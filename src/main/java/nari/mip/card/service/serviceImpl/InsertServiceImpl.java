package nari.mip.card.service.serviceImpl;

import nari.mip.card.controller.responsebean.ResponseBean;
import nari.mip.card.mapper.InsertServiceDao;
import nari.mip.card.model.Pagination;
import nari.mip.card.service.InsertService;

import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;



import java.util.List;
import java.util.Map;


/**
 * Created by chenlailai on 2017/5/23.
 */
@Service
//@Repository
//@Controller
/*@ComponentScan(basePackages={"nari.mip.card"})
@Configuration
@EnableTransactionManagement*/
public class InsertServiceImpl implements InsertService {
	//public class InsertServiceImpl {
    private static final Logger LOG = Logger.getLogger(InsertServiceImpl.class);

    @Autowired
    private InsertServiceDao InsertServiceDao;

    /**
     * 获取接入服务信息
     *
     * @param requestParam
     * @return
     */
    public ResponseBean getServiceInfo(Map<String, Object> requestParam) {
        ResponseBean responseBean = new ResponseBean();
        Pagination pagination = InsertServiceDao.getServiceInfoCount(requestParam);
        List<Map<String, String>> mapList = InsertServiceDao.getServiceInfo(requestParam);
        //接受传进来的记录条数
        Integer countnum = Integer.parseInt(requestParam.get("count").toString());
        //计算总页数
        pagination.setTotalPage((pagination.getTotalItems()+countnum -1)/countnum);
        //获取当前页
        pagination.setCurrentPage(pagination.getCurrentPage()+1);
        //向结果中添加type
        for(Map map:mapList){
        	map.put("type", requestParam.get("type"));
        }
       
        responseBean.setAll("1", "查询成功", mapList, pagination);
        return responseBean;
    }

    
    public ResponseBean setServiceInfo(Map<String, Object> requestParam) {
        ResponseBean responseBean = new ResponseBean();
        int isComplete = 0;
        try{
        	isComplete=InsertServiceDao.setServiceInfo(requestParam);
        }catch(Exception e)
        {
        	e.printStackTrace();
        }
        if(isComplete ==1)
        {
        	responseBean.setAll("1", "插入成功", requestParam, null);
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



	public ResponseBean deleteServiceInfo(Map<String, Object> requestParam) {
		ResponseBean responseBean = new ResponseBean();
		int isComplete =0;
		try{
			isComplete=InsertServiceDao.deleteServiceInfo(requestParam);
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

	
	public ResponseBean updateServiceInfo(Map<String, Object> requestParam) {
		ResponseBean responseBean = new ResponseBean();
		int isComplete = 0;
		try{
			isComplete=InsertServiceDao.updateServiceInfo(requestParam);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		if(isComplete ==1)
		{
			responseBean.setAll("1", "更新成功", null, null);
			return responseBean;
		}
		responseBean.setAll("0", "更新失败", null, null);
		return responseBean;
	}



}
