package com.course.management.controller.rest;

import com.course.management.dto.StudentDto;
import com.course.management.http.PageRequest;
import com.course.management.http.Response;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *     学生信息控制层
 * </p>
 * @author zhangbin
 * @date 2019-10-18
 */
@Slf4j
@RestController
@RequestMapping("rest/student")
public class StudentRestController {

	@RequestMapping("add")
	public Response add(@RequestBody StudentDto studentDto) {

		return Response.success();
	}

	@RequestMapping("remove")
	public Response remove(@RequestBody StudentDto studentDto) {

		return Response.success();
	}

	@RequestMapping("update")
	public Response update(@RequestBody StudentDto studentDto) {

		return Response.success();
	}

	@RequestMapping("page")
	public Response<List<StudentDto>> page(@RequestBody PageRequest<StudentDto> pageRequest) {

		PageInfo pageInfo = new PageInfo();
		return Response.pageSuccess(pageInfo);
	}
}
