package com.nt.erp.controller;

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
import com.nt.erp.dao.GongYingShangWangLaiMapper;
import com.nt.erp.model.GongYingShangWangLai;
import com.nt.erp.model.GongYingShangWangLaiExample;

@RestController
public class GongYingShangWangLaiController {

    @Autowired
    private GongYingShangWangLaiMapper gongYingShangWangLaiMapper;

    //入参报文需要根据前台需要修改
    @RequestMapping(value = "/gongYingShangWangLai/select", method = RequestMethod.POST)
    public JSONObject info(@RequestBody Map<String, Object> requestParam,HttpServletRequest request,  HttpServletResponse response) {

        JSONObject json = new JSONObject();

        GongYingShangWangLaiExample example = new GongYingShangWangLaiExample();
        Integer pageNumber = (Integer) requestParam.get("pageNumber");
        Integer pageSize = (Integer) requestParam.get("pageSize");
        if (pageNumber != null && pageNumber >= 1) {
            pageNumber--;
        }
        example.setOffset(pageNumber);
        example.setRows(pageSize);
        
        List<GongYingShangWangLai> rows = gongYingShangWangLaiMapper.selectByExample(example);
        long total = gongYingShangWangLaiMapper.countByExample(example);
        json.put("rows", rows);
        json.put("total", total);
        json.put("retmsg", "成功");
        json.put("retcode", "1");
        return json;
    }
    
    @RequestMapping(value = "/gongYingShangWangLai/add", method = RequestMethod.POST)
    public JSONObject add(@RequestBody Map<String, Object> requestParam,HttpServletRequest request,  HttpServletResponse response) {
        JSONObject json = new JSONObject();

        GongYingShangWangLai record = new GongYingShangWangLai();
        record.setBaobiao((String) requestParam.get("baobiao"));
        record.setFukuan((String) requestParam.get("fukuan"));
        record.setGongyingshanbianma((String) requestParam.get("gongyingshanbianma"));
        record.setGongyingshangmingcheng((String) requestParam.get("gongyingshangmingcheng"));
        record.setHetongzongjine((Double) requestParam.get("hetongzongjine"));
        record.setRukuzongjine((Double) requestParam.get("rukuzongjine"));
        record.setWeikaipiaojine((Double) requestParam.get("weikaipiaojine"));
        record.setYifukuanjine((Double) requestParam.get("yifukuanjine"));
        record.setYikaipiaojine((Double) requestParam.get("yikaipiaojine"));
        record.setYufukuan((Double) requestParam.get("yufukuan"));
      
        try {
            gongYingShangWangLaiMapper.insert(record);
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
    
    @RequestMapping(value = "/gongYingShangWangLai/update", method = RequestMethod.POST)
    public JSONObject update(@RequestBody Map<String, Object> requestParam,HttpServletRequest request,  HttpServletResponse response) {
        JSONObject json = new JSONObject();

        GongYingShangWangLai record = new GongYingShangWangLai();
        record.setBaobiao((String) requestParam.get("baobiao"));
        record.setFukuan((String) requestParam.get("fukuan"));
        record.setGongyingshanbianma((String) requestParam.get("gongyingshanbianma"));
        record.setGongyingshangmingcheng((String) requestParam.get("gongyingshangmingcheng"));
        record.setHetongzongjine((Double) requestParam.get("hetongzongjine"));
        record.setRukuzongjine((Double) requestParam.get("rukuzongjine"));
        record.setWeikaipiaojine((Double) requestParam.get("weikaipiaojine"));
        record.setYifukuanjine((Double) requestParam.get("yifukuanjine"));
        record.setYikaipiaojine((Double) requestParam.get("yikaipiaojine"));
        record.setYufukuan((Double) requestParam.get("yufukuan"));
        
        GongYingShangWangLaiExample example = new GongYingShangWangLaiExample();
        example.createCriteria().andUuidEqualTo((Integer) requestParam.get("uuid"));
        
        try {
            gongYingShangWangLaiMapper.updateByExample(record, example);
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

    @RequestMapping(value = "/gongYingShangWangLai/delete", method = RequestMethod.POST)
    public JSONObject delete(@RequestBody Map<String, Object> requestParam,HttpServletRequest request,  HttpServletResponse response) {
        JSONObject json = new JSONObject();

        @SuppressWarnings("unchecked")
        List<Integer> uuids = (List<Integer>) requestParam.get("uuids");
        try {
            if (CollectionUtils.isNotEmpty(uuids)) {
                for (Integer integer : uuids) {
                    if (integer != null) {
                        gongYingShangWangLaiMapper.deleteByPrimaryKey(integer); 
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
