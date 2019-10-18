package com.course.management.controller;

import com.course.management.dto.LecturerDto;
import com.course.management.enums.ResponseResults;
import com.course.management.http.PageRequest;
import com.course.management.http.Response;
import com.course.management.service.ILecturerService;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *     讲师信息控制层
 * </p>
 * @author zhangbin
 * @date 2019-10-18
 */
@Slf4j
@RestController
@RequestMapping("lecturer")
public class LecturerController {

	@Autowired
	private ILecturerService lecturerService;

	@RequestMapping("add")
	public Response add(@RequestBody LecturerDto lecturerDto) {

		// 参数完整性校验。
		if (StringUtils.isEmpty(lecturerDto.getName())
				|| StringUtils.isEmpty(lecturerDto.getCellphoneNumber())) {
			return Response.error(ResponseResults.ERROR_PARAMETER_MISSING);
		}

		// 重复性校验。

		// 工号校验。

		// 入库。

		return Response.success();
	}

	@RequestMapping("remove")
	public Response remove(@RequestBody LecturerDto lecturerDto) {

		return Response.success();
	}

	@RequestMapping("update")
	public Response update(@RequestBody LecturerDto lecturerDto) {

		return Response.success();
	}

	@RequestMapping("page")
	public Response<List<LecturerDto>> page(@RequestBody PageRequest<LecturerDto> pageRequest) {

		PageInfo pageInfo = new PageInfo();
		return Response.pageSuccess(pageInfo);
	}
}
