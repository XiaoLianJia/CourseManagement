/**
 *      Description: 课程信息JavaScript
 *      Author: zhangbin
 *      Date: 2019-10-24
 */

/**
 * 表单。
 */
var form;

/**
 * 当前页。
 */
var pageCurr;

$(function () {
    layui.use('table', function () {
        var table = layui.table;
        form = layui.form;

        tableIns = table.render({
            id: 'id',
            elem: '#courseList',
            url: '/course/courseList',
            method: 'post',
            cellMinWidth: 80,
            page: true,
            request: {
                pageName: 'pageNum',
                limitName: 'pageSize'
            },
            response: {
                statusName: 'code',
                statusCode: 200,
                countName: 'totals',
                dataName: 'list'
            },
            cols: [[
                { type: 'numbers' },
                { field: 'name', title: '名称', align: 'center' },
                { filed: 'type', title: '类型', align: 'center' },
                { field: 'lessonCount', title: '课时数', align: 'center' },
                { filed: 'startDate', title: '起始日期', align: 'center' },
                { field: 'endDate', title: '课程结束日期', align: 'center' },
                { filed: 'type', title: '类型', align: 'center' },
                { fixed: 'right',title: '操作', align:'center', toolbar:'#operateBar'}
            ]],
            done: function (res, curr, count) {
                pageCurr = curr;
            }
        });

        table.on('tool(courseTable)', function (obj) {
            var data = obj.data;
            if (obj.event === 'del') {
                del(data, data.id);
            } else if (obj.event === 'edit') {
                edit(data);
            }
        });

        form.on('submit(courseSubmit)', function (data) {
            formSubmit(data);
            return false;
        });
    });
});

/**
 * 提交表单
 * @param obj 表单
 */
function formSubmit(obj) {
    $.ajax({
        type: 'post',
        data: $("courseForm").serialize(),
        url: "/course/setCourse",
        success: function (data) {
            if (200 === data.code) {
                layer.alert(data.msg, function () {
                    layer.closeAll();
                    load(obj);
                })
            } else {
                layer.alert(data.msg);
            }
        }
    })
}

/**
 * 加载数据表
 * @param obj 数据
 */
function load(obj) {
    tableIns.reload({
        where: obj.field,
        page: {
            current: pageCurr
        }
    });
}

/**
 * 新增
 */
function add() {
    edit(null, "新增");
}

/**
 * 删除
 * @param obj 数据
 * @param id 编号
 */
function del(obj, id) {

}

/**
 * 修改
 * @param data 数据
 * @param title 标题
 */
function edit(data, title) {

}
