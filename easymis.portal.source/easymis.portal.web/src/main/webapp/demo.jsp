<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
%>
<html><head>
    <title>演示 - EasyMis</title>
    <meta charset="utf-8">
<meta name="keywords" content="EasyMis,EasyMis官网,EasyMis框架,通用后台管理系统,后台框架,ui框架">
<meta name="description" content="EasyMis 是一个基于最新 Web 技术的企业级通用管理系统快速开发框架，可以帮助企业极大的提高工作效率，节省开发成本，提升品牌形象">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1">
<!--[if lte IE 9]>
<meta http-equiv="refresh" content="0; url='http://www.admui.com/ie'" />
<![endif]-->
<meta name="renderer" content="webkit">
<meta name="visitor-form">
<meta http-equiv="Cache-Control" content="no-siteapp">
<meta name="mobile-web-app-capable" content="yes">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<meta name="apple-mobile-web-app-title" content="EasyMis">
<meta name="msapplication-TileImage" content="http://cdn.admui.com/site/img/app/icon-72@x2.png">
<meta name="msapplication-TileColor" content="#395b81">
<link rel="apple-touch-icon-precomposed" href="http://cdn.admui.com/site/img/app/icon-72@x2.png">
<link rel="shortcut icon" href="http://cdn.admui.com/site/img/app/favicon.png">
<link rel="stylesheet" href="http://cdn.bootcss.com/semantic-ui/2.2.6/semantic.min.css">
<link rel="stylesheet" href="http://cdn.admui.com/site/css/toastr.min.css">
<link rel="stylesheet" href="http://cdn.admui.com/site/css/style.css">
    <link href="http://cdn.admui.com/site/css/demo.css" rel="stylesheet">
<style id="zoomLevel-styles"></style></head>

<body>
<!-- 导航 -->
<header id="navbar">
    <div class="ui container">
        <a href="http://www.admui.com" class="logo" style="font-size: 1.714rem;">EasyMis</a>
        <a href="#" class="menu"><i class="sidebar icon"></i></a>
        <a href="/user" class="ucenter openlogin"><i class="user icon"></i></a>
        <nav>
            <a href="<%=path%>/index.jsp">首页</a>
            <a href="<%=path%>/buy.jsp">购买</a>
            <a href="/demo" class="active">演示</a>
            <a href="<%=path%>/help.jsp" target="_blank">帮助</a>
            <a href="<%=path%>/docs.jsp" target="_blank">开发文档</a>
            <a href="http://bsify.admui.com" target="_blank">BSify</a>
        </nav>
    </div>
</header>

