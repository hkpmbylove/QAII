package com.qaii.dao;

import java.util.List;

import com.qaii.domain.PeriodicalThesis;
import org.apache.ibatis.annotations.Param;
import org.apache.poi.ss.formula.functions.T;

public interface PeriodicalThesisMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PeriodicalThesis record);

    int insertSelective(PeriodicalThesis record);

    PeriodicalThesis selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PeriodicalThesis record);

    int updateByPrimaryKey(PeriodicalThesis record);
    
    List<PeriodicalThesis> listAllMessage();
    
    int deleteMessages(Integer[] id);
    
    int insertMessage(PeriodicalThesis record);
    
    PeriodicalThesis getMessage(long id);
    
    List<PeriodicalThesis> listNotPass();

    List<String> selectperiodicalthesisName();

    List<T> selectInfoByName(@Param("name")String name);
}