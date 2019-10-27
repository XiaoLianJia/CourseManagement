package com.course.management.exception;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * <p>
 *     全局异常处理
 * </p>
 * @author zhangbin
 * @date 2019-10-27
 */
@ControllerAdvice
public class ExceptionAdvice {

    @ExceptionHandler(Exception.class)
    public ModelAndView exception() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("error");
        return  modelAndView;
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ModelAndView methodArgumentNotValidException() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("error");
        return  modelAndView;
    }

    @ExceptionHandler(BusinessException.class)
    public ModelAndView businessException() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("error");
        return  modelAndView;
    }
}
