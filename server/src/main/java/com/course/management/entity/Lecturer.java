package com.course.management.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * <p>
 *     讲师信息实体类
 * </p>
 * @author zhangbin
 * @date 2019-10-15
 */
@Data
@Entity
@Table(name = "lecturer")
public class Lecturer implements Serializable {

	/**
	 * 工号。
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
	 * 手机号码。
	 */
	@Column(name = "cellphone_number")
	private String cellphoneNumber;

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
