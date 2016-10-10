package com.sinoway.cisp.dao;

import com.sinoway.cisp.entitys.ContractAcceptDetail;
import com.sinoway.cisp.entitys.ContractAcceptDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContractAcceptDetailMapper {
    int countByExample(ContractAcceptDetailExample example);

    int deleteByExample(ContractAcceptDetailExample example);

    int deleteByPrimaryKey(String sinoid);

    int insert(ContractAcceptDetail record);

    int insertSelective(ContractAcceptDetail record);

    List<ContractAcceptDetail> selectByExample(ContractAcceptDetailExample example);

    ContractAcceptDetail selectByPrimaryKey(String sinoid);

    int updateByExampleSelective(@Param("record") ContractAcceptDetail record, @Param("example") ContractAcceptDetailExample example);

    int updateByExample(@Param("record") ContractAcceptDetail record, @Param("example") ContractAcceptDetailExample example);

    int updateByPrimaryKeySelective(ContractAcceptDetail record);

    int updateByPrimaryKey(ContractAcceptDetail record);
	/*
     * 根据cardid查出所有实体
     * jzj
     */
    List<ContractAcceptDetail> selectByCardid(String cardid);
}