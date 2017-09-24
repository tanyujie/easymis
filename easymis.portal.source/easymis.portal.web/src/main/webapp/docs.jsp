<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
%>
<html style="transform-origin: left top 0px; transform: scale(1);" lang="zh-cn"><head>
    <title> EasyMis 开发文档</title>
    <meta charset="utf-8">
    <meta name="keywords" content="EasyMis,EasyMis官网,EasyMis框架,通用后台管理系统,后台框架,ui框架">
    <meta name="description" content="EasyMis 是一个基于最新 Web 技术的企业级通用管理系统快速开发框架，可以帮助企业极大的提高工作效率，节省开发成本，提升品牌形象">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1">
    <!--[if lte IE 9]>
    <meta http-equiv="refresh" content="0; url='http://www.admui.com/ie'" />
    <![endif]-->
    <meta name="renderer" content="webkit">
    <meta http-equiv="Cache-Control" content="no-siteapp">
    <meta name="mobile-web-app-capable" content="yes">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="apple-mobile-web-app-title" content="EasyMis">
    <meta name="msapplication-TileImage" content="http://admui.oss-cn-shenzhen.aliyuncs.com/site/img/app/icon-72@x2.png">
    <meta name="msapplication-TileColor" content="#395b81">
    <link rel="apple-touch-icon-precomposed" href="http://admui.oss-cn-shenzhen.aliyuncs.com/site/img/app/icon-72@x2.png">
    <link rel="shortcut icon" href="http://admui.oss-cn-shenzhen.aliyuncs.com/site/img/app/favicon.png">
    <meta name="msapplication-TileColor" content="#62a8ea">
    <script src="https://hm.baidu.com/hm.js?cd758c4c82a4964836712308cb782b12"></script><script>
        window.PAGE_TYPE = ""
        var _hmt = _hmt || [];
        (function() {
            var hm = document.createElement("script");
            hm.src = "https://hm.baidu.com/hm.js?cd758c4c82a4964836712308cb782b12";
            var s = document.getElementsByTagName("script")[0];
            s.parentNode.insertBefore(hm, s);
        })();
    </script>
    <link rel="stylesheet" href="http://admui.oss-cn-shenzhen.aliyuncs.com/docs/css/page.css">
</head>
<body>
<div id="mobile-bar">
    <a class="menu-button"></a>
    <a class="logo" href="/">EasyMis开发文档</a>
</div>
<div id="header">
    <a id="logo" href="/" style="font-size: 1.714rem;">EasyMis <span>EasyMis 开发文档</span>
    </a>
		<ul id="nav">
			<li><a href="<%=path%>/docs.jsp" class="nav-link">首页</a></li>
			<li><a href="<%=path%>/docs/guide.jsp" class="nav-link">介绍</a>
			</li>
			<li><a href="<%=path%>/docs/ui.jsp" class="nav-link">UI</a></li>
			<li><a href="<%=path%>/docs/java.jsp" class="nav-link">JAVA</a>
			</li>
			<li><a href="<%=path%>/docs/version.jsp" class="nav-link">版本</a>
			</li>

		</ul>
	</div>

<div class="sidebar home">
    <ul class="main-menu">
        <li>
    <a href="/" class="nav-link">首页</a>
</li>
<li>
    <a href="/guide/" class="nav-link">介绍</a>
</li>
<li>
    <a href="/ui/" class="nav-link">UI</a>
</li>
<li>
    <a href="/java/" class="nav-link">JAVA</a>
</li>
<li>
    <a href="/version/" class="nav-link">版本</a>
</li>

    </ul>
</div>
<div id="home">
    <div class="banner">
        <div class="banner-content">
            <h1>EasyMis 开发文档 <sup>v1.1.0</sup></h1>
            <p>
                <a class="btn" href="./guide/">基本介绍</a>
                <a class="btn outline" href="http://www.admui.com" target="_blank">访问官网</a>
            </p>
        </div>
    </div>
    <div class="section why">
        <h2>为什么选 EasyMis</h2>
        <div class="grid">
            <div class="col">
                <div class="item">
                    <h3>提供源码</h3>
                    <img src="http://admui.oss-cn-shenzhen.aliyuncs.com/docs/images/opensource.svg">
                    <p>提供所有源码，不存在任何加密混淆代码，安全全程可控</p>
                </div>
            </div>
            <div class="col">
                <div class="item">
                    <h3>开箱即用</h3>
                    <img src="http://admui.oss-cn-shenzhen.aliyuncs.com/docs/images/outofbox.svg">
                    <p>包含了管理系统常用的基础功能，为业务产品提供强有力的支持</p>
                </div>
            </div>
            <div class="col">
                <div class="item">
                    <h3>无限可能</h3>
                    <img src="http://admui.oss-cn-shenzhen.aliyuncs.com/docs/images/possibility.svg">
                    <p>借助于EasyMis，可以快速开发各种MIS系统，如CMS、OA、CRM、ERP、POS等</p>
                </div>
            </div>
        </div>
    </div>
    <div class="section document">
        <div class="grid">
            <div class="col">
                <div class="card">
                    <div class="card-content">
                        <img src="http://admui.oss-cn-shenzhen.aliyuncs.com/docs/images/guide.svg">
                        <h3>快速开始</h3>
                        <p>了解使用相关事项，为使用 EasyMis 奠定基础</p>
                    </div>
                    <a href="./guide/">查看文档</a>
                </div>
            </div>
            <div class="col">
                <div class="card">
                    <div class="card-content">
                        <img src="http://admui.oss-cn-shenzhen.aliyuncs.com/docs/images/ui.svg">
                        <h3>UI文档</h3>
                        <p>UI部分的详细文档，前端开发者阅读</p>
                    </div>
                    <a href="./ui/">查看文档</a>
                </div>
            </div>
            <div class="col">
                <div class="card">
                    <div class="card-content">
                        <img src="http://admui.oss-cn-shenzhen.aliyuncs.com/docs/images/java.svg">
                        <h3>Java文档</h3>
                        <p>Java部分的详细文档，适合Java开发者阅读</p>
                    </div>
                    <a href="./java/">查看文档</a>
                </div>
            </div>
        </div>
    </div>
    <div class="copyright">
        &copy; 2016
        <a href="http://admui.com/">EasyMis</a>
        ·
        <a href="#" target="_blank">意见反馈</a>
    </div>
</div>



<script src="http://admui.oss-cn-shenzhen.aliyuncs.com/docs/js/smooth-scroll.min.js"></script>
<script src="http://admui.oss-cn-shenzhen.aliyuncs.com/docs/js/common.js"></script>

<script src="http://cdnjs.cloudflare.com/ajax/libs/fastclick/1.0.6/fastclick.min.js"></script>
<script>
    document.addEventListener('DOMContentLoaded', function () {
        FastClick.attach(document.body);
    }, false);
</script>



</body></html>