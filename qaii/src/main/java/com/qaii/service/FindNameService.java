package com.qaii.service;

import org.apache.poi.ss.formula.functions.T;

import java.util.List;

public interface FindNameService {
    List<String> selectpatentName();
    List<String> selectpatentName1();
    List<String> selectpatentName2();

    List<T> selectInfoByName(String name);
}
