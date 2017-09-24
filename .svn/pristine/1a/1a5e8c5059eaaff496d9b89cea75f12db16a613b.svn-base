<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
%>
<div class="page animation-fade page-display">
    <div class="page-content">
        <form id="displayForm" class="form-horizontal padding-vertical-30">
        
            <div class="form-group">
                <label class="col-sm-2 control-label">导航条颜色：</label>
                <div class="col-sm-10" id="skintoolsNavbar">
                    <ul class="list-unstyled list-inline color-radio">
                        <li>
                            <div class="radio-custom radio-primary">
                                <input checked="" name="navigationColor" value="" type="radio"> <label></label>
                            </div>
                        </li>
                        <li>
                            <div class="radio-custom radio-brown">
                                <input name="navigationColor" value="bg-brown-600" type="radio"> <label></label>
                            </div>
                        </li>
                        <li>
                            <div class="radio-custom radio-cyan">
                                <input name="navigationColor" value="bg-cyan-600" type="radio"> <label></label>
                            </div>
                        </li>
                        <li>
                            <div class="radio-custom radio-green">
                                <input name="navigationColor" value="bg-green-600" type="radio"> <label></label>
                            </div>
                        </li>
                        <li>
                            <div class="radio-custom radio-grey">
                                <input name="navigationColor" value="bg-grey-600" type="radio"> <label></label>
                            </div>
                        </li>
                        <li>
                            <div class="radio-custom radio-indigo">
                                <input name="navigationColor" value="bg-indigo-600" type="radio"> <label></label>
                            </div>
                        </li>
                        <li>
                            <div class="radio-custom radio-orange">
                                <input name="navigationColor" value="bg-orange-600" type="radio"> <label></label>
                            </div>
                        </li>
                        <li>
                            <div class="radio-custom radio-pink">
                                <input name="navigationColor" value="bg-pink-600" type="radio"> <label></label>
                            </div>
                        </li>
                        <li>
                            <div class="radio-custom radio-purple">
                                <input name="navigationColor" value="bg-purple-600" type="radio"> <label></label>
                            </div>
                        </li>
                        <li>
                            <div class="radio-custom radio-red">
                                <input name="navigationColor" value="bg-red-600" type="radio"> <label></label>
                            </div>
                        </li>
                        <li>
                            <div class="radio-custom radio-teal">
                                <input name="navigationColor" value="bg-teal-600" type="radio"> <label></label>
                            </div>
                        </li>
                        <li>
                            <div class="radio-custom radio-yellow">
                                <input name="navigationColor" value="bg-yellow-700" type="radio"> <label></label>
                            </div>
                        </li>
                    </ul>
                    <div class="checkbox-custom checkbox-primary margin-top-10">
                        <input checked="" id="navbarDisplay" name="acrossFlag" value="navbar-inverse" type="checkbox">
                        <label for="navbarDisplay">通栏显示</label>
                    </div>
                </div>
            </div>
            <hr>
            <div class="form-group">
                <label class="col-sm-2 control-label">菜单主题：</label>
                <div class="col-sm-10">
                    <div class="btn-group bootstrap-select"><button type="button" class="btn dropdown-toggle btn-select" data-toggle="dropdown" data-id="skintoolsSidebar" title="深色主题"><span class="filter-option pull-left">深色主题</span>&nbsp;<span class="bs-caret"><span class="caret"></span></span></button><div class="dropdown-menu open"><ul class="dropdown-menu inner" role="menu"><li data-original-index="0" class="selected"><a tabindex="0" class="" style="" data-tokens="null"><span class="text">深色主题</span><span class="icon wb-check check-mark"></span></a></li><li data-original-index="1"><a tabindex="0" class="" style="" data-tokens="null"><span class="text">浅色主题</span><span class="icon wb-check check-mark"></span></a></li></ul></div><select data-plugin="selectpicker" id="skintoolsSidebar" name="menuTheme" class="" tabindex="-98">
                        <option value="site-menubar-dark" selected="">深色主题</option>
                        <option value="site-menubar-light">浅色主题</option>
                    </select></div>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">菜单显示：</label>
                <div class="col-sm-10">
                    <div class="radio-inline radio-custom radio-primary">
                        <input id="menuUnfold" checked="checked" name="menuDisplay" value="site-menubar-unfold" type="radio">
                        <label for="menuUnfold">默认展开</label>
                    </div>
                    <div class="radio-inline radio-custom radio-primary">
                        <input id="menuFold" name="menuDisplay" value="site-menubar-fold" type="radio">
                        <label for="menuFold">默认收起</label>
                    </div>
                    <div class="margin-top-10 hidden" id="menuFoldSetting">
                        <span>鼠标经过菜单时显示：</span>
                        <div class="btn-group btn-group-xs" data-toggle="buttons">
                            <label class="btn  btn-outline btn-dark active" for="textIconKeep">
                                <input id="textIconKeep" autocomplete="off" checked="" name="menuTxtIcon" value="site-menubar-keep" type="radio" hidden="hidden"> 文字
                            </label> <label class="btn btn-outline btn-dark" for="textIconAlt">
                            <input id="textIconAlt" autocomplete="off" name="menuTxtIcon" value="site-menubar-fold-alt" type="radio" hidden="hidden"> 图标
                        </label>
                        </div>
                    </div>
                    <span class="help-block">仅在可视区域宽度大于768px生效</span>
                </div>
            </div>
            <hr>
            <div class="form-group">
                <label class="col-sm-2 control-label">主题颜色：</label>
                <div class="col-sm-10" id="skintoolsPrimary">
                    <ul class="list-unstyled list-inline color-radio">
                        <li>
                            <div class="radio-custom radio-primary">
                                <input checked="" name="themeColor" value="primary" type="radio"> <label></label>
                            </div>
                        </li>
                        <li>
                            <div class="radio-custom radio-brown">
                                <input name="themeColor" value="brown" type="radio"> <label></label>
                            </div>
                        </li>
                        <li>
                            <div class="radio-custom radio-cyan">
                                <input name="themeColor" value="cyan" type="radio"> <label></label>
                            </div>
                        </li>
                        <li>
                            <div class="radio-custom radio-green">
                                <input name="themeColor" value="green" type="radio"> <label></label>
                            </div>
                        </li>
                        <li>
                            <div class="radio-custom radio-grey">
                                <input name="themeColor" value="grey" type="radio"> <label></label>
                            </div>
                        </li>
                        <li>
                            <div class="radio-custom radio-indigo">
                                <input name="themeColor" value="indigo" type="radio"> <label></label>
                            </div>
                        </li>
                        <li>
                            <div class="radio-custom radio-orange">
                                <input name="themeColor" value="orange" type="radio"> <label></label>
                            </div>
                        </li>
                        <li>
                            <div class="radio-custom radio-pink">
                                <input name="themeColor" value="pink" type="radio"> <label></label>
                            </div>
                        </li>
                        <li>
                            <div class="radio-custom radio-purple">
                                <input name="themeColor" value="purple" type="radio"> <label></label>
                            </div>
                        </li>
                        <li>
                            <div class="radio-custom radio-red">
                                <input name="themeColor" value="red" type="radio"> <label></label>
                            </div>
                        </li>
                        <li>
                            <div class="radio-custom radio-teal">
                                <input name="themeColor" value="teal" type="radio"> <label></label>
                            </div>
                        </li>
                        <li>
                            <div class="radio-custom radio-yellow">
                                <input name="themeColor" value="yellow" type="radio"> <label></label>
                            </div>
                        </li>
                    </ul>
                </div>
            </div>
            <hr>
            <div class="form-group">
                <label class="col-sm-2 control-label">Tab 页签：</label>
                <div class="col-sm-10">
                    <div class="radio-inline radio-custom radio-primary">
                        <input id="tabDisplayShow" checked="" name="tabFlag" value="site-contabs-open" type="radio">
                        <label for="tabDisplayShow">开启</label>
                    </div>
                    <div class="radio-inline radio-custom radio-primary">
                        <input id="tabDisplayHide" name="tabFlag" value="" type="radio">
                        <label for="tabDisplayHide">关闭</label>
                    </div>
                    <span class="help-block">Tab 页签必须保存以后才能看到效果</span>
                </div>
            </div>
            <hr>
            <div class="form-group">
                <div class="col-sm-10 col-sm-offset-2 margin-top-20">
                    <button type="submit" class="btn btn-primary" name="save" value="true">保存</button>
                    <button type="button" class="btn btn-outline btn-default" name="reset" value="reset" id="skintoolsReset">恢复默认
                    </button>
                </div>
            </div>
        </form>
    </div>
</div>