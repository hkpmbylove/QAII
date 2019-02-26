package com.qaii.service.impl;

import com.qaii.dao.PersonlnameMapper;
import com.qaii.service.PersonlnameService;

import javax.annotation.Resource;

public class PersonlnameServiceImpl implements PersonlnameService {
    @Resource
    private PersonlnameMapper personlnameMapper;
    @Override
    public int Insert(String name) {
        return personlnameMapper.Insert(name);
    }
}
