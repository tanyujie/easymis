/**
 * 
 */
package cn.easymis.uc.web.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import cn.easymis.uc.service.CmsUserMng;


@Controller
public class LoginAction {
	private static final String LOG_ERR_MSG = "帐号或密码错误！";
	private static final String LOG_ERROR_MSG = "帐号或密码不能为空！";
	
	@Autowired
	private CmsUserMng userMng;
	@RequestMapping(value = "/login")
	public String login(HttpSession session, Model model, HttpServletRequest request) throws Exception {
		session.setAttribute("base", request.getContextPath());
		String userName = request.getParameter("name");// 账户名
		String passWord = request.getParameter("password");// 用户密码
		if (userName == null || passWord == null) {
			request.setAttribute("loginState", LOG_ERROR_MSG);
			return "login";
		} else {
			session.setAttribute("UserInfo", "");// 保存用户信息
		}
		return "index";

	}
	/**
	 * 用户退出系统方法
	 * @param request
	 * @param session
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/logout")
	public ModelAndView userLogout(HttpServletRequest request, HttpSession session) throws Exception {
		//设置session失效
		session.invalidate();
		return  new ModelAndView(new RedirectView("http://127.0.0.1/login.html")); 
	}

}
