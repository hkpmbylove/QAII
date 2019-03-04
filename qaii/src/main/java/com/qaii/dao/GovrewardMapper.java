package com.qaii.dao;

import java.util.List;

import com.qaii.domain.Govreward;
import org.apache.ibatis.annotations.Param;
import org.apache.poi.ss.formula.functions.T;

public interface GovrewardMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Govreward record);

    int insertSelective(Govreward record);

    Govreward selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Govreward record);

    int updateByPrimaryKey(Govreward record);
    
    List<Govreward> getAllrewardMsg();
    
    int deleteByPrimaryKeys(Integer[] eid);
    
    List<Govreward> listByNum(int num);

    List<String> selectgovrewardName();

    List<T> selectInfoByName(@Param("name")String name);

}