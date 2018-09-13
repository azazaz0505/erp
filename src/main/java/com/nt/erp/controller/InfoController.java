package com.nt.erp.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.nt.erp.dao.InfoMapper;
import com.nt.erp.model.Info;
import com.nt.erp.model.InfoExample;

@RestController
public class InfoController {

    @Autowired
    private InfoMapper infoMapper;

    @RequestMapping(value = "/info",method = RequestMethod.POST)
    public JSONObject info(@RequestBody Map<String, Object> requestParam,HttpServletRequest request,  HttpServletResponse response) {

        JSONObject json = new JSONObject();

        // 在此添加条件查询
        InfoExample example = new InfoExample();
        List<Info> rows = infoMapper.selectByExample(example);
        long total = infoMapper.countByExample(example);

        json.put("rows", rows);
        json.put("total", total);
        json.put("retmsg", "成功");
        json.put("retcode", "1");
        return json;
    }
    

}
