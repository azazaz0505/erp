package nari.mip.card.service.serviceImpl;




import nari.mip.card.pushMsg;
import nari.mip.card.controller.responsebean.ResponseBean;
import nari.mip.card.mapper.CardDao;
import nari.mip.card.model.Pagination;
import nari.mip.card.service.CardService;
import nari.mip.card.utils.StringEncryptUtil;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.annotation.Resource;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;















import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;



import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Created by chenlailai on 2017/5/23.
 */

//@Configuration  
@Service
/*@Repository
//@Controller
@ComponentScan(basePackages={"nari.mip.card.dao"})
@Configuration
@EnableTransactionManagement*/
//@ComponentScan(basePackageClasses={CardDao.class,CardService.class})

public class CardServiceImpl implements CardService {
//public class CardServiceImpl {
    private static final Logger LOG = Logger.getLogger(CardServiceImpl.class);
    //@Resource
    @Autowired
    private CardDao cardDao;
    /**
     * 接收动态卡片信息
     *
     * @param requestParam
     * @return
     */
    public ResponseBean getCardInfo(Map<String, Object> requestParam) {
        ResponseBean responseBean = new ResponseBean();
        Pagination pagination = cardDao.getCardInfoCount(requestParam);
        List<Map<String, String>> mapList = cardDao.getCardInfo(requestParam);
        //接受传进来的记录条数
        Integer countnum = Integer.parseInt(requestParam.get("count").toString());
        //计算总页数
        pagination.setTotalPage((pagination.getTotalItems()+countnum -1)/countnum);
        //获取当前页
        pagination.setCurrentPage(pagination.getCurrentPage()+1);
        //向结果中添加type
        
      //对获取的logo路径加密
		 StringEncryptUtil strencry =new StringEncryptUtil();
		 
		//向结果中添加type
		for(Map map:mapList){
			String param =  map.get("cardUrl").toString();
			String screenShotUrl = "";
					try {
						try {
							screenShotUrl = "info="+ strencry.hexEncode(strencry.encrypt(param));
						} catch (NoSuchAlgorithmException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (NoSuchPaddingException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (IllegalBlockSizeException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (BadPaddingException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (UnsupportedEncodingException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					} catch (InvalidKeyException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				map.put("cardUrl", screenShotUrl);
				map.put("type", requestParam.get("type"));
		}
        
        responseBean.setAll("1", "查询成功", mapList, pagination);
        return responseBean;
    }

    
    public ResponseBean setCardInfo(Map<String, Object> requestParam) {
        ResponseBean responseBean = new ResponseBean();
       // pushMsg pushmsg = new pushMsg();
        //卡片ID
        String cardid = UUID.randomUUID().toString().replaceAll("-", "");
        //当前系统日期
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String cardtime = sdf.format(date);
        String cardupdatetime = sdf.format(date);
        
        String managerUrlPost = null; //管理服务地址和端口
        
        Map<String, Object> param = new HashMap<String, Object>();
        
        requestParam.put("cardid", cardid);
        requestParam.put("cardtime", cardtime);
        requestParam.put("cardupdatetime", cardupdatetime);

        //插入卡片信息前，先判断接收服务信息是否存在
        List<Map<String, String>> mapList=cardDao.getInsertServiceInfo(requestParam);
        if(mapList.size() == 0)
        {
        	responseBean.setAll("0", "查询接收服务表T_SERVICE_INFO无记录", requestParam, null);
        	return responseBean;
        }else
        { //如果服务存在，查询管理服务的地址和端口
        	param.put("serviceid", "managerUrl");
        	//管理服务地址和端口
        	List<Map<String, String>> managerUrl = cardDao.getServiceNameInfo(param);
        	
        	for (Map<String,String> map:managerUrl)
        	{
        		managerUrlPost = map.get("servicename"); 
        	
        	}
        }
        //插入卡片
        int isComplete = 0;
        try {
        	isComplete=cardDao.setCardInfo(requestParam);
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
        if(isComplete == 1){
        	responseBean.setAll("1", "插入成功", requestParam, null);
        	//消息推送
        	requestParam.put("managerUrl", managerUrlPost);
        	
        	pushMsg.sendMsg(requestParam);
        	return responseBean;
        }
        responseBean.setAll("0", "插入失败", requestParam, null);
        return responseBean;
    }

    
//    public ResponseBean setCardInfo(Map<String, Object> requestParam) {
//        ResponseBean responseBean = new ResponseBean();
//        cardDao.setCardInfo(requestParam);
//        responseBean.setAll("1", "查询成功", null, null);
//        return responseBean;
//    }



	public ResponseBean deleteCardInfo(Map<String, Object> requestParam) {
		ResponseBean responseBean = new ResponseBean();
		int isComplete = 0;
		try{
			isComplete=cardDao.deleteCardInfo(requestParam);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		if(isComplete == 1)
		{
			responseBean.setAll("1","删除成功",null,null);
			return responseBean;
		}
		responseBean.setAll("0","删除失败",null,null);
		return responseBean;
	}

	
	public ResponseBean updateCardInfo(Map<String, Object> requestParam) {
		ResponseBean responseBean = new ResponseBean();
		int isComplete = 0;
		try{
			isComplete=cardDao.updateCardInfo(requestParam);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		if(isComplete == 1)
		{
			responseBean.setAll("1", "更新成功", null, null);
			return responseBean;
		}
		responseBean.setAll("0", "更新失败", null, null);
		return responseBean;
	}


	/**
     *获取分组后根据关联应用ID卡片信息
     * @param requestParam
     * @return
     */
    public ResponseBean getWorkCardInfo(Map<String,Object>requestParam) {
        ResponseBean responseBean = new ResponseBean();
        Pagination pagination = cardDao.getWorkCardInfoCount(requestParam);
        List<Map<String, String>> mapList = cardDao.getWorkCardInfo(requestParam);
        //接受传进来的记录条数
        Integer countnum = Integer.parseInt(requestParam.get("count").toString());
        //计算总页数
        pagination.setTotalPage((pagination.getTotalItems()+countnum -1)/countnum);
        //获取当前页
        pagination.setCurrentPage(pagination.getCurrentPage()+1);
        
        responseBean.setAll("1", "查询成功", mapList, pagination);
        return responseBean;
    }
    

    /**
     * 获取根据应用ID分组的卡片信息
     * @param requestParam
     * @return
     */
    public ResponseBean getWorkGroupCardInfo()
    {
    	ResponseBean responseBean = new ResponseBean();
    	List<Map<String,String>> mapList = cardDao.getWorkGroupCardInfo();
    	//对获取的logo路径加密
		 StringEncryptUtil strencry =new StringEncryptUtil();
	        for(Map map:mapList){
	        	
	        	String param =  map.get("store_Path").toString();
	        	String screenShotUrl = "";
						try {
							try {
								screenShotUrl = "info="+ strencry.hexEncode(strencry.encrypt(param));
							} catch (NoSuchAlgorithmException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} catch (NoSuchPaddingException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} catch (IllegalBlockSizeException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} catch (BadPaddingException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} catch (UnsupportedEncodingException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						} catch (InvalidKeyException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					map.put("store_Path", screenShotUrl);
				} 

    	responseBean.setAll("1", "查询成功", mapList, null);
        return responseBean;
    }
}
