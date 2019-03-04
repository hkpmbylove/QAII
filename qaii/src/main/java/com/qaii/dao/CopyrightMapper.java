package com.qaii.dao;

import java.util.List;

import com.qaii.domain.Copyright;
import org.apache.ibatis.annotations.Param;
import org.apache.poi.ss.formula.functions.T;

public interface CopyrightMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Copyright record);

    int insertSelective(Copyright record);

    Copyright selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Copyright record);

    int updateByPrimaryKey(Copyright record);
    
    List<Copyright> listCopyright();
    
    int insertReturnid(Copyright record);
    
    Copyright selectWithUrl(Integer id);
    
    int deleteByPrimaryKeys(Integer[] id);

    List<String> selectcopyrightName();
    List<String> selectcopyrightName1();
    List<String> selectcopyrightName2();

    List<T> selectInfoByName(@Param("name")String name);

}