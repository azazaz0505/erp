package nari.mip.card.service.serviceImpl;


import nari.mip.card.controller.responsebean.ResponseBean;
import nari.mip.card.service.UserService;
import nari.mip.card.utils.StringEncryptUtil;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by chenlailai on 2017/4/14.
 */
@Service
	public class UserServiceImpl implements UserService {
	//public class UserServiceImpl {
    private static final Logger LOG = Logger.getLogger(UserServiceImpl.class);


    /**
     * 用户登录
     *
     * @param requestParam
     * @return
     */
   //@Override
    public ResponseBean userLogin(Map<String, Object> requestParam) {
        ResponseBean responseBean = new ResponseBean();
        if (null != requestParam.get("name")
                && "admin".equals(requestParam.get("name"))
                && null != requestParam.get("psd")
                && "6b86b273ff34fce19d6b804eff5a3f5747ada4eaa22f1d49c01e52ddb7875b4b".equals(StringEncryptUtil.Encrypt(requestParam.get("psd").toString()))) {
            responseBean.setRetcode("1");
            responseBean.setRetmsg("登录成功");
            Map map = new HashMap();
            map.put("tokenId", StringEncryptUtil.Encrypt(new Date().toString()));
            map.put("name", requestParam.get("name"));
            responseBean.setBody(map);
            return responseBean;
        }
        responseBean.setRetcode("0");
        responseBean.setRetmsg("用户名或密码错误");
        return responseBean;
    }
}
