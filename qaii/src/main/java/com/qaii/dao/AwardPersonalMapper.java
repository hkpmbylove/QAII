package com.qaii.dao;

import com.qaii.domain.AwardPersonal;
import org.apache.ibatis.annotations.Param;
import org.apache.poi.ss.formula.functions.T;

import java.util.List;

public interface AwardPersonalMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AwardPersonal record);

    int insertSelective(AwardPersonal record);

    AwardPersonal selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AwardPersonal record);

    int updateByPrimaryKey(AwardPersonal record);

    int insertRecordReturnID(AwardPersonal record);

    int deleteByPrimaryKeys(Integer[] id);

    List<AwardPersonal> listRecords();

    List<AwardPersonal> listPersonal();

    AwardPersonal getRecord(Integer id);

    List<String> selectawardpersonalName();

    List<T> selectInfoByName(@Param("name")String name);
}