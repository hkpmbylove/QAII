package com.qaii.dao;

import java.util.List;

import com.qaii.domain.MeetingThesis;
import org.apache.ibatis.annotations.Param;
import org.apache.poi.ss.formula.functions.T;

public interface MeetingThesisMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MeetingThesis record);

    int insertSelective(MeetingThesis record);

    MeetingThesis selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MeetingThesis record);

    int updateByPrimaryKey(MeetingThesis record);
    
    List<MeetingThesis> listAllMessage();
    
    int deleteMessages(Integer[] id);
    
    int insertMessage(MeetingThesis record);
    
    MeetingThesis getMessage(long id);
    
    List<MeetingThesis> listNotPass();

    List<String> selectmeetingthesisName();
    List<String> selectmeetingthesisName1();

    List<T> selectInfoByName(@Param("name")String name);
}