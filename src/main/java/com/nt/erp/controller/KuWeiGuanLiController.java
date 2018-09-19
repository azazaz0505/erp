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
import com.nt.erp.dao.KuWeiGuanLiMapper;
import com.nt.erp.model.KuWeiGuanLi;
import com.nt.erp.model.KuWeiGuanLiExample;

@RestController
public class KuWeiGuanLiController {

    @Autowired
    private KuWeiGuanLiMapper kuWeiGuanLiMapper;

    //入参报文需要根据前台需要修改
    @RequestMapping(value = "/kuWeiGuanLi/select", method = RequestMethod.POST)
    public JSONObject select(@RequestBody Map<String, Object> requestParam,HttpServletRequest request,  HttpServletResponse response) {

        JSONObject json = new JSONObject();

        // 在此添加条件查询
        KuWeiGuanLiExample example = new KuWeiGuanLiExample();
        String pageNumber = (String) requestParam.get("pageNumber");
        String pageSize = (String) requestParam.get("pageSize");
//        String pageNumber = requestParam.get("pageNumber").toString();
//        String pageSize = requestParam.get("pageSize").toString();
        if (StringUtils.isNotBlank(pageNumber)) {
            try {
                example.setOffset(Integer.valueOf(pageNumber));
            } catch (Exception e) {
                json.put("retmsg", "失败");
                json.put("retcode", "0");
                return json;
            }
        }
        
        if (StringUtils.isNotBlank(pageSize)) {
            try {
                example.setRows(Integer.valueOf(pageSize));
            } catch (Exception e) {
                json.put("retmsg", "失败");
                json.put("retcode", "0");
                return json;
            }
        }
       
        
        List<KuWeiGuanLi> rows = kuWeiGuanLiMapper.selectByExample(example);
        long total = kuWeiGuanLiMapper.countByExample(example);
        
        json.put("rows", rows);
        json.put("total", total);
        json.put("retmsg", "成功");
        json.put("retcode", "1");
        return json;
    }
    
    @RequestMapping(value = "/kuWeiGuanLi/add", method = RequestMethod.POST)
    public JSONObject add(@RequestBody Map<String, Object> requestParam,HttpServletRequest request,  HttpServletResponse response) {
        JSONObject json = new JSONObject();

        KuWeiGuanLi record = new KuWeiGuanLi();
        record.setAddress((String) requestParam.get("address"));
        record.setAddress((String) requestParam.get("name"));
        record.setAddress((String) requestParam.get("capacity"));
        record.setAddress((String) requestParam.get("operation"));
        record.setLevel((String) requestParam.get("level"));
      
        try {
            kuWeiGuanLiMapper.insert(record);
        } catch (Exception e) {
            json.put("retmsg", "失败");
            json.put("retcode", "0");
            return json;
        }
       
        
        json.put("retmsg", "成功");
        json.put("retcode", "1");
        return json;
    }
    
    @RequestMapping(value = "/kuWeiGuanLi/update", method = RequestMethod.POST)
    public JSONObject update(@RequestBody Map<String, Object> requestParam,HttpServletRequest request,  HttpServletResponse response) {
        JSONObject json = new JSONObject();

        KuWeiGuanLi record = new KuWeiGuanLi();
        record.setLevel((String) requestParam.get("level"));
        record.setAddress((String) requestParam.get("address"));
        record.setAddress((String) requestParam.get("name"));
        record.setAddress((String) requestParam.get("capacity"));
        record.setAddress((String) requestParam.get("operation"));
        
        KuWeiGuanLiExample example = new KuWeiGuanLiExample();
        example.createCriteria().andAddressEqualTo((String) requestParam.get("address"));
        
        try {
            kuWeiGuanLiMapper.updateByExample(record, example);
        } catch (Exception e) {
            json.put("retmsg", "失败");
            json.put("retcode", "0");
            return json;
        }
       
        
        json.put("retmsg", "成功");
        json.put("retcode", "1");
        return json;
    }

    @RequestMapping(value = "/kuWeiGuanLi/delete", method = RequestMethod.POST)
    public JSONObject delete(@RequestBody Map<String, Object> requestParam,HttpServletRequest request,  HttpServletResponse response) {
        JSONObject json = new JSONObject();

        Integer[] uuids = (Integer[]) requestParam.get("uuids");
        try {
            if (uuids != null && uuids.length > 0) {
                for (int i = 0; i < uuids.length; i++) {
                    if (uuids[i] != null) {
                        kuWeiGuanLiMapper.deleteByPrimaryKey(uuids[i]); 
                    }
                }
            }
        
        } catch (Exception e) {
            json.put("retmsg", "失败");
            json.put("retcode", "0");
            return json;
        }
       
        
        json.put("retmsg", "成功");
        json.put("retcode", "1");
        return json;
    }

}
