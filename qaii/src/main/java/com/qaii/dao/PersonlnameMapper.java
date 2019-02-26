package com.qaii.dao;

import com.qaii.domain.Personlname;

public interface PersonlnameMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Personlname record);

    int Insert(String name);

    int insertSelective(Personlname record);

    Personlname selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Personlname record);

    int updateByPrimaryKey(Personlname record);
}