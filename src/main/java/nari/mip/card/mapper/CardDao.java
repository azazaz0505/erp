package nari.mip.card.mapper;

import nari.mip.card.model.Pagination;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by chenlailai on 2017/5/12.
 */
//@Service
//@Repository
//@Configuration
//@Controller
//@ConfigurationProperties(prefix = "web")
//@Component 
public interface CardDao {
    public List<Map<String, String>> getCardInfo(Map<String, Object> requestParam);

    public Pagination getCardInfoCount(Map<String, Object> requestParam);

    
    //接受第三方发过来的卡片信息
    //public void setCardInfo(Map<String, Object> requestParam);
    

    
    //删除动态卡片信息
    public int deleteCardInfo(Map<String, Object> requestParam);
    
    //更新动态卡片信息
    public int updateCardInfo(Map<String, Object> requestParam);
    
    //根据字段cardContent的模糊查询
    public List<Map<String,String>> getBlurCardInfo(Map<String, Object> requestParam);
    
    //接受第三方发过来的卡片信息
    public int setCardInfo(Map<String, Object> requestParam);
    
    
    //获取工单里面关联应用分组的卡片信息
    public List<Map<String,String>> getWorkGroupCardInfo();

    //获取分组后工单里面卡片的信息
    public List<Map<String,String>> getWorkCardInfo(Map<String,Object> requestParam);
    
    public Pagination getWorkCardInfoCount(Map<String, Object> requestParam);
    
    //获取接收服务信息
    public List<Map<String, String>> getInsertServiceInfo(Map<String, Object> requestParam);
    
    //根据服务ID获取服务信息
    public List<Map<String, String>> getServiceNameInfo(Map<String, Object> requestParam);
    
}
