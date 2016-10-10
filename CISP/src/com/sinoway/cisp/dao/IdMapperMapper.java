package com.sinoway.cisp.dao;

import com.sinoway.cisp.entitys.IdMapper;
import com.sinoway.cisp.entitys.IdMapperExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IdMapperMapper {
    int countByExample(IdMapperExample example);

    int deleteByExample(IdMapperExample example);

    int deleteByPrimaryKey(String sinoid);

    int insert(IdMapper record);

    int insertSelective(IdMapper record);

    List<IdMapper> selectByExample(IdMapperExample example);

    IdMapper selectByPrimaryKey(String sinoid);

    int updateByExampleSelective(@Param("record") IdMapper record, @Param("example") IdMapperExample example);

    int updateByExample(@Param("record") IdMapper record, @Param("example") IdMapperExample example);

    int updateByPrimaryKeySelective(IdMapper record);

    int updateByPrimaryKey(IdMapper record);
    
    //jzj 根据sinoid查到
    IdMapper selectBysinoid(String sinoid);
    
    IdMapper getNameByCardid(String cardid);
}