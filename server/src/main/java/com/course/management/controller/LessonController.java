package com.course.management.controller;

import com.course.management.model.Lesson;
import com.course.management.repository.LessonRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

/**
 * <p>
 *     课时控制层
 * </p>
 * @author zhangbin
 * @date 2019-10-28
 */
@Slf4j
@Controller
@RequestMapping("lesson")
public class LessonController {

    @Autowired
    private LessonRepository lessonRepository;

    @RequestMapping("add")
	public String add(@Valid @ModelAttribute Lesson lesson,
							BindingResult bindingResult) {
		return "redirect:lessonInfo";
	}

    @RequestMapping("lessonDetail")
    public ModelAndView lessonDetail() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("lesson", new Lesson());
        modelAndView.setViewName("lesson/lessonDetail");
        return modelAndView;
    }

    @RequestMapping("lessonInfo")
    public ModelAndView lessonInfo(HttpServletRequest request) {
        int page = 0;
        if (null != request.getParameter("page")
                && ! request.getParameter("page").isEmpty()) {
            page = Integer.parseInt(request.getParameter("page")) - 1;
        }

        int size = 8;
        if (null != request.getParameter("size")
                && !request.getParameter("size").isEmpty()) {
            size = Integer.parseInt(request.getParameter("size"));
        }

        Page<Lesson> lessons = lessonRepository.findAll(PageRequest.of(page, size));

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("lessons", lessons);
        modelAndView.setViewName("lesson/lessonInfo");
        return modelAndView;
    }
}
