package com.qaii.controller;

import com.qaii.domain.deptChildinfo;
import com.qaii.service.ChilddeptService;
import com.qaii.util.JsonResult;
import com.qaii.util.Layui;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class ChildDeptController {
    @Resource
    private ChilddeptService childdeptService;


    //根据一级菜单id查询二级菜单
    @ResponseBody
    @RequestMapping(value="findDeptInfosList.do",method=RequestMethod.POST,produces="application/json;charset=UTF-8")
    public Layui findDeptInfoList(@RequestParam Integer id) {
        List<deptChildinfo> list=childdeptService.selectdeptInfosById(id);
        int count =list.size();
        if(list!=null) {
            return Layui.data(count, list);
        }else {
            return Layui.data(count, list);
        }
    }


    //添加二级部门信息
    @ResponseBody
    @RequestMapping(value="addDeptInfos.do", method= RequestMethod.POST,produces="application/json;charset=UTF-8")
    public JsonResult addDeptInfo(HttpServletRequest req, deptChildinfo dept){
        dept.setDeptName(req.getParameter("deptName"));
        dept.setPid(Integer.parseInt(req.getParameter("id")));
        int row=childdeptService.insert(dept);
        if(row!=0) {
            return  new JsonResult(row);
        }else {
            return  new JsonResult();

        }
    }

    //修改二级部门信息
    @ResponseBody
    @RequestMapping(value="uptateDeptInfos.do", method=RequestMethod.POST,produces="application/json;charset=UTF-8")
    public JsonResult uptateDeptInfo(HttpServletRequest req, deptChildinfo dept){
        dept.setDeptName(req.getParameter("deptName"));
        dept.setId(Integer.parseInt(req.getParameter("id")));
        int row=childdeptService.updateDeptInfoById(dept);
        if(row!=0) {
            return  new JsonResult(row);
        }else {
            return  new JsonResult();

        }
    }

    //系统管理二级菜单编辑获取部门信息
    @RequestMapping(value="getdeptsName.do",method=RequestMethod.POST)
    @ResponseBody
    public List<deptChildinfo> getdeptName(@RequestParam("id")Integer id){
        List<deptChildinfo> list=childdeptService.selectdeptInfoById(id);
        return list;
    }

    //系统管理二级菜单删除部门信息
    @ResponseBody
    @RequestMapping(value="dellDeptInfos.do", method=RequestMethod.POST,produces="application/json;charset=UTF-8")
    public JsonResult DellempInfo(@RequestParam(value = "requestDate") Integer id ){
        int row=childdeptService.deleteByPrimaryKey(id);
        if(row!=0) {
            return  new JsonResult(row);
        }else {
            return  new JsonResult();
        }
    }
}
