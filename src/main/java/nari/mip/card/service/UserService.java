package nari.mip.card.service;

import nari.mip.card.controller.responsebean.ResponseBean;

import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Created by chenlailai on 2017/4/14.
 */
/*@ConfigurationProperties(prefix = "web")
@Component 
@Repository*/
public interface UserService {

    /**
     * 用户登录
     * @param requestParam
     * @return
     */
    public ResponseBean userLogin(Map<String, Object> requestParam);

}
