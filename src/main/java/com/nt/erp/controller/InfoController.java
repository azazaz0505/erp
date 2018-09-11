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
import com.nt.erp.dao.InfoMapper;
import com.nt.erp.model.Info;
import com.nt.erp.model.InfoExample;

@RestController
public class InfoController {

    @Autowired
    private InfoMapper infoMapper;

    @RequestMapping(value = "/info", method = RequestMethod.POST)
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
