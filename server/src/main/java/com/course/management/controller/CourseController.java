package com.course.management.controller;

import com.course.management.dto.CourseDto;
import com.course.management.entity.Course;
import com.course.management.http.PageDataResult;
import com.course.management.http.PageRequest;
import com.course.management.http.Response;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *     课程管理页控制层
 * </p>
 * @author zhangbin
 * @date 2019-10-18
 */
@Slf4j
@Controller
@RequestMapping("course")
public class CourseController {

	@RequestMapping("course")
	public String courseInfo() {
		return "/course/course";
	}

	@RequestMapping("lesson")
	public String lessonInfo() {
		return "/course/lesson";
	}

	@ResponseBody
	@RequestMapping("courseList")
	public PageDataResult courseList(@RequestParam("pageNum") Integer pageNumber,
									 @RequestParam("pageSize") Integer pageSize) {

		PageDataResult pageDataResult = new PageDataResult();

		return pageDataResult;
	}

	@ResponseBody
	@RequestMapping("setCourse")
	public Map<String, Object> setCourse() {
		Map<String, Object> map = new HashMap<>(16);

		return map;
	}
}
