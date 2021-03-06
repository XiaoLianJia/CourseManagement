package com.course.management.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * <p>
 *     学生信息实体类
 * </p>
 * @author zhangbin
 * @date 2019-10-15
 */
@Data
@Entity
@Table(name = "student")
public class Student implements Serializable {

	/**
	 * 学号。
	 */
	@Id
	@Column(name = "id", nullable = false, length = 64)
	private String id;

	/**
	 * 姓名。
	 */
	@Column(name = "name", nullable = false)
	private String name;

	/**
	 * 身份证号码。
	 */
	@Column(name = "identification_number")
	private String identificationNumber;

	/**
	 * 性别（0：女，1：男，2：其它）。
	 */
	@Column(name = "gender", length = 1)
	private String gender;

	/**
	 * 年龄。
	 */
	@Column(name = "age")
	private Integer age;

	/**
	 * 生日，格式：yyyy-MM-dd。
	 */
	@Column(name = "birthday")
	private String birthday;
}
