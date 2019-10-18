package com.course.management.http;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 *     分页请求实体类
 * </p>
 * @author zhangbin
 * @date 2019-10-18
 * @param <T>
 */
@Data
public final class PageRequest<T> implements Serializable {

	/**
	 * 页码。
	 */
	private Integer pageNumber;

	/**
	 * 每页数据量。
	 */
	private Integer pageSize;

	/**
	 * 查询参数。
	 */
	private T parameters;
}
