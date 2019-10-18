package com.course.management.service.impl;

import com.course.management.entity.Course;
import com.course.management.repository.CourseRepository;
import com.course.management.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *     课程信息服务实现类
 * </p>
 * @author zhangbin
 * @date 2019-10-18
 */
@Service
public class CourseServiceImpl implements ICourseService {

	@Autowired
	private CourseRepository courseRepository;

	@Override
	public void insert(Course course) {

	}

	@Override
	public void delete(Course course) {

	}

	@Override
	public void update(Course course) {

	}

	@Override
	public boolean exists(Course course) {
		return courseRepository.existsById(course.getId());
	}
}
