package com.course.management.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * <p>
 *     学生课时记录实体类
 * </p>
 * @author zhangbin
 * @date 2019-10-15
 */
@Data
@Entity
@Table(name = "student_lesson_record")
public class StudentLessonRecord implements Serializable {

	/**
	 * 课时记录编码。
	 */
	@Id
	@Column(name = "id", nullable = false, length = 64)
	private String id;

	/**
	 * 学号。
	 */
	@Column(name = "student_id", nullable = false)
	private String studentId;

	/**
	 * 课时编码。
	 */
	@Column(name = "lesson_id", nullable = false)
	private String lessonId;

	/**
	 * 出勤情况（0：正常，1：请假，2：旷课）。
	 */
	@Column(name = "attendance", nullable = false, length = 1)
	private String attendance;

	/**
	 * 缺勤原因。
	 */
	@Column(name = "absence_reason")
	private String absenceReason;
}
