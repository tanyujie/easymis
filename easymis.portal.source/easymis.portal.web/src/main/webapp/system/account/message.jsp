
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
%>







<link rel="stylesheet" href="http://admui.oss-cn-shenzhen.aliyuncs.com/demo/1.1.0/css/system/account.css">
<link rel="stylesheet" href="http://admui.oss-cn-shenzhen.aliyuncs.com/demo/1.1.0/vendor/jquery-strength/jquery-strength.css">
<link rel="stylesheet" href="http://admui.oss-cn-shenzhen.aliyuncs.com/demo/1.1.0/vendor/alertify-js/alertify.css">
<div class="page animation-fade page-account">
    <div class="page-content">
        <div class="row">
            <div class="col-md-3">
                <div class="widget widget-shadow text-center">
                    <div class="widget-header">
                        <div class="widget-header-content">
                            <a class="avatar avatar-lg" href="javascript:;">
                                <img src="http://admui.oss-cn-shenzhen.aliyuncs.com/demo/1.1.0/images/avatar.svg" alt="xiaxuan@admui_demo">
                            </a>
                            <h4 class="account-user">xiaxuan@admui_demo</h4>
                            <p>上次登录：2017-8-5 18:41:46</p>
                        </div>
                    </div>
                    <div class="widget-footer">
                        <div class="row no-space">
                            <div class="col-xs-4">
                                <strong class="account-stat-count">44368</strong> <span>登录</span>
                            </div>
                            <div class="col-xs-4">
                                <strong class="account-stat-count msg-number">1252</strong> <span>消息</span>
                            </div>
                            <div class="col-xs-4">
                                <strong class="account-stat-count log-number">1270</strong> <span>日志</span>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-md-9">
                <div class="panel">
                    <div class="panel-body nav-tabs-animate">
                        <ul class="nav nav-tabs nav-tabs-line tabList" role="tablist">
                            <li class="news active" role="presentation" id="accountMsg">
                                <a href="/system/account/message?from=account" data-pjax="#accountContent" aria-expanded="true">
                                    <i class="icon fa-comment-o" aria-hidden="true"></i> 消息
                                    <span class="badge badge-danger">99+</span></a>
                            </li>
                            <li class="news " role="presentation" id="accountLog">
                                <a href="/system/account/log?from=account" data-pjax="#accountContent" aria-expanded="false">
                                    <i class="icon fa-file-text-o" aria-hidden="true"></i> 日志
                                </a>
                            </li>
                            <li class="news " role="presentation">
                                <a href="/system/account/password?from=account" data-pjax="#accountContent" aria-expanded="false">
                                    <i class="icon fa-key" aria-hidden="true"></i> 密码
                                </a>
                            </li>
                            <li class="news " role="presentation">
                                <a href="/system/account/display?from=account" data-pjax="#accountContent" aria-expanded="false">
                                    <i class="icon fa-magic" aria-hidden="true"></i> 显示
                                </a>
                            </li>
                        </ul>
                        <div class="tab-content margin-top-15">
                            <div class="animation-slide-left tab-message active" id="accountContent">
                                
								






