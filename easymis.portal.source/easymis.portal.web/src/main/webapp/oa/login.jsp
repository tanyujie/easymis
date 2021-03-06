<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-cn">
<head>
<title>EasyMis 在线演示系统</title>
<meta charset="utf-8">
<meta name="keywords"
	content="EasyMis,EasyMis官网,EasyMis下载,EasyMis框架,通用后台管理系统,后台框架,ui框架">
<meta name="description"
	content="EasyMis在线演示系统，EasyMis是一个基于最新Web技术的企业级通用管理系统快速开发框架，可以帮助企业极大的提高工作效率，节省开发成本，提升品牌形象。">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<!-- 移动设备 viewport -->
<meta name="viewport"
	content="width=device-width,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no,minimal-ui">
<meta name="author" content="EasyMis.com">
<!-- 360浏览器默认使用Webkit内核 -->
<meta name="renderer" content="webkit">
<!-- 禁止百度SiteAPP转码 -->
<meta http-equiv="Cache-Control" content="no-siteapp">
<!-- Chrome浏览器添加桌面快捷方式（安卓） -->
<link rel="icon" type="image/png" href="<%=path %>/public/images/favicon.png">
<meta name="mobile-web-app-capable" content="yes">
<!-- Safari浏览器添加到主屏幕（IOS） -->
<link rel="icon" sizes="192x192"
	href="<%=path %>/public/images/apple-touch-icon.png">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<meta name="apple-mobile-web-app-title" content="EasyMis">
<!-- Win8标题栏及ICON图标 -->
<link rel="apple-touch-icon-precomposed"
	href="<%=path %>/public/images/apple-touch-icon.png">
<meta name="msapplication-TileImage"
	content="<%=path %>/public/images/app-icon72x72@2x.png">
<meta name="msapplication-TileColor" content="#62a8ea">
<!-- 样式 -->
<link rel="stylesheet"
	href="<%=path%>/public/themes/classic/base/css/site.css" id="siteStyle">
<!--[if lte IE 9]>
<meta http-equiv="refresh" content="0; url='http://www.EasyMis.com/ie/'" />
<![endif]-->
<!--[if lt IE 10]>
<script src="href="<%=path%>/public/vendor/media-match/media.match.min.js"></script>
<script src="href="<%=path%>/public/vendor/respond/respond.min.js"></script>
<![endif]-->

<!-- 自定义 -->
<link rel="stylesheet" href="<%=path%>/public/css/login.css">
<!-- 插件 -->
<link rel="stylesheet"
	href="<%=path%>/public/vendor/animsition/animsition.css">
<!-- 图标 -->

<link rel="stylesheet"
	href="<%=path%>/public/plug/font-awesome-4.7.0/css/font-awesome.min.css">
<!-- 插件 -->
<link rel="stylesheet"
	href="<%=path%>/public/plug/vendor/bootstrap-select/bootstrap-select.css">
<link rel="stylesheet"
	href="<%=path%>/public/plug/vendor/formvalidation/formValidation.css">


<style id="zoomLevel-styles"></style>

<!-- 客服组件 -->
<script
	src="//assets-cdn.kf5.com/supportbox/main.js?2&amp;_=1501038905781"
	id="kf5-provide-supportBox" kf5-domain="EasyMis.kf5.com"></script>
</head>

