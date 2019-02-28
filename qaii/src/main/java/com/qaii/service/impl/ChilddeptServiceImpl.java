package com.qaii.service.impl;


import com.qaii.dao.deptChildinfoMapper;
import com.qaii.domain.deptChildinfo;
import com.qaii.service.ChilddeptService;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ChilddeptServiceImpl implements ChilddeptService {
    @Resource
    private deptChildinfoMapper deptChildinfoMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return deptChildinfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(deptChildinfo record) {
        return deptChildinfoMapper.insert(record);
    }

    @Override
    public int insertSelective(deptChildinfo record) {
        return deptChildinfoMapper.insertSelective(record);
    }

    @Override
    public deptChildinfo selectByPrimaryKey(Integer id) {
        return deptChildinfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(deptChildinfo record) {
        return deptChildinfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<deptChildinfo> selectdeptInfoById(Integer id) {
        return deptChildinfoMapper.selectdeptInfoById(id);
    }

    @Override
    public List<deptChildinfo> selectdeptInfosById(Integer id) {
        return deptChildinfoMapper.selectdeptInfosById(id);
    }

    @Override
    public int updateByPrimaryKey(deptChildinfo record) {
        return deptChildinfoMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateDeptInfoById(deptChildinfo record) {
        return deptChildinfoMapper.updateDeptInfoById(record);
    }

    @Override
    public int deletePid(Integer id) {
        return deptChildinfoMapper.deletePid(id);
    }
}
