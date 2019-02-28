package com.qaii.service;

import com.qaii.domain.deptChildinfo;
import org.apache.poi.ss.formula.functions.T;

import java.util.List;

public interface ChilddeptService {

        int deletePid(Integer id);

        int deleteByPrimaryKey(Integer id);

        int insert(deptChildinfo record);

        int insertSelective(deptChildinfo record);

        deptChildinfo selectByPrimaryKey(Integer id);

        List<deptChildinfo> selectdeptInfoById(Integer id);

        List<deptChildinfo> selectdeptInfosById(Integer id);

        int updateByPrimaryKeySelective(deptChildinfo record);

        int updateByPrimaryKey(deptChildinfo record);

        int updateDeptInfoById(deptChildinfo record);

}
