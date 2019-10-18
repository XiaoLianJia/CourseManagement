package com.course.management.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 *     课程信息数据传输类
 * </p>
 * @author zhangbin
 * @date 2019-10-18
 */
@Data
public class CourseDto implements Serializable {

	/**
	 * 编码。
	 */
	private String id;

	/**
	 * 名称。
	 */
	private String name;

	/**
	 * 类型。
	 */
	private String type;

	/**
	 * 课时数，初始值为0。
	 */
	private Integer lessonCount;

	/**
	 * 课程起始日期，格式：yyyy-MM-dd。
	 */
	private String startDate;

	/**
	 * 课程结束日期，格式：yyyy-MM-dd。
	 */
	private String endDate;

	/**
	 * 开放报名时间，格式：yyyy-MM-dd HH:mm:ss。
	 */
	private String signUpStartDateTime;

	/**
	 * 截止报名时间，格式：yyyy-MM-dd HH:mm:ss。
	 */
	private String signUpEndDateTime;

	/**
	 * 报名人数，初始值为0。
	 */
	private Integer applicantsCount;

	/**
	 * 课程负责人。
	 */
	private String manager;

	/**
	 * 课程简介。
	 */
	private String introduction;
}
