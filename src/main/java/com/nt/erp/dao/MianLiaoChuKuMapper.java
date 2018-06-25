package com.nt.erp.dao;

import com.nt.erp.model.MianLiaoChuKu;
import com.nt.erp.model.MianLiaoChuKuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MianLiaoChuKuMapper {
    long countByExample(MianLiaoChuKuExample example);

    int deleteByExample(MianLiaoChuKuExample example);

    int deleteByPrimaryKey(Integer uuid);

    int insert(MianLiaoChuKu record);

    int insertSelective(MianLiaoChuKu record);

    List<MianLiaoChuKu> selectByExample(MianLiaoChuKuExample example);

    MianLiaoChuKu selectByPrimaryKey(Integer uuid);

    int updateByExampleSelective(@Param("record") MianLiaoChuKu record, @Param("example") MianLiaoChuKuExample example);

    int updateByExample(@Param("record") MianLiaoChuKu record, @Param("example") MianLiaoChuKuExample example);

    int updateByPrimaryKeySelective(MianLiaoChuKu record);

    int updateByPrimaryKey(MianLiaoChuKu record);

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table mianliaochuku
     *
     * @mbg.generated
     * @author hewei
     */
    int batchInsert(@Param("list") List<MianLiaoChuKu> list);

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table mianliaochuku
     *
     * @mbg.generated
     * @author hewei
     */
    int batchInsertSelective(@Param("list") List<MianLiaoChuKu> list, @Param("selective") MianLiaoChuKu.Column ... selective);

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table mianliaochuku
     *
     * @mbg.generated
     * @author hewei
     */
    int upsert(MianLiaoChuKu record);

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table mianliaochuku
     *
     * @mbg.generated
     * @author hewei
     */
    int upsertSelective(MianLiaoChuKu record);
}