<body class="page-login layout-full page-dark">

	<div class="page height-full">
		<div class="page-content height-full">
			<div
				class="page-brand-info vertical-align animation-slide-left hidden-xs">
				<div class="page-brand vertical-align-middle">
					<div class="brand">
						<img class="brand-img" src="/public/images/logo-white.svg"
							alt="EasyMis" height="50">
					</div>
					<h2 class="hidden-sm">EasyMis 通用管理系统快速开发框架</h2>
					<ul class="list-icons hidden-sm">
						<li><i class="wb-check" aria-hidden="true"></i> EasyMis
							是一个基于最新 Web 技术的企业级通用管理系统快速开发框架，可以帮助企业极大的提高工作效率，节省开发成本，提升品牌形象。</li>
						<li><i class="wb-check" aria-hidden="true"></i> 您可以 EasyMis
							为基础，快速开发各种MIS系统，如CMS、OA、CRM、ERP、POS等。</li>
						<li><i class="wb-check" aria-hidden="true"></i> EasyMis
							紧贴业务特性，涵盖了大量的常用组件和基础功能，最大程度上帮助企业节省时间成本和费用开支。</li>
					</ul>
					<div class="hidden-sm">
						<a href="http://easymis.net" class="btn btn-primary margin-right-5"
							target="_blank"><i class="fa fa-home"></i> 返回官网</a>
						<div class="btn-group margin-right-5">
							<button type="button" class="btn btn-success dropdown-toggle"
								id="demoApp" data-toggle="dropdown" aria-expanded="false">
								<i class="fa fa-download"></i> 下载桌面版 <span class="caret"></span>
							</button>
							<ul class="dropdown-menu dropdown-menu-success bullet"
								aria-labelledby="demoApp" role="menu">
								<li role="presentation"><a
									href="http://dl.admui.com/app/win/admui-demo.zip"
									role="menuitem"><i class="fa fa-windows"></i> Windows 版</a></li>
								<li role="presentation"><a
									href="http://dl.admui.com/app/mac/admui-demo.zip"
									role="menuitem"><i class="fa fa-apple"></i> MacOS 版</a></li>
							</ul>
						</div>
						<a href="javascript:;" class="btn btn-info open-kf"><i
							class="fa fa-user"></i> 联系客服</a>
					</div>
				</div>
			</div>
			<div class="page-login-main animation-fade">
        	
            <div class="vertical-align">
                <div class="vertical-align-middle">
                    <div class="brand visible-xs text-center">
                        <img class="brand-img" src="http://admui.oss-cn-shenzhen.aliyuncs.com/demo/1.1.0/images/logo.svg" alt="Admui" height="50">
                    </div>
                    <h3 class="hidden-xs">登录 EasyMis</h3>
                    <p class="hidden-xs">EasyMis 在线演示系统</p>
                    <form action="/system/loginValidate" class="login-form fv-form fv-form-bootstrap" method="post" id="loginForm" novalidate="novalidate">
                    <button type="submit" class="fv-hidden-submit" style="display: none; width: 0px; height: 0px;"></button>
                    	<div class="form-group">
                            <label class="sr-only" for="identity">选择身份</label>
                            <div class="btn-group bootstrap-select form-control"><button type="button" class="btn dropdown-toggle bs-placeholder btn-select" data-toggle="dropdown" data-id="identity" title="我自己"><span class="filter-option pull-left">我自己</span>&nbsp;<span class="bs-caret"><span class="caret"></span></span></button><div class="dropdown-menu open"><ul class="dropdown-menu inner" role="menu"><li data-original-index="0" class="selected"><a tabindex="0" class="" style="" data-tokens="null"><span class="text">我自己</span><span class="glyphicon glyphicon-ok check-mark"></span></a></li><li class="divider" data-original-index="1"></li><li data-original-index="2"><a tabindex="0" class="" style="" data-tokens="null"><span class="text">夏瑄</span><span class="glyphicon glyphicon-ok check-mark"></span></a></li><li data-original-index="3"><a tabindex="0" class="" style="" data-tokens="null"><span class="text">张致远</span><span class="glyphicon glyphicon-ok check-mark"></span></a></li><li data-original-index="4"><a tabindex="0" class="" style="" data-tokens="null"><span class="text">王诗琪</span><span class="glyphicon glyphicon-ok check-mark"></span></a></li><li data-original-index="5"><a tabindex="0" class="" style="" data-tokens="null"><span class="text">李欣</span><span class="glyphicon glyphicon-ok check-mark"></span></a></li><li data-original-index="6"><a tabindex="0" class="" style="" data-tokens="null"><span class="text">秦守仁</span><span class="glyphicon glyphicon-ok check-mark"></span></a></li><li data-original-index="7"><a tabindex="0" class="" style="" data-tokens="null"><span class="text">刘一鸣</span><span class="glyphicon glyphicon-ok check-mark"></span></a></li><li data-original-index="8"><a tabindex="0" class="" style="" data-tokens="null"><span class="text">王佳琪</span><span class="glyphicon glyphicon-ok check-mark"></span></a></li></ul></div><select class="form-control" id="identity" tabindex="-98">
                                <option value="">我自己</option>
                                <option data-divider="true"></option>
                                <option value="xiaxuan@EasyMis_demo" data-password="123456">夏瑄</option>
                                <option value="zhangzhiyuan@EasyMis_demo" data-password="123456">张致远</option>
                                <option value="wangshiqi@EasyMis_demo" data-password="123456">王诗琪</option>
                                <option value="lixin@EasyMis_demo" data-password="123456">李欣</option>
                                <option value="qinshouren@EasyMis_demo" data-password="123456">秦守仁</option>
                                <option value="liuyiming@EasyMis_demo" data-password="123456">刘一鸣</option>
                                <option value="wangjiaqi@EasyMis_demo" data-password="123456">王佳琪</option>
                            </select></div>
                        </div>
                        <div class="form-group has-feedback">
                            <label class="sr-only" for="username">用户名</label>
                            <input class="form-control" id="username" name="loginName" placeholder="请输入用户名" data-fv-field="loginName" type="text"><i style="display: none;" class="form-control-feedback" data-fv-icon-for="loginName"></i>
                        <small style="display: none;" class="help-block" data-fv-validator="notEmpty" data-fv-for="loginName" data-fv-result="NOT_VALIDATED">用户名不能为空</small></div>
                        <div class="form-group has-feedback">
                            <label class="sr-only" for="password">密码</label>
                            <input class="form-control" id="password" name="password" placeholder="请输入密码" data-fv-field="password" type="password"><i style="display: none;" class="form-control-feedback" data-fv-icon-for="password"></i>
                        <small style="display: none;" class="help-block" data-fv-validator="notEmpty" data-fv-for="password" data-fv-result="NOT_VALIDATED">密码不能为空</small><small style="display: none;" class="help-block" data-fv-validator="stringLength" data-fv-for="password" data-fv-result="NOT_VALIDATED">密码必须大于6且小于30个字符</small></div>
                        <div class="form-group has-feedback">
                            <label class="sr-only" for="password">验证码</label>
                            <div class="input-group">
                                <input class="form-control" name="validCode" placeholder="请输入验证码" data-fv-field="validCode" type="text">
                                <a class="input-group-addon padding-0 reload-vify" href="javascript:;">
                                    <img src="/system/captcha" height="40">
                                </a>
                            </div><i style="display: none;" class="form-control-feedback fv-bootstrap-icon-input-group" data-fv-icon-for="validCode"></i>
                        <small style="display: none;" class="help-block" data-fv-validator="notEmpty" data-fv-for="validCode" data-fv-result="NOT_VALIDATED">验证码不能为空</small></div>
                        <div class="form-group clearfix">
                            <div class="checkbox-custom checkbox-inline checkbox-primary pull-left">
                                <input id="remember" name="remember" type="checkbox">
                                <label for="remember">自动登录</label>
                            </div>
                            <div class="pull-right">
                            	<a href="http://www.admui.com/?sendUrl=http%3A%2F%2Fdemo.admui.com%2Flogin#register" target="_blank">注册账号</a>
                            	·
	                            <a class="collapsed" data-toggle="collapse" href="#forgetPassword" aria-expanded="false" aria-controls="forgetPassword">
	                                找回密码
	                            </a>
                            </div>
                        </div>
                        <div class="collapse" id="forgetPassword" aria-expanded="true">
                            <div class="alert alert-warning alert-dismissible" role="alert">
                                请返回官网点击登录按钮找回密码
                            </div>
                        </div>
                        <button type="submit" class="btn btn-primary btn-block margin-top-30">立即登录</button>
                    </form>
                </div>
            </div>
            <footer class="page-copyright">
                <p>成都爱依客 &copy;
        			<a href="http://www.admui.com" target="_blank">easymis.cn</a>
                </p>
            </footer>
        </div>
		</div>
	</div>

