package com.course.management.service;

import com.course.management.model.Lesson;

/**
 * <p>
 *     课时信息服务接口类
 * </p>
 * @author zhangbin
 * @date 2019-10-18
 */
public interface ILessonService {

	/**
	 *
	 * @param lesson
	 */
	void insert(Lesson lesson);

	/**
	 *
	 * @param lesson
	 */
	void delete(Lesson lesson);

	/**
	 *
	 * @param lesson
	 */
	void update(Lesson lesson);
}
