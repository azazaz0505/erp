package com.nt.erp.utils;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

/**
 * SHA256 加密/解密
 */
public class StringEncryptUtil {

	 /**
     * AES密钥
     */
    private static final String PWD = "FHuma025FHuma025";
    
    /**
     * AES
     */
    private static final String AES_ALGORITHM = "AES";
    
    /**
     * 十六进制
     */
    private static final String HEX = "0123456789ABCDEF";
    
    /**
     * 加密的类型
     */
    private static final String ENCRYPT_TYPE = "SHA-256";

    /**
     * 对字符串加密,加密算法使用MD5,SHA-1,SHA-256,默认使用SHA-256
     *
     * @param strSrc 要加密的字符串
     * @return 加密字符串
     */
    public static String Encrypt(String strSrc) {
        MessageDigest md = null;
        String strDes = null;
        byte[] bt = strSrc.getBytes();
        try {
            md = MessageDigest.getInstance(ENCRYPT_TYPE);
            md.update(bt);
            strDes = bytes2Hex(md.digest()); // to HexString
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
        return strDes;
    }

    public static String bytes2Hex(byte[] bts) {
        String des = "";
        String tmp = null;
        for (int i = 0; i < bts.length; i++) {
            tmp = (Integer.toHexString(bts[i] & 0xFF));
            if (tmp.length() == 1) {
                des += "0";
            }
            des += tmp;
        }
        return des;
    }

    /*public static void main(String[] args) {
        System.out.println("加密：" + Encrypt("1"));
        System.out.println("这个试试：" + Encrypt(new Date().toString()));
    }*/

    /**
	 * hex编码
	 * 
	 * @param str
	 * @return
	 */
	public static String hexEncode(String str) {
		byte[] bytes = str.getBytes();
		StringBuilder sb = new StringBuilder(bytes.length * 2);
		// 转换hex编码
		for (byte b : bytes) {
			sb.append(Integer.toHexString(b + 0x800).substring(1));
		}
		// 转换后的代码为c7d7a3acc4e3bac3
		str = sb.toString();
		return str;
	}
	
	/**
     * aes加密
     * 
     * @param text 源码
     * @return 结果
     * @throws NoSuchAlgorithmException NoSuchAlgorithm异常
     * @throws NoSuchPaddingException NoSuchPadding异常
     * @throws InvalidKeyException InvalidKey异常
     * @throws IllegalBlockSizeException IllegalBlockSize异常
     * @throws BadPaddingException BadPadding异常
     * @throws UnsupportedEncodingException 不支持的字符集异常
     */
	 public static String encrypt(String text)
		        throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException,
		        BadPaddingException, UnsupportedEncodingException {
		        return encrypt(text, PWD);
		    }
	 
	 public static String encrypt(String text, String key)
		        throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException,
		        BadPaddingException, UnsupportedEncodingException {
		        byte[] rawKey = key.getBytes();
		        byte[] result = encrypt(rawKey, text.getBytes("utf-8"));
		        return toHex(result);
		    }
	 
	 /**
	     * aes加密
	     * 
	     * @param raw 密钥
	     * @param clear 源码
	     * @return 结果
	     * @throws NoSuchAlgorithmException NoSuchAlgorithm异常
	     * @throws NoSuchPaddingException NoSuchPadding异常
	     * @throws InvalidKeyException InvalidKey异常
	     * @throws IllegalBlockSizeException IllegalBlockSize异常
	     * @throws BadPaddingException BadPadding异常
	     */
	    private static byte[] encrypt(byte[] raw, byte[] clear)
	        throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException,
	        BadPaddingException {
	        SecretKeySpec skeySpec = new SecretKeySpec(raw, AES_ALGORITHM);
	        Cipher cipher = Cipher.getInstance(AES_ALGORITHM);
	        cipher.init(Cipher.ENCRYPT_MODE, skeySpec);
	        return cipher.doFinal(clear);
	    }
	    
	    /**
	     * toHex
	     * 
	     * @param buf buf
	     * @return toHex
	     */
	    private static String toHex(byte[] buf) {
	        if (buf == null) {
	            return "";
	        }
	        StringBuffer result = new StringBuffer(2 * buf.length);
	        for (int i = 0; i < buf.length; i++) {
	            appendHex(result, buf[i]);
	        }
	        return result.toString();
	    }
	    
	    /**
	     * appendHex
	     * 
	     * @param sb sb
	     * @param b b
	     */
	    private static void appendHex(StringBuffer sb, byte b) {
	        sb.append(HEX.charAt((b >> 4) & 0x0f)).append(HEX.charAt(b & 0x0f));
	    }
	    
	    /**
	     * MD5加密算法
	     * 
	     * @param data 源数据（可以不是可见字符）
	     * @return 加密后的数据（hex编码）
	     */
	    public static String md5(String data) {
	        String result = null;
	        if (data == null || data.length() == 0) {
	            return null;
	        }
	        try {
	            byte[] source = data.getBytes("UTF-8");
	            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
	            messageDigest.update(source);
	            byte[] args = messageDigest.digest();
	            result = convertToHexString(args);
	        }
	        catch (Exception e) {
	            e.printStackTrace();
	        }
	        return result;
	    }
	    
	    
	    /**
	     * 将byte数组转换成16进制
	     * 
	     * @param args 数组
	     * @return 返回16进制数
	     */
	    public static String convertToHexString(byte[] args) {
	        StringBuilder sb = new StringBuilder();
	        for (int i = 0; i < args.length; i++) {
	            sb.append(Integer.toHexString((0x000000ff & args[i]) | 0xffffff00).substring(6));
	        }
	        return sb.toString();
	    }
	    
}
