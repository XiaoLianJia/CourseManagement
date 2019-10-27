package com.course.management.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
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
	@NotEmpty(message="名称不能为空")
	@Column(name = "name", nullable = false)
	private String name;

	/**
	 * 类型。
	 */
	@Column(name = "type", length = 1)
	private String type;

	/**
	 * 课时数，初始值为0。
	 */
	@Column(name = "lesson_count", nullable = false)
	private Integer lessonCount;

	/**
	 * 起始日期，格式：yyyy-MM-dd。
	 */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "start_date")
	private String startDate;

	/**
	 * 结束日期，格式：yyyy-MM-dd。
	 */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "end_date")
	private String endDate;

	/**
	 * 开放报名时间，格式：yyyy-MM-dd HH:mm。
	 */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
	@Column(name = "sign_up_start_date_time")
	private String signUpStartDateTime;

	/**
	 * 截止报名时间，格式：yyyy-MM-dd HH:mm。
	 */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
	@Column(name = "sign_up_end_date_time")
	private String signUpEndDateTime;

	/**
	 * 报名人数，初始值为0。
	 */
	@Column(name = "applicants_count", nullable = false)
	private Integer applicantsCount;

	/**
	 * 负责人。
	 */
	@NotEmpty(message="负责人不能为空")
	@Column(name = "manager", nullable = false)
	private String manager;

	/**
	 * 简介。
	 */
	@Column(name = "introduction")
	private String introduction;
}
