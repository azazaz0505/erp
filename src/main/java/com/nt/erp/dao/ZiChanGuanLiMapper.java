package com.nt.erp.dao;

import com.nt.erp.model.ZiChanGuanLi;
import com.nt.erp.model.ZiChanGuanLiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZiChanGuanLiMapper {
    long countByExample(ZiChanGuanLiExample example);

    int deleteByExample(ZiChanGuanLiExample example);

    int deleteByPrimaryKey(Integer uuid);

    int insert(ZiChanGuanLi record);

    int insertSelective(ZiChanGuanLi record);

    List<ZiChanGuanLi> selectByExample(ZiChanGuanLiExample example);

    ZiChanGuanLi selectByPrimaryKey(Integer uuid);

    int updateByExampleSelective(@Param("record") ZiChanGuanLi record, @Param("example") ZiChanGuanLiExample example);

    int updateByExample(@Param("record") ZiChanGuanLi record, @Param("example") ZiChanGuanLiExample example);

    int updateByPrimaryKeySelective(ZiChanGuanLi record);

    int updateByPrimaryKey(ZiChanGuanLi record);

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table zichanguanli
     *
     * @mbg.generated
     * @author hewei
     */
    int batchInsert(@Param("list") List<ZiChanGuanLi> list);

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table zichanguanli
     *
     * @mbg.generated
     * @author hewei
     */
    int batchInsertSelective(@Param("list") List<ZiChanGuanLi> list, @Param("selective") ZiChanGuanLi.Column ... selective);

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table zichanguanli
     *
     * @mbg.generated
     * @author hewei
     */
    int upsert(ZiChanGuanLi record);

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table zichanguanli
     *
     * @mbg.generated
     * @author hewei
     */
    int upsertSelective(ZiChanGuanLi record);
}