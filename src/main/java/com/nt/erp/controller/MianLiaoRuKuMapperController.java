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
import com.nt.erp.dao.MianLiaoRuKuMapper;
import com.nt.erp.model.MianLiaoRuKu;
import com.nt.erp.model.MianLiaoRuKuExample;

@RestController
public class MianLiaoRuKuMapperController {

    @Autowired
    private MianLiaoRuKuMapper mianLiaoRuKuMapper;

    //入参报文需要根据前台需要修改
    @RequestMapping(value = "/mianLiaoRuKu/select", method = RequestMethod.POST)
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
        MianLiaoRuKuExample example = new MianLiaoRuKuExample();
        List<MianLiaoRuKu> list = mianLiaoRuKuMapper.selectByExample(example);

        json.put("infos", list);
        json.put("retmsg", "成功");
        json.put("retcode", "1");
        return json;
    }


}
