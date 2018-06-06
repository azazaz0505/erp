package nari.mip.card;

import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;
import org.ksoap2.transport.ServiceConnection;
import org.ksoap2.transport.ServiceConnectionSE;




//import com.fiberhome.emap.nari.controller.MobileServiceController;




import nari.mip.base.util.AES;
import nari.mip.core.msg.MsgBase;
import nari.mip.core.util.UrlUtil;
import nari.mip.core.web.rpc.IRestClient;
import nari.mip.core.web.rpc.RestClient;
import nari.mip.core.web.rpc.RestResult;
public class pushMsg {

	//public static void main(String[] args){
	
	
	public static void sendMsg(Map<String, Object> requestParam){
		
		
		
		List<String> appIds = new ArrayList<String>();
		
		String appId = requestParam.get("appid").toString();
		String cardId = requestParam.get("cardid").toString();
		String cardContent = requestParam.get("cardcontent").toString();
		String userNames = requestParam.get("username").toString();
		String managerUrl=null;
		if (requestParam.get("managerUrl") != null)
		{
		 managerUrl = requestParam.get("managerUrl").toString();
		}
		appIds.add(appId); //接收APPID

		MsgBase msgBase = new MsgBase();
		msgBase.setId("cardPush");//消息Id,由调用者自己定义
		msgBase.setContent(cardContent);//这是具体的消息内容，是一个字符串，由用户自定义如："abc","123"
		msgBase.setAppIds(appIds);
		
		msgBase.setSendTime(new Timestamp(System.currentTimeMillis()));
		
		System.out.println("原始消息： "+msgBase.toJSONString());
		
		
		//推送消息
		pushTest_restful(msgBase,userNames,managerUrl);
		
//		String clientToken = "12344321";
//		
//		if(checkClientToken(clientToken)){
//			
//			System.out.println("令牌校验成功！");
//			
//		}else{
//			
//			System.out.println("令牌校验失败！");
//		}
	}
	
	
	/**
	 * 校验客户端的登录令牌
	 * @param token		客户端登录令牌
	 */
	private static boolean checkClientToken(String token){
		
		Map<String,String> params = new HashMap<String, String>();
		params.put("SessionId", token);
		
		IRestClient restClient=null;
		
		try {
			
			//此处配置平台管理服务的IP和端口
			restClient = RestClient
					.createDefault("http://127.0.0.1:8888");
			
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		final RestResult result = restClient.post("/rest/mobile/token",params);
		
		if(result.isSuccessful()){
			
			return result.getBoolean();
				
		}else{
			
			return false;
		}
	}
	
	/**
	 * 消息推送restful接口
	 * @param msgBase
	 */
	private static void pushTest_restful(MsgBase msgBase,String userNames,String managerUrl){
		
		//String userNames = userNames;//如果有多个用户用,隔开，如："cht123,test12345"
		HashMap<String,String> params = new HashMap<String, String>();
		params.put("userNames", userNames); //用户名，参数格式 ,如果有多个用户用,隔开
		params.put("msg", msgBase.toJSONString());				//消息，参数格式
		IRestClient restClient=null;
		
		try {
			
			//此处配置平台管理服务的IP和端口
			restClient = RestClient
					.createDefault(managerUrl);
			
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		final RestResult result = restClient.post("/rest/mobile/push",params);
		
		if(result.isSuccessful()){
			
			if(result.getBoolean())
				System.out.println("推送成功");
			else
				System.out.println("推送失败："+result.getMessage());
		}else{
			
			System.out.println("推送失败："+result.getMessage());
		}
	}
	
	/**
	 * 消息推送webservice接口
	 * @param msgBase
	 */
	private static void pushTest_WebService(MsgBase msgBase){
		
		try{	
			String result = "";
			String url = "http://localhost:8888/services/yxCenterCall";
			result = pushMsg
					.callSGGISService(url,
							"http://ws.nari.emap.fiberhome.com/",
							"service", "<?xml version=\"1.0\" encoding=\"gb2312\"?>"
							+ "<data> <opCode>0001</opCode>"
							+ "<userName>cht12345</userName><password>"
							+ AES.encrypt("cht123456")
							+ "</password><source>APP</source></data>");
			System.out.println(result);
			String token = getContentFromYX(result).get("token");
			System.out.println(token);
			result = callSGGISService(url,
							"http://ws.nari.emap.fiberhome.com/",
							"service", "<?xml version=\"1.0\" encoding=\"gb2312\"?>"
							+ "<data> <opCode>0010</opCode><token>"
							+ token
							+ "</token><appKey>nari.mip.test.msgrecevier</appKey>"
							+ "<versionNo>1.0</versionNo></data>");
			System.out.println(result);
			result = callSGGISService(url,
							"http://ws.nari.emap.fiberhome.com/",
							"service", "<?xml version=\"1.0\" encoding=\"gb2312\"?>"
							+ "<data> <opCode>0100</opCode><token>"
							+ token
							+ "</token><appKey>nari.mip.test.msgrecevier</appKey>"
							+ "</data>");
			System.out.println(result);
			result = callSGGISService(url,
							"http://ws.nari.emap.fiberhome.com/",
							"service", "<?xml version=\"1.0\" encoding=\"gb2312\"?>"
							+ "<data> <opCode>1000</opCode><token>"
							+ token
							+ "</token><appKey>nari.mip.test.msgrecevier</appKey>"
							+ "<timeStart>2015-1-31 00:00:00</timeStart><timeEnd>2016-1-31 00:00:00</timeEnd></data>");
			System.out.println(result);
			result = callSGGISService(url,
							"http://ws.nari.emap.fiberhome.com/",
							"service", "<?xml version=\"1.0\" encoding=\"gb2312\"?>"
							+ "<data> <opCode>0011</opCode><token>"
							+ token
							+ "</token><appKey>nari.mip.test.msgrecevier</appKey>"
							+ "<time>2016-1-24 00:00:00</time><tag>0</tag></data>");
			System.out.println(result);
			result = callSGGISService(url,
							"http://ws.nari.emap.fiberhome.com/",
							"service", "<?xml version=\"1.0\" encoding=\"gb2312\"?>"
							+ "<data> <opCode>0011</opCode><token>"
							+ token
							+ "</token><appKey>nari.mip.test.msgrecevier</appKey>"
							+ "<time>2016-2-24 00:00:00</time><tag>1</tag></data>");
			System.out.println(result);
			result = callSGGISService(url,
							"http://ws.nari.emap.fiberhome.com/",
							"service", "<?xml version=\"1.0\" encoding=\"gb2312\"?>"
							+ "<data> <opCode>0101</opCode><token>"
							+ token
							+ "</token><userName>cht12345,test12345</userName><msgBody>"
							+ msgBase.toJSONString()
							+ "</msgBody></data>");
			System.out.println(result);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Map<String, String> getContentFromYX(String xml) throws IOException {
		Map<String, String> config = new HashMap<String, String>();
		Document doc = null;
		try {
			doc = DocumentHelper.parseText(xml);
			Element root = doc.getRootElement();
			Iterator<Element> iter = root.elementIterator();
			while (iter.hasNext()) {
				Element el = iter.next();
				config.put(el.getName(), el.getTextTrim());
			}

		} catch (DocumentException e) {
			e.printStackTrace();
		}
		return config;

	}
	public static String callSGGISService(String endPoint, String nameSpace, String methodName, String input) 
    {
        SoapObject rpc = new SoapObject(nameSpace, methodName);
        rpc.addProperty("arg0", input);

        MyHttpTransport transport = new MyHttpTransport(endPoint, 5000);

        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);

        envelope.bodyOut = transport;
        envelope.setOutputSoapObject(rpc);

        String result = null;

        try
        {
            transport.call(null, envelope);

            SoapObject object = (SoapObject) envelope.bodyIn;

            result = object.getProperty(0).toString();

        }
        catch (Exception ex)
        {
            String errorInfo = ex.getMessage();

            if (errorInfo == null)
            {
                errorInfo = "连接远程服务失败，请检查服务是否可用！";
            }

        }
        return result;
    }
}

class MyHttpTransport extends HttpTransportSE
{
    public MyHttpTransport(String url)
    {
        super(url);
    }

    public MyHttpTransport(String url, int timeout)
    {
        super(url);
        mTimeout = timeout;
    }

    protected ServiceConnection getServiceConnection() throws IOException
    {
        ServiceConnectionSE serviceConnection = new ServiceConnectionSE(this.url, mTimeout);
        return serviceConnection;
    }

    private int mTimeout = 5000;
}