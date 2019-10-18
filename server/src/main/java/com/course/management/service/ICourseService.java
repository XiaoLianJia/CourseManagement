package com.course.management.service;

import com.course.management.entity.Course;

/**
 * <p>
 *     课程信息服务接口类
 * </p>
 * @author zhangbin
 * @date 2019-10-18
 */
public interface ICourseService {

	/**
	 *
	 * @param course
	 */
	void insert(Course course);

	/**
	 *
	 * @param course
	 */
	void delete(Course course);

	/**
	 *
	 * @param course
	 */
	void update(Course course);

	/**
	 * 判断课程信息是否存在
	 * @param course 课程信息
	 * @return 课程信息是否存在
	 */
	boolean exists(Course course);
}
