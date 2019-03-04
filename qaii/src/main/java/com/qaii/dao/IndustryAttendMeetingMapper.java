package com.qaii.dao;

import com.qaii.domain.IndustryAttendMeeting;
import org.apache.ibatis.annotations.Param;
import org.apache.poi.ss.formula.functions.T;

import java.util.List;

public interface IndustryAttendMeetingMapper {
    int deleteByPrimaryKey(Integer[] id);

    int insert(IndustryAttendMeeting record);

    int insertSelective(IndustryAttendMeeting record);

    IndustryAttendMeeting selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(IndustryAttendMeeting record);

    int updateByPrimaryKey(IndustryAttendMeeting record);

    List<IndustryAttendMeeting> listRecords();

    IndustryAttendMeeting getRecords(Integer id);

    List<String> selectAttendMeetingName();

    List<T> selectInfoByName(@Param("name")String name);

}