<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
%>
<html style="transform-origin: left top 0px; transform: scale(1);"><head>
    <title>购买 - EasyMis</title>
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
<meta name="apple-mobile-web-app-title" content="Admui">
<meta name="msapplication-TileImage" content="http://admui.oss-cn-shenzhen.aliyuncs.com/site/img/app/icon-72@x2.png">
<meta name="msapplication-TileColor" content="#395b81">
<link rel="apple-touch-icon-precomposed" href="http://admui.oss-cn-shenzhen.aliyuncs.com/site/img/app/icon-72@x2.png">
<link rel="shortcut icon" href="http://admui.oss-cn-shenzhen.aliyuncs.com/site/img/app/favicon.png">
<link rel="stylesheet" href="http://cdn.bootcss.com/semantic-ui/2.2.6/semantic.min.css">
<link rel="stylesheet" href="<%=path %>/site/css/toastr.min.css">
<link rel="stylesheet" href="<%=path %>/site/css/style.css">
    <link href="<%=path %>/site/css/buy.css" rel="stylesheet">
    <script src="https://hm.baidu.com/hm.js?fa2bd45e217bb7176d461a15f7f5b8a8"></script><script>
        var formData = {
            version: [],
            program: [],
            style: {
            	selected: '',
            	items: []
            },
            code: [], 
            theme: [],
            /* services: {
            	selected: '',
            	items: []
            }, */
            domains: {
            	selected: '',
            	items: []
            },
            invoice: false 
        };
    </script>
</head>

<body>
<!-- 导航 -->
<header id="navbar">
    <div class="ui container">
        <a href="http://www.admui.com" class="logo" style="font-size: 1.714rem;">EasyMis</a>
        <a href="#" class="menu"><i class="sidebar icon"></i></a>
        <a href="/user" class="ucenter openlogin"><i class="user icon"></i></a>
        <nav>
            <a href="<%=path%>/index.jsp">首页</a>
            <a href="<%=path%>/buy.jsp" class="active">购买</a>
            <a href="<%=path%>/demo.jsp">演示</a>
            <a href="<%=path%>/help.jsp" target="_blank">帮助</a>
            <a href="<%=path%>/docs.jsp" target="_blank">开发文档</a>
            <a href="http://bsify.admui.com" target="_blank">BSify</a>
        </nav>
    </div>
