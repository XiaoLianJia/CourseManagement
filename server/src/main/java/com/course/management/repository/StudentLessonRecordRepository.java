package com.course.management.repository;

import com.course.management.entity.StudentLessonRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *     学生课时记录持久化类
 * </p>
 * @author zhangbin
 * @date 2019-10-15
 */
@Repository
public interface StudentLessonRecordRepository extends JpaRepository<StudentLessonRecord, String> {
}
