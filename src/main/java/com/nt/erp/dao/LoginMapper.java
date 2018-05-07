package com.nt.erp.dao;

import com.nt.erp.model.Login;
import java.util.List;

public interface LoginMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Login record);

    Login selectByPrimaryKey(Integer id);

    List<Login> selectAll();

    int updateByPrimaryKey(Login record);
}