</header>
<main id="main">
    <header id="introduction">
        <div class="ui container">
            <h2>EasyMIS 通用管理系统快速开发框架</h2>
            <ul class="ui bulleted list">
                <li class="item">EasyMIS 是一个基于最新WEB技术的企业级通用管理系统快速开发框架，可以帮助企业极大的提高工作效率，节省开发成本，提升品牌形象。</li>
                <li class="item">您可以 EasyMis 为基础，快速开发各种MIS系统，如CMS、OA、CRM、ERP、POS等。</li>
                <li class="item">EasyMis 紧贴业务特性，涵盖了大量的常用组件和基础功能，最大程度上帮助企业节省时间成本和费用开支。</li>
            </ul>

            <a class="ui medium green button" href="<%=path %>/demo.jsp"><i class="eye icon"></i>在线体验</a>
            <a class="ui medium orange button open-kf" href="#"><i class="user icon"></i>在线咨询</a>
        </div>
    </header>
    <div class="ui container" id="content">
        <div class="ui secondary pointing menu">
            <a class="item active">
                EasyMis 购买
            </a>
            <a class="right item" href="http://help.admui.com/hc/kb/section/1014666/" target="_blank">
                <i class="help circle icon"></i> 帮助
            </a>
        </div>
        <form id="product" action="" class="ui form stackable grid"><div class="eleven wide column"><div data-title="源码" class="form-row"><div class="form-cell"><div class="inline fields"><label>选择版本：</label> <div class="inline"><div class="button-checked"><input tabindex="0" name="version" id="d4a47a9b-572f-4380-a90f-d9005fb07b3e" class="hidden" value="d4a47a9b-572f-4380-a90f-d9005fb07b3e" type="radio"> <label for="d4a47a9b-572f-4380-a90f-d9005fb07b3e">1.1.0</label></div> <div class="form-cell-info"><div>仅提供已购买主版本和当前版本的最新版，<span class="text-red">不同版本之间可能会有不兼容的情况，请谨慎选择。</span> <a href="http://help.admui.com/hc/kb/article/1039831/" target="_blank">点此了解</a></div> <div>Admui 的版本号遵循《<a href="http://semver.org/lang/zh-CN/" target="_blank">语义化版本 2.0.0</a>》
                                    </div></div></div></div> <div class="inline fields"><label>后端程序：</label> <div class="inline"><div class="button-checked"><input tabindex="0" name="program" id="program-27181a77-c001-4af1-b808-044cbb29f8bc" data-price="3600" class="hidden" value="27181a77-c001-4af1-b808-044cbb29f8bc" type="checkbox"> <label for="program-27181a77-c001-4af1-b808-044cbb29f8bc">Java+MySQL</label></div> <div class="form-cell-info">包含管理系统常见功能(如登录、菜单、权限、日志、设置、黑名单、消息、账户等)及所有的示例页面</div> <div class="form-cell-info">后端程序中包含了前端基础源码中的所有源码，您可以不选择前端源码中的基础源码</div></div></div> <div class="inline fields"><label>前端源码：</label> <div class="inline"><div class="inline button-checked"><input tabindex="0" name="code" id="37e36a6c-955b-4871-b3b0-998555e0a91a" data-price="13600" class="hidden" value="37e36a6c-955b-4871-b3b0-998555e0a91a" type="checkbox"> <label for="37e36a6c-955b-4871-b3b0-998555e0a91a">自动构建</label></div><div class="inline button-checked"><input tabindex="0" name="code" id="c2c5e21b-bf89-4620-9a61-c06becde2d5d" data-price="1800" class="hidden" value="c2c5e21b-bf89-4620-9a61-c06becde2d5d" type="checkbox"> <label for="c2c5e21b-bf89-4620-9a61-c06becde2d5d">基础源码</label></div> <div class="form-cell-info">"自动构建"包含所有项目源码，适合对Gulp、Less等比较熟悉的前端工程师使用，同时，利用"自动构建"提供的脚手架可最大程度的实现对EasyMis的定制</div> <div class="form-cell-info">"基础源码"包含所有html、css、js等文件，适合对要求界面定制要求不高的场景，或普通前端工程师使用</div> <div class="form-cell-info"><a href="http://help.admui.com/hc/kb/article/1040432/" target="_blank">如何选择适合我的前端源码？</a></div></div></div></div></div> <div data-title="主题及布局" class="form-row"><div class="form-cell"><div class="inline fields"><label>经典主题：</label> <div class="inline"><div class="button-checked"><input tabindex="0" name="theme" id="theme-546f7f7d-5857-41fb-83a1-eee244be88c0" data-price="1800" class="hidden" value="546f7f7d-5857-41fb-83a1-eee244be88c0" type="checkbox"> <label for="theme-546f7f7d-5857-41fb-83a1-eee244be88c0">经典主题</label></div> <div class="form-cell-info">更多主题及布局正在开发中，您可以随时通过升级的形式获取新的主题</div></div></div></div></div> <div data-title="服务" class="form-row"><div class="form-cell"><div class="inline fields"><label>授权域名：</label> <div class="inline"><div class="slider-range"><ul class="slider-bar"><li><input tabindex="0" name="domain" id="domains-6" data-price="0" class="hide" value="bfafe657-aaf2-4f5c-8290-b3256487f6f6" type="radio"> <label for="domains-6" class="text-uppeurcase">单个</label></li><li><input tabindex="0" name="domain" id="domains-7" data-price="1000" class="hide" value="d66741b8-352c-442a-9143-78406e694f3a" type="radio"> <label for="domains-7" class="text-uppeurcase">5个以内</label></li><li><input tabindex="0" name="domain" id="domains-8" data-price="1800" class="hide" value="ca30e668-19fb-4114-8723-13767063ae2c" type="radio"> <label for="domains-8" class="text-uppeurcase">10个以内</label></li><li><input tabindex="0" name="domain" id="domains-9" data-price="6800" class="hide" value="c46d1f55-8e22-4137-abbf-6a781431a4e7" type="radio"> <label for="domains-9" class="text-uppeurcase">无限制</label></li></ul></div> <div class="form-cell-info">您可以将EasyMis用于多个项目，但是您需要为每个域名(不包含子域名)或IP购买授权。
                                    <a href="http://help.admui.com/hc/kb/article/1035790/" target="_blank">详情</a></div></div></div></div></div> <div data-title="其它" class="form-row"><div class="form-cell"><div class="inline fields"><label>财务报销：</label> <div class="inline"><div class="inline button-checked"><input tabindex="0" name="invoice" id="invoice" class="hidden" value="false" type="checkbox"> <label for="invoice">邮寄发票</label></div> <div class="form-cell-info">请务必正确填写发票信息及邮寄地址，否则我们无法为您邮寄发票！也可以在购买完成后到会员中心索取发票</div></div></div> <div class="inline fields"><label>协议合同：</label> <div class="inline"><div class="form-cell-info">如果需要纸质合同，请在购买完成后在会员中心下载。
                                    <a href="http://help.admui.com/hc/kb/article/1035530/" target="_blank">详情</a></div></div></div></div></div></div> <div class="five wide column"><div class="ui sticky" style="width: 324px !important; height: 377px !important;"><div id="order"><h4><i class="checkmark box icon"></i> 当前选择</h4> <div class="order-info"><div class="inline fields"><label>当前版本：</label><span>1.1.0</span></div> <div class="inline fields"><label>后端程序：</label><!----></div> <div class="inline fields"><label>前端源码：</label><!----><span>基础源码</span></div> <div class="inline fields"><label>经典主题：</label><span>经典主题</span></div> <div class="inline fields"><label>授权域名：</label><span>单个</span><!----><!----><!----></div> <!----> <div id="price" class="price"><label>共需支付：</label><span><b><small> ¥</small>3600</b><span></span></span></div></div> <button id="payment" type="button" tabindex="0" class="ui green button fluid" style="display: inline-block;"><i class="in payment icon"></i> 立即支付
                        </button> <div class="license" style="display: block;">
                            付款即代表同意<a href="/about#license" target="_blank">《EasyMis 授权协议》</a></div> <a href="#" class="ui orange button fluid openlogin">
                            请登录后购买
                        </a></div></div></div></form>
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
<script src="https://cdn.staticfile.org/jquery/2.1.4/jquery.min.js"></script>
<script src="http://cdn.bootcss.com/semantic-ui/2.2.6/semantic.min.js"></script>
<script src="https://cdn.staticfile.org/toastr.js/latest/js/toastr.min.js"></script>
<script src="http://admui.oss-cn-shenzhen.aliyuncs.com/site/js/main.js"></script>

