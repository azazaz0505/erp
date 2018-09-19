package com.nt.erp.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.nt.erp.dao.MianLiaoChuKuMapper;
import com.nt.erp.model.MianLiaoChuKu;
import com.nt.erp.model.MianLiaoChuKuExample;

@RestController
public class MianLiaoChuKuController {

    @Autowired
    private MianLiaoChuKuMapper mianLiaoChuKuMapper;

    //入参报文需要根据前台需要修改
    @RequestMapping(value = "/mianLiaoChuKu/select", method = RequestMethod.POST)
    public JSONObject info(@RequestBody Map<String, Object> requestParam,HttpServletRequest request,  HttpServletResponse response) {

        JSONObject json = new JSONObject();

        // 在此添加条件查询
        MianLiaoChuKuExample example = new MianLiaoChuKuExample();
        
        Integer pageNumber = (Integer) requestParam.get("pageNumber");
        Integer pageSize = (Integer) requestParam.get("pageSize");
        if (pageNumber != null && pageNumber >= 1) {
            pageNumber--;
        }
        example.setOffset(pageNumber);
        example.setRows(pageSize);
        
        List<MianLiaoChuKu> rows = mianLiaoChuKuMapper.selectByExample(example);
        long total = mianLiaoChuKuMapper.countByExample(example);
        json.put("rows", rows);
        json.put("total", total);
        json.put("retmsg", "成功");
        json.put("retcode", "1");
        return json;
    }


}
