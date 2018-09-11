package com.qaii.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.qaii.domain.EmpInfo;

public interface EmpInfoMapper {
    int deleteByPrimaryKeys(Integer[] eid);

    int insert(EmpInfo record);

    int insertSelective(EmpInfo record);

    EmpInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EmpInfo record);

    int updateByPrimaryKey(EmpInfo record);
    
    List<EmpInfo> checkbyContract(String empContractendtime);
    
    List<EmpInfo> checkbyTry(String empTryoutendtime);
    
    int selectnumbyEntry(String lastm,String thism);
    
    int selectnumbyDeparture(String lastm,String thism);
    
    int selectnumofcollege(String lastm,String thism);
    
    int selectnumofIncubationComp(String lasty,String thisy);
    
    int selectnumofcollegeComp(String lasty,String thisy,@Param("list") List<String> list);
    
    int selectnumoftalnets(String dept);
    
    int selectnumofHightalents(String title);
    
    List <EmpInfo> findAllEmpInfo();
    
    EmpInfo findEmpinfoAndAvatarByid(Integer id);
    
    List <EmpInfo> findDellInfoByStatus();
    
    int updataempStatus(EmpInfo emp);
    
    List<EmpInfo> getstatusbyreview(String reviewstatus);
    
    List<EmpInfo> getIDexpire(String date);
    
    int updateReview(String msg,int id);
    
    List <EmpInfo> getallinjobEmp();
    
}