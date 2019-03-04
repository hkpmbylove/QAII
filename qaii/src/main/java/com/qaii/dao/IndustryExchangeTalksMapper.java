package com.qaii.dao;

import com.qaii.domain.IndustryExchangeTalks;
import org.apache.ibatis.annotations.Param;
import org.apache.poi.ss.formula.functions.T;

import java.util.List;

public interface IndustryExchangeTalksMapper {
    int deleteByPrimaryKey(Integer[] id);

    int insert(IndustryExchangeTalks record);

    int insertSelective(IndustryExchangeTalks record);

    IndustryExchangeTalks selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(IndustryExchangeTalks record);

    int updateByPrimaryKey(IndustryExchangeTalks record);

    List<IndustryExchangeTalks> listRecords();

    IndustryExchangeTalks getRecords(Integer id);

    List<String> selectExchangeTalksName();

    List<String> selectExchangeTalksName1();

    List<T> selectInfoByName(@Param("name")String name);

}