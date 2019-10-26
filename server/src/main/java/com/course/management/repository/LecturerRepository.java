package com.course.management.repository;

import com.course.management.model.Lecturer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *     讲师信息持久化类
 * </p>
 * @author zhangbin
 * @date 2019-10-15
 */
@Repository
public interface LecturerRepository extends JpaRepository<Lecturer, String> {
}
