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
import com.ieker.ierp.bsb.entity.BsbCodeRule;
import com.ieker.ierp.bsb.manager.BsbCodeRuleMng;
import com.ieker.ierp.bsb.manager.BsbSupplierMng;
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
public class BsbCodeRuleAct {

	@RequestMapping(value = "/bsb/coderule/query.jspx")
	public String query(Integer page, Integer pageSize,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		CmsUser user = CmsUtils.getUser(request);
		PageHelper.startPage(SimplePage.cpn(page), 999);
		BsbCodeRule param = new BsbCodeRule();
		param.setOrgId(user.getOrgId());
		List<BsbCodeRule> codeRulelList = codeRuleMng.getList(param);
		PageInfo<BsbCodeRule> p = new PageInfo<BsbCodeRule>(codeRulelList);
		model.put("codeRulelList", codeRulelList);
		FrontUtils.frontData(request, model, site, p);

		return FrontUtils.getTplPath("/bsb/coderule/coderule_list");
	}
	@RequestMapping(value = "/bsb/coderule/add.jspx", method = RequestMethod.GET)
	public String add(String prodId, Integer pageNo, Integer pageSize,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		List<BsbCodeRule> sortList = codeRuleMng.getList(new BsbCodeRule() );
		model.put("sortList", sortList);
		
		FrontUtils.frontData(request, model, site);
		return FrontUtils.getTplPath("/bsb/coderule/coderule_add");
	}
	@RequestMapping(value = "/bsb/coderule/edit.jspx", method = RequestMethod.GET)
	public String edit(String prodId, Integer pageNo, Integer pageSize,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);

		return FrontUtils.getTplPath("/bsb/coderule/coderule_edit");
	}
	@RequestMapping(value = "/bsb/coderule/update.jspx", method = RequestMethod.POST)
	public String update(String prodId,String cateId, String brandId,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);

		FrontUtils.frontData(request, model, site);
		return FrontUtils.getTplPath("productList");
	}
	@RequestMapping(value = "/bsb/coderule/delete.jspx")
	public String del(String supplierId, HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		supplierMng.deleteById(supplierId);
		return "redirect:/bsb/coderule/query.jspx";
	}
	@RequestMapping(value = "/bsb/coderule/save.jspx", method = RequestMethod.POST)
	public String save(String supplierName, String contacts,String phone,Integer pageNo, Integer pageSize,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		CmsUser user = CmsUtils.getUser(request);
		BsbCodeRule bean = new BsbCodeRule();
		bean.setOrgId(user.getOrgId());
/*		bean.setName(name);
		bean.setStartNo(startNo);
		//bean.setContacts(contacts);
		bean.setPhone(phone);*/
		codeRuleMng.save(bean);
		return "redirect:/bsb/coderule/query.jspx";
	}

	@Autowired
	private BsbSupplierMng supplierMng;
	@Autowired
	private BsbCodeRuleMng codeRuleMng;

}
