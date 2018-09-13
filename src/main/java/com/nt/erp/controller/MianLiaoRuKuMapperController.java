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
import com.nt.erp.dao.MianLiaoRuKuMapper;
import com.nt.erp.model.MianLiaoRuKu;
import com.nt.erp.model.MianLiaoRuKuExample;

@RestController
public class MianLiaoRuKuMapperController {

    @Autowired
    private MianLiaoRuKuMapper mianLiaoRuKuMapper;

    //入参报文需要根据前台需要修改
    @RequestMapping(value = "/mianLiaoRuKu/select", method = RequestMethod.POST)
    public JSONObject info(@RequestBody Map<String, Object> requestParam,HttpServletRequest request,  HttpServletResponse response) {

        JSONObject json = new JSONObject();

        // 在此添加条件查询
        MianLiaoRuKuExample example = new MianLiaoRuKuExample();
        List<MianLiaoRuKu> rows = mianLiaoRuKuMapper.selectByExample(example);
        long total = mianLiaoRuKuMapper.countByExample(example);
        json.put("rows", rows);
        json.put("total", total);
        
        json.put("retmsg", "成功");
        json.put("retcode", "1");
        return json;
    }


}
