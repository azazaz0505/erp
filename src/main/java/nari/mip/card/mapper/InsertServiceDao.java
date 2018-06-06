package nari.mip.card.mapper;

import nari.mip.card.model.Pagination;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by chenlailai on 2017/5/12.
 */

public interface InsertServiceDao {
    public List<Map<String, String>> getServiceInfo(Map<String, Object> requestParam);

    public Pagination getServiceInfoCount(Map<String, Object> requestParam);

    
    //接受第三方发过来的卡片信息
    //public void setCardInfo(Map<String, Object> requestParam);
    

    
    //删除动态卡片信息
    public int deleteServiceInfo(Map<String, Object> requestParam);
    
    //更新动态卡片信息
    public int updateServiceInfo(Map<String, Object> requestParam);
    
    //根据字段cardContent的模糊查询
    public List<Map<String,String>> getBlurServiceInfo(Map<String, Object> requestParam);
    
    //接受第三方发过来的卡片信息
    public int setServiceInfo(Map<String, Object> requestParam);
    
    
    

}
