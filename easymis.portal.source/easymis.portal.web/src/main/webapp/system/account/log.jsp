<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
%>


                    

                        <div class="tab-content margin-top-15">
                            <div class="animation-slide-left tab-message active" id="accountContent">






<link rel="stylesheet" href="http://admui.oss-cn-shenzhen.aliyuncs.com/demo/1.1.0/vendor/datatables-bootstrap/dataTables.bootstrap.css">
<link rel="stylesheet" href="http://admui.oss-cn-shenzhen.aliyuncs.com/demo/1.1.0/vendor/datatables-responsive/dataTables.responsive.css">
<div id="logList_wrapper" class="dataTables_wrapper form-inline dt-bootstrap"><div class="row"><div class="col-xs-6"><div class="hidden-xs"><div class="dataTables_length" id="logList_length"><label>每页显示 <select name="logList_length" aria-controls="logList" class="form-control input-sm"><option value="10">10</option><option value="25">25</option><option value="50">50</option><option value="100">100</option></select> 条</label></div></div></div><div class="col-xs-6"></div></div><div class="row"><div class="col-xs-12"><table class="table table-bordered table-hover text-nowrap dataTable table-striped width-full margin-vertical-10 dtr-inline collapsed" id="logList" data-column-defs="[{ &quot;orderable&quot;: false, &quot;targets&quot;: 2}]" role="grid" aria-describedby="logList_info">
    <thead>
    <tr role="row"><th class="sorting_asc" tabindex="0" aria-controls="logList" rowspan="1" colspan="1" aria-sort="ascending" aria-label="路径降序排列">路径</th><th class="sorting" tabindex="0" aria-controls="logList" rowspan="1" colspan="1" aria-label="名称升序排列">名称</th><th class="sorting_disabled" rowspan="1" colspan="1" aria-label="参数">参数</th><th class="sorting" tabindex="0" aria-controls="logList" rowspan="1" colspan="1" aria-label="用户升序排列">用户</th><th class="sorting" tabindex="0" aria-controls="logList" rowspan="1" colspan="1" aria-label="用户IP升序排列" style="display: none;">用户IP</th><th class="sorting" tabindex="0" aria-controls="logList" rowspan="1" colspan="1" aria-label="时间升序排列" style="display: none;">时间</th></tr>
    </thead>
    <tfoot>
    <tr><th rowspan="1" colspan="1">路径</th><th rowspan="1" colspan="1">名称</th><th rowspan="1" colspan="1">参数</th><th rowspan="1" colspan="1">用户</th><th rowspan="1" colspan="1" style="display: none;">用户IP</th><th rowspan="1" colspan="1" style="display: none;">时间</th></tr>
    </tfoot>
