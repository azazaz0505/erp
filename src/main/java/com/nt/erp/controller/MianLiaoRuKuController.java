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
import com.nt.erp.dao.MianLiaoRuKuMapper;
import com.nt.erp.model.MianLiaoRuKu;
import com.nt.erp.model.MianLiaoRuKuExample;

@RestController
public class MianLiaoRuKuController {

    @Autowired
    private MianLiaoRuKuMapper mianLiaoRuKuMapper;

    //入参报文需要根据前台需要修改
    @RequestMapping(value = "/mianLiaoRuKu/select", method = RequestMethod.POST)
    public JSONObject info(@RequestBody Map<String, Object> requestParam,HttpServletRequest request,  HttpServletResponse response) {

        JSONObject json = new JSONObject();
        
        MianLiaoRuKuExample example = new MianLiaoRuKuExample();
        Integer pageNumber = (Integer) requestParam.get("pageNumber");
        Integer pageSize = (Integer) requestParam.get("pageSize");
        if (pageNumber != null && pageNumber >= 1) {
            pageNumber--;
        }
        example.setOffset(pageNumber);
        example.setRows(pageSize);
      
        List<MianLiaoRuKu> rows = mianLiaoRuKuMapper.selectByExample(example);
        long total = mianLiaoRuKuMapper.countByExample(example);
        json.put("rows", rows);
        json.put("total", total);
        
        json.put("retmsg", "成功");
        json.put("retcode", "1");
        return json;
    }
    
    @RequestMapping(value = "/mianLiaoRuKu/add", method = RequestMethod.POST)
    public JSONObject add(@RequestBody Map<String, Object> requestParam,HttpServletRequest request,  HttpServletResponse response) {
        JSONObject json = new JSONObject();

        MianLiaoRuKu record = new MianLiaoRuKu();
        record.setRukudanhao((Integer) requestParam.get("rukudanhao"));
        record.setShouhuocangku((String) requestParam.get("shouhuocangku"));
        record.setRukufangshi((String) requestParam.get("rukufangshi"));
        record.setBeizhu((String) requestParam.get("beizhu"));
        record.setRikushijian(new Date());
      
        try {
            mianLiaoRuKuMapper.insert(record);
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
    
    @RequestMapping(value = "/mianLiaoRuKu/update", method = RequestMethod.POST)
    public JSONObject update(@RequestBody Map<String, Object> requestParam,HttpServletRequest request,  HttpServletResponse response) {
        JSONObject json = new JSONObject();

        MianLiaoRuKu record = new MianLiaoRuKu();
        record.setRukudanhao((Integer) requestParam.get("rukudanhao"));
        record.setShouhuocangku((String) requestParam.get("shouhuocangku"));
        record.setRukufangshi((String) requestParam.get("rukufangshi"));
        record.setBeizhu((String) requestParam.get("beizhu"));
        
        MianLiaoRuKuExample example = new MianLiaoRuKuExample();
        example.createCriteria().andUuidEqualTo((Integer) requestParam.get("uuid"));
        
        try {
            mianLiaoRuKuMapper.updateByExample(record, example);
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
    

    @RequestMapping(value = "/mianLiaoRuKu/delete", method = RequestMethod.POST)
    public JSONObject delete(@RequestBody Map<String, Object> requestParam,HttpServletRequest request,  HttpServletResponse response) {
        JSONObject json = new JSONObject();
        
        @SuppressWarnings("unchecked")
        List<Integer> uuids = (List<Integer>) requestParam.get("uuids");
        try {
            if (CollectionUtils.isNotEmpty(uuids)) {
                for (Integer integer : uuids) {
                    if (integer != null) {
                        mianLiaoRuKuMapper.deleteByPrimaryKey(integer); 
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
