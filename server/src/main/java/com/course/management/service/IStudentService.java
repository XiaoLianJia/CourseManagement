package com.course.management.service;

import com.course.management.entity.Student;

/**
 * <p>
 *     学生信息服务接口类
 * </p>
 * @author zhangbin
 * @date 2019-10-18
 */
public interface IStudentService {

	/**
	 *
	 * @param student
	 */
	void insert(Student student);

	/**
	 *
	 * @param student
	 */
	void delete(Student student);

	/**
	 *
	 * @param student
	 */
	void update(Student student);
}
