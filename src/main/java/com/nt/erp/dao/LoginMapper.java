package com.nt.erp.dao;

import com.nt.erp.model.Login;
import com.nt.erp.model.LoginExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoginMapper {
    long countByExample(LoginExample example);

    int deleteByExample(LoginExample example);

    int deleteByPrimaryKey(String loginaccount);

    int insert(Login record);

    int insertSelective(Login record);

    List<Login> selectByExample(LoginExample example);

    Login selectByPrimaryKey(String loginaccount);

    int updateByExampleSelective(@Param("record") Login record, @Param("example") LoginExample example);

    int updateByExample(@Param("record") Login record, @Param("example") LoginExample example);

    int updateByPrimaryKeySelective(Login record);

    int updateByPrimaryKey(Login record);

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table login
     *
     * @mbg.generated
     * @author hewei
     */
    int batchInsert(@Param("list") List<Login> list);

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table login
     *
     * @mbg.generated
     * @author hewei
     */
    int batchInsertSelective(@Param("list") List<Login> list, @Param("selective") Login.Column ... selective);

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table login
     *
     * @mbg.generated
     * @author hewei
     */
    int upsert(Login record);

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table login
     *
     * @mbg.generated
     * @author hewei
     */
    int upsertSelective(Login record);
}