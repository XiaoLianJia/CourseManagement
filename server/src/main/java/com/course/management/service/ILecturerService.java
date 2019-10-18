package com.course.management.service;

import com.course.management.entity.Lecturer;

/**
 * <p>
 *     讲师信息服务接口类
 * </p>
 * @author zhangbin
 * @date 2019-10-18
 */
public interface ILecturerService {

	/**
	 *
	 * @param lecturer
	 */
	void insert(Lecturer lecturer);

	/**
	 *
	 * @param lecturer
	 */
	void delete(Lecturer lecturer);

	/**
	 *
	 * @param lecturer
	 */
	void update(Lecturer lecturer);

	/**
	 * 判断讲师信息是否存在
	 * @param lecturer 讲师信息
	 * @return 讲师信息是否存在
	 */
	boolean exists(Lecturer lecturer);
}
