<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
%>









<link rel="stylesheet" href="http://admui.oss-cn-shenzhen.aliyuncs.com/demo/1.1.0/vendor/bootstrap-daterangepicker/daterangepicker.css">
<link rel="stylesheet" href="http://admui.oss-cn-shenzhen.aliyuncs.com/demo/1.1.0/vendor/select2/select2.css">






<div class="page page-full animation-fade page-logs">
    <div class="page-header">
        <h1 class="page-title">系统日志</h1>
        <div class="page-header-actions">
            <button type="button" class="btn btn-icon btn-info" data-toggle="collapse" data-target="#collapseFilter" aria-expanded="true" aria-controls="collapseFilter">
                <i class="fa fa-filter"></i>
            </button>
        </div>
    </div>
    <div class="page-content">
        <div class="collapse in" id="collapseFilter" aria-expanded="true" style="">
            <div class="panel">
                <div class="panel-body">
                    <form class="form-inline" id="logForm">
                        <div class="form-group">
                            <div class="input-daterange input-group">
                                <span class="input-group-addon"><i class="icon wb-calendar" aria-hidden="true"></i></span>
                                <input class="form-control" id="filter-date" placeholder="起至日期" type="text">
                                <input name="startDate" type="hidden">
                                <input name="endDate" type="hidden">
                                <a class="input-group-addon padding-horizontal-10" role="button">
                                    <i class="icon wb-close date-close"></i></a>
                            </div>
                        </div>
                        <div class="form-group">
                            <select class="form-control select2-hidden-accessible" name="url" data-plugin="select2" tabindex="-1" aria-hidden="true">
                                <option value="">日志名称</option>
                                
                                <option value="/system/menu">访问菜单管理</option>
                                
                            </select><span class="select2 select2-container select2-container--default select2-container--below select2-container--focus" dir="ltr"><span class="selection"><span class="select2-selection select2-selection--single" role="combobox" aria-haspopup="true" aria-expanded="false" tabindex="0" aria-labelledby="select2-url-ha-container"><span class="select2-selection__rendered" id="select2-url-ha-container" title="日志名称">日志名称</span><span class="select2-selection__arrow" role="presentation"><b role="presentation"></b></span></span></span><span class="dropdown-wrapper" aria-hidden="true"></span></span>
                        </div>
                        <div class="form-group">
                            <select class="form-control select2-hidden-accessible" name="user.userId" data-plugin="select2" tabindex="-1" aria-hidden="true">
                                <option value="">所有用户</option>
                                
                                <option value="9">xiaxuan@admui_demo</option>
                                
                                <option value="10">zhangzhiyuan@admui_demo</option>
                                
                                <option value="11">wangshiqi@admui_demo</option>
                                
                                <option value="12">lixin@admui_demo</option>
                                
                                <option value="13">qinshouren@admui_demo</option>
                                
                                <option value="14">liuyiming@admui_demo</option>
                                
                                <option value="15">wangjiaqi@admui_demo</option>
                                
                            </select><span class="select2 select2-container select2-container--default select2-container--below" dir="ltr"><span class="selection"><span class="select2-selection select2-selection--single" role="combobox" aria-haspopup="true" aria-expanded="false" tabindex="0" aria-labelledby="select2-useruserId-ko-container"><span class="select2-selection__rendered" id="select2-useruserId-ko-container" title="zhangzhiyuan@admui_demo">zhangzhiyuan@admui_demo</span><span class="select2-selection__arrow" role="presentation"><b role="presentation"></b></span></span></span><span class="dropdown-wrapper" aria-hidden="true"></span></span>
                        </div>
                        <div class="form-group">
                            <button type="submit" class="btn btn-success"><i class="icon fa-search"></i> 查找</button>
                        </div>
                    </form>

                </div>
            </div>
        </div>
        <div class="panel">
            <header class="panel-heading">
                <h3 class="panel-title">日志信息</h3>
            </header>
            <div class="panel-body">
                






<link rel="stylesheet" href="<%=path %>/public/vendor/datatables-bootstrap/dataTables.bootstrap.css">
<link rel="stylesheet" href="<%=path %>/public/vendor/datatables-responsive/dataTables.responsive.css">
<div id="logList_wrapper" class="dataTables_wrapper form-inline dt-bootstrap"><div class="row"><div class="col-xs-6"><div class="hidden-xs"><div class="dataTables_length" id="logList_length"><label>每页显示 <select name="logList_length" aria-controls="logList" class="form-control input-sm"><option value="10">10</option><option value="25">25</option><option value="50">50</option><option value="100">100</option></select> 条</label></div></div></div><div class="col-xs-6"></div></div><div class="row"><div class="col-xs-12"><table class="table table-bordered table-hover text-nowrap dataTable table-striped width-full margin-vertical-10 dtr-inline" id="logList" data-column-defs="[{ &quot;orderable&quot;: false, &quot;targets&quot;: 2}]" role="grid" aria-describedby="logList_info">
    <thead>
    <tr role="row"><th class="sorting_asc" tabindex="0" aria-controls="logList" rowspan="1" colspan="1" aria-sort="ascending" aria-label="路径降序排列">路径</th><th class="sorting" tabindex="0" aria-controls="logList" rowspan="1" colspan="1" aria-label="名称升序排列">名称</th><th class="sorting_disabled" rowspan="1" colspan="1" aria-label="参数">参数</th><th class="sorting" tabindex="0" aria-controls="logList" rowspan="1" colspan="1" aria-label="用户升序排列">用户</th><th class="sorting" tabindex="0" aria-controls="logList" rowspan="1" colspan="1" aria-label="用户IP升序排列">用户IP</th><th class="sorting" tabindex="0" aria-controls="logList" rowspan="1" colspan="1" aria-label="时间升序排列">时间</th></tr>
    </thead>
    <tfoot>
    <tr><th rowspan="1" colspan="1">路径</th><th rowspan="1" colspan="1">名称</th><th rowspan="1" colspan="1">参数</th><th rowspan="1" colspan="1">用户</th><th rowspan="1" colspan="1">用户IP</th><th rowspan="1" colspan="1">时间</th></tr>
    </tfoot>
