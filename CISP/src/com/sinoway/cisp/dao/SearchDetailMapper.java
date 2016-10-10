package com.sinoway.cisp.dao;

import com.sinoway.cisp.entitys.SearchDetail;
import com.sinoway.cisp.entitys.SearchDetailExample;
import com.sinoway.cisp.entitys.SearchDetailKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SearchDetailMapper {
    int countByExample(SearchDetailExample example);

    int deleteByExample(SearchDetailExample example);

    int deleteByPrimaryKey(SearchDetailKey key);

    int insert(SearchDetail record);

    int insertSelective(SearchDetail record);

    List<SearchDetail> selectByExample(SearchDetailExample example);

    SearchDetail selectByPrimaryKey(SearchDetailKey key);

    int updateByExampleSelective(@Param("record") SearchDetail record, @Param("example") SearchDetailExample example);

    int updateByExample(@Param("record") SearchDetail record, @Param("example") SearchDetailExample example);

    int updateByPrimaryKeySelective(SearchDetail record);

    int updateByPrimaryKey(SearchDetail record);
    /*
     * 查找此人所有的查询记录
     * 
     * 
     */
    List<SearchDetail> selectBycardid(String cardid);
}