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
    
    @RequestMapping(value = "/mianLiaoChuKu/add", method = RequestMethod.POST)
    public JSONObject add(@RequestBody Map<String, Object> requestParam,HttpServletRequest request,  HttpServletResponse response) {
        JSONObject json = new JSONObject();

        MianLiaoChuKu record = new MianLiaoChuKu();
        record.setChukudanhao((Integer) requestParam.get("chukudanhao"));
        record.setChuhuocangku((String) requestParam.get("chuhuocangku"));
        record.setChukufangshi((String) requestParam.get("chukufangshi"));
        record.setBeizhu((String) requestParam.get("beizhu"));
        record.setChukushijian(new Date());
      
        try {
            mianLiaoChuKuMapper.insert(record);
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
    
    @RequestMapping(value = "/mianLiaoChuKu/update", method = RequestMethod.POST)
    public JSONObject update(@RequestBody Map<String, Object> requestParam,HttpServletRequest request,  HttpServletResponse response) {
        JSONObject json = new JSONObject();

        MianLiaoChuKu record = new MianLiaoChuKu();
        record.setChukudanhao((Integer) requestParam.get("chukudanhao"));
        record.setChuhuocangku((String) requestParam.get("chuhuocangku"));
        record.setChukufangshi((String) requestParam.get("chukufangshi"));
        record.setBeizhu((String) requestParam.get("beizhu"));
        
        MianLiaoChuKuExample example = new MianLiaoChuKuExample();
        example.createCriteria().andUuidEqualTo((Integer) requestParam.get("uuid"));
      
        try {
            mianLiaoChuKuMapper.updateByExample(record, example);
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
    

    @RequestMapping(value = "/mianLiaoChuKu/delete", method = RequestMethod.POST)
    public JSONObject delete(@RequestBody Map<String, Object> requestParam,HttpServletRequest request,  HttpServletResponse response) {
        JSONObject json = new JSONObject();

        List<Integer> uuids = (List<Integer>) requestParam.get("uuids");
        try {
            if (CollectionUtils.isNotEmpty(uuids)) {
                for (Integer integer : uuids) {
                    if (integer != null) {
                        mianLiaoChuKuMapper.deleteByPrimaryKey(integer); 
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
