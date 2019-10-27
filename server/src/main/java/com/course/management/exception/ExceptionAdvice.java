package com.course.management.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

/**
 * <p>
 *     全局异常处理
 * </p>
 * @author zhangbin
 * @date 2019-10-27
 */
@ControllerAdvice
public class ExceptionAdvice {

    @ExceptionHandler
    public ModelAndView exception(Exception e) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("timestamp", new Date());
        modelAndView.addObject("path", "");
        modelAndView.addObject("error", "");
        modelAndView.addObject("code", "");
        modelAndView.addObject("status", "");
        modelAndView.addObject("message", e.getMessage());
        modelAndView.addObject("exception", e.getClass());
        modelAndView.addObject("trace", e.getStackTrace());
        modelAndView.setViewName("error");
        return modelAndView;
    }
}
