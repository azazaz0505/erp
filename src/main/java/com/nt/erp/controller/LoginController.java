package com.nt.erp.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.nt.erp.dao.LoginMapper;
import com.nt.erp.model.Login;
import com.nt.erp.model.LoginExample;
import com.nt.erp.utils.Base64;

@RestController
public class LoginController {
    
    @Autowired
    private LoginMapper loginMapper;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public JSONObject login(@RequestBody Map<String, Object> requestParam,HttpServletRequest request,  HttpServletResponse response) {
        
        JSONObject json = new JSONObject();
     
        String name = (String) requestParam.get("loginAccount");
        String passwd = (String) requestParam.get("loginPasswd");
        
        
        //生成唯一主键
        //String id = UUID.randomUUID().toString().replaceAll("-", "");
        
        if (StringUtils.isEmpty(name) || StringUtils.isEmpty(passwd)) {
            json.put("retmsg", "用户名或密码不能为空");
            json.put("retcode", "0");
            return json;
        }
        LoginExample example = new LoginExample();
        example.createCriteria().andLoginaccountEqualTo(StringUtils.trim(name));
        List<Login> list = loginMapper.selectByExample(example);
        if(CollectionUtils.isEmpty(list))
        {
            json.put("retmsg", "用户名不存在");
            json.put("retcode", "0");
            return json;
        }
        
        String pw = null;
        try {
            pw = Base64.decode(list.get(0).getLoginpasswd());
        } catch (Exception e) {
            json.put("retmsg", "内部服务异常");
            json.put("retcode", "0");
            return json;
        }
        if (StringUtils.isNotBlank(passwd)) {
            if(!passwd.equals(pw))
            {
                json.put("retmsg", "密码错误");
                json.put("retcode", "0");
                return json;
            }
        }
        
        json.put("retmsg", "成功");
        json.put("retcode", "1");
        json.put("name", name);
        return json;
    }
    
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public JSONObject register(@RequestBody Map<String, Object> requestParam,HttpServletRequest request,  HttpServletResponse response) {
        JSONObject json = new JSONObject();
        String loginaccount = (String) requestParam.get("loginAccount");
        LoginExample example = new LoginExample();
        example.createCriteria().andLoginaccountEqualTo(loginaccount);
        List<Login> list = loginMapper.selectByExample(example);
        if (CollectionUtils.isNotEmpty(list)) {
            json.put("retmsg", "错误，该用户名已被注册");
            json.put("retcode", "0");
            return json;
        }
        
        String passwd = (String) requestParam.get("loginPasswd");
        if (StringUtils.isEmpty(passwd)) {
            json.put("retmsg", "错误，密码不能为空");
            json.put("retcode", "0");
        }
        
        String encodePasswd = null;
        try {
            encodePasswd = Base64.encode(passwd);
            Login record = new Login();
            record.setLoginaccount(StringUtils.trim(loginaccount));
            record.setLoginpasswd(encodePasswd);
            loginMapper.insert(record);
        } catch (Exception e) {
            json.put("retmsg", "内部服务异常");
            json.put("retcode", "0");
            return json;
        }
        
        json.put("retmsg", "恭喜你，注册成功");
        json.put("retcode", "1");
        
        return json;
    }
        
    
}