<!-- JS -->
<script src="<%=path%>/public/plug/vendor/formvalidation/framework/jquery.min.js"></script>
<script src="<%=path%>/public/plug/bootstrap/bootstrap.min.js"></script>
<script src="<%=path%>/public/plug/vendor/bootstrap-select/bootstrap-select.min.js"></script>
<script src="<%=path%>/public/plug/vendor/formvalidation/formValidation.min.js" data-name="formValidation"></script>
<script src="<%=path%>/public/plug/vendor/formvalidation/framework/bootstrap.min.js" data-deps="formValidation"></script>
<script src="<%=path%>/public/js/login.js"></script>


	<iframe src="javascript:false" title="" style="display: none;"></iframe>
	<link rel="styleSheet" type="text/css"
		href="//assets-cdn.kf5.com/supportbox_v2/css/supportBtn.css?v=3">
	<div class="kf5-support-chat kf5-chatSupport-right-bottom"
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
		<div id="kf5-support-btn"
			style="color: rgb(255, 255, 255); background: rgb(103, 183, 243) none repeat scroll 0% 0%; display: none;"
			class="kf5-chatSupport-btn kf5-chatSupport-style4 kf5-chatSupport-icon8 kf5-waves waves-effect waves-light">
			<span>在线客服</span>
			<div id="msg-number" class="kf5-chatSupport_msgNumber"
				style="display: none"></div>
		</div>
		<div id="kf5-backdrop" class="kf5-backdrop" style="display: none;">
			<a class="kf5-backdrop-close">关闭</a><a href="" target="_blink"><img
				id="kf5-view-image" class="kf5-backdrop-img" src=""></a>
		</div>
	</div>
</body>
</html>