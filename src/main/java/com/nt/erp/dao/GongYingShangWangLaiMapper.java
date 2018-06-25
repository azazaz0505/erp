package com.nt.erp.dao;

import com.nt.erp.model.GongYingShangWangLai;
import com.nt.erp.model.GongYingShangWangLaiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GongYingShangWangLaiMapper {
    long countByExample(GongYingShangWangLaiExample example);

    int deleteByExample(GongYingShangWangLaiExample example);

    int deleteByPrimaryKey(Integer uuid);

    int insert(GongYingShangWangLai record);

    int insertSelective(GongYingShangWangLai record);

    List<GongYingShangWangLai> selectByExample(GongYingShangWangLaiExample example);

    GongYingShangWangLai selectByPrimaryKey(Integer uuid);

    int updateByExampleSelective(@Param("record") GongYingShangWangLai record, @Param("example") GongYingShangWangLaiExample example);

    int updateByExample(@Param("record") GongYingShangWangLai record, @Param("example") GongYingShangWangLaiExample example);

    int updateByPrimaryKeySelective(GongYingShangWangLai record);

    int updateByPrimaryKey(GongYingShangWangLai record);

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table gongyingshangwanglai
     *
     * @mbg.generated
     * @author hewei
     */
    int batchInsert(@Param("list") List<GongYingShangWangLai> list);

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table gongyingshangwanglai
     *
     * @mbg.generated
     * @author hewei
     */
    int batchInsertSelective(@Param("list") List<GongYingShangWangLai> list, @Param("selective") GongYingShangWangLai.Column ... selective);

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table gongyingshangwanglai
     *
     * @mbg.generated
     * @author hewei
     */
    int upsert(GongYingShangWangLai record);

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table gongyingshangwanglai
     *
     * @mbg.generated
     * @author hewei
     */
    int upsertSelective(GongYingShangWangLai record);
}