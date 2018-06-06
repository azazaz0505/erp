package nari.mip.card.service;



import java.util.Map;

import nari.mip.card.controller.responsebean.ResponseBean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Created by chenlailai on 2017/5/23.
 */
/*@ConfigurationProperties(prefix = "web")
@Component 
@Repository*/
public interface InsertService {

    /**
     * 接收服务信息
     * @param requestParam
     * @return
     */
    public ResponseBean getServiceInfo(Map<String, Object> requestParam);


    /**
     * 增加服务信息
     * @param requestParam
     * @return
     */
    public ResponseBean setServiceInfo(Map<String, Object> requestParam);

    /**
     * 增加服务信息
     * @param requestParam
     * @return
     */
   // public ResponseBean setCardInfo(Map<String, Object> requestParam);
    
    /**
     * 
     * 删除服务信息
     * @param requestParam
     * @return
     */
    public ResponseBean deleteServiceInfo(Map<String, Object> requestParam);
    
    /**
     * 
     * 更新服务信息
     * @param requestParam
     * @return
     */
    public ResponseBean updateServiceInfo(Map<String, Object> requestParam);
    

    
    

}
