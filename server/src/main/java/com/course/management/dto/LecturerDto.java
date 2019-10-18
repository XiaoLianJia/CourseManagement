package com.course.management.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 *     讲师信息数据传输类
 * </p>
 * @author zhangbin
 * @date 2019-10-18
 */
@Data
public class LecturerDto implements Serializable {

	/**
	 * 工号。
	 */
	private String id;

	/**
	 * 姓名。
	 */
	private String name;

	/**
	 * 手机号码。
	 */
	private String cellphoneNumber;

	/**
	 * 性别（0：女，1：男，2：其它）。
	 */
	private String gender;

	/**
	 * 年龄。
	 */
	private Integer age;

	/**
	 * 生日，格式：yyyy-MM-dd。
	 */
	private String birthday;
}
