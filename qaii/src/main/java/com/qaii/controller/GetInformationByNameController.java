package com.qaii.controller;
import com.qaii.domain.EmpInfo;
import com.qaii.service.EmpInfoService;
import com.qaii.service.FindNameService;
import com.qaii.util.Layui;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Controller
public class GetInformationByNameController {


    @Resource
    private FindNameService findNameService;
    @Resource
    private EmpInfoService empInfoService;

    List<String> listPersonl=new ArrayList<>();
    //查询所有人名
    @RequestMapping(value = "findName.do")
    public Layui findName() {
        List<String> list = new ArrayList<>();
        List<String> listTemp = new ArrayList<>();
        List<String> listname = findNameService.selectpatentName();
        List<String> listname1 = findNameService.selectpatentName1();
        List<String> listname2 = findNameService.selectpatentName2();
        list.addAll(listname);
        list.addAll(listname1);
        list.addAll(listname2);
        //listTemp.clear();
        for (int i = 0; i < list.size(); i++) {
            // 保存不为空的元素
            if (!list.get(i).equals("")&&!list.get(i).contains(";")) {
                listTemp.add(list.get(i));
            }
            if (list.get(i).contains(";")){
                String[] sourceStrArray = list.get(i).split(";");//分割出来的字符数组
                for (int j = 0; j < sourceStrArray.length; j++) {
                    listTemp.add(sourceStrArray[j]);
                    System.out.println(sourceStrArray[j]);
                }
            }
        }
        System.out.println(listTemp);
        findPersonName();
        Compare(listTemp);
        listPersonl.clear();
        int count=listTemp.size();
        return Layui.data(count, listTemp);
    }

    //根据人名查询出所有的信息
    @RequestMapping(value = "findInfoByName.do")
    public Layui findInfoByName(/*@RequestParam String name*/) {

        List<T> listInfo=new ArrayList<>();
        listInfo=findNameService.selectInfoByName("黄坤鹏");
        int count=listInfo.size();
        return Layui.data(count, listInfo);
    }

     //查询人事处的所有入职人员
     public void findPersonName() {
         List<String> listEmpInfo=empInfoService.findAllEmpInfoName();
         for (String empInfo:listEmpInfo){
             listPersonl.add(empInfo);
         }
     }

     //判断查询到的所有人员是否在人事处入职
     public void Compare(List<String> listhkp) {
         Iterator<String> it=listhkp.iterator();
         while (it.hasNext()){
             String hkp=it.next();
             System.out.println(hkp);
             if (!listPersonl.contains(hkp)){
                 System.out.println(hkp);
                 it.remove();
             }
        }

     }

}