<main id="main">
    <header id="introduction">
        <div class="ui container">
            <div class="ui two column doubling grid">
                <div class="column">
                    <h2>EasyMis 通用管理系统快速开发框架</h2>
                    <p>您可以直接使用以下卡片中的身份来在线体验EasyMis</p>
                </div>
                <div class="column right aligned">
                	<a class="ui inverted basic button open-kf" href="#"><i class="user icon"></i>在线咨询</a>
                </div>
            </div>
        </div>
    </header>
    <div class="main ui container" id="content">
        <h4 class="ui horizontal divider header"><i class="pointing right icon"></i>选择角色，开始体验</h4>
        <div class="ui link four cards doubling">
            <div class="card">
                <div class="content">
                    <a class="ui green ribbon label">推荐</a>
                    <div class="header right aligned">
                        我自己
                    </div>
                    <div class="meta right aligned">
                        超级管理员
                    </div>
                    <div class="description">
                        使用自己的账号登录，可体验全部功能，保存历史数据6个月。
                    </div>
                </div>
                <div class="extra content">
                    <div class="ui two mini buttons">
                        <a href="<%=path%>/oa/login.jsp" target="_blank" class="ui basic green button">
                            <i class="user icon"></i> 登录
                        </a>
                        <a href="#register" class="ui basic primary button">
                            <i class="write icon"></i> 注册
                        </a>
                    </div>
                </div>
            </div>
            <div class="card">
                <div class="content">
                    <img class="right floated mini ui image" src="http://cdn.admui.com/site/img/avatar/girl.svg">
                    <div class="header">
                        夏瑄
                    </div>
                    <div class="meta">
                        超级管理员
                    </div>
                    <div class="description">
                        演示用户，部分功能或操作受限，数据定时重置。
                    </div>
                </div>
                <div class="extra content">
                    <div class="ui two mini buttons">
                        <a href="<%=path%>/oa/login.jsp?user=xiaxuan@admui_demo" target="_blank" class="ui basic green button">
                            <i class="external icon"></i> 以 Ta 的身份登录
                        </a>
                    </div>
                </div>
            </div>
            <div class="card">
                <div class="content">
                    <img class="right floated mini ui image" src="http://cdn.admui.com/site/img/avatar/boy.svg">
                    <div class="header">
                        张致远
                    </div>
                    <div class="meta">
                        管理员
                    </div>
                    <div class="description">
                        演示用户，部分功能或操作受限，数据定时重置。
                    </div>
                </div>
                <div class="extra content">
                    <div class="ui two mini buttons">
                        <a href="<%=path%>/oa/login.jsp?user=zhangzhiyuan@admui_demo" target="_blank" class="ui basic green button">
                            <i class="external icon"></i> 以 Ta 的身份登录
                        </a>
                    </div>
                </div>
            </div>
            <div class="card">
                <div class="content">
                    <img class="right floated mini ui image" src="http://cdn.admui.com/site/img/avatar/supportfemale.svg">
                    <div class="header">
                        王诗琪
                    </div>
                    <div class="meta">
                        客服美女
                    </div>
                    <div class="description">
                        演示用户，部分功能或操作受限，数据定时重置。
                    </div>
                </div>
                <div class="extra content">
                    <div class="ui two mini buttons">
                        <a href="<%=path%>/oa/login.jsp?user=wangshiqi@admui_demo" target="_blank" class="ui basic green button">
                            <i class="external icon"></i> 以 Ta 的身份登录
                        </a>
                    </div>
                </div>
            </div>
            <div class="card">
                <div class="content">
                    <img class="right floated mini ui image" src="http://cdn.admui.com/site/img/avatar/supportmale.svg">
                    <div class="header">
                        李欣
                    </div>
                    <div class="meta">
                        客服帅哥
                    </div>
                    <div class="description">
                        演示用户，部分功能或操作受限，数据定时重置。
                    </div>
                </div>
                <div class="extra content">
                    <div class="ui two mini buttons">
                        <a href="<%=path%>/oa/login.jsp?user=lixin@admui_demo" target="_blank" class="ui basic green button">
                            <i class="external icon"></i> 以 Ta 的身份登录
                        </a>
                    </div>
                </div>
            </div>
            <div class="card">
                <div class="content">
                    <img class="right floated mini ui image" src="http://cdn.admui.com/site/img/avatar/malecostume.svg">
                    <div class="header">
                        秦守仁
                    </div>
                    <div class="meta">
                        我是老板
                    </div>
                    <div class="description">
                        演示用户，部分功能或操作受限，数据定时重置。
                    </div>
                </div>
                <div class="extra content">
                    <div class="ui two mini buttons">
                        <a href="<%=path%>/oa/login.jsp?user=qinshouren@admui_demo" target="_blank" class="ui basic green button">
                            <i class="external icon"></i> 以 Ta 的身份登录
                        </a>
                    </div>
                </div>
            </div>
            <div class="card">
                <div class="content">
                    <img class="right floated mini ui image" src="http://cdn.admui.com/site/img/avatar/male.svg">
                    <div class="header">
                        刘一鸣
                    </div>
                    <div class="meta">
                        Java程序猿
                    </div>
                    <div class="description">
                        演示用户，部分功能或操作受限，数据定时重置。
                    </div>
                </div>
                <div class="extra content">
                    <div class="ui two mini buttons">
                        <a href="<%=path%>/oa/login.jsp?user=liuyiming@admui_demo" target="_blank" class="ui basic green button">
                            <i class="external icon"></i> 以 Ta 的身份登录
                        </a>
                    </div>
                </div>
            </div>
            <div class="card">
                <div class="content">
                    <img class="right floated mini ui image" src="http://cdn.admui.com/site/img/avatar/female.svg">
                    <div class="header">
                        王佳琪
                    </div>
                    <div class="meta">
                        Java程序媛
                    </div>
                    <div class="description">
                        演示用户，部分功能或操作受限，数据定时重置。
                    </div>
                </div>
                <div class="extra content">
                    <div class="ui two mini buttons">
                        <a href="<%=path%>/oa/login.jsp?user=wangjiaqi@admui_demo" target="_blank" class="ui basic green button">
                            <i class="external icon"></i> 以 Ta 的身份登录
                        </a>
                    </div>
                </div>
            </div>
        </div>
        <!-- <div class="ui horizontal divider">或者</div>
        <div id="video">
            <button class="ui right labeled blue huge icon button"><i class="video icon"></i> 观看演示视频</button>
        </div> -->
    </div>
