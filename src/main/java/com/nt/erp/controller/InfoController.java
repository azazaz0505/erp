package com.nt.erp.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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
import com.nt.erp.dao.InfoMapper;
import com.nt.erp.model.Info;
import com.nt.erp.model.InfoExample;
import com.nt.erp.model.InfoExample.Criteria;

@RestController
public class InfoController {

    @Autowired
    private InfoMapper infoMapper;

    @RequestMapping(value = "/info",method = RequestMethod.POST)
    public JSONObject info(@RequestBody Map<String, Object> requestParam,HttpServletRequest request,  HttpServletResponse response) {

        JSONObject json = new JSONObject();

        InfoExample example = new InfoExample();
        Criteria criteria = example.createCriteria();
        criteria.andStyleidEqualTo((String) requestParam.get("styleid"))
        .andStylenameEqualTo((String) requestParam.get("stylename"));
        if (StringUtils.isNotBlank((String) requestParam.get("orderdate"))) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            try {
                criteria.andOrderdateGreaterThanOrEqualTo(sdf.parse((String) requestParam.get("orderdate")));
            } catch (ParseException e) {
                System.out.println(e);
                json.put("retmsg", " 日期解析失败");
                json.put("retcode", "0");
                return json;
            }
        }
       
        
        
        Integer pageNumber = (Integer) requestParam.get("pageNumber");
        Integer pageSize = (Integer) requestParam.get("pageSize");
        if (pageNumber != null && pageNumber >= 1) {
            pageNumber--;
        }
        example.setOffset(pageNumber);
        example.setRows(pageSize);
        
        List<Info> rows = infoMapper.selectByExample(example);
        long total = infoMapper.countByExample(example);

        json.put("rows", rows);
        json.put("total", total);
        json.put("retmsg", "成功");
        json.put("retcode", "1");
        return json;
    }
    
    public static void main(String[] args) {
        String ss= "2018-09-11";
        if (StringUtils.isNotBlank(ss)) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            try {
                System.out.println(sdf.parse(ss));
            } catch (ParseException e) {
                System.out.println(e);
            }
        }
    }
    

}