<tbody><tr role="row" class="odd"><td class="sorting_1" tabindex="0">/system/menu</td><td>访问菜单管理</td><td>[_pjax=#admui-pageContent _=1501293554454 ]</td><td>xiaxuan@admui_demo</td><td style="display: none;">1.204.235.250</td><td style="display: none;">2017-07-29 09:59:29</td></tr><tr role="row" class="even"><td class="sorting_1" tabindex="0">/system/menu</td><td>访问菜单管理</td><td>[_pjax=#admui-pageContent _=1501147085339 ]</td><td>xiaxuan@admui_demo</td><td style="display: none;">113.139.208.77</td><td style="display: none;">2017-07-27 17:19:46</td></tr><tr role="row" class="odd"><td class="sorting_1" tabindex="0">/system/menu</td><td>访问菜单管理</td><td>[_pjax=#admui-pageContent _=1501293673206 ]</td><td>xiaxuan@admui_demo</td><td style="display: none;">117.87.8.114</td><td style="display: none;">2017-07-29 10:09:53</td></tr><tr role="row" class="even"><td class="sorting_1" tabindex="0">/system/menu</td><td>访问菜单管理</td><td>[_pjax=#admui-pageContent _=1501294528516 ]</td><td>xiaxuan@admui_demo</td><td style="display: none;">36.110.17.18</td><td style="display: none;">2017-07-29 10:16:08</td></tr><tr role="row" class="odd"><td class="sorting_1" tabindex="0">/system/menu</td><td>访问菜单管理</td><td>[_pjax=#admui-pageContent _=1501147870627 ]</td><td>xiaxuan@admui_demo</td><td style="display: none;">113.139.208.77</td><td style="display: none;">2017-07-27 17:31:26</td></tr><tr role="row" class="even"><td class="sorting_1" tabindex="0">/system/menu</td><td>访问菜单管理</td><td>[_pjax=#admui-pageContent _=1501294628895 ]</td><td>xiaxuan@admui_demo</td><td style="display: none;">125.118.111.56</td><td style="display: none;">2017-07-29 10:17:39</td></tr><tr role="row" class="odd"><td class="sorting_1" tabindex="0">/system/menu</td><td>访问菜单管理</td><td>[]</td><td>xiaxuan@admui_demo</td><td style="display: none;">113.139.208.77</td><td style="display: none;">2017-07-27 17:31:50</td></tr><tr role="row" class="even"><td class="sorting_1" tabindex="0">/system/menu</td><td>访问菜单管理</td><td>[_pjax=#admui-pageContent _=1501293228186 ]</td><td>xiaxuan@admui_demo</td><td style="display: none;">221.224.11.234</td><td style="display: none;">2017-07-29 10:27:12</td></tr><tr role="row" class="odd"><td class="sorting_1" tabindex="0">/system/menu</td><td>访问菜单管理</td><td>[_pjax=#admui-pageContent _=1501147924086 ]</td><td>xiaxuan@admui_demo</td><td style="display: none;">113.139.208.77</td><td style="display: none;">2017-07-27 17:34:16</td></tr><tr role="row" class="even"><td class="sorting_1" tabindex="0">/system/menu</td><td>访问菜单管理</td><td>[_pjax=#admui-pageContent _=1501295816021 ]</td><td>xiaxuan@admui_demo</td><td style="display: none;">101.231.60.132</td><td style="display: none;">2017-07-29 10:36:41</td></tr></tbody></table><div id="logList_processing" class="dataTables_processing" style="display: none;">正在处理，请稍后…</div></div></div><div class="row"><div class="col-sm-5"><div class="dataTables_info" id="logList_info" role="status" aria-live="polite">第 1 至 10 项，共 416 项</div></div><div class="col-sm-7"><div class="dataTables_paginate paging_simple_numbers" id="logList_paginate"><ul class="pagination"><li class="paginate_button previous disabled" id="logList_previous"><a href="#" aria-controls="logList" data-dt-idx="0" tabindex="0"><i class="icon wb-chevron-left-mini"></i></a></li><li class="paginate_button active"><a href="#" aria-controls="logList" data-dt-idx="1" tabindex="0">1</a></li><li class="paginate_button "><a href="#" aria-controls="logList" data-dt-idx="2" tabindex="0">2</a></li><li class="paginate_button "><a href="#" aria-controls="logList" data-dt-idx="3" tabindex="0">3</a></li><li class="paginate_button "><a href="#" aria-controls="logList" data-dt-idx="4" tabindex="0">4</a></li><li class="paginate_button "><a href="#" aria-controls="logList" data-dt-idx="5" tabindex="0">5</a></li><li class="paginate_button disabled" id="logList_ellipsis"><a href="#" aria-controls="logList" data-dt-idx="6" tabindex="0">…</a></li><li class="paginate_button "><a href="#" aria-controls="logList" data-dt-idx="7" tabindex="0">42</a></li><li class="paginate_button next" id="logList_next"><a href="#" aria-controls="logList" data-dt-idx="8" tabindex="0"><i class="icon wb-chevron-right-mini"></i></a></li></ul></div></div></div></div>





</div>
                        </div>
       
         

