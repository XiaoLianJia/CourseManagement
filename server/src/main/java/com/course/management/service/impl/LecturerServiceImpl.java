package com.course.management.service.impl;

import com.course.management.entity.Lecturer;
import com.course.management.repository.LecturerRepository;
import com.course.management.service.ILecturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *     讲师信息服务实现类
 * </p>
 * @author zhangbin
 * @date 2019-10-18
 */
@Service
public class LecturerServiceImpl implements ILecturerService {

	@Autowired
	private LecturerRepository lecturerRepository;

	@Override
	public void insert(Lecturer lecturer) {

	}

	@Override
	public void delete(Lecturer lecturer) {

	}

	@Override
	public void update(Lecturer lecturer) {

	}

	@Override
	public boolean exists(Lecturer lecturer) {
		return lecturerRepository.existsById(lecturer.getId());
	}
}
