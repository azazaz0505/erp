package com.nt.erp.dao;

import com.nt.erp.model.KuWeiGuanLi;
import com.nt.erp.model.KuWeiGuanLiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KuWeiGuanLiMapper {
    long countByExample(KuWeiGuanLiExample example);

    int deleteByExample(KuWeiGuanLiExample example);

    int deleteByPrimaryKey(Integer uuid);

    int insert(KuWeiGuanLi record);

    int insertSelective(KuWeiGuanLi record);

    List<KuWeiGuanLi> selectByExample(KuWeiGuanLiExample example);

    KuWeiGuanLi selectByPrimaryKey(Integer uuid);

    int updateByExampleSelective(@Param("record") KuWeiGuanLi record, @Param("example") KuWeiGuanLiExample example);

    int updateByExample(@Param("record") KuWeiGuanLi record, @Param("example") KuWeiGuanLiExample example);

    int updateByPrimaryKeySelective(KuWeiGuanLi record);

    int updateByPrimaryKey(KuWeiGuanLi record);

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table kuweiguanli
     *
     * @mbg.generated
     * @author hewei
     */
    int batchInsert(@Param("list") List<KuWeiGuanLi> list);

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table kuweiguanli
     *
     * @mbg.generated
     * @author hewei
     */
    int batchInsertSelective(@Param("list") List<KuWeiGuanLi> list, @Param("selective") KuWeiGuanLi.Column ... selective);

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table kuweiguanli
     *
     * @mbg.generated
     * @author hewei
     */
    int upsert(KuWeiGuanLi record);

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table kuweiguanli
     *
     * @mbg.generated
     * @author hewei
     */
    int upsertSelective(KuWeiGuanLi record);
}