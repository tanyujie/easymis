<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
%>
<link rel="stylesheet" href="http://admui.oss-cn-shenzhen.aliyuncs.com/demo/1.1.0/vendor/webui-popover/webui-popover.css">
<link rel="stylesheet" href="http://admui.oss-cn-shenzhen.aliyuncs.com/demo/1.1.0/vendor/alertify-js/alertify.css">
<link rel="stylesheet" href="http://admui.oss-cn-shenzhen.aliyuncs.com/demo/1.1.0/vendor/datatables-bootstrap/dataTables.bootstrap.css">
<link rel="stylesheet" href="http://admui.oss-cn-shenzhen.aliyuncs.com/demo/1.1.0/vendor/datatables-responsive/dataTables.responsive.css">
<link rel="stylesheet" href="http://admui.oss-cn-shenzhen.aliyuncs.com/demo/1.1.0/vendor/formvalidation/formValidation.css">

<div class="page animation-fade page-backlist">
    <div class="page-content">
        <div class="panel">
            <div class="panel-heading">
                <h3 class="panel-title">黑名单</h3>
                <div class="panel-actions">
                    <a class="panel-action icon wb-plus" data-target="#add" data-toggle="modal" aria-hidden="true" role="button">
                        新增
                    </a>
                </div>
            </div>
            <div class="panel-body">
                <div id="DataTables_Table_0_wrapper" class="dataTables_wrapper form-inline dt-bootstrap no-footer"><div class="row"><div class="col-xs-6"><div class="hidden-xs"><div class="dataTables_length" id="DataTables_Table_0_length"><label>每页显示 <select name="DataTables_Table_0_length" aria-controls="DataTables_Table_0" class="form-control input-sm"><option value="10">10</option><option value="25">25</option><option value="50">50</option><option value="100">100</option></select> 条</label></div></div></div><div class="col-xs-6"><div id="DataTables_Table_0_filter" class="dataTables_filter"><label><input class="form-control input-sm" placeholder="快速查找" aria-controls="DataTables_Table_0" type="search"></label></div></div></div><div class="row"><div class="col-xs-12"><table class="table table-bordered dataTable table-striped table-hover text-nowrap margin-vertical-10 no-footer dtr-inline" data-column-defs="[{ &quot;orderable&quot;: false, &quot;targets&quot;: 3},{ &quot;orderable&quot;: false, &quot;targets&quot;: 4}]" id="DataTables_Table_0" role="grid" aria-describedby="DataTables_Table_0_info">
                    <thead>
	                    <tr role="row"><th class="sorting_asc" tabindex="0" aria-controls="DataTables_Table_0" rowspan="1" colspan="1" aria-sort="ascending" aria-label="序号降序排列">序号</th><th class="sorting" tabindex="0" aria-controls="DataTables_Table_0" rowspan="1" colspan="1" aria-label="IP升序排列">IP</th><th class="sorting" tabindex="0" aria-controls="DataTables_Table_0" rowspan="1" colspan="1" aria-label="加入时间升序排列">加入时间</th><th class="sorting_disabled" rowspan="1" colspan="1" aria-label="备注">备注</th><th class="sorting_disabled" rowspan="1" colspan="1" aria-label="操作">操作</th></tr>
                    </thead>
                    <tbody>
	                    
                    <tr class="odd"><td colspan="5" class="dataTables_empty" valign="top">无数据</td></tr></tbody>
                </table></div></div><div class="row"><div class="col-sm-5"><div class="dataTables_info" id="DataTables_Table_0_info" role="status" aria-live="polite">共 0 项</div></div><div class="col-sm-7"><div class="dataTables_paginate paging_simple_numbers" id="DataTables_Table_0_paginate"><ul class="pagination"><li class="paginate_button previous disabled" id="DataTables_Table_0_previous"><a href="#" aria-controls="DataTables_Table_0" data-dt-idx="0" tabindex="0"><i class="icon wb-chevron-left-mini"></i></a></li><li class="paginate_button next disabled" id="DataTables_Table_0_next"><a href="#" aria-controls="DataTables_Table_0" data-dt-idx="1" tabindex="0"><i class="icon wb-chevron-right-mini"></i></a></li></ul></div></div></div></div>
            </div>
        </div>
    </div>
</div>

<div class="modal fade" id="add" aria-hidden="true" aria-labelledby="add" role="dialog" tabindex="-1" style="display: none;">
    <div class="modal-dialog modal-center">
        <form class="modal-content fv-form fv-form-bootstrap" id="blackList" method="post" novalidate="novalidate"><button type="submit" class="fv-hidden-submit disabled" style="display: none; width: 0px; height: 0px;" disabled="disabled"></button>
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="关闭">
                    <span aria-hidden="true">×</span>
                </button>
                <h4 class="modal-title">添加到黑名单</h4>
            </div>
            <div class="modal-body">
                <div class="alert alert-warning alert-dismissible" role="alert">
                    <i class="icon wb-bell" aria-hidden="true"></i> 加入黑名单的IP用户将无法访问本系统
                </div>
                <div class="form-group has-feedback has-error">
                    <input class="form-control" name="ip" placeholder="请填写要加入黑名单的IP" data-fv-field="ip" type="text"><i style="display: block;" class="form-control-feedback fv-icon-no-label icon wb-close" data-fv-icon-for="ip"></i>
                <small style="display: block;" class="help-block" data-fv-validator="notEmpty" data-fv-for="ip" data-fv-result="INVALID">请填写IP地址</small></div>
                <div class="form-group margin-bottom-0">
                    <textarea class="form-control" rows="3" name="comment" placeholder="备注信息"></textarea>
                </div>
            </div>
            <div class="modal-footer">
                <button type="submit" class="btn btn-primary disabled" disabled="disabled">确定</button>
                <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
            </div>
        </form>
    </div>
</div>








