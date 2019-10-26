package com.course.management.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * <p>
 *     课时信息实体类
 * </p>
 * @author zhangbin
 * @date 2019-10-15
 */
@Data
@Entity
@Table(name = "lesson")
public class Lesson implements Serializable {

	/**
	 * 课时编码。
	 */
	@Id
	@Column(name = "id", nullable = false, length = 64)
	private String id;

	/**
	 * 课程编码。
	 */
	@Column(name = "course_id", nullable = false)
	private String courseId;

	/**
	 * 上课时间，格式：yyyy-MM-dd HH:mm:ss。
	 */
	@Column(name = "start_date_time")
	private String startDateTime;

	/**
	 * 下课时间，格式：yyyy-MM-dd HH:mm:ss。
	 */
	@Column(name = "end_date_time")
	private String endDateTime;
}
