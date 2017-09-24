<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
%>
<html dir="ltr" style="transform-origin: left top 0px; transform: scale(1);"><!--<![endif]--><head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta name="keywords" content="EasyMis,EasyMis官网,EasyMis框架,通用后台管理系统,后台框架,ui框架"><meta name="description" content="EasyMis 是一个基于最新 Web 技术的企业级通用管理系统快速开发框架，可以帮助企业极大的提高工作效率，节省开发成本，提升品牌形象">    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="_csrf" value="7e8b36c931f161253c717e389666836982f960db">
    <link rel="stylesheet" type="text/css" href="/library/ue/third-party/SyntaxHighlighter/shCoreDefault.css">
<link rel="stylesheet" type="text/css" href="//assets-cdn.kf5.com/help-center/css/theme_base.css?v=201707281845">
<link rel="stylesheet" type="text/css" href="//assets-cdn.kf5.com/help-center/css/theme_fonts.css">
<link rel="stylesheet" type="text/css" href="https://fs.kf5.com/generated/cssv2/style_d1b11d193b9d62b13d4185fa795032af.css?v=fbdc9014ca799cf0">
<link rel="stylesheet" type="text/css" href="https://fs.kf5.com/generated/cssv2/setting_d1b11d193b9d62b13d4185fa795032af.css?v=fbdc9014ca799cf0">
<script type="text/javascript" src="//assets-cdn.kf5.com/help-center/js/vendor/jquery-1.8.3.js"></script>
<script type="text/javascript" src="//assets-cdn.kf5.com/help-center/js/vendor/jquery.form.js"></script>
<script type="text/javascript" src="//assets-cdn.kf5.com/help-center/js/vendor/jquery-ui.1.11.0.min.js"></script>
<script type="text/javascript" src="//assets-cdn.kf5.com/help-center/js/application/dialog.js?v=201707281845"></script>
<script type="text/javascript" src="//assets-cdn.kf5.com/help-center/js/application/function.js?v=201707281845"></script>
<script type="text/javascript" src="/library/ue/ueditor.config.js"></script>
<script type="text/javascript" src="/library/ue/ueditor.min.js"></script>
<script type="text/javascript" src="/library/ue/third-party/SyntaxHighlighter/shCore.js"></script>
<script type="text/javascript" src="//assets-cdn.kf5.com/help-center/js/application/ueditor_insertimage_ui.js?v=201707281845"></script>
<script type="text/javascript">
/*&lt;![CDATA[*/
$.ajaxSetup({
        headers: {
            "X-CSRF-Token": "7e8b36c931f161253c717e389666836982f960db"
        }
    })
/*]]&gt;*/
</script>
<title>EasyMis框架 - 客户服务</title>
    <link rel="shortcut icon" type="image/x-icon" href="/upload/28399/201704/58e4690e6694a_999.ico">    <!--[if lt IE 9]>
    <script type="text/javascript" src="//assets-cdn.kf5.com/help-center/js/vendor/html5.js"></script>
    <script type="text/javascript">
        (function() {
            var e = "abbr, article, aside, audio, canvas, datalist, details, dialog, eventsource, figure, footer, header, hgroup, mark, menu, meter, nav, output, progress, section, time, video".split(', ');
            var i= e.length;
            while (i--){
                document.createElement(e[i]);
            }
        })();
    </script>
    <style type="text/css">
        article,aside,dialog,footer,header,section,footer,nav,figure,menu { display:block;}
    </style>
    <![endif]-->
    <!--请在这里编写顶部声明，将生成在页面head标签内-->
<link href="https://cdn.staticfile.org/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet"></head>
<body>

<header id="navbar">
    <div class="wrap clearfix">
        <a href="http://www.admui.com" class="logo"><img src="http://cdn.admui.com/site/img/logo.svg"></a>
        <a href="http://www.admui.com/?sendUrl=http%3a%2f%2fhelp.admui.com%2f#login" class="ucenter"><i class="fa fa-user"></i></a>
        <nav>
            <a href="http://www.admui.com/">首页</a>
            <a href="http://www.admui.com/buy.html">购买</a>
            <a href="http://www.admui.com/demo.html">演示</a>
            <a href="http://help.admui.com/" class="active">帮助</a>
            <a href="<%=path%>/docs.jsp" target="_blank">开发文档</a>
        </nav>
    </div>
