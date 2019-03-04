package com.qaii.service;

import org.apache.poi.ss.formula.functions.T;

import java.util.List;

public interface FindNameService {
    //专利查询
    List<String> selectpatentName();
    List<String> selectpatentName1();
    List<String> selectpatentName2();
    //专利查询

    //软著查询
    List<String> selectsoftwarecopyrightName();
    List<String> selectsoftwarecopyrightName1();
    List<String> selectsoftwarecopyrightName2();
    //软著查询

    //商标查询
    List<String> selecttrademarkName();
    List<String> selecttrademarkName1();
    //商标查询

    //著作
    List<String> selectworkName();
    //著作

    //纵向课题
    List<String> selectProjectPerName();
    //纵向课题

    //政府资助平台
    List<String> selectgovplatformName();
    //政府资助平台

    //政府奖励信息表
    List<String> selectgovrewardName();
    //政府奖励信息表

    //版权信息表
    List<String> selectcopyrightName();
    List<String> selectcopyrightName1();
    List<String> selectcopyrightName2();
    //版权信息表

    //会议论文信息
    List<String> selectmeetingthesisName();
    List<String> selectmeetingthesisName1();
    //会议论文信息

    //期刊论文
    List<String> selectperiodicalthesisName();
    //期刊论文

    //孵化企业信息
    List<String> selectincubatorName();
    //孵化企业信息

    //孵化企业股东
    List<String> selectstockequityName();
    //孵化企业股东

    //个人获奖
    List<String> selectawardpersonalName();
    //个人获奖

    //服务企业
    List<String> selectministryName();
    List<String> selectministryName1();
    //服务企业

    //交流座谈
    List<String> selectExchangeTalksName();
    List<String> selectExchangeTalksName1();
    //交流座谈

    //参加会议
    List<String> selectAttendMeetingName();
    //参加会议
    List<T> selectInfoByName(String name);
}
