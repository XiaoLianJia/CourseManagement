package com.course.management.controller;

import com.course.management.model.Course;
import com.course.management.repository.CourseRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;

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
	public ModelAndView add(@Valid @ModelAttribute Course course,
							BindingResult result) {
		log.info("add");
		ModelAndView modelAndView = new ModelAndView();

		if (result.hasErrors()) {
			List<ObjectError> error = result.getAllErrors();
			for (ObjectError e : error) {
				System.out.println(e);
			}
			modelAndView.addObject("message", "出错了");
			modelAndView.setViewName("course/courseInfo");
			return modelAndView;
		}
		course.setId("002");

		courseRepository.save(course);
		modelAndView.setViewName("course/courseInfo");
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
