package com.sinoway.cisp.dao;

import com.sinoway.cisp.entitys.ContractDelayHistory;
import com.sinoway.cisp.entitys.ContractDelayHistoryExample;
import com.sinoway.cisp.entitys.ContractDelayHistoryKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContractDelayHistoryMapper {
    int countByExample(ContractDelayHistoryExample example);

    int deleteByExample(ContractDelayHistoryExample example);

    int deleteByPrimaryKey(ContractDelayHistoryKey key);

    int insert(ContractDelayHistory record);

    int insertSelective(ContractDelayHistory record);

    List<ContractDelayHistory> selectByExample(ContractDelayHistoryExample example);

    ContractDelayHistory selectByPrimaryKey(ContractDelayHistoryKey key);

    int updateByExampleSelective(@Param("record") ContractDelayHistory record, @Param("example") ContractDelayHistoryExample example);

    int updateByExample(@Param("record") ContractDelayHistory record, @Param("example") ContractDelayHistoryExample example);

    int updateByPrimaryKeySelective(ContractDelayHistory record);

    int updateByPrimaryKey(ContractDelayHistory record);
}