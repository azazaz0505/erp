package nari.mip.card.service;


import nari.mip.card.controller.responsebean.ResponseBean;

import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Created by chenlailai on 2017/5/23.
 */
/*@ConfigurationProperties(prefix = "web")
@Component 
@Repository*/
public interface CardService {

    /**
     * 接收动态卡片信息
     * @param requestParam
     * @return
     */
    public ResponseBean getCardInfo(Map<String, Object> requestParam);


    /**
     * 增加卡片信息
     * @param requestParam
     * @return
     */
    public ResponseBean setCardInfo(Map<String, Object> requestParam);

    /**
     * 增加卡片信息
     * @param requestParam
     * @return
     */
   // public ResponseBean setCardInfo(Map<String, Object> requestParam);
    
    /**
     * 
     * 删除卡片信息
     * @param requestParam
     * @return
     */
    public ResponseBean deleteCardInfo(Map<String, Object> requestParam);
    
    /**
     * 
     * 更新卡片信息
     * @param requestParam
     * @return
     */
    public ResponseBean updateCardInfo(Map<String, Object> requestParam);
    

    /**
     * 
     * 获取根据关联的应用分组的卡片信息
     * @param requestParam
     * @return
     */
    public ResponseBean getWorkGroupCardInfo ();
    
    /**
     * 
     * 根据分组的卡片ID查询具体的卡片信息
     */
    public ResponseBean getWorkCardInfo(Map<String,Object> requestParam);
    
   
}