</main>

<!-- 底部 -->
<!-- 版权 --><footer class="section fp-auto-height" id="footer">
    <div class="link">
        <a href="<%=path %>/about.jsp">关于我们</a> ·
        <a href="<%=path %>/about.jsp#agreement">用户协议</a> ·
        <a href="<%=path %>/about.jsp#duty">免责声明</a> ·
        <a href="<%=path %>/about.jsp#privacy">隐私保护</a> 
        <!--· <a href="http://weibo.com/admui" target="_blank"><i class="weibo icon"></i>微博</a> -->
    </div>
    <div class="copyright">
        <i class="copyright icon"></i> 2016-2017 成都爱依客. All Rights Reserved. 电话：400 150 2080
    </div>
</footer>
<!-- 登录 -->
<div class="ui small modal signbox" id="loginBox">
       <div class="header">登录</div>
       <div class="content ui dimmable">
           <div class="ui inverted dimmer">
               <div class="ui indeterminate text loader"></div>
           </div>
           <div class="ui middle aligned very relaxed stackable grid">
               <div class="ten wide column">
                   <div class="ui form" id="loginForm">
                       <div class="field">
                           <div class="ui slider checkbox">
                               <input name="loginType" id="loginType" type="checkbox">
                               <label for="loginType">使用验证码登录</label>
                           </div>
                       </div>
                       <div class="field">
                           <div class="ui left icon input">
                               <input name="mobile" placeholder="手机号" type="text">
                               <i class="mobile icon"></i>
                           </div>
                       </div>
                       <div class="field">
                           <div class="ui left icon input">
                               <input id="logPad" name="password" placeholder="密码" type="password">
                               <i class="lock icon"></i>
                           </div>
                           <button class="ui mini button getcode" style="display:none" type="button">获取验证码</button>
                    </div>
                    <div class="field code message"></div>
                    <div class="field">
                        <div class="ui checkbox">
                            <input id="rememberMe" type="checkbox">
                            <label for="rememberMe">自动登录</label>
                        </div>
                        <div class="forget">
                            <a href="#">忘记密码了？</a>
                        </div>
                    </div>
                    <input name="type" value="login" type="hidden">
                    <button class="ui blue submit button">登录</button>
                </div>
            </div>
            <div class="ui vertical divider" style="left:64%">或</div>
            <div class="center aligned six wide column">
                <button class="ui green labeled icon button openreg" type="button"><i class="signup icon"></i> 一分钟注册</button>
            </div>
        </div>
    </div>
</div>
<!-- 注册 -->
<div class="ui small modal signbox" id="regBox">
    <div class="header">注册新账户</div>
    <div class="content ui dimmable">
        <div class="ui inverted dimmer">
            <div class="ui indeterminate text loader"></div>
        </div>
        <div class="ui middle aligned very relaxed stackable grid">
            <div class="ten wide column">
                <div class="ui form" id="regForm">
                    <div class="field">
                        <div class="ui left icon input">
                            <input name="mobile" placeholder="手机号" type="text">
                            <i class="mobile icon"></i>
                        </div>
                    </div>
                    <div class="field">
                        <div class="ui left icon input">
                            <input name="mcode" placeholder="验证码" maxlength="6" type="text">
                            <i class="at icon"></i>
                        </div>
                        <button class="ui mini button getcode" type="button">获取验证码</button>
                    </div>
                    <div class="field code message"></div>
                    <div class="field">
                        <div class="ui left icon input">
                            <input id="regPad" name="password" placeholder="密码，6-16位数字、字母、符号组合" type="password">
                            <i class="lock icon"></i>
                        </div>
                    </div>
                    <div class="field">
                        <div class="ui left icon input">
                            <input name="rePassword" placeholder="确认密码" type="password">
                            <i class="lock icon"></i>
                        </div>
                    </div>
                    <div class="field">
                        <div class="ui checkbox">
                            <input name="agreement" id="agreement" checked="checked" type="checkbox">
                            <label for="agreement">我同意《<a href="/about" target="_blank">EasyMis 相关条款</a>》</label>
                        </div>
                    </div>
                    <input name="type" value="register" type="hidden">
                    <button class="ui blue submit button"><i class="signup icon"></i> 立即注册</button>
                </div>
            </div>
            <div class="ui vertical divider" style="left:64%">或</div>
            <div class="center aligned six wide column">
                <button class="ui green labeled icon button openlogin" type="button"><i class="user icon"></i> 直接登录</button>
            </div>
        </div>
    </div>
