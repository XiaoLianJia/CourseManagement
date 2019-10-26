package com.course.management.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * <p>
 *     课程信息实体类
 * </p>
 * @author zhangbin
 * @date 2019-10-15
 */
@Data
@Entity
@Table(name = "course")
public class Course implements Serializable {

	/**
	 * 编码。
	 */
	@Id
	@Column(name = "id", nullable = false, length = 64)
	private String id;

	/**
	 * 名称。
	 */
	@Column(name = "name", nullable = false)
	private String name;

	/**
	 * 类型。
	 */
	@Column(name = "type", nullable = false, length = 1)
	private String type;

	/**
	 * 课时数，初始值为0。
	 */
	@Column(name = "lesson_count", nullable = false)
	private Integer lessonCount;

	/**
	 * 课程起始日期，格式：yyyy-MM-dd。
	 */
	@Column(name = "start_date", nullable = false)
	private String startDate;

	/**
	 * 课程结束日期，格式：yyyy-MM-dd。
	 */
	@Column(name = "end_date", nullable = false)
	private String endDate;

	/**
	 * 开放报名时间，格式：yyyy-MM-dd HH:mm:ss。
	 */
	@Column(name = "sign_up_start_date_time", nullable = false)
	private String signUpStartDateTime;

	/**
	 * 截止报名时间，格式：yyyy-MM-dd HH:mm:ss。
	 */
	@Column(name = "sign_up_end_date_time", nullable = false)
	private String signUpEndDateTime;

	/**
	 * 报名人数，初始值为0。
	 */
	@Column(name = "applicants_count", nullable = false)
	private Integer applicantsCount;

	/**
	 * 课程负责人。
	 */
	@Column(name = "manager", nullable = false)
	private String manager;

	/**
	 * 课程简介。
	 */
	@Column(name = "introduction")
	private String introduction;
}
