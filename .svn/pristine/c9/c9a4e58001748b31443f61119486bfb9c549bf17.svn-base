<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
%>
<html
	class="js flexbox canvas canvastext webgl no-touch geolocation postmessage no-websqldatabase indexeddb hashchange history draganddrop websockets rgba hsla multiplebgs backgroundsize borderimage borderradius boxshadow textshadow opacity cssanimations csscolumns cssgradients no-cssreflections csstransforms csstransforms3d csstransitions fontface generatedcontent video audio localstorage sessionstorage webworkers applicationcache svg inlinesvg smil svgclippaths js-menubar"
	style="" lang="zh-cn">
<head>
<title>主页</title>
<meta charset="utf-8">
<meta name="keywords"
	content="admui,admui官网,admui下载,admui框架,通用后台管理系统,后台框架,ui框架">
<meta name="description"
	content="Admui在线演示系统，Admui是一个基于最新Web技术的企业级通用管理系统快速开发框架，可以帮助企业极大的提高工作效率，节省开发成本，提升品牌形象。">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<!-- 移动设备 viewport -->
<meta name="viewport"
	content="width=device-width,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no,minimal-ui">
<meta name="author" content="admui.com">
<!-- 360浏览器默认使用Webkit内核 -->
<meta name="renderer" content="webkit">
<!-- 禁止百度SiteAPP转码 -->
<meta http-equiv="Cache-Control" content="no-siteapp">
<!-- Chrome浏览器添加桌面快捷方式（安卓） -->
<link rel="icon" type="image/png"
	href="<%=path%>/public/images/favicon.png">
<meta name="mobile-web-app-capable" content="yes">
<!-- Safari浏览器添加到主屏幕（IOS） -->
<link rel="icon" sizes="192x192"
	href="<%=path%>/public/images/apple-touch-icon.png">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<meta name="apple-mobile-web-app-title" content="Admui">
<!-- Win8标题栏及ICON图标 -->
<link rel="apple-touch-icon-precomposed"
	href="<%=path%>/public/images/apple-touch-icon.png">
<meta name="msapplication-TileImage"
	content="<%=path%>/public/images/app-icon72x72@2x.png">
<meta name="msapplication-TileColor" content="#62a8ea">
<!-- 样式 -->
<link rel="stylesheet"
	href="<%=path%>/public/themes/classic/base/css/site.css" id="siteStyle">
<!-- 图标 CSS-->
<link rel="stylesheet"
	href="<%=path%>/public/plug/font-awesome-4.7.0/css/font-awesome.css">
<link rel="stylesheet"
	href="<%=path%>/public/fonts/web-icons/web-icons.css">

<!-- 插件 CSS -->
<link rel="stylesheet"
	href="<%=path%>/public/plug/animsition/animsition.css">
<link rel="stylesheet" href="<%=path%>/public/plug/toastr/toastr.css">
<link rel="stylesheet" href="<%=path%>/public/css/demo.css">

<!-- 插件 -->
<script
	src="https://hm.baidu.com/hm.js?c9dd85291ea88dcf64671a7dfa65e0ef"></script>
<script src="<%=path%>/public/plug/jquery/jquery.min.js"></script>
<style id="zoomLevel-styles"></style>
<script src="<%=path%>/public/plug/bootstrap/bootstrap.min.js"></script>
<script src="<%=path%>/public/plug/modernizr/modernizr.min.js"></script>
<script src="<%=path%>/public/plug/breakpoints/breakpoints.min.js"></script>
<script src="<%=path%>/public/plug/artTemplate/template.min.js"></script>
<script src="<%=path%>/public/plug/toastr/toastr.min.js"></script>
<script src="<%=path%>/public/plug/bootbox/bootbox.min.js"></script>

<!-- 核心  -->
<script src="<%=path%>/public/themes/classic/global/js/core.js"></script>
<script src="<%=path%>/public/themes/classic/base/js/site.js"></script>
<script
	src="<%=path%>/public/themes/classic/global/js/configs/site-configs.js"></script>
<script src="<%=path%>/public/themes/classic/global/js/components.js"></script>

<!-- 百度统计 -->
<script>
    var _hmt = _hmt || [];
	(function() {
	  var hm = document.createElement("script");
	  hm.src = "https://hm.baidu.com/hm.js?c9dd85291ea88dcf64671a7dfa65e0ef";
	  var s = document.getElementsByTagName("script")[0]; 
	  s.parentNode.insertBefore(hm, s);
	})();
	</script>

<script>
        Breakpoints();
    </script>
</head>

