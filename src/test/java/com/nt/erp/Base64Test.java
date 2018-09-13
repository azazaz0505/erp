package com.nt.erp;

import org.junit.Assert;
import org.junit.Test;

import com.nt.erp.utils.Base64;


public class Base64Test {

    @Test
    public void testEncode() throws Exception{
        String encodeStr = Base64.encode("admin");
        System.out.println(encodeStr);
        Assert.assertEquals("admin", Base64.decode(encodeStr));
        
    }
}
