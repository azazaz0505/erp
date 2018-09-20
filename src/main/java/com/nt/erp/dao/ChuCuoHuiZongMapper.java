package com.nt.erp.dao;

import com.nt.erp.model.ChuCuoHuiZong;
import com.nt.erp.model.ChuCuoHuiZongExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChuCuoHuiZongMapper {
    long countByExample(ChuCuoHuiZongExample example);

    int deleteByExample(ChuCuoHuiZongExample example);

    int deleteByPrimaryKey(Integer uuid);

    int insert(ChuCuoHuiZong record);

    int insertSelective(ChuCuoHuiZong record);

    List<ChuCuoHuiZong> selectByExample(ChuCuoHuiZongExample example);

    ChuCuoHuiZong selectByPrimaryKey(Integer uuid);

    int updateByExampleSelective(@Param("record") ChuCuoHuiZong record, @Param("example") ChuCuoHuiZongExample example);

    int updateByExample(@Param("record") ChuCuoHuiZong record, @Param("example") ChuCuoHuiZongExample example);

    int updateByPrimaryKeySelective(ChuCuoHuiZong record);

    int updateByPrimaryKey(ChuCuoHuiZong record);

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table chucuohuizong
     *
     * @mbg.generated
     * @author hewei
     */
    int batchInsert(@Param("list") List<ChuCuoHuiZong> list);

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table chucuohuizong
     *
     * @mbg.generated
     * @author hewei
     */
    int batchInsertSelective(@Param("list") List<ChuCuoHuiZong> list, @Param("selective") ChuCuoHuiZong.Column ... selective);

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table chucuohuizong
     *
     * @mbg.generated
     * @author hewei
     */
    int upsert(ChuCuoHuiZong record);

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table chucuohuizong
     *
     * @mbg.generated
     * @author hewei
     */
    int upsertSelective(ChuCuoHuiZong record);
}