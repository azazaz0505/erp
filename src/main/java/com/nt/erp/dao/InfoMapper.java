package com.nt.erp.dao;

import com.nt.erp.model.Info;
import com.nt.erp.model.InfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InfoMapper {
    long countByExample(InfoExample example);

    int deleteByExample(InfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Info record);

    int insertSelective(Info record);

    List<Info> selectByExample(InfoExample example);

    Info selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Info record, @Param("example") InfoExample example);

    int updateByExample(@Param("record") Info record, @Param("example") InfoExample example);

    int updateByPrimaryKeySelective(Info record);

    int updateByPrimaryKey(Info record);

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table infos
     *
     * @mbg.generated
     * @author hewei
     */
    int batchInsert(@Param("list") List<Info> list);

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table infos
     *
     * @mbg.generated
     * @author hewei
     */
    int batchInsertSelective(@Param("list") List<Info> list, @Param("selective") Info.Column ... selective);

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table infos
     *
     * @mbg.generated
     * @author hewei
     */
    int upsert(Info record);

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table infos
     *
     * @mbg.generated
     * @author hewei
     */
    int upsertSelective(Info record);
}