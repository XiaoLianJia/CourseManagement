package com.course.management.controller;

import com.course.management.model.Course;
import com.course.management.repository.CourseRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

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

	@Resource
	private CourseRepository courseRepository;

	@RequestMapping("add")
	public ModelAndView add(@ModelAttribute Course course) {
		log.info("add");

		courseRepository.save(course);

		ModelAndView modelAndView = new ModelAndView();
		return modelAndView;
	}

	@RequestMapping("courseInfo")
	public ModelAndView courseInfo(HttpServletRequest request) {
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

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("courses", courses);
		modelAndView.addObject("course", new Course());
		modelAndView.setViewName("course/courseInfo");
		return modelAndView;
	}
}
