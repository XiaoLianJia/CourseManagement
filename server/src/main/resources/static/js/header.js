/**
 *      Description: 通用首部JavaScript
 *      Author: zhangbin
 *      Date: 2019-10-25
 */

$(function (){
    layui.use(['element','jquery'], function () {
        //alert("Hide");
        $ = layui.jquery;
        element = layui.element;
        $('.layui-side span').hide();
        $(".layui-side").animate({width:'0px'});
    });
});

