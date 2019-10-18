package com.course.management.http;

import com.course.management.enums.ResponseResults;
import com.github.pagehelper.PageInfo;
import lombok.Data;
import org.springframework.data.domain.Page;

import java.io.Serializable;

/**
 * <p>
 *     响应实体类
 * </p>
 * @author zhangbin
 * @date 2019-10-18
 * @param <T>
 */
@Data
public final class Response<T> implements Serializable {

	private String code;

	private String msg;

	private T result;

	private Response(String code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	private Response(String code, String msg, T result) {
		this.code = code;
		this.msg = msg;
		this.result = result;
	}

	public static <T> Response<T> success() {
		return new Response<>(ResponseResults.SUCCESS.getCode(), ResponseResults.SUCCESS.getMsg());
	}

	public static <T> Response<T> success(T result) {
		return new Response<>(ResponseResults.SUCCESS.getCode(), ResponseResults.SUCCESS.getMsg(), result);
	}

	public static <T> Response<T> error(String code, String msg) {
		return new Response<>(code, msg);
	}

	public static <T> Response<T> error(ResponseResults error) {
		return new Response<>(error.getCode(), error.getMsg());
	}

	@SuppressWarnings("unchecked")
	public static <T> Response<T> pageSuccess(Page page) {
		if (null == page) {
			return success();
		}
		PageResponse pageResult = new PageResponse();
		pageResult.setData(page.getContent());
		pageResult.setTotalPages(page.getTotalPages());
		pageResult.setTotalElements(page.getTotalElements());
		pageResult.setPageNumber(page.getNumber() + 1);
		pageResult.setPageSize(page.getSize());
		return new Response(ResponseResults.SUCCESS.getCode(), ResponseResults.SUCCESS.getMsg(), pageResult);
	}

	@SuppressWarnings("unchecked")
	public static <T> Response<T> pageSuccess(PageInfo pageInfo) {
		if (null == pageInfo) {
			return success();
		}
		PageResponse pageResult = new PageResponse();
		pageResult.setData(pageInfo.getList());
		pageResult.setTotalPages(pageInfo.getPages());
		pageResult.setTotalElements(pageInfo.getTotal());
		pageResult.setPageNumber(pageInfo.getPageNum());
		pageResult.setPageSize(pageInfo.getSize());
		return new Response(ResponseResults.SUCCESS.getCode(), ResponseResults.SUCCESS.getMsg(), pageResult);
	}
}
