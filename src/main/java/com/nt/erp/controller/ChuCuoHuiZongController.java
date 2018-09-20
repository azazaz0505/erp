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
import com.nt.erp.dao.ChuCuoHuiZongMapper;
import com.nt.erp.model.ChuCuoHuiZong;
import com.nt.erp.model.ChuCuoHuiZongExample;
import com.nt.erp.model.ChuCuoHuiZongExample.Criteria;

@RestController
public class ChuCuoHuiZongController {

    @Autowired
    private ChuCuoHuiZongMapper chuCuoHuiZongMapper;

    @RequestMapping(value = "/errorcollect",method = RequestMethod.POST)
    public JSONObject errorcollect(@RequestBody Map<String, Object> requestParam,HttpServletRequest request,  HttpServletResponse response) {

        JSONObject json = new JSONObject();

        ChuCuoHuiZongExample example = new ChuCuoHuiZongExample();
        Criteria criteria = example.createCriteria();
        
        if (StringUtils.isNotBlank((String) requestParam.get("orderdate"))) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            try {
                criteria.andOrderdateEqualTo(sdf.parse((String) requestParam.get("orderdate")));
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
        
        List<ChuCuoHuiZong> rows = chuCuoHuiZongMapper.selectByExample(example);
        long total = chuCuoHuiZongMapper.countByExample(example);

        json.put("rows", rows);
        json.put("total", total);
        json.put("retmsg", "成功");
        json.put("retcode", "1");
        return json;
    }
    

}
