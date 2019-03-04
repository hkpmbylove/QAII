package com.qaii.dao;

import java.util.List;

import com.qaii.domain.Trademark;
import org.apache.ibatis.annotations.Param;
import org.apache.poi.ss.formula.functions.T;

public interface TrademarkMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Trademark record);

    int insertSelective(Trademark record);

    Trademark selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Trademark record);

    int updateByPrimaryKey(Trademark record);
    
    int selectCountNum();
    
    List<Trademark> getAllTradeMarkMsg();
    
    int deleteByPrimaryKeys(Integer[] eid);
    
    int countAgencyTradeMark(String firstDay, String endDay);
    
    int countAuthorizationTradeMark(String firstDay, String endDay);
    
    int countAuthorizationTradeMarkNum();

    //商标查询
    List<String> selecttrademarkName();
    List<String> selecttrademarkName1();
    //商标查询
    List<T> selectInfoByName(@Param("name")String name);

}