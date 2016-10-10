package com.sinoway.cisp.dao;

import com.sinoway.cisp.entitys.DissentDetail;
import com.sinoway.cisp.entitys.DissentDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DissentDetailMapper {
    int countByExample(DissentDetailExample example);

    int deleteByExample(DissentDetailExample example);

    int deleteByPrimaryKey(String dissentId);

    int insert(DissentDetail record);

    int insertSelective(DissentDetail record);

    List<DissentDetail> selectByExample(DissentDetailExample example);

    DissentDetail selectByPrimaryKey(String dissentId);

    int updateByExampleSelective(@Param("record") DissentDetail record, @Param("example") DissentDetailExample example);

    int updateByExample(@Param("record") DissentDetail record, @Param("example") DissentDetailExample example);

    int updateByPrimaryKeySelective(DissentDetail record);

    int updateByPrimaryKey(DissentDetail record);
    /*
     * cardid
     * dissentdetail list
     */
    List<DissentDetail> selectBycardid(String cardid);
}