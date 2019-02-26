package com.qaii.dao;

import java.util.List;

import com.qaii.domain.DeptInfo;
import com.qaii.domain.Patent;
import org.apache.poi.ss.formula.functions.T;

public interface PatentMapper {
    int deleteByPrimaryKey(Integer[] id);

    int insert(Patent record);

    int insertSelective(Patent record);

    Patent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Patent record);

    int updateByPrimaryKey(Patent record); 

    int selectCountbyNum();
//新增
    List<String> selectpatentName();

    List<String> selectpatentName1();

    List<String> selectpatentName2();

    List<T> selectInfoByName(String name);

    List<Patent> findAllPatentInfo();
    
    int countAgencyPatent(String firstDay, String endDay);
    
    int countAuthorizationPatent(String firstDay, String endDay);
    
    int countAuthorizationPatentNum();

    Integer countApplyNumber(String Key);
    
    Integer countRejectNumber(String Key);
    
    Integer countAgencyPatentByKey(String key);
    
    Integer countAuthorizationPatentByKey(String key);
}