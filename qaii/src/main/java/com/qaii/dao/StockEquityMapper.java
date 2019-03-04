package com.qaii.dao;

import java.util.List;

import com.qaii.domain.StockEquity;
import org.apache.ibatis.annotations.Param;
import org.apache.poi.ss.formula.functions.T;

public interface StockEquityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StockEquity record);

    int insertSelective(StockEquity record);

    List<StockEquity>selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StockEquity record);

    //更新股东状态码
    int updateShareholderStatus(Integer id);

    int updateByPrimaryKey(StockEquity record);

    int deleteByIncubatorId(Integer[] id);

    List<String> selectstockequityName();

    List<T> selectInfoByName(@Param("name")String name);
}