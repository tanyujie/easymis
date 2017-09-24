package com.ieker.ierp.bsb.action.front;

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
import com.ieker.ierp.bsb.entity.BsbInStorage;
import com.ieker.ierp.bsb.entity.BsbInStorageSub;
import com.ieker.ierp.bsb.entity.BsbStorage;
import com.ieker.ierp.bsb.manager.BsbInStorageMng;
import com.ieker.ierp.bsb.manager.BsbStorageMng;
import com.ieker.ierp.core.entity.CmsSite;
import com.ieker.ierp.core.entity.CmsUser;
import com.ieker.ierp.core.web.util.CmsUtils;
import com.ieker.ierp.core.web.util.FrontUtils;

/**
 * 组装单
 * @author lenovo-t
 *
 */
@Controller
public class BsbOutPackageAct {
	@RequestMapping(value = "/bsb/out/package/query.jspx")
	public String query(String leadsName, Integer follow, String leadsCatId, String contacts,Integer page, Integer pageSize,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		CmsUser user = CmsUtils.getUser(request);
		FrontUtils.frontData(request, model, site);
		if (user == null) {
			return FrontUtils.showLogin(request, model, site);
		}
		PageHelper.startPage(SimplePage.cpn(page), SimplePage.cps(pageSize));
		BsbInStorage param = new BsbInStorage();
		param.setOrgId(user.getOrgId());
		List<BsbInStorage> inStorageList = inStorageMng.getList(param);
		PageInfo<BsbInStorage> p = new PageInfo<BsbInStorage>(inStorageList);

		model.put("inStorageList", inStorageList);

		FrontUtils.frontData(request, model, site, p);
		return FrontUtils.getTplPath("/bsb/storage/package/out_package_list");
	}
	@RequestMapping(value = "/bsb/out/package/search.jspx")
	public String search(String prodId, Integer pageNo, Integer pageSize,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
/*			List<BsbSupplierCategory> sortList = sortMng.getList(new BsbSupplierCategory() );
		model.put("sortList", sortList);*/
		
		FrontUtils.frontData(request, model, site);
		return FrontUtils.getTplPath("/bsb/out/package/package_search");
	}
	/**
	 * 其他入库单
	 */
	@RequestMapping(value = "/bsb/out/package/add.jspx")
	public String otherInStorage(String businessName,String prodStatus,String prodCatId, Integer page, Integer pageSize,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		PageHelper.startPage(SimplePage.cpn(page), SimplePage.cps(pageSize));
		BsbInStorage param = new BsbInStorage();
		model.put("billDate", new Date());
		model.put("billNo", StrUtils.makePk());
		
		model.put("inStorageId", StrUtils.makePk());
		FrontUtils.frontData(request, model, site);
		return FrontUtils.getTplPath("/bsb/storage/package/out_package_add");
	}
	/**
	 * 其他入库单
	 */
	@RequestMapping(value = "/bsb/out/package/edit.jspx")
	public String otherInStorageEdit(String inStorageId,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		CmsUser user = CmsUtils.getUser(request);
		FrontUtils.frontData(request, model, site);
		if (user == null) {
			return FrontUtils.showLogin(request, model, site);
		}
		BsbInStorage inStorage = inStorageMng.findById(inStorageId);
		BsbInStorageSub sub = new BsbInStorageSub();
		sub.setInStorageId(inStorageId);
		List<BsbInStorageSub> subList=inStorageMng.getListOnInStorageSub(sub);
		BsbStorage param = new BsbStorage();
		param.setOrgId(user.getOrgId());
		List<BsbStorage> storageList = storageMng.getList(param);
		model.put("storageList", storageList);
		model.put("inStorage", inStorage);
		model.put("subList", subList);
		
		FrontUtils.frontData(request, model, site);
		return FrontUtils.getTplPath("/bsb/storage/package/out_package_edit");
	}
	/**
	 * 其他入库单
	 */
	@RequestMapping(value = "/bsb/out/package/update.jspx")
	public String otherInStorageUpdate(String inStorageId, String supplierId, String billNo, String billDate,
			Integer totalQuantity, Float totalAmount, Integer transType, String inStorageProducts,String depict,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		CmsUser user = CmsUtils.getUser(request);
		FrontUtils.frontData(request, model, site);
		if (user == null) {
			return FrontUtils.showLogin(request, model, site);
		}
		BsbInStorage param = inStorageMng.findById(inStorageId);
		param.setSupplierId(supplierId);
		param.setBillNo(billNo);
		if(billDate!=null&& !"".equals(billDate))
			param.setBillDate(DateUtils.toDate(billDate));		
		param.setTransType(transType);
		param.setDepict(depict);
		param.setOrgId(user.getOrgId());
		param.setCreatorId(user.getStaffId());
		param.setPrintStatus(0);
		param.setCreateTime(new Date());
		param.setTotalQuantity(totalQuantity);
		param.setTotalAmount(totalAmount);

		inStorageMng.update(param, inStorageProducts);
		FrontUtils.frontData(request, model, site);
		return FrontUtils.getTplPath("/bsb/storage/package/out_package_edit");
	}
	/**
	 * 其他入库单
	 */
	@RequestMapping(value = "/bsb/out/package/delete.jspx")
	public String otherInStorageDelete(String inStorageId,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		CmsUser user = CmsUtils.getUser(request);
		FrontUtils.frontData(request, model, site);
		if (user == null) {
			return FrontUtils.showLogin(request, model, site);
		}
		inStorageMng.deleteById(inStorageId);
		return "redirect:/bsb/storage/package/query.jspx";
	}
	@RequestMapping(value = "/bsb/out/package/save.jspx")
	public String otherInStorageSave(String supplierId, String billNo, String billDate,Integer totalQuantity,Float totalAmount, Integer transType,
			String inStorageProducts, String depict, HttpServletRequest request, HttpServletResponse response,
			ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		CmsUser user = CmsUtils.getUser(request);
		FrontUtils.frontData(request, model, site);
		if (user == null) {
			return FrontUtils.showLogin(request, model, site);
		}
		BsbInStorage param = new BsbInStorage();
		param.setSupplierId(supplierId);
		param.setBillNo(billNo);
		if(billDate!=null&& !"".equals(billDate))
			param.setBillDate(DateUtils.toDate(billDate));		
		param.setTransType(transType);
		param.setDepict(depict);
		param.setOrgId(user.getOrgId());
		param.setCreatorId(user.getStaffId());
		param.setPrintStatus(0);
		param.setCreateTime(new Date());
		param.setTotalQuantity(totalQuantity);
		param.setTotalAmount(totalAmount);

		inStorageMng.save(param, inStorageProducts);
		return "redirect:/bsb/storage/package/query.jspx";
	}
	@Autowired
	private BsbInStorageMng inStorageMng;
	@Autowired
	private BsbStorageMng storageMng;
}
