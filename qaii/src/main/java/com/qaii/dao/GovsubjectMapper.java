package com.qaii.dao;

import java.util.List;

import com.qaii.domain.Govsubject;
import org.apache.ibatis.annotations.Param;
import org.apache.poi.ss.formula.functions.T;

public interface GovsubjectMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Govsubject record);

    int insertSelective(Govsubject record);

    Govsubject selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Govsubject record);

    int updateByPrimaryKey(Govsubject record);
    
    List<Govsubject> getAllSubjectMsg();
    
    int deleteByPrimaryKeys(Integer[] eid);
    
    List<Govsubject> listByNum(int num);

    //纵向课题
    List<String> selectProjectPerName();
    //纵向课题

    List<T> selectInfoByName(@Param("name")String name);
}