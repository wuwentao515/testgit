package com.sinoway.cisp.dao;

import com.sinoway.cisp.entitys.PaidMonthlyAmount;
import com.sinoway.cisp.entitys.PaidMonthlyAmountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaidMonthlyAmountMapper {
    int countByExample(PaidMonthlyAmountExample example);

    int deleteByExample(PaidMonthlyAmountExample example);

    int deleteByPrimaryKey(String sinoid);

    int insert(PaidMonthlyAmount record);

    int insertSelective(PaidMonthlyAmount record);

    List<PaidMonthlyAmount> selectByExample(PaidMonthlyAmountExample example);

    List<PaidMonthlyAmount> selectByPrimaryKey(String sinoid);

    int updateByExampleSelective(@Param("record") PaidMonthlyAmount record, @Param("example") PaidMonthlyAmountExample example);

    int updateByExample(@Param("record") PaidMonthlyAmount record, @Param("example") PaidMonthlyAmountExample example);

    int updateByPrimaryKeySelective(PaidMonthlyAmount record);

    int updateByPrimaryKey(PaidMonthlyAmount record);
}