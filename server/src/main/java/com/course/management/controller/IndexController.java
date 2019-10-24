package com.course.management.controller;

import org.springframework.stereotype.Controller;
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

	@RequestMapping("index")
	public String index() {
		return "index";
	}
}