<!-- 自定义js -->
<script>
	//严正声明！！！
	$(function(){
		$('.message .close').on('click', function() {
	    	$(this).closest('.message').transition('fade');
	    });
	});
</script>

<script src="https://cdn.staticfile.org/vue/2.1.7/vue.min.js"></script>
<script src="。。/../js/buy.js"></script>



<script src="//assets-cdn.kf5.com/supportbox/main.js?6" id="kf5-provide-supportBox" kf5-domain="admui.kf5.com" charset="utf-8"></script><iframe src="javascript:false" title="" style="display: none;"></iframe><link rel="styleSheet" type="text/css" href="//assets-cdn.kf5.com/supportbox_v2/css/supportBtn.css?v=6"><div class="kf5-support-chat kf5-chatSupport-right-bottom" style="position: relative;z-index: 2147483000"><div id="kf5-support-block" class="kf5-supportBox" style="display: none"><a id="kf5-close-btn" class="kf5-support-chat_close kf5-waves" href="javascript:;"></a><div id="kf5-loading" class="kf5-loading kf5-loading-md kf5-center" style="display: none;"></div><iframe id="kf5-widget-iframe" class="kf5-supportBox_iframe" scrolling="no" src="//admui.kf5.com/supportbox/index?active_in_iframe=0" frameborder="0"></iframe></div><div id="kf5-support-btn" style="color:#ffffff; background:#67B7F3;" class="kf5-chatSupport-btn kf5-chatSupport-style4 kf5-chatSupport-icon8 kf5-waves waves-effect waves-light"><span>在线客服</span><div id="msg-number" class="kf5-chatSupport_msgNumber" style="display: none"></div></div><div id="kf5-backdrop" class="kf5-backdrop" style="display: none;"><a class="kf5-backdrop-close">关闭</a><a href="" target="_blink"><img id="kf5-view-image" class="kf5-backdrop-img" src=""></a></div></div></body></html>