package com.qaii.controller;
import com.qaii.service.EmpInfoService;
import com.qaii.service.FindNameService;
import com.qaii.util.JsonResult;
import com.qaii.util.Layui;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collections;
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
    @ResponseBody
    @RequestMapping(value = "findName.do")
    public JsonResult findName() {
        List<String> list = new ArrayList<>();
        List<String> listTemp = new ArrayList<>();
        //查询科技处产业化处人名
        List<String> listname = findNameService.selectpatentName();
        List<String> listname1 = findNameService.selectpatentName1();
        List<String> listname2 = findNameService.selectpatentName2();
        List<String> listsoftwarecopyrightname=findNameService.selectsoftwarecopyrightName();
        List<String> listsoftwarecopyrightname1=findNameService.selectsoftwarecopyrightName1();
        List<String> listsoftwarecopyrightname2=findNameService.selectsoftwarecopyrightName2();

        List<String> listtrademarkname1=findNameService.selecttrademarkName();
        List<String> listtrademarkname2=findNameService.selecttrademarkName1();
        List<String> listworkname=findNameService.selectworkName();

        List<String> listProjectPername=findNameService.selectProjectPerName();

        List<String> listgovplatformrname=findNameService.selectgovplatformName();

        List<String> listgovrewardname=findNameService.selectgovrewardName();

        List<String> listcopyrightname=findNameService.selectcopyrightName();
        List<String> listcopyrightname1=findNameService.selectcopyrightName1();
        List<String> listcopyrightname2=findNameService.selectcopyrightName2();

        List<String> listmeetingthesisname=findNameService.selectmeetingthesisName();
        List<String> listmeetingthesisname1=findNameService.selectmeetingthesisName1();

        List<String> listperiodicalthesisname=findNameService.selectperiodicalthesisName();

        List<String>incubatorName=findNameService.selectincubatorName();

        List<String>liststockequityname=findNameService.selectstockequityName();

        List<String> listawardpersonalName=findNameService.selectawardpersonalName();

        List<String> listministryName=findNameService.selectministryName();
        List<String> listministryName1=findNameService.selectministryName1();

        List<String> listExchangeTalksName=findNameService.selectExchangeTalksName();
        List<String> listExchangeTalksName1=findNameService.selectExchangeTalksName1();

        List<String> listAttendMeetingName=findNameService.selectAttendMeetingName();

        list.addAll(listname);
        list.addAll(listname1);
        list.addAll(listname2);

        list.addAll(listsoftwarecopyrightname);
        list.addAll(listsoftwarecopyrightname1);
        list.addAll(listsoftwarecopyrightname2);

        list.addAll(listtrademarkname1);
        list.addAll(listtrademarkname2);

        list.addAll(listworkname);

        list.addAll(listProjectPername);

        list.addAll(listgovplatformrname);

        list.addAll(listgovrewardname);

        list.addAll(listcopyrightname);
        list.addAll(listcopyrightname1);
        list.addAll(listcopyrightname2);

        list.addAll(listmeetingthesisname);
        list.addAll(listmeetingthesisname1);

        list.addAll(listperiodicalthesisname);

        list.addAll(incubatorName);

        list.addAll(liststockequityname);

        list.addAll(listawardpersonalName);

        list.addAll(listministryName);
        list.addAll(listministryName1);

        list.addAll(listExchangeTalksName);
        list.addAll(listExchangeTalksName1);

        list.addAll(listAttendMeetingName);

        //listTemp.clear();
        for (int i = 0; i < list.size(); i++) {
            /*list.get(i).replaceAll("\n",";");*/
            if (!list.get(i).equals("")&&list.get(i).contains(";")&&!list.get(i).contains("\n")){
                String[] sourceStrArray = list.get(i).split(";");//分割出来的字符数组
                for (int j = 0; j < sourceStrArray.length; j++) {
                    listTemp.add(sourceStrArray[j]);
                    System.out.println(sourceStrArray[j]);
                }
            }
            // 保存不为空的元素  &&!"".equals(list.get(i))
            if (!list.get(i).equals("")&&!list.get(i).contains(";")&&!list.get(i).contains("\n")) {
                listTemp.add(list.get(i));
            }

            if (!"".equals(list.get(i))&&list.get(i).contains("\n")){
                String[] sourceStrArray = list.get(i).split("\n");//分割出来的字符数组
                System.out.println(list.get(i));
                for (int k = 0; k < sourceStrArray.length; k++) {
                    listTemp.add(sourceStrArray[k]);
                    //System.out.println(sourceStrArray[k]);
                }
            }
       /*     listTemp.removeAll(Collections.singleton(null));*/
        }
        System.out.println(listTemp);
        findPersonName();
        Compare(listTemp);
        listPersonl.clear();
        return new JsonResult(listTemp);
    }

    //根据人名查询出所有的信息
    @ResponseBody
    @RequestMapping(value = "findInfoByName.do",method= RequestMethod.POST,produces="application/json;charset=UTF-8")
    public Layui findInfoByName(@RequestParam String name) {

        List<T> listInfo=new ArrayList<>();
        //这里是用来测试后台数据查询接口的，因为接口可以用模糊查询来执行
        listInfo=findNameService.selectInfoByName(name);
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