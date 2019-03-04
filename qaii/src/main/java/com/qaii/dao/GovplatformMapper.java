package com.qaii.dao;

import java.util.List;

import com.qaii.domain.Govplatform;
import org.apache.ibatis.annotations.Param;
import org.apache.poi.ss.formula.functions.T;

public interface GovplatformMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Govplatform record);

    int insertSelective(Govplatform record);

    Govplatform selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Govplatform record);

    int updateByPrimaryKey(Govplatform record);
    
    List<Govplatform> getAllPlatformMsg();
    
    int deleteByPrimaryKeys(Integer[] eid);
    
    List<Govplatform> listByNum(int num);

    List<String> selectgovplatformName();

    List<T> selectInfoByName(@Param("name")String name);
}