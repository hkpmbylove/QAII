package com.qaii.controller;

import com.qaii.domain.Constant;
import com.qaii.domain.Ministry;
import com.qaii.domain.MinistryFile;
import com.qaii.service.MinistryFileService;
import com.qaii.service.MinistryService;
import com.qaii.util.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Company: 青岛智能产业技术研究院
 *
 * @author: wangxin
 *
 * @Descrpiton: 服务企业控制器
 *
 * @Time 2018/11/15
 */

@Controller
public class MinistryController {

    @InitBinder
    protected void init(HttpServletRequest request, ServletRequestDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }


    @Resource
    private MinistryService service;
    @Resource
    private MinistryFileService fileService;


    private final static String TEST_PATH = "/Users/wangxin/File/";

    //文件位置
    private final static String BASE_PATH = "industry/Ministry/";
    //文件类型
    public final static String FILE_CERTIFY = "certify";
    //文件路径 本机路径为/Users/wangxin/File
    //private final static String FILE_PATH = Constant.FILE_BASE_PATH + BASE_PATH;
    private final static String FILE_PATH = TEST_PATH + BASE_PATH;
    //数据库中记录的路径
    private final static String DATABASE_PATH = Constant.DATABASE_BASE_PATH + BASE_PATH;


    //插入记录
    @RequestMapping(value = "insertMinistry.do" ,produces = "text/json;charset=UTF-8" )
    String insertMinistry(HttpServletRequest request,
                          @RequestParam("file") MultipartFile[] files,
                          Ministry record,
                          MinistryFile fileRecord) throws IOException, ParseException {
        //装载属性
        LoadData(request, record);
        //装载文件类属性
        LoadFileData(fileRecord);
        int result=service.insertRecordReturnID(record);
        fileRecord.setIncubatorId(record.getId());
        //存储文件
        List list = FileLoadUtils.moveFileAndReturnName(files, FILE_PATH);
        //向数据库添加记录
        for (int i=0;i<files.length;i++) {
            fileRecord.setFileName(files[i].getOriginalFilename());
            fileRecord.setFilePath(DATABASE_PATH + list.get(i));
            fileService.insertRecord(fileRecord);
        }
        //如果无文件，添加一条空记录
        if(files.length==0)
            fileService.insertRecord(fileRecord);
        if (result!=0)
            return Constant.INDUSTRY_INSERT_SUCCESS;
        else
            return Constant.INDUSTRY_INSERT_FAILD;
    }

    void LoadFileData(MinistryFile fileRecord) {
        fileRecord.setFileStyle(FILE_CERTIFY);
        fileRecord.setGmtCreate(new Date());
        fileRecord.setGmtModified(new Date());
    }

    void LoadData(HttpServletRequest request, Ministry record) throws ParseException {
        record.setMinistryName(request.getParameter("ministryName"));
        record.setMinistryProperty(request.getParameter("ministryProperty"));
        record.setContactPerson(request.getParameter("contactPerson"));
        record.setContactMethod(request.getParameter("contactMethod"));
        record.setMinistryLocation(request.getParameter("ministryLocation"));
        record.setMinistryTime(CountDatetoNowDays.StringConvertToDate(request.getParameter("ministryTime")));
        record.setMinistryProject(request.getParameter("ministryProject"));
        record.setOwnselfUnit(request.getParameter("ownselfUnit"));
        record.setOwnselfContactPerson(request.getParameter("ownselfContactPerson"));
        record.setOwnselfContactMethod(request.getParameter("ownselfContactMethod"));
        record.setRemark(request.getParameter("remark"));
        record.setGmtCreate(new Date());
        record.setGmtModified(new Date());
    }

    //显示所有信息
    @RequestMapping(value = "listMinistries.do")
    @ResponseBody
    Layui listMinistries() throws ParseException {
        return Layui.data(1,service.listRecords());
    }

    //查看详情
    @RequestMapping(value = "getMinistry.do")
    @ResponseBody
    JsonResult getMinistry(@RequestParam("id")Integer id) throws ParseException {
        return new JsonResult(service.getRecord(id));
    }

    //更新信息
    @RequestMapping(value = "updateMinistry.do")
    String updateMinistry(HttpServletRequest request, Ministry record) throws ParseException {
        record.setId(Integer.parseInt(request.getParameter("id")));
        LoadData(request, record);
        int result = service.updateByPrimaryKey(record);
        if (result!=0)
            return Constant.INDUSTRY_INSERT_SUCCESS;
        else
            return Constant.INDUSTRY_INSERT_FAILD;
    }

    //删除信息
    @RequestMapping(value = "deleteMinistry.do")
    @ResponseBody
    JsonResult deleteMinistry(@RequestParam("requestDate[]")Integer[] id){
        int result = service.deleteByPrimaryKeys(id);
        if (result != 0)
            return new JsonResult("success!");
        else
            return new JsonResult();
    }

}