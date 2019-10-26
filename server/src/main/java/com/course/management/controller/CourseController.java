package com.course.management.controller;

import com.course.management.model.Course;
import com.course.management.repository.CourseRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
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

	@Autowired
	private CourseRepository courseRepository;

	@RequestMapping("courseInfo")
	public String courseInfo(HttpServletRequest request, Model model) {
		int page = 0;
		if (null != request.getParameter("page")
				&& ! request.getParameter("page").isEmpty()) {
			page = Integer.parseInt(request.getParameter("page")) - 1;
		}

		int size = 10;
		if (null != request.getParameter("size")
				&& !request.getParameter("size").isEmpty()) {
			size = Integer.parseInt(request.getParameter("size"));
		}

		Page<Course> courses = courseRepository.findAll(PageRequest.of(page, size));
		model.addAttribute("courses", courses);
		return "/course/courseInfo";
	}

	@RequestMapping("lesson")
	public String lessonInfo() {
		return "/course/lesson";
	}

	@ResponseBody
	@RequestMapping("courseList")
	public String courseList(Model model) {

		List<Course> courses = new ArrayList<>();
		model.addAttribute("customers", courses);
		return "";
	}

	@ResponseBody
	@RequestMapping("setCourse")
	public Map<String, Object> setCourse() {
		Map<String, Object> map = new HashMap<>(16);

		return map;
	}
}