</header>
<header class="header">
    <div class="wrap hader-inner clearfix">
        <h1 class="logo"><a href="http://www.admui.com/help.html">客户服务平台</a></h1>
        <nav class="header-nav">
            <ul class="header-nav-list clearfix">
                <li><a href="/hc/community/topic/" class="community-link">讨论社区</a></li>
                <li><a href="/hc/request/guest/" class="submit-a-request">提交新问题</a></li>
            </ul>
            <div class="user-nav clearfix">
                <div class="user-info dropdown">
                <div class="dropdown-toggle"><span class="user-info-name"><a href="/user/login/" class="login" role="button">登录</a></span></div></div>
                
            </div>
        </nav>
    </div>
</header><main>
	<section class="search-box">
        <form id="forum-search-form" accept-charset="UTF-8" action="/hc/search/results/" class="search" method="get" role="search">
                <div class="search-match">
                    <label for="top-search">
                        <input name="type" value="kb" type="hidden">
                        <input id="search" name="keyword" placeholder="输入问题关键字，找到答案" autocomplete="off" x-webkit-speech="" type="search">
                    </label>
                    <ul id="search-match-list" class="match-list"></ul>
                </div>
                <input name="" value="搜索" type="submit">
            </form>
	</section>
    <section class="content">
        <div class="wrap clearfix">
		    <section class="content-main">
                <div class="category-tree"><div class="category category-1003601">
                    <h2><a href="/hc/kb/category/1003601/">帮助支持</a></h2><div class="section section-1014666">
                            <h3><a href="/hc/kb/section/1014666/">产品购买</a></h3>
                            <ul class="article-list"><li><a href="/hc/kb/article/1035796/" title="EasyMis全部开源吗？">EasyMis全部开源吗？</a></li><li><a href="/hc/kb/article/1035790/" title="Admui可授权在多少个域名下使用？">EasyMis可授权在多少个域名下使用？</a></li><li><a href="/hc/kb/article/1039831/" title="升级产品的时候，如何选择版本？">升级产品的时候，如何选择版本？</a></li></ul><a href="/hc/kb/section/1014666/" class="more">查看全部7篇文档</a></div><div class="section section-1016207">
                            <h3><a href="/hc/kb/section/1016207/">开发工具</a></h3>
                            <ul class="article-list"></ul><span class="more">没有内容</span></div><div class="section section-1014671">
                            <h3><a href="/hc/kb/section/1014671/">产品演示</a></h3>
                            <ul class="article-list"></ul><span class="more">没有内容</span></div><div class="section section-1014673">
                            <h3><a href="/hc/kb/section/1014673/">订单相关</a></h3>
                            <ul class="article-list"><li><a href="/hc/kb/article/1035529/" title="未付款的有效期为多久？">未付款的有效期为多久？</a></li><li><a href="/hc/kb/article/1035526/" title="为什么找不到开具合同的入口">为什么找不到开具合同的入口</a></li><li><a href="/hc/kb/article/1035525/" title="为什么找不到索取发票的入口">为什么找不到索取发票的入口</a></li></ul><a href="/hc/kb/section/1014673/" class="more">查看全部3篇文档</a></div><div class="section section-1014649">
                            <h3><a href="/hc/kb/section/1014649/">发票及合同</a></h3>
                            <ul class="article-list"><li><a href="/hc/kb/article/1035530/" title="合同申请流程">合同申请流程</a></li><li><a href="/hc/kb/article/1035474/" title="发票申请流程">发票申请流程</a></li><li><a href="/hc/kb/article/1035498/" title="个人的类型为什么只能开具“个人”抬头？">个人的类型为什么只能开具“个人”抬头？</a></li></ul><a href="/hc/kb/section/1014649/" class="more">查看全部6篇文档</a></div></div></div>
			</section>
            <section class="content-sidebar">
                
                <div class="widget-column promoted-articles"><h3>被推荐的文档</h3><ul><li><a href="/hc/kb/article/1035506/" title="EasyMis购买常见问题">EasyMis购买常见问题</a></li></ul></div>
            </section>
        </div>
    </section>
