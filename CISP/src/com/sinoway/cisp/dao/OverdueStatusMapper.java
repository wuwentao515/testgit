package com.sinoway.cisp.dao;

import com.sinoway.cisp.entitys.OverdueStatus;
import com.sinoway.cisp.entitys.OverdueStatusExample;
import com.sinoway.cisp.entitys.OverdueStatusKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OverdueStatusMapper {
    int countByExample(OverdueStatusExample example);

    int deleteByExample(OverdueStatusExample example);

    int deleteByPrimaryKey(OverdueStatusKey key);

    int insert(OverdueStatus record);

    int insertSelective(OverdueStatus record);

    List<OverdueStatus> selectByExample(OverdueStatusExample example);

    OverdueStatus selectByPrimaryKey(OverdueStatusKey key);

    int updateByExampleSelective(@Param("record") OverdueStatus record, @Param("example") OverdueStatusExample example);

    int updateByExample(@Param("record") OverdueStatus record, @Param("example") OverdueStatusExample example);

    int updateByPrimaryKeySelective(OverdueStatus record);

    int updateByPrimaryKey(OverdueStatus record);
/*
     * para:cardid
     * 
     */
    List<OverdueStatus> selectByCardid(String cardid);
}