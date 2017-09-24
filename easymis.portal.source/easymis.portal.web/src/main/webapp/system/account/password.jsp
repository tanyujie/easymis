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
                            <p>上次登录：2017-7-30 11:51:41</p>
                        </div>
                    </div>
                    <div class="widget-footer">
                        <div class="row no-space">
                            <div class="col-xs-4">
                                <strong class="account-stat-count">41554</strong> <span>登录</span>
                            </div>
                            <div class="col-xs-4">
                                <strong class="account-stat-count msg-number">1137</strong> <span>消息</span>
                            </div>
                            <div class="col-xs-4">
                                <strong class="account-stat-count log-number">435</strong> <span>日志</span>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-md-9">
                <div class="panel">
                    <div class="panel-body nav-tabs-animate">
                        <ul class="nav nav-tabs nav-tabs-line tabList" role="tablist">
                            <li class="news  fv-form fv-form-bootstrap" role="presentation" id="accountMsg" novalidate="novalidate"><button type="submit" class="fv-hidden-submit" style="display: none; width: 0px; height: 0px;"></button>
                                <a href="/system/account/message?from=account" data-pjax="#accountContent" aria-expanded="true">
                                    <i class="icon fa-comment-o" aria-hidden="true"></i> 消息
                                    <span class="badge badge-danger"></span></a>
                            </li>
                            <li class="news" role="presentation" id="accountLog">
                                <a href="/system/account/log?from=account" data-pjax="#accountContent" aria-expanded="false">
                                    <i class="icon fa-file-text-o" aria-hidden="true"></i> 日志
                                </a>
                            </li>
                            <li class="news active" role="presentation">
                                <a href="/system/account/password?from=account" data-pjax="#accountContent" aria-expanded="false">
                                    <i class="icon fa-key" aria-hidden="true"></i> 密码
                                </a>
                            </li>
                            <li class="news" role="presentation">
                                <a href="/system/account/display?from=account" data-pjax="#accountContent" aria-expanded="false">
                                    <i class="icon fa-magic" aria-hidden="true"></i> 显示
                                </a>
                            </li>
                        </ul>
                        <div class="tab-content margin-top-15">
                            <div class="animation-slide-left tab-message active" id="accountContent">






<link rel="stylesheet" href="http://admui.oss-cn-shenzhen.aliyuncs.com/demo/1.1.0/vendor/alertify-js/alertify.css">
<link rel="stylesheet" href="http://admui.oss-cn-shenzhen.aliyuncs.com/demo/1.1.0/vendor/formvalidation/formValidation.css">

<div class="col-sm-6 col-sm-offset-3 margin-vertical-35">
    <form id="accountMsg">
        <div class="form-group">
            <h5>修改密码</h5>
        </div>
        <div class="form-group">
            <input name="oldPwd" class="form-control" placeholder="请输入原来的密码" autocomplete="off" type="password">
        </div>
        <div class="form-group">
            <div class="strength-container"><input name="newPwd" class="form-control strength-input" placeholder="请输入新密码" autocomplete="off" data-plugin="strength" type="password"><div class="strength-meter"><div class="strength-score"></div></div></div>
        </div>
        <div class="form-group">
            <input name="confirm" class="form-control" placeholder="请再次输入新密码" autocomplete="off" type="password">
        </div>
        <div class="form-group">
            <button type="submit" class="btn btn-primary">确认修改</button>
        </div>
    </form>
</div>





</div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>




