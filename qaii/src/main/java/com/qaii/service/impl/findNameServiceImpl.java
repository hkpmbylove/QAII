package com.qaii.service.impl;

import com.qaii.dao.*;
import com.qaii.service.FindNameService;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
@Service
public class findNameServiceImpl implements FindNameService {
@Resource
private PatentMapper patentMapper;
@Resource
private SoftwarecopyrightMapper softwarecopyrightMapper;
@Resource
private TrademarkMapper trademarkMapper;
@Resource
private WorkMapper workMapper;
@Resource
private GovsubjectMapper govsubjectMapper;
@Resource
private GovplatformMapper govplatformMapper;
@Resource
private GovrewardMapper govrewardMapper;
@Resource
private CopyrightMapper copyrightMapper;
@Resource
private MeetingThesisMapper meetingThesisMapper;
@Resource
private PeriodicalThesisMapper periodicalThesisMapper;
@Resource
private IncubatorMapper incubatorMapper;
@Resource
private StockEquityMapper stockEquityMapper;
@Resource
private AwardPersonalMapper awardPersonalMapper;
@Resource
private MinistryMapper ministryMapper;
@Resource
private IndustryExchangeTalksMapper industryExchangeTalksMapper;
@Resource
private IndustryAttendMeetingMapper industryAttendMeetingMapper;
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
        List<T> list=new ArrayList<>();
        /*list.add()*/
        //在用方法list.addall()的时候如果被添加的对象为NULL的时候则会报空指针错误
        List<T> listpatent=patentMapper.selectInfoByName(name);
        List<T> listsoftwarecopyright=softwarecopyrightMapper.selectInfoByName(name);
        List<T> listtrademark=trademarkMapper.selectInfoByName(name);
        List<T> listwork=workMapper.selectInfoByName(name);
        List<T> listgovsubject=govsubjectMapper.selectInfoByName(name);
        List<T> listgovplatform=govplatformMapper.selectInfoByName(name);
        List<T> listgovreward=govrewardMapper.selectInfoByName(name);
        List<T> listcopyright=copyrightMapper.selectInfoByName(name);
        List<T> listmeetingThesis=meetingThesisMapper.selectInfoByName(name);
        List<T> listperiodicalThesis=periodicalThesisMapper.selectInfoByName(name);
        List<T> listincubator=incubatorMapper.selectInfoByName(name);
        List<T> liststockEquity=stockEquityMapper.selectInfoByName(name);
        List<T> listawardPersonal=awardPersonalMapper.selectInfoByName(name);
        List<T> listministry=ministryMapper.selectInfoByName(name);
        List<T> listindustryExchangeTalks=industryExchangeTalksMapper.selectInfoByName(name);
        List<T> listindustryAttendMeeting=industryAttendMeetingMapper.selectInfoByName(name);
        list.addAll(listpatent);
        list.addAll(listsoftwarecopyright);
        list.addAll(listtrademark);
        list.addAll(listwork);
        list.addAll(listgovsubject);
        list.addAll(listgovplatform);
        list.addAll(listgovreward);
        list.addAll(listcopyright);
        list.addAll(listmeetingThesis);
        list.addAll(listperiodicalThesis);
        list.addAll(listincubator);
        list.addAll(liststockEquity);
        list.addAll(listawardPersonal);
        list.addAll(listministry);
        list.addAll(listindustryExchangeTalks);
        list.addAll(listindustryAttendMeeting);
        return list;
    }

    @Override
    public List<String> selectsoftwarecopyrightName() {
        return softwarecopyrightMapper.selectsoftwarecopyrightName();
    }

    @Override
    public List<String> selectsoftwarecopyrightName1() {
        return softwarecopyrightMapper.selectsoftwarecopyrightName1();
    }

    @Override
    public List<String> selectsoftwarecopyrightName2() {
        return softwarecopyrightMapper.selectsoftwarecopyrightName2();
    }

    @Override
    public List<String> selecttrademarkName() {
        return trademarkMapper.selecttrademarkName();
    }

    @Override
    public List<String> selecttrademarkName1() {
        return trademarkMapper.selecttrademarkName1();
    }

    @Override
    public List<String> selectworkName() {
        return workMapper.selectworkName();
    }

    @Override
    public List<String> selectProjectPerName() {
        return govsubjectMapper.selectProjectPerName();
    }

    @Override
    public List<String> selectgovplatformName() {
        return govplatformMapper.selectgovplatformName();
    }

    @Override
    public List<String> selectgovrewardName() {
        return govrewardMapper.selectgovrewardName();
    }

    @Override
    public List<String> selectcopyrightName() {
        return copyrightMapper.selectcopyrightName();
    }

    @Override
    public List<String> selectcopyrightName1() {
        return copyrightMapper.selectcopyrightName1();
    }

    @Override
    public List<String> selectcopyrightName2() {
        return copyrightMapper.selectcopyrightName2();
    }

    @Override
    public List<String> selectmeetingthesisName() {
        return meetingThesisMapper.selectmeetingthesisName();
    }

    @Override
    public List<String> selectmeetingthesisName1() {
        return meetingThesisMapper.selectmeetingthesisName1();
    }

    @Override
    public List<String> selectperiodicalthesisName() {
        return periodicalThesisMapper.selectperiodicalthesisName();
    }

    @Override
    public List<String> selectincubatorName() {
        return incubatorMapper.selectincubatorName();
    }

    @Override
    public List<String> selectstockequityName() {
        return stockEquityMapper.selectstockequityName();
    }

    @Override
    public List<String> selectawardpersonalName() {
        return awardPersonalMapper.selectawardpersonalName();
    }

    @Override
    public List<String> selectministryName() {
        return ministryMapper.selectministryName();
    }

    @Override
    public List<String> selectministryName1() {
        return ministryMapper.selectministryName1();
    }

    @Override
    public List<String> selectExchangeTalksName() {
        return industryExchangeTalksMapper.selectExchangeTalksName();
    }

    @Override
    public List<String> selectExchangeTalksName1() {
        return industryExchangeTalksMapper.selectExchangeTalksName1();
    }

    @Override
    public List<String> selectAttendMeetingName() {
        return industryAttendMeetingMapper.selectAttendMeetingName();
    }
}
