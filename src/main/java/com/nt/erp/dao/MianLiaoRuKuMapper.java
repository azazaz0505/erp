package com.nt.erp.dao;

import com.nt.erp.model.MianLiaoRuKu;
import com.nt.erp.model.MianLiaoRuKuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MianLiaoRuKuMapper {
    long countByExample(MianLiaoRuKuExample example);

    int deleteByExample(MianLiaoRuKuExample example);

    int deleteByPrimaryKey(Integer uuid);

    int insert(MianLiaoRuKu record);

    int insertSelective(MianLiaoRuKu record);

    List<MianLiaoRuKu> selectByExample(MianLiaoRuKuExample example);

    MianLiaoRuKu selectByPrimaryKey(Integer uuid);

    int updateByExampleSelective(@Param("record") MianLiaoRuKu record, @Param("example") MianLiaoRuKuExample example);

    int updateByExample(@Param("record") MianLiaoRuKu record, @Param("example") MianLiaoRuKuExample example);

    int updateByPrimaryKeySelective(MianLiaoRuKu record);

    int updateByPrimaryKey(MianLiaoRuKu record);

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table mianliaoruku
     *
     * @mbg.generated
     * @author hewei
     */
    int batchInsert(@Param("list") List<MianLiaoRuKu> list);

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table mianliaoruku
     *
     * @mbg.generated
     * @author hewei
     */
    int batchInsertSelective(@Param("list") List<MianLiaoRuKu> list, @Param("selective") MianLiaoRuKu.Column ... selective);

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table mianliaoruku
     *
     * @mbg.generated
     * @author hewei
     */
    int upsert(MianLiaoRuKu record);

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table mianliaoruku
     *
     * @mbg.generated
     * @author hewei
     */
    int upsertSelective(MianLiaoRuKu record);
}