package com.nt.erp.controller;

import java.util.Date;
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
import com.nt.erp.dao.ChuCuoHuiZongMapper;
import com.nt.erp.model.ChuCuoHuiZong;
import com.nt.erp.model.ChuCuoHuiZongExample;

@RestController
public class ChuCuoHuiZongController {

    @Autowired
    private ChuCuoHuiZongMapper chuCuoHuiZongMapper;

    @RequestMapping(value = "/errorcollect",method = RequestMethod.POST)
    public JSONObject errorcollect(@RequestBody Map<String, Object> requestParam,HttpServletRequest request,  HttpServletResponse response) {

        JSONObject json = new JSONObject();

        ChuCuoHuiZongExample example = new ChuCuoHuiZongExample();
        example.createCriteria()
        .andOrderdateGreaterThanOrEqualTo((Date) requestParam.get("orderdate"));
        
        
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
