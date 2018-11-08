package com.qaii.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class IndustryController {
	@RequestMapping("industry.do")
	public String science(){
		return "page/industry/industry";
	}
	//孵化企业界面
	@RequestMapping("hatch.do")
	public String hatch(){
		return "page/industry/hatch/hatch";
	}
	//孵化企业添加界面
	@RequestMapping("hatchAdd.do")
	public String hatchAdd(){
		return "page/industry/hatch/hatchAdd";
	}
	//孵化企业查看详情界面
	@RequestMapping("hatchCheck.do")
	public String hatchCheck(){
		return "page/industry/hatch/hatchCheck";
	}
	//孵化企业修改界面
	@RequestMapping("hatchEdit.do")
	public String hatchEdit(){
		return "page/industry/hatch/hatchEdit";
	}
	//创新能力界面
	@RequestMapping("innovate.do")
	public String innovate(){
		return "page/industry/innovate/innovate";
	}
	//院获奖情况界面
	@RequestMapping("institute.do")
	public String institute(){
		return "page/industry/honor/institute/institute";
	}
	//孵化企业获奖情况界面
	@RequestMapping("incubate.do")
	public String incubate(){
		return "page/industry/honor/incubate/incubate";
	}
	//个人获奖界面
	@RequestMapping("person.do")
	public String person(){
		return "page/industry/honor/person/person";
	}
	//服务企业管理界面
	@RequestMapping("serviceFirm.do")
	public String serviceFirm(){
		return "page/industry/serviceFirm/serviceFirm";
	}
}