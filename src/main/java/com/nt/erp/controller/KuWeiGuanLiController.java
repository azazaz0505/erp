package com.nt.erp.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.collections.CollectionUtils;
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
        Integer pageNumber = (Integer) requestParam.get("pageNumber");
        Integer pageSize = (Integer) requestParam.get("pageSize");
        if (pageNumber != null && pageNumber >= 1) {
            pageNumber--;
        }
        example.setOffset(pageNumber);
        example.setRows(pageSize);
        
        List<KuWeiGuanLi> rows = new ArrayList<KuWeiGuanLi>();
        long total = 0;
        try {
            rows = kuWeiGuanLiMapper.selectByExample(example);
            total = kuWeiGuanLiMapper.countByExample(example);
        } catch (Exception e) {
            System.out.println(e);
            json.put("retmsg", "失败");
            json.put("retcode", "0");
            return json;
        }
     
        
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
        record.setName((String) requestParam.get("name"));
        record.setCapacity((String) requestParam.get("capacity"));
        record.setOperation((String) requestParam.get("operation"));
        record.setLevel((String) requestParam.get("level"));
      
        try {
            kuWeiGuanLiMapper.insert(record);
        } catch (Exception e) {
            System.out.println(e);
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
        record.setName((String) requestParam.get("name"));
        record.setCapacity((String) requestParam.get("capacity"));
        record.setOperation((String) requestParam.get("operation"));
        
        KuWeiGuanLiExample example = new KuWeiGuanLiExample();
        example.createCriteria().andUuidEqualTo((Integer) requestParam.get("uuid"));
        
        try {
            kuWeiGuanLiMapper.updateByExample(record, example);
        } catch (Exception e) {
            System.out.println(e);
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

        List<Integer> uuids = (List<Integer>) requestParam.get("uuids");
        try {
            if (CollectionUtils.isNotEmpty(uuids)) {
                for (Integer integer : uuids) {
                    if (integer != null) {
                        kuWeiGuanLiMapper.deleteByPrimaryKey(integer); 
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e);
            json.put("retmsg", "失败");
            json.put("retcode", "0");
            return json;
        }
        
        json.put("retmsg", "成功");
        json.put("retcode", "1");
        return json;
    }

}
