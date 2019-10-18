package com.course.management.repository;

import com.course.management.entity.Lecturer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *     授课人员信息持久化类
 * </p>
 * @author zhangbin
 * @date 2019-10-15
 */
@Repository
public interface LecturerRepository extends JpaRepository<Lecturer, String> {
}