<body class="site-contabs-open site-menubar-unfold">

	<nav
		class="site-navbar navbar navbar-default navbar-fixed-top navbar-inverse "
		role="navigation">
		<div class="navbar-header">
			<button type="button"
				class="navbar-toggle hamburger hamburger-close navbar-toggle-left hided unfolded"
				data-toggle="menubar">
				<span class="sr-only">切换菜单</span> <span class="hamburger-bar"></span>
			</button>
			<button type="button" class="navbar-toggle collapsed"
				data-target="#admui-navbarCollapse" data-toggle="collapse">
				<i class="fa fa-more-horizontal" aria-hidden="true"></i>
			</button>
			<div class="navbar-brand navbar-brand-center site-gridmenu-toggle"
				data-toggle="gridmenu">
				<img class="navbar-brand-logo visible-lg visible-xs navbar-logo"
					src="<%=path%>/public/images/logo-white.svg" title="Admui"> <img
					class="navbar-brand-logo hidden-xs hidden-lg navbar-logo-mini"
					src="http://admui.oss-cn-shenzhen.aliyuncs.com/demo/1.1.0/images/logo-white-min.svg" title="Admui">
			</div>
		</div>
		<div class="navbar-container container-fluid">
			<div class="collapse navbar-collapse navbar-collapse-toolbar"
				id="admui-navbarCollapse">
				<ul class="nav navbar-toolbar navbar-left">
					<li class="hidden-float"><a data-toggle="menubar"
						class="hidden-float hided unfolded vdropdown" href="javascript:;"
						role="button" id="admui-toggleMenubar"> <i
							class="icon hamburger hamburger-arrow-left"> <span
								class="sr-only">切换目录</span> <span class="hamburger-bar"></span>
						</i>
					</a></li>
					<li class="navbar-menu nav-tabs-horizontal nav-tabs-animate"
						id="admui-navMenu">
						<ul class="nav navbar-toolbar nav-tabs" role="tablist" style="margin-top: 0px;padding-top:0px;">
							<!-- 顶部菜单 -->

							<li role="presentation" class="active"><a data-toggle="tab"
								href="#admui-navTabsItem-1" aria-controls="admui-navTabsItem-1"
								role="tab" aria-expanded="false"> <i
									class="fa fa-book fa-fw"></i> <span>UI 示例</span>
							</a></li>

							<li role="presentation" class=""><a data-toggle="tab"
								href="#admui-navTabsItem-2" aria-controls="admui-navTabsItem-2"
								role="tab" aria-expanded="false"> <i class="fa fa-desktop"></i>
									<span>页面示例</span>
							</a></li>

							<li role="presentation" class=""><a data-toggle="tab"
								href="#admui-navTabsItem-3" aria-controls="admui-navTabsItem-3"
								role="tab" aria-expanded="false"> <i class="fa fa-table"></i>
									<span>表格示例</span>
							</a></li>

							<li role="presentation" class=""><a data-toggle="tab"
								href="#admui-navTabsItem-4" aria-controls="admui-navTabsItem-4"
								role="tab" aria-expanded="false"> <i class="fa fa-order"></i>
									<span>表单示例</span>
							</a></li>

							<li role="presentation" class=""><a data-toggle="tab"
								href="#admui-navTabsItem-5" aria-controls="admui-navTabsItem-5"
								role="tab" aria-expanded="false"> <i class="fa fa-pie-chart"></i>
									<span>统计图表</span>
							</a></li>

							<li role="presentation" class=""><a data-toggle="tab"
								href="#admui-navTabsItem-6" aria-controls="admui-navTabsItem-6"
								role="tab" aria-expanded="false"> <i class="fa fa-bars"></i>
									<span>菜单示例</span>
							</a></li>

							<li role="presentation" class="" style="display: none;"><a
								data-toggle="tab" href="#admui-navTabsItem-7"
								aria-controls="admui-navTabsItem-7" role="tab"
								aria-expanded="false"> <i class="fa fa-cog"></i> <span>系统管理</span>
							</a></li>

							<li class="dropdown" id="admui-navbarSubMenu" ><a
								class="dropdown-toggle vdropdown"  data-toggle="dropdown" href="#"
								data-animation="slide-bottom" aria-expanded="true" role="button">
									<i class="fa fa-ellipsis-v"></i>
							</a>
								<ul class="dropdown-menu" role="menu">
									<li role="no-menu" class="presentation" style="display: block;">
										<a data-toggle="tab" href="#admui-navTabsItem-7"
										aria-controls="admui-navTabsItem-7" role="tab"
										aria-expanded="false"> <i class="fa fa-cog"></i> <span>系统管理</span>
									</a>
									</li>
									<li class="no-menu" role="presentation"><a href="/sitemap"
										target="_blank" role="menuitem" data-pjax=""> <i
											class="fa fa-list-ol"></i><span>网站地图</span>
									</a></li>
									<li class="no-menu" role="presentation"><a
										href="/system/menu.jsp" target="_blank" role="menuitem"
										data-pjax=""> <i class="fa fa-wrench"></i><span>菜单管理</span>
									</a></li>
								</ul></li>
						</ul>
					</li>
				</ul>
				<ul class="nav navbar-toolbar navbar-right navbar-toolbar-right">
					<li class="dropdown" id="admui-navbarMessage"><a
						data-toggle="dropdown" href="javascript:;" class="msg-btn"
						aria-expanded="false" data-animation="scale-up" role="button">
							<i class="fa fa-bell" aria-hidden="true"></i> <span
							class="badge badge-danger up msg-num">99+</span>
					</a>
						<ul class="dropdown-menu dropdown-menu-right dropdown-menu-media"
							role="menu">
							<li class="dropdown-menu-header" role="presentation">
								<h5>最新消息</h5> <span class="label label-round label-danger"></span>
							</li>
							<li class="list-group" role="presentation">
								<div class="slimScrollDiv"
									style="position: relative; overflow: hidden; width: auto; height: 220px;">
									<div class="navbar-message-content" id="admui-messageContent"
										data-height="220px" data-plugin="slimScroll"
										style="overflow: hidden; width: auto; height: 220px;"></div>
									<div class="slimScrollBar"
										style="background: rgb(118, 131, 143) none repeat scroll 0% 0%; width: 4px; position: absolute; top: 0px; opacity: 0.4; display: block; border-radius: 4px; z-index: 99; right: 1px;"></div>
									<div class="slimScrollRail"
										style="width: 4px; height: 100%; position: absolute; top: 0px; display: none; border-radius: 4px; background: rgb(204, 213, 219) none repeat scroll 0% 0%; opacity: 0.1; z-index: 90; right: 1px;"></div>
								</div> <script type="text/html" id="admui-messageTpl">
										{{if msgList.length &lt; 1}}
										&lt;p class="text-center height-200 vertical-align"&gt;
	                                		&lt;small class="vertical-align-middle opacity-four"&gt;没有新消息&lt;/small&gt;
	                            		&lt;/p&gt;
										{{else}}
                                        {{each msgList}}
                                        &lt;a class="list-group-item" href="#"  data-message-id="{{$value.messageId}}" data-title="{{$value.title}}" data-content="{{$value.content}}" role="menuitem"&gt;
                                            &lt;div class="media"&gt;
                                                &lt;div class="media-left padding-right-10"&gt;
                                                    &lt;i class="icon {{$value.type | iconType}} white icon-circle" aria-hidden="true"&gt;&lt;/i&gt;
                                                &lt;/div&gt;
                                                &lt;div class="media-body"&gt;
                                                    &lt;h6 class="media-heading"&gt;{{$value.title}}&lt;/h6&gt;
                                                    &lt;time class="media-meta" datetime="{{$value.sendTime}}"&gt;
                                                        {{$value.sendTime | timeMsg}}
                                                    &lt;/time&gt;
                                                &lt;/div&gt;
                                            &lt;/div&gt;
                                        &lt;/a&gt;{{/each}}
										{{/if}}
                                 </script>
							</li>
							<li class="dropdown-menu-footer" role="presentation"><a
								href="<%=path %>/system/account/message.jsp" target="_blank" data-pjax="">
									<i class="fa fa-navicon"></i> 所有消息
							</a></li>
						</ul></li>
					<li class="hidden-xs" id="admui-navbarDisplay"
						data-toggle="tooltip" data-placement="bottom" title=""
						data-original-title="设置主题与布局等"><a class="fa fa-list-alt"
						href="<%=path%>/system/settings/display.jsp" target="_blank" data-pjax="">
							<span class="sr-only">主题与布局</span>
					</a></li>
					<li class="hidden-xs" id="admui-QRcode" data-toggle="tooltip"
						data-placement="bottom" title="" data-original-title="在手机上预览本页">
						<a class="fa fa-mobile" href="#" data-toggle="modal"
						data-target="#admui-mobileView"> <span class="sr-only">在手机上预览</span></a>
					</li>
					<li class="hidden-xs" id="admui-demo-app" data-toggle="tooltip"
						data-placement="bottom" title="" data-original-title="下载桌面版">
						<a class="fa fa-download dropdown-toggle" href="#"
						data-toggle="dropdown" aria-expanded="false" role="button"> <span
							class="sr-only">下载桌面版</span></a>
						<ul
							class="dropdown-menu dropdown-menu-success bullet dropdown-menu-right"
							aria-labelledby="demoApp" role="menu">
							<li role="presentation"><a
								href="http://dl.admui.com/app/win/admui-demo.zip"
								role="menuitem"><i class="fa fa-windows"></i> Windows 版</a></li>
							<li role="presentation"><a
								href="http://dl.admui.com/app/mac/admui-demo.zip"
								role="menuitem"><i class="fa fa-apple"></i> MacOS 版</a></li>
						</ul>
					</li>
					<li class="open-kf" id="admui-service" data-toggle="tooltip"
						data-placement="bottom" title="" data-original-title="在线咨询">
						<a class="fa fa-user" href="#" role="button"> <span
							class="sr-only">在线咨询</span></a>
					</li>
					<li class="hidden-xs" id="admui-navbarFullscreen"
						data-toggle="tooltip" data-placement="bottom" title=""
						data-original-title="全屏"><a class="fa fa-window-maximize"
						data-toggle="fullscreen" href="#" role="button"> <span
							class="sr-only">全屏</span>
					</a></li>
					<li><a class="fa fa-sign-out" id="admui-signOut" data-ctx=""
						data-user="9" href="<%=path %>/system/logout.jspx" role="button"> <span
							class="sr-only">退出</span>
					</a></li>

				</ul>
			</div>
		</div>
	</nav>
	<nav class="site-menubar site-menubar-dark">
		<div class="site-menubar-body">
			<div class="slimScrollDiv"
				style="position: relative; overflow: hidden; width: auto; height: 100%;">
				<div class="tab-content height-full" id="admui-navTabs"
					style="overflow: hidden; width: auto; height: 100%;">
					<!-- 一级菜单 -->

					<div class="tab-pane animation-fade height-full active"
						id="admui-navTabsItem-1" role="tabpanel">
						<div>
							<ul class="site-menu">

								<!-- 二级菜单 -->

								<li class="site-menu-category">UI 示例</li>
								<!-- 三级菜单 -->




								<li class="site-menu-item has-sub"><a href="javascript:;"><i
										class="site-menu-icon fa fa-laptop" aria-hidden="true"></i><span
										class="site-menu-title">布局</span><span class="site-menu-arrow fa fa-chevron-right"></span></a>
									<ul class="site-menu-sub">
										<!-- 四级菜单 -->



										<li class="site-menu-item has-sub "><a
											href="javascript:;"> <span class="site-menu-title">栅格</span><span
												class="site-menu-arrow fa fa-chevron-right"></span></a>
											<ul class="site-menu-sub">
												<!-- 五级菜单 -->

												<li class="site-menu-item "><a data-pjax=""
													href="<%=path %>/components/layouts/grids.jsp" target="_blank"> <span
														class="site-menu-title">基本栅格</span>
												</a></li>

												<li class="site-menu-item "><a data-pjax=""
													href="<%=path %>/components/layouts/layout-grid.jsp" target="_blank">
														<span class="site-menu-title">布局栅格</span>
												</a></li>

												<!-- 五级菜单 -->
											</ul></li>




										<li class="site-menu-item has-sub "><a
											href="javascript:;"> <span class="site-menu-title">标题栏</span><span
												class="site-menu-arrow fa fa-chevron-right"></span></a>
											<ul class="site-menu-sub">
												<!-- 五级菜单 -->

												<li class="site-menu-item "><a data-pjax=""
													href="<%=path %>/components/layouts/headers.jsp" target="_blank"> <span
														class="site-menu-title">普通</span>
												</a></li>

												<li class="site-menu-item "><a data-pjax=""
													href="<%=path %>/components/layouts/bordered-header.jsp" target="_blank">
														<span class="site-menu-title">带边框</span>
												</a></li>

												<!-- 五级菜单 -->
											</ul></li>



										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/components/layouts/panel-transition.jsp" target="_blank" >
												<span class="site-menu-title">面板动画</span>
										</a></li>

										<li class="site-menu-item "><a data-pjax=""
											href="<%=path%>/components/layouts/boxed.jsp" target="_blank" > <span
												class="site-menu-title">盒式布局</span>
										</a></li>


										<li class="site-menu-item "><a data-pjax=""
											href="<%=path%>/components/layouts/page-aside.jsp" target="_blank" > <span
												class="site-menu-title">侧边栏</span>
										</a></li>




										<li class="site-menu-item"><a data-pjax=""
											href="<%=path%>/components/layouts/two-columns.jsp" target="_blank"> <span
												class="site-menu-title">两栏式布局</span>
										</a></li>
					



										<!-- 四级菜单 -->
									</ul></li>




								<li class="site-menu-item has-sub"><a href="javascript:;"><i
										class="site-menu-icon fa fa-cube" aria-hidden="true"></i><span
										class="site-menu-title">基本</span><span class="site-menu-arrow fa fa-chevron-right"></span></a>
									<ul class="site-menu-sub">
										<!-- 四级菜单 -->



										<li class="site-menu-item has-sub "><a
											href="javascript:;"> <span class="site-menu-title">面板</span><span
												class="site-menu-arrow fa fa-chevron-right"></span></a>
											<ul class="site-menu-sub">
												<!-- 五级菜单 -->

												<li class="site-menu-item "><a data-pjax=""
													href="<%=path %>/components/basic/panel/structure.jsp" target="_blank" >
														<span class="site-menu-title">面板结构</span>
												</a></li>

												<li class="site-menu-item "><a data-pjax=""
													href="<%=path %>/components/basic/panel/actions.jsp" target="_blank">
														<span class="site-menu-title">面板操作</span>
												</a></li>

												<li class="site-menu-item "><a data-pjax=""
													href="<%=path %>/components/basic/panel/portlets.jsp" target="_blank">
														<span class="site-menu-title">面板组件</span>
												</a></li>

												<!-- 五级菜单 -->
											</ul></li>



										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/components/basic/buttons.jsp" target="_blank"> <span
												class="site-menu-title">按钮</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/components/basic/icons.jsp" target="_blank"> <span
												class="site-menu-title">矢量图标</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/components/basic/dropdowns.jsp" target="_blank"> <span
												class="site-menu-title">下拉菜单</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/components/basic/list.jsp" target="_blank"> <span
												class="site-menu-title">列表组</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/components/basic/tooltip-popover.jsp" target="_blank">
												<span class="site-menu-title">气泡提示 &amp; 弹出框</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/components/basic/modals.jsp" target="_blank"> <span
												class="site-menu-title">模态框</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/components/basic/tabs-accordions.jsp" target="_blank">
												<span class="site-menu-title">选项卡 &amp; 折叠面板</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/components/basic/images.jsp" target="_blank"> <span
												class="site-menu-title">图片</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/components/basic/badges-labels.jsp" target="_blank"> <span
												class="site-menu-title">徽章 &amp; 标签</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/components/basic/carousel.jsp" target="_blank"> <span
												class="site-menu-title">轮播组件</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/components/basic/typography.jsp" target="_blank"> <span
												class="site-menu-title">排版</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/components/basic/progress-bars.jsp" target="_blank"> <span
												class="site-menu-title">进度条</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/components/basic/colors.jsp" target="_blank"> <span
												class="site-menu-title">配色方案</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/components/basic/utilities.jsp" target="_blank"> <span
												class="site-menu-title">辅助类</span>
										</a></li>



										<!-- 四级菜单 -->
									</ul></li>




								<li class="site-menu-item has-sub"><a href="javascript:;"><i
										class="site-menu-icon fa fa-cubes" aria-hidden="true"></i><span
										class="site-menu-title">进阶</span><span class="site-menu-arrow fa fa-chevron-right"></span></a>
									<ul class="site-menu-sub">
										<!-- 四级菜单 -->


										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/components/advanced/tour.jsp" target="_blank"> <span
												class="site-menu-title">新手指引</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/components/advanced/animation.jsp" target="_blank"> <span
												class="site-menu-title">动画</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/components/advanced/highlight.jsp" target="_blank"> <span
												class="site-menu-title">代码高亮</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/components/advanced/lightbox.jsp" target="_blank"> <span
												class="site-menu-title">灯箱</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/components/advanced/scrollbar.jsp" target="_blank"> <span
												class="site-menu-title">滚动条</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/components/advanced/rating.jsp" target="_blank"> <span
												class="site-menu-title">评分</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/components/advanced/context-menu.jsp" target="_blank">
												<span class="site-menu-title">右键菜单</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/components/advanced/alertify.jsp" target="_blank"> <span
												class="site-menu-title">Alertify弹框</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/components/advanced/masonry.jsp" target="_blank"> <span
												class="site-menu-title">瀑布流布局</span>
										</a></li>





										<li class="site-menu-item has-sub "><a
											href="javascript:;"> <span class="site-menu-title">树形控件</span><span
												class="site-menu-arrow fa fa-chevron-right"></span></a>
											<ul class="site-menu-sub">
												<!-- 五级菜单 -->

												<li class="site-menu-item "><a data-pjax=""
													href="<%=path %>/components/advanced/tree/jstree.jsp" target="_blank">
														<span class="site-menu-title">JsTree</span>
												</a></li>

												<li class="site-menu-item "><a data-pjax=""
													href="<%=path %>/components/advanced/tree/treeview.jsp" target="_blank">
														<span class="site-menu-title">Treeview</span>
												</a></li>

												<!-- 五级菜单 -->
											</ul></li>



										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/components/advanced/toastr.jsp" target="_blank"> <span
												class="site-menu-title">Toaster 通知</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/components/advanced/sortable-nestable.jsp" target="_blank">
												<span class="site-menu-title">拖动排序</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/components/advanced/bootbox-sweetalert"
											target="_blank"> <span class="site-menu-title">弹层组件</span>
										</a></li>



										<!-- 四级菜单 -->
									</ul></li>




								<li class="site-menu-item has-sub"><a href="javascript:;"><i
										class="site-menu-icon fa fa-plug" aria-hidden="true"></i><span
										class="site-menu-title">组件</span><span class="site-menu-arrow fa fa-chevron-right"></span></a>
									<ul class="site-menu-sub">
										<!-- 四级菜单 -->


										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/components/structure/alerts.jsp" target="_blank"> <span
												class="site-menu-title">警告框</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/components/structure/ribbon.jsp" target="_blank"> <span
												class="site-menu-title">彩带</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/components/structure/pricing-tables.jsp" target="_blank">
												<span class="site-menu-title">价目表</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/components/structure/overlay.jsp" target="_blank"> <span
												class="site-menu-title">遮罩</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/components/structure/cover.jsp" target="_blank"> <span
												class="site-menu-title">覆盖层</span>
										</a></li>





										<li class="site-menu-item has-sub "><a
											href="javascript:;"> <span class="site-menu-title">时间轴</span><span
												class="site-menu-arrow fa fa-chevron-right"></span></a>
											<ul class="site-menu-sub">
												<!-- 五级菜单 -->

												<li class="site-menu-item "><a data-pjax=""
													href="<%=path %>/components/structure/timeline/simple"
													target="_blank"> <span class="site-menu-title">简单时间轴</span>
												</a></li>

												<li class="site-menu-item "><a data-pjax=""
													href="<%=path %>/components/structure/timeline/icons.jsp" target="_blank">
														<span class="site-menu-title">图标时间轴</span>
												</a></li>

												<!-- 五级菜单 -->
											</ul></li>



										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/components/structure/step.jsp" target="_blank"> <span
												class="site-menu-title">步骤条</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/components/structure/comments.jsp" target="_blank"> <span
												class="site-menu-title">评论</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/components/structure/media.jsp" target="_blank"> <span
												class="site-menu-title">媒体</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/components/structure/chat.jsp" target="_blank"> <span
												class="site-menu-title">聊天窗口</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/components/structure/testimonials.jsp" target="_blank">
												<span class="site-menu-title">客户评价</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/components/structure/nav.jsp" target="_blank"> <span
												class="site-menu-title">导航</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/components/structure/navbars.jsp" target="_blank"> <span
												class="site-menu-title">导航条</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/components/structure/blockquotes.jsp" target="_blank">
												<span class="site-menu-title">引用</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/components/structure/pagination.jsp" target="_blank">
												<span class="site-menu-title">分页</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/components/structure/breadcrumbs.jsp" target="_blank">
												<span class="site-menu-title">包屑导航</span>
										</a></li>



										<!-- 四级菜单 -->
									</ul></li>




								<li class="site-menu-item has-sub"><a href="javascript:;"><i
										class="site-menu-icon fa fa-puzzle-piece" aria-hidden="true"></i><span
										class="site-menu-title">小工具</span><span
										class="site-menu-arrow fa fa-chevron-right"></span></a>
									<ul class="site-menu-sub">
										<!-- 四级菜单 -->


										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/components/widgets/statistics.jsp" target="_blank"> <span
												class="site-menu-title">统计</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/components/widgets/data.jsp" target="_blank"> <span
												class="site-menu-title">数据</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/components/widgets/blog.jsp" target="_blank"> <span
												class="site-menu-title">博客</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/components/widgets/chart.jsp" target="_blank"> <span
												class="site-menu-title">图表</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/components/widgets/social.jsp" target="_blank"> <span
												class="site-menu-title">社交</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/components/widgets/weather.jsp" target="_blank"> <span
												class="site-menu-title">天气</span>
										</a></li>



										<!-- 四级菜单 -->
									</ul></li>



								<!-- 三级菜单 -->

								<!-- 二级菜单 -->

							</ul>
						</div>
					</div>

					<div class="tab-pane animation-fade height-full "
						id="admui-navTabsItem-2" role="tabpanel">
						<div>
							<ul class="site-menu">

								<!-- 二级菜单 -->

								<li class="site-menu-category">页面示例</li>
								<!-- 三级菜单 -->




								<li class="site-menu-item has-sub "><a href="javascript:;"><i
										class="site-menu-icon fa fa-home" aria-hidden="true"></i><span
										class="site-menu-title">首页示例</span><span
										class="site-menu-arrow fa fa-chevron-right"></span></a>
									<ul class="site-menu-sub">
										<!-- 四级菜单 -->


										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/pages/home/index-v1.jsp" target="_blank"> <span
												class="site-menu-title">首页示例 01</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/pages/home/index-v2.jsp" target="_blank"> <span
												class="site-menu-title">首页示例 02</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/pages/home/ecommerce.jsp" target="_blank"> <span
												class="site-menu-title">电商网站型</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/pages/home/analytics.jsp" target="_blank"> <span
												class="site-menu-title">数据统计型</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/pages/home/team.jsp" target="_blank"> <span
												class="site-menu-title">团队协作型</span>
										</a></li>



										<!-- 四级菜单 -->
									</ul></li>




								<li class="site-menu-item has-sub "><a href="javascript:;"><i
										class="site-menu-icon fa fa-files-o" aria-hidden="true"></i><span
										class="site-menu-title">常用页面</span><span
										class="site-menu-arrow fa fa-chevron-right"></span></a>
									<ul class="site-menu-sub">
										<!-- 四级菜单 -->


										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/pages/general/blank.jsp" target="_blank"> <span
												class="site-menu-title">空白页面</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/pages/general/faq.jsp" target="_blank"> <span
												class="site-menu-title">帮助文档</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/pages/general/gallery-grid.jsp" target="_blank"> <span
												class="site-menu-title">相册</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/pages/general/search-result.jsp" target="_blank"> <span
												class="site-menu-title">搜索</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/pages/general/user.jsp" target="_blank"> <span
												class="site-menu-title">客户列表</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/pages/general/email.jsp" target="_blank"> <span
												class="site-menu-title">邮件模板</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/pages/general/code-editor.jsp" target="_blank"> <span
												class="site-menu-title">代码编辑器</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax="" href="<%=path %>/error"
											target="_blank"> <span class="site-menu-title">错误页面</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/noauth.jsp" target="_blank"> <span
												class="site-menu-title">没有权限</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/maintenance.jsp" target="_blank"> <span
												class="site-menu-title">网站维护中</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/locked.jsp" target="_blank"> <span
												class="site-menu-title">锁屏页面</span>
										</a></li>



										<!-- 四级菜单 -->
									</ul></li>




								<li class="site-menu-item has-sub "><a href="javascript:;"><i
										class="site-menu-icon fa fa-group" aria-hidden="true"></i><span
										class="site-menu-title">团队协作</span><span
										class="site-menu-arrow fa fa-chevron-right"></span></a>
									<ul class="site-menu-sub">
										<!-- 四级菜单 -->


										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/pages/team/calendar.jsp" target="_blank"> <span
												class="site-menu-title">日历</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/pages/team/notebook.jsp" target="_blank"> <span
												class="site-menu-title">笔记</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/pages/team/taskboard.jsp" target="_blank"> <span
												class="site-menu-title">任务看板</span>
										</a></li>





										<li class="site-menu-item has-sub "><a
											href="javascript:;"> <span class="site-menu-title">知识库</span><span
												class="site-menu-arrow fa fa-chevron-right"></span></a>
											<ul class="site-menu-sub">
												<!-- 五级菜单 -->

												<li class="site-menu-item "><a data-pjax=""
													href="<%=path %>/pages/team/documents/articles.jsp" target="_blank">
														<span class="site-menu-title">列表</span>
												</a></li>

												<li class="site-menu-item "><a data-pjax=""
													href="<%=path %>/pages/team/documents/categories.jsp" target="_blank">
														<span class="site-menu-title">分类</span>
												</a></li>

												<li class="site-menu-item "><a data-pjax=""
													href="<%=path %>/pages/team/documents/article.jsp" target="_blank"> <span
														class="site-menu-title">详情</span>
												</a></li>

												<!-- 五级菜单 -->
											</ul></li>



										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/pages/team/forum.jsp" target="_blank"> <span
												class="site-menu-title">论坛</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/pages/team/message.jsp" target="_blank"> <span
												class="site-menu-title">即时通讯</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/pages/team/mailbox.jsp" target="_blank"> <span
												class="site-menu-title">邮箱</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/pages/team/media.jsp" target="_blank"> <span
												class="site-menu-title">文件管理</span>
										</a></li>





										<li class="site-menu-item has-sub "><a
											href="javascript:;"> <span class="site-menu-title">项目</span><span
												class="site-menu-arrow fa fa-chevron-right"></span></a>
											<ul class="site-menu-sub">
												<!-- 五级菜单 -->

												<li class="site-menu-item "><a data-pjax=""
													href="<%=path %>/pages/team/projects.jsp" target="_blank"> <span
														class="site-menu-title">项目列表 01</span>
												</a></li>

												<li class="site-menu-item "><a data-pjax=""
													href="<%=path %>/pages/team/work.jsp" target="_blank"> <span
														class="site-menu-title">项目列表 02</span>
												</a></li>

												<!-- 五级菜单 -->
											</ul></li>


										<!-- 四级菜单 -->
									</ul></li>



								<!-- 三级菜单 -->

								<!-- 二级菜单 -->

							</ul>
						</div>
					</div>

					<div class="tab-pane animation-fade height-full "
						id="admui-navTabsItem-3" role="tabpanel">
						<div>
							<ul class="site-menu">

								<!-- 二级菜单 -->

								<li class="site-menu-category">表格示例</li>
								<!-- 三级菜单 -->



								<li class="site-menu-item "><a data-pjax=""
									href="<%=path %>/tables/basic/index.jsp" target="_blank"> <i
										class="site-menu-icon fa fa-table" aria-hidden="true"></i><span
										class="site-menu-title">基本表格</span>
								</a></li>




								<li class="site-menu-item "><a data-pjax=""
									href="<%=path %>/tables/treegrid/index.jsp" target="_blank"> <i
										class="site-menu-icon fa fa-bars" aria-hidden="true"></i><span
										class="site-menu-title">树形表格</span>
								</a></li>





								<li class="site-menu-item has-sub "><a href="javascript:;"><i
										class="site-menu-icon fa fa-list-alt" aria-hidden="true"></i><span
										class="site-menu-title">DataTables</span><span
										class="site-menu-arrow fa fa-chevron-right"></span></a>
									<ul class="site-menu-sub">
										<!-- 四级菜单 -->


										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/tables/data-tables/basic-init/index.jsp" target="_blank">
												<span class="site-menu-title">基本初始化</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/tables/data-tables/advanced-init/index"
											target="_blank"> <span class="site-menu-title">高级初始化</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/tables/data-tables/data-sources/index.jsp" target="_blank">
												<span class="site-menu-title">数据源</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/tables/data-tables/api/index.jsp" target="_blank"> <span
												class="site-menu-title">API</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/tables/data-tables/ajax/index.jsp" target="_blank"> <span
												class="site-menu-title">AJAX</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/tables/data-tables/server-side/index.jsp" target="_blank">
												<span class="site-menu-title">服务器模式</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/tables/data-tables/plug-ins/index.jsp" target="_blank">
												<span class="site-menu-title">插件</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/tables/data-tables/others/index.jsp" target="_blank">
												<span class="site-menu-title">其他</span>
										</a></li>



										<!-- 四级菜单 -->
									</ul></li>



								<!-- 三级菜单 -->

								<!-- 二级菜单 -->

							</ul>
						</div>
					</div>

					<div class="tab-pane animation-fade height-full "
						id="admui-navTabsItem-4" role="tabpanel">
						<div>
							<ul class="site-menu">

								<!-- 二级菜单 -->

								<li class="site-menu-category">表单相关</li>
								<!-- 三级菜单 -->



								<li class="site-menu-item "><a data-pjax=""
									href="<%=path %>/forms/general.jsp" target="_blank"> <i
										class="site-menu-icon fa fa-circle-o" aria-hidden="true"></i><span
										class="site-menu-title">基本表单</span>
								</a></li>




								<li class="site-menu-item "><a data-pjax=""
									href="<%=path %>/forms/material.jsp" target="_blank"> <i
										class="site-menu-icon fa fa-google" aria-hidden="true"></i><span
										class="site-menu-title">质感风格</span>
								</a></li>




								<li class="site-menu-item "><a data-pjax=""
									href="<%=path %>/forms/advanced.jsp" target="_blank"> <i
										class="site-menu-icon fa fa-toggle-off" aria-hidden="true"></i><span
										class="site-menu-title">高级表单</span>
								</a></li>




								<li class="site-menu-item "><a data-pjax=""
									href="<%=path %>/forms/layouts.jsp" target="_blank"> <i
										class="site-menu-icon fa fa-indent" aria-hidden="true"></i><span
										class="site-menu-title">表单布局</span>
								</a></li>




								<li class="site-menu-item "><a data-pjax=""
									href="<%=path %>/forms/wizard.jsp" target="_blank"> <i
										class="site-menu-icon fa fa-arrow-right" aria-hidden="true"></i><span
										class="site-menu-title">表单向导</span>
								</a></li>




								<li class="site-menu-item "><a data-pjax=""
									href="<%=path %>/forms/validation.jsp" target="_blank"> <i
										class="site-menu-icon fa fa-check-square-o" aria-hidden="true"></i><span
										class="site-menu-title">表单验证</span>
								</a></li>




								<li class="site-menu-item "><a data-pjax=""
									href="<%=path %>/forms/masks.jsp" target="_blank"> <i
										class="site-menu-icon fa fa-at" aria-hidden="true"></i><span
										class="site-menu-title">格式预设</span>
								</a></li>




								<li class="site-menu-item "><a data-pjax=""
									href="<%=path %>/forms/editable.jsp" target="_blank"> <i
										class="site-menu-icon fa fa-edit" aria-hidden="true"></i><span
										class="site-menu-title">表单编辑</span>
								</a></li>





								<li class="site-menu-item has-sub "><a href="javascript:;"><i
										class="site-menu-icon fa fa-list-alt" aria-hidden="true"></i><span
										class="site-menu-title">编辑器</span><span
										class="site-menu-arrow fa fa-chevron-right"></span></a>
									<ul class="site-menu-sub">
										<!-- 四级菜单 -->


										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/forms/editor/summernote.jsp" target="_blank"> <span
												class="site-menu-title">文本编辑器</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/forms/editor/markdown.jsp" target="_blank"> <span
												class="site-menu-title">Markdown编辑器</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/forms/editor/ace.jsp" target="_blank"> <span
												class="site-menu-title">代码编辑器</span>
										</a></li>



										<!-- 四级菜单 -->
									</ul></li>



								<li class="site-menu-item "><a data-pjax=""
									href="<%=path %>/forms/image-cropping.jsp" target="_blank"> <i
										class="site-menu-icon fa fa-cut" aria-hidden="true"></i><span
										class="site-menu-title">图片裁剪</span>
								</a></li>




								<li class="site-menu-item "><a data-pjax=""
									href="<%=path %>/forms/dropify.jsp" target="_blank"> <i
										class="site-menu-icon fa fa-cloud-upload" aria-hidden="true"></i><span
										class="site-menu-title">文件上传</span>
								</a></li>




								<!-- 三级菜单 -->

								<!-- 二级菜单 -->

							</ul>
						</div>
					</div>

					<div class="tab-pane animation-fade height-full "
						id="admui-navTabsItem-5" role="tabpanel">
						<div>
							<ul class="site-menu">

								<!-- 二级菜单 -->

								<li class="site-menu-category">统计图表</li>
								<!-- 三级菜单 -->




								<li class="site-menu-item has-sub "><a href="javascript:;"><i
										class="site-menu-icon fa fa-pie-chart" aria-hidden="true"></i><span
										class="site-menu-title">简单图表</span><span
										class="site-menu-arrow fa fa-chevron-right"></span></a>
									<ul class="site-menu-sub">
										<!-- 四级菜单 -->


										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/charts/chartjs.jsp" target="_blank"> <span
												class="site-menu-title">Chart.js</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/charts/gauges.jsp" target="_blank"> <span
												class="site-menu-title">Gauges</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/charts/flot.jsp" target="_blank"> <span
												class="site-menu-title">Flot</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/charts/peity.jsp" target="_blank"> <span
												class="site-menu-title">Peity</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/charts/sparkline.jsp" target="_blank"> <span
												class="site-menu-title">Sparkline</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/charts/morris.jsp" target="_blank"> <span
												class="site-menu-title">Morris</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/charts/chartist.jsp" target="_blank"> <span
												class="site-menu-title">Chartist</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/charts/rickshaw.jsp" target="_blank"> <span
												class="site-menu-title">Rickshaw</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/charts/c3.jsp" target="_blank"> <span
												class="site-menu-title">C3</span>
										</a></li>



										<!-- 四级菜单 -->
									</ul></li>



								<li class="site-menu-item "><a data-pjax=""
									href="<%=path %>/charts/echarts.jsp" target="_blank"> <i
										class="site-menu-icon fa fa-area-chart" aria-hidden="true"></i><span
										class="site-menu-title">百度 Echarts</span>
								</a></li>




								<!-- 三级菜单 -->

								<!-- 二级菜单 -->

							</ul>
						</div>
					</div>

					<div class="tab-pane animation-fade height-full "
						id="admui-navTabsItem-6" role="tabpanel">
						<div>
							<ul class="site-menu">

								<!-- 二级菜单 -->

								<li class="site-menu-category">菜单演示 01</li>
								<!-- 三级菜单 -->




								<li class="site-menu-item has-sub "><a href="javascript:;"><i
										class="site-menu-icon fa fa-bars" aria-hidden="true"></i><span
										class="site-menu-title">一级菜单</span><span
										class="site-menu-arrow fa fa-chevron-right"></span></a>
									<ul class="site-menu-sub">
										<!-- 四级菜单 -->


										<li class="site-menu-item "><a data-pjax="" href="<%=path %>/menu"
											target="_blank"> <span class="site-menu-title">二级菜单
													01</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax="" href="<%=path %>/menu"
											target="_blank"> <span class="site-menu-title">二级菜单
													02</span>
										</a></li>





										<li class="site-menu-item has-sub "><a
											href="javascript:;"> <span class="site-menu-title">二级菜单
													03</span><span class="site-menu-arrow fa fa-chevron-right"></span></a>
											<ul class="site-menu-sub">
												<!-- 五级菜单 -->

												<li class="site-menu-item "><a data-pjax=""
													href="<%=path %>/menu.jsp" target="_blank"> <span
														class="site-menu-title">三级菜单 001</span>
												</a></li>

												<li class="site-menu-item "><a data-pjax=""
													href="<%=path %>/menu.jsp" target="_blank"> <span
														class="site-menu-title">三级菜单 002</span>
												</a></li>

												<li class="site-menu-item "><a data-pjax=""
													href="<%=path %>/menu.jsp" target="_blank"> <span
														class="site-menu-title">三级菜单 003</span>
												</a></li>

												<!-- 五级菜单 -->
											</ul></li>


										<!-- 四级菜单 -->
									</ul></li>



								<li class="site-menu-item "><a data-pjax="" href="#"
									target="_blank"> <i class="site-menu-icon fa fa-bars"
										aria-hidden="true"></i><span class="site-menu-title">独立菜单</span>
								</a></li>




								<!-- 三级菜单 -->

								<li class="site-menu-category">菜单演示 02</li>
								<!-- 三级菜单 -->



								<li class="site-menu-item "><a data-pjax="" href="<%=path %>/menu"
									target="_blank"> <i class="site-menu-icon fa fa-bars"
										aria-hidden="true"></i><span class="site-menu-title">独立菜单</span>
								</a></li>




								<!-- 三级菜单 -->

								<!-- 二级菜单 -->

							</ul>
						</div>
					</div>

					<div class="tab-pane animation-fade height-full "
						id="admui-navTabsItem-7" role="tabpanel">
						<div>
							<ul class="site-menu">

								<!-- 二级菜单 -->

								<li class="site-menu-category">系统信息</li>
								<!-- 三级菜单 -->



								<li class="site-menu-item "><a data-pjax=""
									href="<%=path %>/system/menu.jsp" target="_blank"> <i
										class="site-menu-icon fa fa-bars" aria-hidden="true"></i><span
										class="site-menu-title">菜单管理</span>
								</a></li>




								<li class="site-menu-item "><a data-pjax=""
									href="<%=path %>/system/user.jsp" target="_blank"> <i
										class="site-menu-icon fa fa-street-view" aria-hidden="true"></i><span
										class="site-menu-title">用户管理</span>
								</a></li>




								<li class="site-menu-item "><a data-pjax=""
									href="<%=path %>/system/log.jsp" target="_blank"> <i
										class="site-menu-icon fa fa-file-text-o" aria-hidden="true"></i><span
										class="site-menu-title">日志信息</span>
								</a></li>




								<li class="site-menu-item "><a data-pjax=""
									href="<%=path %>/system/blacklist.jsp" target="_blank"> <i
										class="site-menu-icon fa fa-shield" aria-hidden="true"></i><span
										class="site-menu-title">黑名单</span>
								</a></li>





								<li class="site-menu-item has-sub "><a href="javascript:;">
								<i
										class="site-menu-icon fa fa-gear" aria-hidden="true"></i><span
										class="site-menu-title">系统设置</span><span
										class="site-menu-arrow fa fa-chevron-right"></span></a>
									<ul class="site-menu-sub">
										<!-- 四级菜单 -->


										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/system/settings/display.jsp" target="_blank"> <span
												class="site-menu-title">显示设置</span>
										</a></li>




										<li class="site-menu-item "><a data-pjax=""
											href="<%=path %>/system/settings/log.jsp" target="_blank"> <span
												class="site-menu-title">日志设置</span>
										</a></li>



										<!-- 四级菜单 -->
									</ul></li>



								<!-- 三级菜单 -->

								<li class="site-menu-category">我的账户</li>
								<!-- 三级菜单 -->



								<li class="site-menu-item "><a data-pjax=""
									href="<%=path %>/system/account.jsp" target="_blank"> <i
										class="site-menu-icon fa fa-key" aria-hidden="true"></i><span
										class="site-menu-title">账户信息</span>
								</a></li>




								<!-- 三级菜单 -->

								<!-- 二级菜单 -->

							</ul>
						</div>
					</div>

					<!-- 一级菜单 -->
				</div>
				<div class="slimScrollBar"
					style="background: rgb(118, 131, 143) none repeat scroll 0% 0%; width: 4px; position: absolute; top: 0px; opacity: 0.4; display: none; border-radius: 4px; z-index: 99; right: 1px; height: 715px;"></div>
				<div class="slimScrollRail"
					style="width: 4px; height: 100%; position: absolute; top: 0px; display: none; border-radius: 4px; background: rgb(204, 213, 219) none repeat scroll 0% 0%; opacity: 0.1; z-index: 90; right: 1px;"></div>
			</div>
		</div>
	</nav>
	<nav class="site-contabs" id="admui-siteConTabs">
		<button type="button" class="btn btn-icon btn-default pull-left hide">
			<i class="fa fa-angle-double-left"></i>
		</button>
		<div class="contabs-scroll pull-left">
			<ul class="nav con-tabs">
				<li class="active"><a data-pjax="" href="<%=path%>/oa/index.jsp" rel="contents"><span>首页</span></a>
				</li>
			</ul>
		</div>
		<div class="btn-group pull-right">
			<button type="button" class="btn btn-icon btn-default hide">
				<i class="fa fa-angle-double-right"></i>
			</button>
			<button type="button"
				class="btn btn-default dropdown-toggle btn-outline"
				data-toggle="dropdown" aria-expanded="false">
				<span class="caret"></span> <span class="sr-only">切换菜单</span>
			</button>
			<ul class="dropdown-menu dropdown-menu-right"
				aria-labelledby="conTabsDropdown" role="menu">
				<li class="reload-page" role="presentation"><a
					href="javascript:;" role="menuitem"><i class="fa fa-refresh"></i>
						刷新当前</a></li>
				<li class="close-other" role="presentation"><a
					href="javascript:;" role="menuitem"><i class="fa fa-close"></i>
						关闭其他</a></li>
				<li class="close-all" role="presentation"><a
					href="javascript:;" role="menuitem"><i class="fa fa-power-off"></i>
						关闭所有</a></li>
			</ul>
		</div>
	</nav>

	<main class="site-page">
	<div class="page-container" id="admui-pageContent">











		<link rel="stylesheet" href="<%=path%>/public/fonts/themify/themify.css">
		<link rel="stylesheet" href="<%=path%>/public/css/home.css">

		<div class="page animation-fade page-index">
			<div class="page-content">
				<div class="media account-info">
					<div class="media-left">
						<div class="avatar avatar-online">
							<img src="<%=path%>/public/images/avatar.svg" alt="xiaxuan@admui_demo" class="fa fa-user-secret">
							<i class="avatar avatar-busy"></i>
						</div>
					</div>
					<div class="media-body">
						<h4 class="media-heading">
							欢迎您，xiaxuan@admui_demo <small> 系统管理员 </small>
						</h4>
						<p>
							<i class="icon icon-color wb-bell" aria-hidden="true"></i> 这是您第
							40048 次登录，上次登录日期：2017-7-26 11:35:19，详细信息请查看 <a data-pjax=""
								href="<%=path %>/system/account/log.jsp" target="_blank">日志</a> ，如果不是您本人登录，请及时 <a
								data-pjax="" href="<%=path %>/system/account/password.jsp" target="_blank">修改密码</a> 。
						</p>
					</div>
					<div class="media-right">
						<a href="<%=path %>/system/account.jsp" data-pjax="" target="_blank"
							class="btn btn-outline btn-success btn-outline btn-sm">账户管理</a>
					</div>
				</div>

				<div class="alert dark alert-icon alert-success alert-dismissible"
					role="alert">
					<button type="button" class="close" data-dismiss="alert"
						aria-label="关闭">
						<span aria-hidden="true">×</span>
					</button>
					<i class="fa fa-bell" aria-hidden="true"></i> Admui中使用了大量成熟的、常用的<a
						target="_blank" class="alert-link"
						href="http://docs.admui.com/ui/plugins.html">第三方插件</a>，为了方便广大开发者，我们正在逐步翻译和整理这些插件的文档，如果您有兴趣，请随时关注
					<a target="_blank" class="alert-link" href="http://bsify.admui.com">BSify</a>，如果您有更好的建议或者是想贡献文档，请发送邮件至：<a
						target="_blank" class="alert-link" href="mailto:team@admui.com">team@admui.com</a>。
					<p class="margin-top-10 margin-bottom-5">
						<a class="btn btn-sm btn-danger btn-inverse btn-outline"
							href="http://bsify.admui.com" target="_blank">访问BSify</a>
					</p>
				</div>

				<div class="row margin-top-10" data-plugin="matchHeight"
					data-by-row="true">
					<div class="col-md-7" style="height: 462px;">
						<div class="panel introduce-info">
							<div class="panel-heading">
								<ul class="panel-actions">
									<li><a href="http://docs.admui.com/" target="_blank">更多</a>
									</li>
								</ul>
								<h1 class="panel-title">基本介绍</h1>
							</div>
							<div class="panel-body">
								<div class="media">
									<div class="media-left">
										<a href="javascript:;"> <img class="media-object"
											src="/public/images/admui-desktop.svg" alt="...">
										</a>

									</div>
									<div class="media-body">
										<h3 class="media-heading">Admui 通用管理系统快速开发框架</h3>
										<ul class="list-group list-group-full">
											<li class="list-group-item">Admui 是一个基于最新 Web
												技术的企业级通用管理系统快速开发框架，可以帮助企业极大的提高工作效率，节省开发成本，提升品牌形象。</li>
											<li class="list-group-item">您可以 Admui
												为基础，快速开发各种MIS系统，如CMS、OA、CRM、ERP、POS等。</li>
											<li class="list-group-item">Admui
												紧贴业务特性，涵盖了大量的常用组件和基础功能，最大程度上帮助企业节省时间成本和费用开支。</li>
										</ul>

										<div>
											<a href="http://www.admui.com/"
												class="btn btn-success btn-sm btn-outline btn-round"
												target="_blank"> 返回官网 </a> <a href="#"
												class="btn btn-warning btn-sm btn-outline btn-round"
												data-toggle="modal" data-target="#admui-mobileView">
												手机体验 </a> <a href="#"
												class="btn btn-primary btn-sm btn-outline btn-round open-kf"
												data-toggle="modal"> 咨询客服 </a> <a
												href="http://docs.admui.com/"
												class="btn btn-danger btn-sm btn-outline btn-round"
												target="_blank"> 开发文档 </a> <a
												href="http://www.admui.com/about.html"
												class="btn btn-dark btn-sm btn-outline btn-round"
												target="_blank"> 服务协议 </a>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="col-md-5" style="height: 462px;">
						<div class="panel changelog-info">
							<div class="panel-heading">
								<ul class="panel-actions">
									<li><a href="http://docs.admui.com/version"
										target="_blank">更多</a></li>
								</ul>
								<h1 class="panel-title">版本信息</h1>
							</div>
							<div class="panel-body">
								<ul class="time-line">
									<li><time datatime="2017-06-26">2017-06-26</time>
										<h5>
											<a href="http://docs.admui.com/version/v1.1.0/"
												target="_blank">Admui v1.1.0 版发布</a>
										</h5></li>
									<li><time datatime="2017-06-13">2017-06-13</time>
										<h5>
											<a href="http://docs.admui.com/version/v1.0.1/"
												target="_blank">Admui v1.0.1 维护版发布</a>
										</h5></li>
									<li><time datatime="2017-04-25">2017-04-25</time>
										<h5>
											<a href="http://docs.admui.com/version/v1.0.0/"
												target="_blank">Admui v1.0.0 正式发布</a>
										</h5></li>
									<li><time datatime="2017-03-16">2017-03-16</time>
										<h5>Admui v1.0.0 RC 正式发布</h5></li>
									<li><time datatime="2017-02-21">2017-02-21</time>
										<h5>Admui v1.0.0 Beta1 发布</h5></li>
									<li><time datatime="2016-08-27">2016-08-27</time>
										<h5>Admui v0.1.1 - v0.9.5 开发</h5></li>
									<li><time datatime="2016-07-21">2016-07-21</time>
										<h5>Admui v0.1.0 Beta 开发完成</h5></li>
									<li><time datatime="2016-05-07">2016-05-07</time>
										<h5>Admui v0.0.1 Alpha 开发完成</h5></li>
									<li><time datatime="2015-12-14">2015-12-14</time>
										<h5>Admui 正式立项</h5></li>
								</ul>
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-12">
						<div class="panel">
							<div class="panel-heading">
								<ul class="panel-actions">
									<li><a href="http://www.admui.com/buy" target="_blank">现在购买</a>
									</li>
								</ul>
								<h3 class="panel-title">购买流程</h3>
							</div>
							<div class="panel-body">
								<div class="steps row steps-xs">
									<div class="step col-md-3">
										<span class="step-number">1</span>
										<div class="step-desc">
											<span class="step-title">购买</span>
											<p>选择您需要购买的组件及服务</p>
										</div>
									</div>
									<div class="step col-md-3">
										<span class="step-number">2</span>
										<div class="step-desc">
											<span class="step-title">付款</span>
											<p>在线或通过线下汇款支付费用</p>
										</div>
									</div>
									<div class="step col-md-3 done">
										<span class="step-number">3</span>
										<div class="step-desc">
											<span class="step-title">完成</span>
											<p>索取发票，开具合同、下载源码</p>
										</div>
									</div>
									<div class="step col-md-3">
										<span class="step-number">4</span>
										<div class="step-desc">
											<span class="step-title">售后</span>
											<p>工单支持、在线反馈、售后客服</p>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="row part-info" data-plugin="matchHeight"
					data-by-row="true">
					<div class="col-xs-12 col-sm-6 col-md-4 col-lg-3 col-xlg-2"
						style="height: 262px;">
						<div class="panel">
							<div class="panel-body text-center">
								<i class="icon ti-layout-cta-btn-right red-500"></i>
								<p>UI 示例</p>
								<div class="label-content">
									<span class="label label-default label-round label-outline">布局</span>
									<span class="label label-default label-round label-outline">基本</span>
									<span class="label label-default label-round label-outline">进阶</span>
									<span class="label label-default label-round label-outline">组件</span>
									<span class="label label-default label-round label-outline">小工具</span>
								</div>
							</div>
						</div>
					</div>
					<div class="col-xs-12 col-sm-6 col-md-4 col-lg-3 col-xlg-2"
						style="height: 262px;">
						<div class="panel">
							<div class="panel-body text-center">
								<i class="icon ti-layout cyan-500"></i>
								<p>页面示例</p>
								<div class="label-content">
									<span class="label label-default label-round label-outline">首页</span>
									<span class="label label-default label-round label-outline">常用</span>
									<span class="label label-default label-round label-outline">团队</span>
								</div>
							</div>
						</div>
					</div>
					<div class="col-xs-12 col-sm-6 col-md-4 col-lg-3 col-xlg-2"
						style="height: 262px;">
						<div class="panel">
							<div class="panel-body text-center">
								<i class="icon ti-widgetized purple-500"></i>
								<p>表格示例</p>
								<div class="label-content">
									<span class="label label-default label-round label-outline">基本表格</span>
									<span class="label label-default label-round label-outline">树形表格</span>
									<span class="label label-default label-round label-outline">DataTable</span>
								</div>
							</div>
						</div>
					</div>
					<div class="col-xs-12 col-sm-6 col-md-4 col-lg-3 col-xlg-2"
						style="height: 262px;">
						<div class="panel">
							<div class="panel-body text-center">
								<i class="icon ti-layout-accordion-list green-500"></i>
								<p>表单示例</p>
								<div class="label-content">
									<span class="label label-default label-round label-outline">基本</span>
									<span class="label label-default label-round label-outline">质感</span>
									<span class="label label-default label-round label-outline">高级</span>
									<span class="label label-default label-round label-outline">布局</span>
									<span class="label label-default label-round label-outline">向导</span>
									<span class="label label-default label-round label-outline">验证</span>
									<span class="label label-default label-round label-outline">预设</span>
									<span class="label label-default label-round label-outline">编辑</span>
									<span class="label label-default label-round label-outline">编辑器</span>
									<span class="label label-default label-round label-outline">图片裁剪</span>
									<span class="label label-default label-round label-outline">文件上传</span>
								</div>
							</div>
						</div>
					</div>
					<div class="col-xs-12 col-sm-6 col-md-4 col-lg-3 col-xlg-2"
						style="height: 237px;">
						<div class="panel">
							<div class="panel-body text-center">
								<i class="icon ti-bar-chart-alt orange-500"></i>
								<p>图表示例</p>
								<div class="label-content">
									<span class="label label-default label-round label-outline">简单图表</span>
									<span class="label label-default label-round label-outline">ECharts</span>
								</div>
							</div>
						</div>
					</div>
					<div class="col-xs-12 col-sm-6 col-md-4 col-lg-3 col-xlg-2"
						style="height: 237px;">
						<div class="panel">
							<div class="panel-body text-center">
								<i class="icon ti-panel teal-500"></i>
								<p>系统设置</p>
								<div class="label-content">
									<span class="label label-default label-round label-outline">菜单</span>
									<span class="label label-default label-round label-outline">用户</span>
									<span class="label label-default label-round label-outline">日志</span>
									<span class="label label-default label-round label-outline">黑名单</span>
									<span class="label label-default label-round label-outline">系统</span>
									<span class="label label-default label-round label-outline">账户</span>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

		<script src="<%=path%>/public/plug/matchheight/jquery.matchHeight.min.js"></script>




	</div>
	<div class="page-loading vertical-align text-center">
		<div class="page-loader loader-default loader vertical-align-middle"
			data-type="default"></div>
	</div>
	</main>

	<footer class="site-footer">
		<div class="site-footer-legal">
			成都爱依客 &copy; <a href="<%=path%>/index.jsp" target="_blank">admui.com</a>
		</div>
		<div class="site-footer-right">
			当前版本：v1.1.0 <a class="margin-left-5" data-toggle="tooltip" title=""
				href="<%=path%>/buy.jsp" target="_blank"
				data-original-title="升级"> <i class="fa fa-cloud-upload"></i>
			</a>
		</div>
	</footer>

	<div class="modal fade" id="admui-mobileView" aria-hidden="true"
		aria-labelledby="admui-mobileView" role="dialog" tabindex="-1">
		<div class="modal-dialog modal-sidebar modal-sm">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="关闭">
						<span aria-hidden="true">×</span>
					</button>
					<h4 class="modal-title">在手机上预览本页</h4>
				</div>
				<div class="modal-body">
					<p class="thumbnail">
						<img class="img-responsive img-bordered" id="admui-mobileViewQRcode" src="">
					</p>
					<p class="margin-top-20 font-size-12">
						<i class="fa fa-bell" aria-hidden="true"></i>
						您可以用手机APP(如微信、支付宝等)的扫码功能扫码下面的二维码，在手机上查看本页显示效果。
					</p>
				</div>
			</div>
		</div>
	</div>

	<!-- 布局 -->
	<script src="<%=path%>/public/themes/classic/base/js/sections/menu.js"></script>
	<script
		src="<%=path%>/public/themes/classic/base/js/sections/media-menu.js"></script>
	<script
		src="<%=path%>/public/themes/classic/base/js/sections/content-tabs.js"></script>

	<!-- 插件 -->
	<script type="text/javascript" src="<%=path%>/public/plug/jquery-pjax/jquery.pjax.min.js" ></script>
	<script
		src="<%=path%>/public/themes/classic/global/js/plugins/responsive-tabs.js"></script>
	<script
		src="<%=path%>/public/plug/ashoverscroll/jquery-asHoverScroll.min.js"></script>
	<script src="<%=path%>/public/plug/slimscroll/jquery.slimscroll.min.js"></script>
	<script src="<%=path%>/public/plug/screenfull/screenfull.min.js"></script>

	<!-- 客服组件 -->
	<script
		src="//assets-cdn.kf5.com/supportbox/main.js?2&amp;_=1501040170880"
		id="kf5-provide-supportBox" kf5-domain="admui.kf5.com"></script>

	<!-- 消息通知 -->
	<script src="<%=path%>/public/js/notify-msg.js"></script>



	<iframe src="javascript:false" title="" style="display: none;"></iframe>
	<link rel="styleSheet" type="text/css"
		href="//assets-cdn.kf5.com/supportbox_v2/css/supportBtn.css?v=3">
