<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
%>
<link rel="stylesheet" href="http://admui.oss-cn-shenzhen.aliyuncs.com/demo/1.1.0/css/system/settings/log.css">
<link rel="stylesheet" href="http://admui.oss-cn-shenzhen.aliyuncs.com/demo/1.1.0/vendor/alertify-js/alertify.css">
<link rel="stylesheet" href="http://admui.oss-cn-shenzhen.aliyuncs.com/demo/1.1.0/vendor/datatables-bootstrap/dataTables.bootstrap.css">
<link rel="stylesheet" href="http://admui.oss-cn-shenzhen.aliyuncs.com/demo/1.1.0/vendor/datatables-responsive/dataTables.responsive.css">
<link rel="stylesheet" href="http://admui.oss-cn-shenzhen.aliyuncs.com/demo/1.1.0/vendor/formvalidation/formValidation.css">

<div class="page animation-fade bg-white page-logs">
    <div class="page-header">
        <h1 class="page-title">系统日志</h1>
        <div class="page-header-actions">
            <button type="button" class="btn btn-sm btn-outline btn-default add-row" data-target="#logsForm" data-toggle="modal" aria-hidden="true" role="button">
                <i class="fa fa-plus"></i> 新增
            </button>
        </div>
    </div>
    <hr class="margin-0">
    <div class="page-content">
		<div id="logList_wrapper"
			class="dataTables_wrapper form-inline dt-bootstrap no-footer">

			<div class="row">
				<div class="col-xs-12">
					<table
						class="table table-bordered table-hover text-nowrap dataTable table-striped width-full no-footer dtr-inline"
						id="logList"
						data-column-defs="[{ &quot;orderable&quot;: false, &quot;targets&quot;: 2},{ &quot;orderable&quot;: false, &quot;targets&quot;: 3},{ &quot;orderable&quot;: false, &quot;targets&quot;: 4}]"
						role="grid" aria-describedby="logList_info">
						<thead>
							<tr role="row">
								<th class="sorting_asc" tabindex="0" aria-controls="logList"
									rowspan="1" colspan="1" aria-sort="ascending"
									aria-label="路径降序排列">路径</th>
								<th class="sorting" tabindex="0" aria-controls="logList"
									rowspan="1" colspan="1" aria-label="类型升序排列">类型</th>
								<th class="sorting_disabled" rowspan="1" colspan="1"
									aria-label="用户">用户</th>
								<th class="sorting_disabled" rowspan="1" colspan="1"
									aria-label="时间">时间</th>
								<th class="sorting_disabled" rowspan="1" colspan="1"
									aria-label="操作">操作</th>
							</tr>
						</thead>
						<tbody>



							<tr id="35" role="row" class="odd">
								<td tabindex="0" class="sorting_1">/system/menu</td>
								<td>访问菜单管理</td>
								<td>xiaxuan@admui_demo</td>
								<td>2017-6-13 22:35:44</td>
								<td><div class="btn-group btn-group-sm">
										<button type="button"
											class="btn btn-icon btn-pure btn-default edit-row"
											data-target="#logsForm" data-toggle="modal">
											<i class="icon wb-edit" aria-hidden="true"></i>
										</button>
										<button type="button"
											class="btn btn-icon btn-pure btn-default delete-row">
											<i class="icon wb-close" aria-hidden="true"></i>
										</button>
									</div></td>
							</tr>
						</tbody>
					</table>
					<div id="logList_processing" class="dataTables_processing"
						style="display: none;">正在处理，请稍后…</div>
				</div>
			</div>

		</div>
	</div>
    <div class="modal" id="logsForm" aria-hidden="true" aria-labelledby="logsForm" role="dialog" tabindex="-1" style="display: none;">
        <div class="modal-dialog modal-center">
            <form class="modal-content  fv-form fv-form-bootstrap" id="compileRoleForm" novalidate="novalidate"><button type="submit" class="fv-hidden-submit" style="display: none; width: 0px; height: 0px;"></button>
                <div class="modal-header">
                    <button type="button" class="close" aria-hidden="true" data-dismiss="modal">×</button>
                    <h4 class="modal-title">日志设置</h4>
                </div>
                <div class="modal-body">
                    <div class="form form-horizontal logs-settings">
                        <div class="form-group row has-feedback">
                            <label class="col-xs-2 control-label">路径</label>
                            <div class="col-xs-9">
                                <input class="form-control" name="url" placeholder="请填写需要记录日志的URL" data-fv-field="url" type="text"><i style="display: none;" class="form-control-feedback" data-fv-icon-for="url"></i>
                            <small style="display: none;" class="help-block" data-fv-validator="notEmpty" data-fv-for="url" data-fv-result="NOT_VALIDATED">请填写URL地址</small></div>
                        </div>
                        <div class="form-group row has-feedback">
                            <label class="col-xs-2 control-label">名称</label>
                            <div class="col-xs-9">
                                <input class="form-control" name="type" placeholder="请填写URL对应的显示名称" data-fv-field="type" type="text"><i style="display: none;" class="form-control-feedback" data-fv-icon-for="type"></i>
                            <small style="display: none;" class="help-block" data-fv-validator="notEmpty" data-fv-for="type" data-fv-result="NOT_VALIDATED">请填写URL对应名称</small></div>
                        </div>
                    </div>
                </div>
                <div class="modal-footer">
                    <button class="btn btn-primary" type="submit">保存</button>
                    <a class="btn btn-default" data-dismiss="modal">取消</a>
                </div>
            </form>

        </div>
    </div>