</main><footer id="footer">
    <div class="link">
        <a href="http://www.admui.com/about.html">关于我们</a>
        ·
        <a href="http://www.admui.com/about.html#agreement">用户协议</a>
        ·
        <a href="http://www.admui.com/about.html#duty">免责声明</a>
        ·
        <a href="http://www.admui.com/about.html#privacy">隐私保护</a>
        ·
        <a href="http://weibo.com/admui" target="_blank"><i class="fa fa-weibo"></i> 微博</a>
    </div>
    <div class="wrap clearfix copyright">
        <i class="fa fa-copyright"></i> 2016 EasyMis
    </div>
</footer>
<script type="text/javascript" src="https://fs.kf5.com/generated/jsv2/application_d1b11d193b9d62b13d4185fa795032af.js?v=fbdc9014ca799cf0"></script>
<script type="text/javascript" src="//assets-cdn.kf5.com/help-center/js/vendor/ajaxupload.3.5.js"></script>
<script type="text/javascript" src="//assets-cdn.kf5.com/help-center/js/vendor/autosize.min.js"></script>
<script type="text/javascript" src="//assets-cdn.kf5.com/help-center/js/vendor/jquery-scrolltofixed-min.js"></script>
<script type="text/javascript">
/*&lt;![CDATA[*/

            $("#forum-search-form").submit(function(){
                if($("#search").val()==""){
                    showNotice("请输入搜索的关键字",false);
                    return false;
                }
            });
        

		$("#search").keyup(function(){
			$.get("/posts/matchkeyword/",{keyword:$("#search").val()},function(data){
				if(data){
					$("#search-match-list").html(data).show();
				}else{
					$("#search-match-list").hide();
				}
			});
		});

		function selectKeyword(obj){
			$("#search").val(obj.text());
			post_search(1);
		}

		function post_search(){
			$("#search-match-list").hide();
			$("#forum-search-form").submit();
		}
	


	SyntaxHighlighter.all();

	$("body").click(function(event){
		if($(event.target).data("type") != "select"){
			$(".js-select .options-ul").hide();
		}
	});
	
    function set_language(lang){
        $.post("/user/changelanguage/",{type:"change_language",language:lang,url:"/hc/"},function(res){
        	if(!res.error){
        		window.location.href = res.url;
        	}
        });
    }

	//页面初始时的纵向滚动条样式
	window.htmlInitScrollStyle = "";

	//隐藏页面的纵向滚动条
    function hiddenHtmlScroll(){
    	window.htmlInitScrollStyle = $("html").css("overflow-y");
    	$("html").css("overflow-y", "hidden");
    }

	//显示页面的纵向滚动条
	function showHtmlScroll(){
		if(window.htmlInitScrollStyle){
			$("html").css("overflow-y", window.htmlInitScrollStyle)
		}
	}

	//显示一个页面遮罩层
	function showLockLayer(queryString){
		if(queryString != undefined){
			$(queryString).show();
		}
		hiddenHtmlScroll();
	}

	//隐藏一个页面遮罩层
	function hiddenLockLayer(queryString){
		if(queryString != undefined){
			$(queryString).hide();
		}
		showHtmlScroll();
	}
	
	function question_pop() {
        var answer_btn = $(".answer");
        answer_btn.live("click",function(event) {
            $(this).parents(".question-comment-item-bottom").toggleClass("show");
        });
    }
    question_pop();

    function js_select() {
        var select = $(".js-select");
        var title = $(".js-select").find(".title");
        var box = $(".js-select").find("ul");
        var item = box.find("a");
        title.click(function() {
            box.not($(this).siblings("ul")).hide();
            $(this).next("ul").fadeToggle(200);
        });
        select.each(function(){
            var oriSelect = $(this).parent().find("select");
            if(oriSelect.length){
                var oriSelectId = oriSelect.attr("id");
                if(oriSelectId){
                    var oriSelectIdStrArr=oriSelectId.split("_");
                    if(oriSelectIdStrArr.length==2){
                        oriSelect.attr("name", oriSelectIdStrArr[0]+"["+oriSelectIdStrArr[1]+"]");
                    }
                    if(oriSelectIdStrArr.length==3){
                        oriSelect.attr("name", oriSelectIdStrArr[0]+"["+oriSelectIdStrArr[1]+"_"+oriSelectIdStrArr[2]+"]");
                    }
                    var oriSelectVal=oriSelect.val();
                    var oriSelectValIndex=0;
                    oriSelect.find("option").each(function(){
                        if($(this).attr("value")==oriSelectVal){
                            oriSelectValIndex=$(this).index();
                        }
                    });
                    $(this).find("ul li").eq(oriSelectValIndex).addClass("active");
					var panel = $("#panel_"+oriSelectId);
					if(panel.length &amp;&amp; oriSelect.val()){
						panel.find(".form-section").hide();
						panel.find("[cascade_value=\""+oriSelect.val()+"\"]").parent().show();
					}
                }
            }
        });
        item.click(function(event) {
			var option = $(this).html();
			$(this).parents("li").addClass("active").siblings().removeClass("active")
            $(this).parents(".js-select").find(".title").html(option);
            $(this).parents("ul").fadeOut(200);
            var index=$(this).parent().index();
            var oriSelect=$(this).parent().parent().parent().parent().find("select");
            if(oriSelect.length){
				var optionItem=oriSelect.find("option").eq(index);
				oriSelect.find("option").removeAttr("selected");
				optionItem.attr("selected", "selected");
				oriSelect.val(optionItem.attr("value"));
				if(oriSelect.attr("id")){
					var panel=$("#panel_"+oriSelect.attr("id"));
					if(panel.length){
						var val=oriSelect.val();
						if(val){
							panel.find(".form-section").hide();
							panel.find("[cascade_value=\""+val+"\"]").parent().show();
							panel.show();
						}else{
							panel.hide();
						}
					}
				}
			}
        });
    }
    js_select();

    function tip() {
		var js_tip = $(".tooltip");
		js_tip.hover(function() {
			var text = $(this).attr("title");
			var w = $(this).innerWidth();
			var h = $(this).innerHeight();
			var x = $(this).offset().left;
			var y = $(this).offset().top;
			$(this).attr("title", "");
			var $tip_main = $("&lt;div class=\"tip-main\"&gt;&lt;/div&gt;").appendTo("body").html("&lt;i&gt;&lt;/i&gt;" + text);
			var t_w = $tip_main.innerWidth();
			$tip_main.fadeIn(400).css({
                left: x - (t_w / 2) + (w / 2),
                top: h + y + 10
            });
        }, function() {
			var text = $(".tip-main:last").text(); //注意是最后一个对象的原因
			$(this).attr("title", text);
			$(".tip-main").fadeOut(100, function() {
				$(this).remove();
			});
		});
	}
    tip();

    $(".wechat").click(function(){
		$(this).find(".qr-box").fadeToggle(400);
	})

    $(document).ready(function() {
		$(".js-scroll-fixed").scrollToFixed({ marginTop: 10});
    });

    autosize($("textarea"));
    
	var user_id = parseInt("0");
	
	var setNewMessageCount = function(count){
		count = parseInt(count);
		if(count){
			if(!$(".user-info .msg-number").length){
				var msgNumber = $("&lt;span class=\"msg-number\"&gt;0&lt;/span&gt;");
				msgNumber.hide();
				msgNumber.prependTo(".user-nav .user-info");
				var msgNumber2 = $("&lt;span class=\"msg-num\"&gt;0&lt;/span&gt;");
				msgNumber2.hide();
				msgNumber2.appendTo(".user-info-menu li:eq(0) a");
				var msgNumber3 = $("&lt;span&gt;&lt;/span&gt;");
				msgNumber3.hide();
				msgNumber3.appendTo(".user-center-nav li:eq(0) a");
			}
			$(".user-info .msg-number").html(count).show();
			$(".user-center-nav li span").html(count).show();
			$(".user-info-menu .msg-num").html(count).show();
		}else{
			$(".user-info .msg-number").hide();
			$(".user-center-nav li span").hide();
			$(".user-info-menu .msg-num").hide();
		}
	};
	
	if(user_id){
		setInterval(function(){
			$.get("/hc/message/count/", function(res){
				setNewMessageCount(res.newCount);
			});
		}, 10000);
	}


/*]]&gt;*/
</script>

</body></html>