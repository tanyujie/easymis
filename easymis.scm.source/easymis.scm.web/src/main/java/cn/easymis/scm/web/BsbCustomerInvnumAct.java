package cn.easymis.scm.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ieker.common.web.page.SimplePage;
import com.ieker.ierp.bsb.entity.BsbCustomerInvnum;
import com.ieker.ierp.bsb.entity.BsbCustomerInvnum;
import com.ieker.ierp.bsb.manager.BsbCustomerInvnumMng;
import com.ieker.ierp.core.entity.CmsSite;
import com.ieker.ierp.core.entity.CmsUser;
import com.ieker.ierp.core.web.util.CmsUtils;
import com.ieker.ierp.core.web.util.FrontUtils;
/**
 * 客戶编码规则
 * @author lenovo-t
 *
 */
@Controller
public class BsbCustomerInvnumAct {

	@RequestMapping(value = "/bsb/customer/invnum/query.jspx")
	public String query(String supplierName,String type,Integer page, Integer pageSize,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		CmsUser user = CmsUtils.getUser(request);
		PageHelper.startPage(SimplePage.cpn(page), 999);
		BsbCustomerInvnum param = new BsbCustomerInvnum();
		param.setOrgId(user.getOrgId());
		List<BsbCustomerInvnum> customerInvnumList = invnumMng.getList(param);
		PageInfo<BsbCustomerInvnum> p = new PageInfo<BsbCustomerInvnum>(customerInvnumList);
		model.put("customerInvnumList", customerInvnumList);
		FrontUtils.frontData(request, model, site, p);

		return FrontUtils.getTplPath("/bsb/customer/invnum/invnum_list");
	}
	@RequestMapping(value = "/bsb/customer/invnum/add.jspx", method = RequestMethod.GET)
	public String add(String prodId, Integer pageNo, Integer pageSize,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		List<BsbCustomerInvnum> sortList = invnumMng.getList(new BsbCustomerInvnum() );
		model.put("sortList", sortList);
		
		FrontUtils.frontData(request, model, site);
		return FrontUtils.getTplPath("/bsb/customer/invnum/invnum_add");
	}
	@RequestMapping(value = "/bsb/customer/invnum/edit.jspx", method = RequestMethod.GET)
	public String edit(String prodId, Integer pageNo, Integer pageSize,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);

		return FrontUtils.getTplPath("/bsb/customer/invnum/invnum_edit");
	}
	@RequestMapping(value = "/bsb/customer/invnum/update.jspx", method = RequestMethod.POST)
	public String update(String prodId,String cateId, String brandId,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);

		FrontUtils.frontData(request, model, site);
		return FrontUtils.getTplPath("productList");
	}
	@RequestMapping(value = "/bsb/customer/invnum/delete.jspx")
	public String del(String supplierId, HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		invnumMng.deleteById(supplierId);
		return "redirect:/bsb/customer/invnum/query.jspx";
	}
	@RequestMapping(value = "/bsb/customer/invnum/save.jspx", method = RequestMethod.POST)
	public String save(String supplierName, String contacts,String phone,Integer pageNo, Integer pageSize,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		CmsUser user = CmsUtils.getUser(request);
		BsbCustomerInvnum bean = new BsbCustomerInvnum();
		bean.setOrgId(user.getOrgId());
		invnumMng.save(bean);
		return "redirect:/bsb/customer/invnum/query.jspx";
	}

	@Autowired
	private BsbCustomerInvnumMng invnumMng;

}