</div>
<script src="http://admui.oss-cn-shenzhen.aliyuncs.com/demo/1.1.0/vendor/datatables/jquery.dataTables.min.js" data-name="dataTables"></script>
<script src="http://admui.oss-cn-shenzhen.aliyuncs.com/demo/1.1.0/vendor/datatables-bootstrap/dataTables.bootstrap.min.js" data-deps="dataTables"></script>
<script src="http://admui.oss-cn-shenzhen.aliyuncs.com/demo/1.1.0/vendor/datatables-responsive/dataTables.responsive.min.js" data-deps="dataTables"></script>
<script src="http://admui.oss-cn-shenzhen.aliyuncs.com/demo/1.1.0/vendor/datatables-buttons/dataTables.buttons.min.js" data-deps="dataTables"></script>
<script src="http://admui.oss-cn-shenzhen.aliyuncs.com/demo/1.1.0/vendor/datatables-buttons/buttons.print.min.js"></script>
<script src="http://admui.oss-cn-shenzhen.aliyuncs.com/demo/1.1.0/vendor/datatables-buttons/buttons.html5.min.js"></script>
<script src="http://admui.oss-cn-shenzhen.aliyuncs.com/demo/1.1.0/vendor/jszip/jszip.min.js"></script>
<script src="http://admui.oss-cn-shenzhen.aliyuncs.com/demo/1.1.0/vendor/jstree/jstree.min.js"></script>
<script src="http://admui.oss-cn-shenzhen.aliyuncs.com/demo/1.1.0/vendor/alertify-js/alertify.min.js"></script>
<script src="http://admui.oss-cn-shenzhen.aliyuncs.com/demo/1.1.0/vendor/jquery-strength/jquery-strength.min.js"></script>
<script src="http://admui.oss-cn-shenzhen.aliyuncs.com/demo/1.1.0/vendor/multi-select/jquery.multi-select.min.js"></script>
<script src="http://admui.oss-cn-shenzhen.aliyuncs.com/demo/1.1.0/vendor/formvalidation/formValidation.min.js" data-name="formValidation"></script>
<script src="http://admui.oss-cn-shenzhen.aliyuncs.com/demo/1.1.0/vendor/formvalidation/framework/bootstrap.min.js" data-deps="formValidation"></script>
<script src="http://admui.oss-cn-shenzhen.aliyuncs.com/demo/1.1.0/themes/classic/global/js/plugins/sticky-header.js"></script>
<script src="http://admui.oss-cn-shenzhen.aliyuncs.com/demo/1.1.0/themes/classic/global/js/plugins/action-btn.js"></script>
<script src="http://admui.oss-cn-shenzhen.aliyuncs.com/demo/1.1.0/themes/classic/global/js/plugins/selectable.js"></script>
<script src="http://admui.oss-cn-shenzhen.aliyuncs.com/demo/1.1.0/themes/classic/base/js/app.js" data-name="app"></script>
<script src="<%=path %>/public/js/system/settings/log.js" data-deps="app"></script>







