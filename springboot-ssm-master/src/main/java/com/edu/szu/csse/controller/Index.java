package com.edu.szu.csse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 整合layui+thymeleaf
 * 
 * @author Administrator
 *
 */
@Controller
public class Index {
	@RequestMapping("/index")
	public String index(ModelMap map) {
		map.addAttribute("name", "testname");
		return "index";
	}

	@RequestMapping("/welcome")
	public String welcome(ModelMap map) {
		return "welcome";
	}

	@RequestMapping("/user-list")
	public String member_list() {
		return "user-list";
	}

	@RequestMapping("/user-add")
	public String member_add() {
		return "user-add";
	}

	@RequestMapping("/teacher-list")
	public String teacher_add() {
		return "teacher-list";
	}

	@RequestMapping("/admin-list")
	public String admin_list(){return "admin-list";}
	@RequestMapping("/device-list")
	public String device_list(){return "device-list";}
}
