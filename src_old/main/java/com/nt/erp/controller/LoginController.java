package com.nt.erp.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.nt.erp.bean.LoginBean;
import com.nt.erp.dao.LoginMapper;
import com.nt.erp.model.Login;

@RestController
public class LoginController {
    
    @Autowired
    private LoginMapper loginMapper;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public JSONObject login(@RequestBody @Validated LoginBean loginBean,
            BindingResult bindingResult) {
        
        JSONObject json = new JSONObject();
        if (bindingResult.hasErrors()) {
            StringBuilder sb = new StringBuilder();
            for (FieldError fieldError : bindingResult.getFieldErrors()) {
                sb.append(fieldError.getDefaultMessage()).append(" ");
            }
            
            json.put("retmsg", sb.toString());
            json.put("retcode", "0");

            return json;
        }
        
     
        String name = loginBean.getLoginAccount();
        String passwd = loginBean.getLoginPasswd();
        List<Login> list = loginMapper.selectAll();
        Map<String, String> maps = new HashMap<String, String>();
        if(CollectionUtils.isNotEmpty(list))
        {
            for(Login l : list)
            {
                maps.put(l.getLoginaccount(), l.getLoginpasswd());
            }
        }
        
        if (maps.isEmpty() || (!maps.containsKey(name))) {
            json.put("retmsg", "用户名不存在");
            json.put("retcode", "0");
            return json;
        }
        
        String pw = maps.get(name);
        if (StringUtils.isNotBlank(passwd)) {
            if(!passwd.equals(pw))
            {
                json.put("retmsg", "密码错误");
                json.put("retcode", "0");
                return json;
            }
        }
        else{
            if (StringUtils.isBlank(pw)) {
                json.put("retmsg", "密码错误");
                json.put("retcode", "0");
                return json;
            }
        }
        
        json.put("retmsg", "成功");
        json.put("retcode", "1");
        return json;
    }
}


