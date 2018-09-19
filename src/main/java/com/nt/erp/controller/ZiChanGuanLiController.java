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
import com.nt.erp.dao.ZiChanGuanLiMapper;
import com.nt.erp.model.ZiChanGuanLi;
import com.nt.erp.model.ZiChanGuanLiExample;

@RestController
public class ZiChanGuanLiController {

    @Autowired
    private ZiChanGuanLiMapper ziChanGuanLiMapper;

    //入参报文需要根据前台需要修改
    @RequestMapping(value = "/ziChanGuanLi/select", method = RequestMethod.POST)
    public JSONObject info(@RequestBody Map<String, Object> requestParam,HttpServletRequest request,  HttpServletResponse response) {

        JSONObject json = new JSONObject();

        // 在此添加条件查询
        ZiChanGuanLiExample example = new ZiChanGuanLiExample();
        List<ZiChanGuanLi> rows = ziChanGuanLiMapper.selectByExample(example);
        long total = ziChanGuanLiMapper.countByExample(example);
        
        json.put("rows", rows);
        json.put("total", total);
        json.put("retmsg", "成功");
        json.put("retcode", "1");
        return json;
    }


}
