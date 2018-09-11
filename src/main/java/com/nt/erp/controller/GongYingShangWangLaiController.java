package com.nt.erp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.nt.erp.bean.InfoBean;
import com.nt.erp.dao.GongYingShangWangLaiMapper;
import com.nt.erp.model.GongYingShangWangLai;
import com.nt.erp.model.GongYingShangWangLaiExample;

@RestController
public class GongYingShangWangLaiController {

    @Autowired
    private GongYingShangWangLaiMapper gongYingShangWangLaiMapper;

    //入参报文需要根据前台需要修改
    @RequestMapping(value = "/gongYingShangWangLai/select", method = RequestMethod.POST)
    public JSONObject info(@RequestBody @Validated InfoBean infoBean, BindingResult bindingResult) {

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

        // 在此添加查询条件
        GongYingShangWangLaiExample example = new GongYingShangWangLaiExample();
        List<GongYingShangWangLai> rows = gongYingShangWangLaiMapper.selectByExample(example);
        long total = gongYingShangWangLaiMapper.countByExample(example);
        json.put("rows", rows);
        json.put("total", total);
        json.put("retmsg", "成功");
        json.put("retcode", "1");
        return json;
    }


}
