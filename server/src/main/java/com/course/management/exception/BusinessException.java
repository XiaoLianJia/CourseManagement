package com.course.management.exception;

/**
 * <p>
 *     业务异常类
 * </p>
 * @author zhangbin
 * @date 2019-10-27
 */
public class BusinessException extends RuntimeException {

    public BusinessException(String message) {
        super(message);
    }
}
