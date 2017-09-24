package cn.easymis.scm.web;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ieker.common.util.DateUtils;
import com.ieker.common.util.StrUtils;
import com.ieker.common.web.page.SimplePage;
import com.ieker.ierp.bsb.entity.BsbCostAdjust;
import com.ieker.ierp.bsb.entity.BsbCostAdjustSub;
import com.ieker.ierp.bsb.entity.BsbStorage;
import com.ieker.ierp.bsb.manager.BsbCostAdjustMng;
import com.ieker.ierp.bsb.manager.BsbStorageMng;
import com.ieker.ierp.core.entity.CmsSite;
import com.ieker.ierp.core.entity.CmsUser;
import com.ieker.ierp.core.web.util.CmsUtils;
import com.ieker.ierp.core.web.util.FrontUtils;
@Controller
public class BsbCostAdjustAct {
	@RequestMapping(value = "/bsb/costAdjust/query.jspx")
	public String query(String leadsName, Integer follow, String leadsCatId, String contacts,Integer page, Integer pageSize,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		CmsUser user = CmsUtils.getUser(request);
		FrontUtils.frontData(request, model, site);
		if (user == null) {
			return FrontUtils.showLogin(request, model, site);
		}
		PageHelper.startPage(SimplePage.cpn(page), SimplePage.cps(pageSize));
		BsbCostAdjust param = new BsbCostAdjust();
		param.setOrgId(user.getOrgId());
		List<BsbCostAdjust> costAdjustList = costAdjustMng.getList(param);
		PageInfo<BsbCostAdjust> p = new PageInfo<BsbCostAdjust>(costAdjustList);

		model.put("costAdjustList", costAdjustList);

		FrontUtils.frontData(request, model, site, p);
		return FrontUtils.getTplPath("/bsb/storage/cost/cost_adjust_list");
	}

	@RequestMapping(value = "/bsb/costAdjust/add.jspx")
	public String costAdjust(String businessName,String prodStatus,String prodCatId, Integer page, Integer pageSize,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		CmsUser user = CmsUtils.getUser(request);
		FrontUtils.frontData(request, model, site);
		if (user == null) {
			return FrontUtils.showLogin(request, model, site);
		}
		
		model.put("costAdjustId", StrUtils.makePk());
		FrontUtils.frontData(request, model, site);
		return FrontUtils.getTplPath("/bsb/storage/cost/cost_adjust_add");
	}
	@RequestMapping(value = "/bsb/costAdjust/edit.jspx")
	public String otherInStorageEdit(String costAdjustId,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		CmsUser user = CmsUtils.getUser(request);
		FrontUtils.frontData(request, model, site);
		if (user == null) {
			return FrontUtils.showLogin(request, model, site);
		}
		BsbCostAdjust costAdjust = costAdjustMng.findById(costAdjustId);
		BsbCostAdjustSub sub = new BsbCostAdjustSub();
		sub.setCostAdjustId(costAdjustId);
		List<BsbCostAdjustSub> subList=costAdjustMng.getListOnCostAdjustSub(sub);
		BsbStorage param = new BsbStorage();
		param.setOrgId(user.getOrgId());
		List<BsbStorage> storageList = storageMng.getList(param);
		model.put("storageList", storageList);
		model.put("costAdjust", costAdjust);
		model.put("subList", subList);
		
		FrontUtils.frontData(request, model, site);
		return FrontUtils.getTplPath("/bsb/storage/cost/cost_adjust_edit");
	}
	@RequestMapping(value = "/bsb/costAdjust/update.jspx")
	public String otherInStorageUpdate(String costAdjustId, String supplierId, String billNo, String billDate,
			Integer totalQuantity, Float totalAmount, Integer transType, String costAdjustProducts,String depict,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		CmsUser user = CmsUtils.getUser(request);
		FrontUtils.frontData(request, model, site);
		if (user == null) {
			return FrontUtils.showLogin(request, model, site);
		}
		BsbCostAdjust param = costAdjustMng.findById(costAdjustId);
		param.setCostAdjustId(costAdjustId);
		param.setBillNo(billNo);
		if(billDate!=null&& !"".equals(billDate))
			param.setBillDate(DateUtils.toDate(billDate));		
		param.setTransType(transType);
		param.setDepict(depict);
		param.setOrgId(user.getOrgId());
		param.setCreatorId(user.getStaffId());
		param.setPrintStatus(0);
		param.setCreateTime(new Date());

		costAdjustMng.update(param, costAdjustProducts);
		FrontUtils.frontData(request, model, site);
		return "redirect:/bsb/costAdjust/query.jspx";
	}
	@RequestMapping(value = "/bsb/costAdjust/delete.jspx")
	public String otherInStorageDelete(String costAdjustId,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		CmsUser user = CmsUtils.getUser(request);
		FrontUtils.frontData(request, model, site);
		if (user == null) {
			return FrontUtils.showLogin(request, model, site);
		}
		costAdjustMng.deleteById(costAdjustId);
		return "redirect:/bsb/costAdjust/query.jspx";
	}
	@RequestMapping(value = "/bsb/costAdjust/save.jspx")
	public String costAdjustSave(String costAdjustId,String billNo,String billDate,Integer transType, String costAdjustProducts,String depict,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		CmsUser user = CmsUtils.getUser(request);
		FrontUtils.frontData(request, model, site);
		if (user == null) {
			return FrontUtils.showLogin(request, model, site);
		}
		BsbCostAdjust param = new BsbCostAdjust();
		param.setCostAdjustId(costAdjustId);
		param.setBillNo(billNo);
		if(billDate!=null&& !"".equals(billDate))
			param.setBillDate(DateUtils.toDate(billDate));		
		param.setTransType(transType);
		param.setDepict(depict);
		param.setOrgId(user.getOrgId());
		param.setCreatorId(user.getStaffId());
		param.setPrintStatus(0);
		param.setCreateTime(new Date());

		costAdjustMng.save(param, costAdjustProducts);
		return "redirect:/bsb/costAdjust/query.jspx";
	}
	@Autowired
	private BsbCostAdjustMng costAdjustMng;
	@Autowired
	private BsbStorageMng storageMng;
}