<tbody><tr role="row" class="odd"><td class="sorting_1" tabindex="0">/system/menu</td><td>访问菜单管理</td><td>[_pjax=#admui-pageContent _=1501147096568 ]</td><td>zhangzhiyuan@admui_demo</td><td>221.224.122.162</td><td>2017-07-27 17:18:32</td></tr><tr role="row" class="even"><td class="sorting_1" tabindex="0">/system/menu</td><td>访问菜单管理</td><td>[_pjax=#admui-pageContent _=1501293554454 ]</td><td>xiaxuan@admui_demo</td><td>1.204.235.250</td><td>2017-07-29 09:59:29</td></tr><tr role="row" class="odd"><td class="sorting_1" tabindex="0">/system/menu</td><td>访问菜单管理</td><td>[_pjax=#admui-pageContent _=1501481630622 ]</td><td>xiaxuan@admui_demo</td><td>124.227.14.117</td><td>2017-07-31 14:42:09</td></tr><tr role="row" class="even"><td class="sorting_1" tabindex="0">/system/menu</td><td>访问菜单管理</td><td>[_pjax=#admui-pageContent _=1501581710397 ]</td><td>xiaxuan@admui_demo</td><td>59.34.84.173</td><td>2017-08-01 18:01:59</td></tr><tr role="row" class="odd"><td class="sorting_1" tabindex="0">/system/menu</td><td>访问菜单管理</td><td>[_pjax=#admui-pageContent _=1501734236540 ]</td><td>zhangzhiyuan@admui_demo</td><td>61.174.30.170</td><td>2017-08-03 12:24:42</td></tr><tr role="row" class="even"><td class="sorting_1" tabindex="0">/system/menu</td><td>访问菜单管理</td><td>[_pjax=#admui-pageContent _=1501813678249 ]</td><td>xiaxuan@admui_demo</td><td>180.102.114.221</td><td>2017-08-04 10:53:54</td></tr><tr role="row" class="odd"><td class="sorting_1" tabindex="0">/system/menu</td><td>访问菜单管理</td><td>[_pjax=#admui-pageContent _=1501147085339 ]</td><td>xiaxuan@admui_demo</td><td>113.139.208.77</td><td>2017-07-27 17:19:46</td></tr><tr role="row" class="even"><td class="sorting_1" tabindex="0">/system/menu</td><td>访问菜单管理</td><td>[_pjax=#admui-pageContent _=1501293673206 ]</td><td>xiaxuan@admui_demo</td><td>117.87.8.114</td><td>2017-07-29 10:09:53</td></tr><tr role="row" class="odd"><td class="sorting_1" tabindex="0">/system/menu</td><td>访问菜单管理</td><td>[_pjax=#admui-pageContent _=1501483300819 ]</td><td>xiaxuan@admui_demo</td><td>39.71.209.102</td><td>2017-07-31 14:43:37</td></tr><tr role="row" class="even"><td class="sorting_1" tabindex="0">/system/menu</td><td>访问菜单管理</td><td>[_pjax=#admui-pageContent _=1501581743889 ]</td><td>xiaxuan@admui_demo</td><td>114.95.248.39</td><td>2017-08-01 18:03:09</td></tr></tbody></table><div id="logList_processing" class="dataTables_processing" style="display: none;">正在处理，请稍后…</div></div></div><div class="row"><div class="col-sm-5"><div class="dataTables_info" id="logList_info" role="status" aria-live="polite">第 1 至 10 项，共 1,711 项</div></div><div class="col-sm-7"><div class="dataTables_paginate paging_simple_numbers" id="logList_paginate"><ul class="pagination"><li class="paginate_button previous disabled" id="logList_previous"><a href="#" aria-controls="logList" data-dt-idx="0" tabindex="0"><i class="icon wb-chevron-left-mini"></i></a></li><li class="paginate_button active"><a href="#" aria-controls="logList" data-dt-idx="1" tabindex="0">1</a></li><li class="paginate_button "><a href="#" aria-controls="logList" data-dt-idx="2" tabindex="0">2</a></li><li class="paginate_button "><a href="#" aria-controls="logList" data-dt-idx="3" tabindex="0">3</a></li><li class="paginate_button "><a href="#" aria-controls="logList" data-dt-idx="4" tabindex="0">4</a></li><li class="paginate_button "><a href="#" aria-controls="logList" data-dt-idx="5" tabindex="0">5</a></li><li class="paginate_button disabled" id="logList_ellipsis"><a href="#" aria-controls="logList" data-dt-idx="6" tabindex="0">…</a></li><li class="paginate_button "><a href="#" aria-controls="logList" data-dt-idx="7" tabindex="0">172</a></li><li class="paginate_button next" id="logList_next"><a href="#" aria-controls="logList" data-dt-idx="8" tabindex="0"><i class="icon wb-chevron-right-mini"></i></a></li></ul></div></div></div></div>






            </div>
        </div>
    </div>
</div>