<div id="messageLists">
        <div class="list-group list-group-full">
            
            <div class="list-group-item" role="menuitem" data-message-id="96409" data-title="欢迎您访问Admui演示系统" data-content="这是一条演示消息，通过websocket实时推送给前端用户。适用于消息类以及在线聊天类的应用场景，服务器端会主动将消息推送给浏览器端，无需浏览器端发起请求。">
                <div class="media">
                    <div class="media-left">
                        <i class="icon fa-tasks task white icon-circle" aria-hidden="true"></i>
                    </div>
                    <div class="media-body">
                        <h6 class="media-heading">
                            <a class="news-list" href="#">
                                
                                <i class="icon wb-medium-point red-600" aria-hidden="true"></i>  欢迎您访问Admui演示系统
                            </a>
                        </h6>
                        <time class="media-meta" datetime="2017-08-05 18:52:08">刚刚</time>
                    </div>
                    <div class="media-right">
                        
                        <a type="button" href="#" title="标为已读" class="btn btn-pure btn-default icon wb-check"></a>
                        
                    </div>
                </div>
            </div>
            
            <div class="list-group-item" role="menuitem" data-message-id="96402" data-title="欢迎您访问Admui演示系统" data-content="这是一条演示消息，通过websocket实时推送给前端用户。适用于消息类以及在线聊天类的应用场景，服务器端会主动将消息推送给浏览器端，无需浏览器端发起请求。">
                <div class="media">
                    <div class="media-left">
                        <i class="icon fa-tasks task white icon-circle" aria-hidden="true"></i>
                    </div>
                    <div class="media-body">
                        <h6 class="media-heading">
                            <a class="news-list" href="#">
                                
                                <i class="icon wb-medium-point red-600" aria-hidden="true"></i>  欢迎您访问Admui演示系统
                            </a>
                        </h6>
                        <time class="media-meta" datetime="2017-08-05 18:47:08">5分钟前</time>
                    </div>
                    <div class="media-right">
                        
                        <a type="button" href="#" title="标为已读" class="btn btn-pure btn-default icon wb-check"></a>
                        
                    </div>
                </div>
            </div>
            
            <div class="list-group-item" role="menuitem" data-message-id="96395" data-title="欢迎您访问Admui演示系统" data-content="这是一条演示消息，通过websocket实时推送给前端用户。适用于消息类以及在线聊天类的应用场景，服务器端会主动将消息推送给浏览器端，无需浏览器端发起请求。">
                <div class="media">
                    <div class="media-left">
                        <i class="icon fa-tasks task white icon-circle" aria-hidden="true"></i>
                    </div>
                    <div class="media-body">
                        <h6 class="media-heading">
                            <a class="news-list" href="#">
                                
                                <i class="icon wb-medium-point red-600" aria-hidden="true"></i>  欢迎您访问Admui演示系统
                            </a>
                        </h6>
                        <time class="media-meta" datetime="2017-08-05 18:42:08">10分钟前</time>
                    </div>
                    <div class="media-right">
                        
                        <a type="button" href="#" title="标为已读" class="btn btn-pure btn-default icon wb-check"></a>
                        
                    </div>
                </div>
            </div>
            
            <div class="list-group-item" role="menuitem" data-message-id="96388" data-title="欢迎您访问Admui演示系统" data-content="这是一条演示消息，通过websocket实时推送给前端用户。适用于消息类以及在线聊天类的应用场景，服务器端会主动将消息推送给浏览器端，无需浏览器端发起请求。">
                <div class="media">
                    <div class="media-left">
                        <i class="icon fa-tasks task white icon-circle" aria-hidden="true"></i>
                    </div>
                    <div class="media-body">
                        <h6 class="media-heading">
                            <a class="news-list" href="#">
                                
                                <i class="icon wb-medium-point red-600" aria-hidden="true"></i>  欢迎您访问Admui演示系统
                            </a>
                        </h6>
                        <time class="media-meta" datetime="2017-08-05 18:37:08">15分钟前</time>
                    </div>
                    <div class="media-right">
                        
                        <a type="button" href="#" title="标为已读" class="btn btn-pure btn-default icon wb-check"></a>
                        
                    </div>
                </div>
            </div>
            
            <div class="list-group-item" role="menuitem" data-message-id="96381" data-title="欢迎您访问Admui演示系统" data-content="这是一条演示消息，通过websocket实时推送给前端用户。适用于消息类以及在线聊天类的应用场景，服务器端会主动将消息推送给浏览器端，无需浏览器端发起请求。">
                <div class="media">
                    <div class="media-left">
                        <i class="icon fa-tasks task white icon-circle" aria-hidden="true"></i>
                    </div>
                    <div class="media-body">
                        <h6 class="media-heading">
                            <a class="news-list" href="#">
                                
                                <i class="icon wb-medium-point red-600" aria-hidden="true"></i>  欢迎您访问Admui演示系统
                            </a>
                        </h6>
                        <time class="media-meta" datetime="2017-08-05 18:32:08">20分钟前</time>
                    </div>
                    <div class="media-right">
                        
                        <a type="button" href="#" title="标为已读" class="btn btn-pure btn-default icon wb-check"></a>
                        
                    </div>
                </div>
            </div>
            
            <div class="list-group-item" role="menuitem" data-message-id="96374" data-title="欢迎您访问Admui演示系统" data-content="这是一条演示消息，通过websocket实时推送给前端用户。适用于消息类以及在线聊天类的应用场景，服务器端会主动将消息推送给浏览器端，无需浏览器端发起请求。">
                <div class="media">
                    <div class="media-left">
                        <i class="icon fa-tasks task white icon-circle" aria-hidden="true"></i>
                    </div>
                    <div class="media-body">
                        <h6 class="media-heading">
                            <a class="news-list" href="#">
                                
                                <i class="icon wb-medium-point red-600" aria-hidden="true"></i>  欢迎您访问Admui演示系统
                            </a>
                        </h6>
                        <time class="media-meta" datetime="2017-08-05 18:27:08">25分钟前</time>
                    </div>
                    <div class="media-right">
                        
                        <a type="button" href="#" title="标为已读" class="btn btn-pure btn-default icon wb-check"></a>
                        
                    </div>
                </div>
            </div>
            
            <div class="list-group-item" role="menuitem" data-message-id="96367" data-title="欢迎您访问Admui演示系统" data-content="这是一条演示消息，通过websocket实时推送给前端用户。适用于消息类以及在线聊天类的应用场景，服务器端会主动将消息推送给浏览器端，无需浏览器端发起请求。">
                <div class="media">
                    <div class="media-left">
                        <i class="icon fa-tasks task white icon-circle" aria-hidden="true"></i>
                    </div>
                    <div class="media-body">
                        <h6 class="media-heading">
                            <a class="news-list" href="#">
                                
                                <i class="icon wb-medium-point red-600" aria-hidden="true"></i>  欢迎您访问Admui演示系统
                            </a>
                        </h6>
                        <time class="media-meta" datetime="2017-08-05 18:22:08">30分钟前</time>
                    </div>
                    <div class="media-right">
                        
                        <a type="button" href="#" title="标为已读" class="btn btn-pure btn-default icon wb-check"></a>
                        
                    </div>
                </div>
            </div>
            
            <div class="list-group-item" role="menuitem" data-message-id="96360" data-title="欢迎您访问Admui演示系统" data-content="这是一条演示消息，通过websocket实时推送给前端用户。适用于消息类以及在线聊天类的应用场景，服务器端会主动将消息推送给浏览器端，无需浏览器端发起请求。">
                <div class="media">
                    <div class="media-left">
                        <i class="icon fa-tasks task white icon-circle" aria-hidden="true"></i>
                    </div>
                    <div class="media-body">
                        <h6 class="media-heading">
                            <a class="news-list" href="#">
                                
                                <i class="icon wb-medium-point red-600" aria-hidden="true"></i>  欢迎您访问Admui演示系统
                            </a>
                        </h6>
                        <time class="media-meta" datetime="2017-08-05 18:17:08">35分钟前</time>
                    </div>
                    <div class="media-right">
                        
                        <a type="button" href="#" title="标为已读" class="btn btn-pure btn-default icon wb-check"></a>
                        
                    </div>
                </div>
            </div>
            
            <div class="list-group-item" role="menuitem" data-message-id="96353" data-title="欢迎您访问Admui演示系统" data-content="这是一条演示消息，通过websocket实时推送给前端用户。适用于消息类以及在线聊天类的应用场景，服务器端会主动将消息推送给浏览器端，无需浏览器端发起请求。">
                <div class="media">
                    <div class="media-left">
                        <i class="icon fa-tasks task white icon-circle" aria-hidden="true"></i>
                    </div>
                    <div class="media-body">
                        <h6 class="media-heading">
                            <a class="news-list" href="#">
                                
                                <i class="icon wb-medium-point red-600" aria-hidden="true"></i>  欢迎您访问Admui演示系统
                            </a>
                        </h6>
                        <time class="media-meta" datetime="2017-08-05 18:12:08">40分钟前</time>
                    </div>
                    <div class="media-right">
                        
                        <a type="button" href="#" title="标为已读" class="btn btn-pure btn-default icon wb-check"></a>
                        
                    </div>
                </div>
            </div>
            
            <div class="list-group-item" role="menuitem" data-message-id="96346" data-title="欢迎您访问Admui演示系统" data-content="这是一条演示消息，通过websocket实时推送给前端用户。适用于消息类以及在线聊天类的应用场景，服务器端会主动将消息推送给浏览器端，无需浏览器端发起请求。">
                <div class="media">
                    <div class="media-left">
                        <i class="icon fa-tasks task white icon-circle" aria-hidden="true"></i>
                    </div>
                    <div class="media-body">
                        <h6 class="media-heading">
                            <a class="news-list" href="#">
                                 欢迎您访问Admui演示系统
                            </a>
                        </h6>
                        <time class="media-meta" datetime="2017-08-05 18:07:08">45分钟前</time>
                    </div>
                    <div class="media-right">
                        
                        <a type="button" href="#" title="删除" class="btn btn-pure btn-default icon wb-close"></a>
                        
                    </div>
                </div>
            </div>
            
        </div>
        <nav id="paging" data-page="1" data-max-page="126">
            <ul class="pager pager-sm margin-bottom-0">
                 
                <li class="next">
                    <a href="javascript:;">下一页 <span aria-hidden="true">→</span></a>
                </li>
                
            </ul>
        </nav>
		</div>


								
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>




