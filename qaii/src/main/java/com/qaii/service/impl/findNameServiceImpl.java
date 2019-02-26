package com.qaii.service.impl;

import com.qaii.dao.PatentMapper;
import com.qaii.service.FindNameService;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class findNameServiceImpl implements FindNameService {
@Resource
private PatentMapper patentMapper;
    @Override
    public List<String> selectpatentName() {
        return patentMapper.selectpatentName();
    }

    @Override
    public List<String> selectpatentName1() {
        return patentMapper.selectpatentName1();
    }

    @Override
    public List<String> selectpatentName2() {
        return patentMapper.selectpatentName2();
    }

    @Override
    public List<T> selectInfoByName(String name) {
        return patentMapper.selectInfoByName(name);
    }
}
