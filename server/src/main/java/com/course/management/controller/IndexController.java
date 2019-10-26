package com.course.management.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>
 *     主页控制层
 * </p>
 * @author zhangbin
 * @date 2019-10-24
 */
@Controller
public class IndexController {

//	@RequestMapping("index")
//	public String index() {
//		return "index";
//	}

	@Value("${spring.application.name}")
	String appName;

	@RequestMapping("/")
	public String homePage(Model model) {
		model.addAttribute("appName", appName);
		return "home";
	}
}
