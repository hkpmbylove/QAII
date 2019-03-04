package com.qaii.dao;

import java.util.List;

import com.qaii.domain.Softwarecopyright;
import org.apache.ibatis.annotations.Param;
import org.apache.poi.ss.formula.functions.T;

public interface SoftwarecopyrightMapper {

    //新增软著
    List<String> selectsoftwarecopyrightName();
    List<String> selectsoftwarecopyrightName1();
    List<String> selectsoftwarecopyrightName2();
    //新增软著
    List<T> selectInfoByName(@Param("name")String name);

    int deleteByPrimaryKey(Integer id);

    int insert(Softwarecopyright record);

    int insertSelective(Softwarecopyright record);

    Softwarecopyright selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Softwarecopyright record);

    int updateByPrimaryKey(Softwarecopyright record);
    
    int selectCountNum();
    
    List<Softwarecopyright> getAllSoftWareMsg();
    
    int deleteByPrimaryKeys(Integer[] eid);
    
    int countApplycopyright(String firstDay, String endDay);
    
    int countAuthorizationcopyright(String firstDay, String endDay);
    
    int countAuthorizationcopyrightNum();
    
    int insertreturnId(Softwarecopyright record);
    
    Softwarecopyright selectFileMsg(int id);
}