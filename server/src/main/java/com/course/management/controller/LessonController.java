package com.course.management.controller;

import com.course.management.model.Lesson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
    public ModelAndView lessonInfo() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("lesson/lessonInfo");
        return modelAndView;
    }
}
