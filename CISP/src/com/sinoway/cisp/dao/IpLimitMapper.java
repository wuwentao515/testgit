package com.sinoway.cisp.dao;

import com.sinoway.cisp.entitys.IpLimit;
import com.sinoway.cisp.entitys.IpLimitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IpLimitMapper {
    int countByExample(IpLimitExample example);

    int deleteByExample(IpLimitExample example);

    int deleteByPrimaryKey(String userAccount);

    int insert(IpLimit record);

    int insertSelective(IpLimit record);

    List<IpLimit> selectByExample(IpLimitExample example);

    IpLimit selectByPrimaryKey(String userAccount);

    int updateByExampleSelective(@Param("record") IpLimit record, @Param("example") IpLimitExample example);

    int updateByExample(@Param("record") IpLimit record, @Param("example") IpLimitExample example);

    int updateByPrimaryKeySelective(IpLimit record);

    int updateByPrimaryKey(IpLimit record);
}