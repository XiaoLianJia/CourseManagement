package com.course.management.http;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 *     分页响应实体类
 * </p>
 * @author zhangbin
 * @date 2019-10-18
 * @param <T>
 */
@Data
final class PageResponse<T> implements Serializable {

	/**
	 * 数据集合。
	 */
	private T data;

	/**
	 * 总数据量。
	 */
	private Long totalElements;

	/**
	 * 总页数。
	 */
	private Integer totalPages;

	/**
	 * 当前页码。
	 */
	private Integer pageNumber;

	/**
	 * 每页数据量。
	 */
	private Integer pageSize;
}
