package com.nt.erp.controller;

import java.util.Date;
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
import com.nt.erp.dao.ZiChanGuanLiMapper;
import com.nt.erp.model.MianLiaoRuKu;
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

        ZiChanGuanLiExample example = new ZiChanGuanLiExample();
        Integer pageNumber = (Integer) requestParam.get("pageNumber");
        Integer pageSize = (Integer) requestParam.get("pageSize");
        if (pageNumber != null && pageNumber >= 1) {
            pageNumber--;
        }
        example.setOffset(pageNumber);
        example.setRows(pageSize);
        
        List<ZiChanGuanLi> rows = ziChanGuanLiMapper.selectByExample(example);
        long total = ziChanGuanLiMapper.countByExample(example);
        
        json.put("rows", rows);
        json.put("total", total);
        json.put("retmsg", "成功");
        json.put("retcode", "1");
        return json;
    }
    
    @RequestMapping(value = "/ziChanGuanLi/add", method = RequestMethod.POST)
    public JSONObject add(@RequestBody Map<String, Object> requestParam,HttpServletRequest request,  HttpServletResponse response) {
        JSONObject json = new JSONObject();

        ZiChanGuanLi record = new ZiChanGuanLi();
        record.setGudingzichanbiana((String) requestParam.get("gudingzichanbiana"));
        record.setGudingzichanleixing((String) requestParam.get("gudingzichanleixing"));
        record.setGudingzichanmingcheng((String) requestParam.get("gudingzichanmingcheng"));
        record.setJingcanzhi((String) requestParam.get("jingcanzhi"));
        record.setYuanzhi((String) requestParam.get("yuanzhi"));
        record.setZhejiunianxian(new Date());
      
        try {
            ziChanGuanLiMapper.insert(record);
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
    
    @RequestMapping(value = "/ziChanGuanLi/update", method = RequestMethod.POST)
    public JSONObject update(@RequestBody Map<String, Object> requestParam,HttpServletRequest request,  HttpServletResponse response) {
        JSONObject json = new JSONObject();

        ZiChanGuanLi record = new ZiChanGuanLi();
        record.setGudingzichanbiana((String) requestParam.get("gudingzichanbiana"));
        record.setGudingzichanleixing((String) requestParam.get("gudingzichanleixing"));
        record.setGudingzichanmingcheng((String) requestParam.get("gudingzichanmingcheng"));
        record.setJingcanzhi((String) requestParam.get("jingcanzhi"));
        record.setYuanzhi((String) requestParam.get("yuanzhi"));
        
        ZiChanGuanLiExample example = new ZiChanGuanLiExample();
        example.createCriteria().andGudingzichanbianaEqualTo((String) requestParam.get("gudingzichanbiana"));
      
        try {
            ziChanGuanLiMapper.updateByExample(record, example);
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
    
    

    @RequestMapping(value = "/ziChanGuanLi/delete", method = RequestMethod.POST)
    public JSONObject delete(@RequestBody Map<String, Object> requestParam,HttpServletRequest request,  HttpServletResponse response) {
        JSONObject json = new JSONObject();
        
        List<Integer> uuids = (List<Integer>) requestParam.get("uuids");
        try {
            if (CollectionUtils.isNotEmpty(uuids)) {
                for (Integer integer : uuids) {
                    if (integer != null) {
                        ziChanGuanLiMapper.deleteByPrimaryKey(integer); 
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
