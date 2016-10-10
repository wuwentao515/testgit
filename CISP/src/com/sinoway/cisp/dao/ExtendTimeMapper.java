package com.sinoway.cisp.dao;

import com.sinoway.cisp.entitys.ExtendTime;
import com.sinoway.cisp.entitys.ExtendTimeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExtendTimeMapper {
    int countByExample(ExtendTimeExample example);

    int deleteByExample(ExtendTimeExample example);

    int deleteByPrimaryKey(String sinoid);

    int insert(ExtendTime record);

    int insertSelective(ExtendTime record);

    List<ExtendTime> selectByExample(ExtendTimeExample example);

    ExtendTime selectByPrimaryKey(String sinoid);

    int updateByExampleSelective(@Param("record") ExtendTime record, @Param("example") ExtendTimeExample example);

    int updateByExample(@Param("record") ExtendTime record, @Param("example") ExtendTimeExample example);

    int updateByPrimaryKeySelective(ExtendTime record);

    int updateByPrimaryKey(ExtendTime record);
}