</div>
<!-- 忘记密码 -->
<div class="ui small modal signbox" id="forgetBox">
    <div class="header">忘记密码</div>
    <div class="content ui dimmable">
        <div class="ui inverted dimmer">
            <div class="ui indeterminate text loader"></div>
        </div>
        <div class="ui middle aligned very relaxed stackable grid">
            <div class="ten wide column">
                <div class="ui form" id="forgetForm">
                    <div class="field">
                        <div class="ui left icon input">
                            <input name="mobile" placeholder="手机号" type="text">
                            <i class="mobile icon"></i>
                        </div>
                    </div>
                    <div class="field">
                        <div class="ui left icon input">
                            <input name="mcode" placeholder="验证码" maxlength="6" type="text">
                            <i class="at icon"></i>
                        </div>
                        <button class="ui mini button getcode" type="button">获取验证码</button>
                    </div>
                    <div class="field code message"></div>
                    <div class="field">
                        <div class="ui left icon input">
                            <input id="forPad" name="password" placeholder="密码，6-16位数字、字母、符号组合" type="password">
                            <i class="lock icon"></i>
                        </div>
                    </div>
                    <div class="field">
                        <div class="ui left icon input">
                            <input name="rePassword" placeholder="确认密码" type="password">
                            <i class="lock icon"></i>
                        </div>
                    </div>
                    <input name="type" value="validate" type="hidden">
                    <button class="ui blue submit button">重置密码</button>
                </div>
            </div>
            <div class="ui vertical divider" style="left:64%">或</div>
            <div class="center aligned six wide column">
                <button class="ui green labeled icon button openlogin" type="button"><i class="user icon"></i> 直接登录</button>
            </div>
        </div>
    </div>
</div>

<!-- 公共js -->
<script src="https://hm.baidu.com/hm.js?fa2bd45e217bb7176d461a15f7f5b8a8"></script><script src="https://cdn.staticfile.org/jquery/2.1.4/jquery.min.js"></script>
<script src="http://cdn.bootcss.com/semantic-ui/2.2.6/semantic.min.js"></script>
<script src="https://cdn.staticfile.org/toastr.js/latest/js/toastr.min.js"></script>
<script src="http://cdn.admui.com/site/js/main.js"></script>

<!-- 自定义js -->
<script>
	//严正声明！！！
	$(function(){
		$('.message .close').on('click', function() {
	    	$(this).closest('.message').transition('fade');
	    });
	});
</script>




<script src="//assets-cdn.kf5.com/supportbox/main.js?3" id="kf5-provide-supportBox" kf5-domain="admui.kf5.com" charset="utf-8"></script><iframe src="javascript:false" title="" style="display: none;"></iframe><link rel="styleSheet" type="text/css" href="//assets-cdn.kf5.com/supportbox_v2/css/supportBtn.css?v=3"><div class="kf5-support-chat kf5-chatSupport-right-bottom" style="position: relative;z-index: 2147483000"><div id="kf5-support-block" class="kf5-supportBox" style="display: none"><a id="kf5-close-btn" class="kf5-support-chat_close kf5-waves" href="javascript:;"></a><div id="kf5-loading" class="kf5-loading kf5-loading-md kf5-center" style="display: none;"></div><iframe id="kf5-widget-iframe" class="kf5-supportBox_iframe" scrolling="no" src="//admui.kf5.com/supportbox/index?active_in_iframe=0" frameborder="0"></iframe></div><div id="kf5-support-btn" style="color:#ffffff; background:#67B7F3;" class="kf5-chatSupport-btn kf5-chatSupport-style4 kf5-chatSupport-icon8 kf5-waves waves-effect waves-light"><span>在线客服</span><div id="msg-number" class="kf5-chatSupport_msgNumber" style="display: none"></div></div><div id="kf5-backdrop" class="kf5-backdrop" style="display: none;"><a class="kf5-backdrop-close">关闭</a><a href="" target="_blink"><img id="kf5-view-image" class="kf5-backdrop-img" src=""></a></div></div></body></html>