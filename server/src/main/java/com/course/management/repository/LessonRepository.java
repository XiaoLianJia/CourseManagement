package com.course.management.repository;

import com.course.management.entity.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *     课时信息持久化类
 * </p>
 * @author zhangbin
 * @date 2019-10-15
 */
@Repository
public interface LessonRepository extends JpaRepository<Lesson, String> {
}
