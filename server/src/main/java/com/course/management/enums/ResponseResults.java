package com.course.management.enums;

/**
 * <p>
 *     响应结果枚举
 * </p>
 * @author zhangbin
 * @date 2019-10-18
 */
public enum ResponseResults {

	/**
	 * 无异常。
	 */
	SUCCESS("200", "OK"),

	/**
	 * 参数不全。
	 */
	ERROR_PARAMETER_MISSING("4001", "缺少参数/参数为空");

	/**
	 * 响应码。
	 */
	private String code;

	/**
	 * 响应值。
	 */
	private String msg;

	ResponseResults(String code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public String getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}
}