<!-- 	<div class="kf5-support-chat kf5-chatSupport-right-bottom"
		style="position: relative; z-index: 2147483000">
		<div id="kf5-support-block" class="kf5-supportBox"
			style="display: none">
			<a id="kf5-close-btn" class="kf5-support-chat_close kf5-waves"
				href="javascript:;"></a>
			<div id="kf5-loading" class="kf5-loading kf5-loading-md kf5-center"
				style="display: none;"></div>
			<iframe id="kf5-widget-iframe" class="kf5-supportBox_iframe"
				scrolling="no"
				src="//admui.kf5.com/supportbox/index?active_in_iframe=0"
				frameborder="0"></iframe>
		</div>
		<div id="kf5-support-btn" style="color: #ffffff; background: #67B7F3;"
			class="kf5-chatSupport-btn kf5-chatSupport-style4 kf5-chatSupport-icon8 kf5-waves waves-effect waves-light">
			<span>在线客服</span>
			<div id="msg-number" class="kf5-chatSupport_msgNumber"
				style="display: none"></div>
		</div>
		<div id="kf5-backdrop" class="kf5-backdrop" style="display: none;">
			<a class="kf5-backdrop-close">关闭</a><a href="" target="_blink"><img
				id="kf5-view-image" class="kf5-backdrop-img" src=""></a>
		</div>
	</div> -->
</body>
</html>

