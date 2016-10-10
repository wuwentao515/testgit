package com.sinoway.cisp.dao;

import com.sinoway.cisp.entitys.InstiDetail;
import com.sinoway.cisp.entitys.InstiDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InstiDetailMapper {
    int countByExample(InstiDetailExample example);

    int deleteByExample(InstiDetailExample example);

    int deleteByPrimaryKey(Integer instiCode);

    int insert(InstiDetail record);

    int insertSelective(InstiDetail record);

    List<InstiDetail> selectByExample(InstiDetailExample example);

    InstiDetail selectByPrimaryKey(Integer instiCode);

    int updateByExampleSelective(@Param("record") InstiDetail record, @Param("example") InstiDetailExample example);

    int updateByExample(@Param("record") InstiDetail record, @Param("example") InstiDetailExample example);

    int updateByPrimaryKeySelective(InstiDetail record);

    int updateByPrimaryKey(InstiDetail record);
    InstiDetail selectByCode(String insti_code);
}