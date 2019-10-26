package com.course.management.repository;

import com.course.management.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *     学生信息持久化类
 * </p>
 * @author zhangbin
 * @date 2019-10-15
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, String> {
}
