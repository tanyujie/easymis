package com.ieker.ierp.bsb.action.front;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ieker.common.util.DateUtils;
import com.ieker.common.util.StrUtils;
import com.ieker.common.web.page.SimplePage;
import com.ieker.ierp.bsb.entity.BsbOutStorage;
import com.ieker.ierp.bsb.entity.BsbOutStorageSub;
import com.ieker.ierp.bsb.entity.BsbProduct;
import com.ieker.ierp.bsb.entity.BsbStorage;
import com.ieker.ierp.bsb.entity.BsbStorageProduct;
import com.ieker.ierp.bsb.manager.BsbOutStorageMng;
import com.ieker.ierp.bsb.manager.BsbProductMng;
import com.ieker.ierp.bsb.manager.BsbStorageMng;
import com.ieker.ierp.core.entity.CmsSite;
import com.ieker.ierp.core.entity.CmsUser;
import com.ieker.ierp.core.web.util.CmsUtils;
import com.ieker.ierp.core.web.util.FrontUtils;
@Controller
public class BsbOutStorageAct {
	@RequestMapping(value = "/bsb/outStorage/query.jspx")
	public String query(String leadsName, Integer follow, String leadsCatId, String contacts,Integer page, Integer pageSize,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		CmsUser user = CmsUtils.getUser(request);
		FrontUtils.frontData(request, model, site);
		if (user == null) {
			return FrontUtils.showLogin(request, model, site);
		}
		PageHelper.startPage(SimplePage.cpn(page), SimplePage.cps(pageSize));
		BsbOutStorage param = new BsbOutStorage();
		param.setOrgId(user.getOrgId());
		List<BsbOutStorage> outStorageList = outStorageMng.getList(param);
		PageInfo<BsbOutStorage> p = new PageInfo<BsbOutStorage>(outStorageList);

		model.put("outStorageList", outStorageList);

		FrontUtils.frontData(request, model, site, p);
		return FrontUtils.getTplPath("/bsb/storage/out/out_storage_list");
	}
	@RequestMapping(value = "/bsb/outStorage/search.jspx")
	public String search(String prodId, Integer pageNo, Integer pageSize,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
/*			List<BsbSupplierCategory> sortList = sortMng.getList(new BsbSupplierCategory() );
		model.put("sortList", sortList);*/
		
		FrontUtils.frontData(request, model, site);
		return FrontUtils.getTplPath("/bsb/storage/out/out_storage_search");
	}
	/**
	 * 其他出库单
	 */
	@RequestMapping(value = "/bsb/scm/otherOutStorage.jspx")
	public String otherOutStorage(String businessName,String prodStatus,String prodCatId, Integer page, Integer pageSize,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		CmsUser user = CmsUtils.getUser(request);
		FrontUtils.frontData(request, model, site);
		if (user == null) {
			return FrontUtils.showLogin(request, model, site);
		}
		model.put("billDate", new Date());
		model.put("billNo", StrUtils.makePk());
		model.put("outStorageId", StrUtils.makePk());
		
		FrontUtils.frontData(request, model, site);
		return FrontUtils.getTplPath("/bsb/storage/out/out_storage_add");
	}
	@RequestMapping(value = "/bsb/outStorage/edit.jspx")
	public String otherOutStorageEdit(String outStorageId,String prodStatus,String prodCatId, Integer page, Integer pageSize,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		CmsUser user = CmsUtils.getUser(request);
		FrontUtils.frontData(request, model, site);
		if (user == null) {
			return FrontUtils.showLogin(request, model, site);
		}
		BsbOutStorage outStorage = outStorageMng.findById(outStorageId);
		BsbOutStorageSub sub = new BsbOutStorageSub();
		sub.setOutStorageId(outStorageId);
		List<BsbOutStorageSub> subList=outStorageMng.getListOnOutStorageSub(sub);
		BsbStorage param = new BsbStorage();
		param.setOrgId(user.getOrgId());
		List<BsbStorage> storageList = storageMng.getList(param);
		model.put("storageList", storageList);
		model.put("outStorage", outStorage);
		model.put("subList", subList);
		
		FrontUtils.frontData(request, model, site);
		return FrontUtils.getTplPath("/bsb/storage/out/out_storage_edit");
	}
	@RequestMapping(value = "/bsb/outStorage/update.jspx")
	public String otherOutStorageUpdate(String outStorageId,String customerId,String billNo,String billDate,Integer transType, String outStorageProducts,String depict,
			Integer totalQuantity,Float totalAmount,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		CmsUser user = CmsUtils.getUser(request);
		FrontUtils.frontData(request, model, site);
		if (user == null) {
			return FrontUtils.showLogin(request, model, site);
		}
		BsbOutStorage param = outStorageMng.findById(outStorageId);
		param.setCustomerId(customerId);
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

		outStorageMng.update(param, outStorageProducts);		
		FrontUtils.frontData(request, model, site);
		return "redirect:/bsb/outStorage/query.jspx";
	}
	@RequestMapping(value = "/bsb/outStorage/delete.jspx")
	public String otherOutStorageDelete(String outStorageId,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		CmsSite site = CmsUtils.getSite(request);
		CmsUser user = CmsUtils.getUser(request);
		FrontUtils.frontData(request, model, site);
		if (user == null) {
			return FrontUtils.showLogin(request, model, site);
		}
		
		String[] ids=outStorageId.split(",");
		for(int i=0;i<ids.length;i++)
			outStorageMng.deleteById(ids[i]);
		return "redirect:/bsb/outStorage/query.jspx";
	}

	@RequestMapping(value = "/bsb/outStorage/save.jspx")
	@ResponseBody
	public Map<String, Object> otherInStorageSave(String customerId,String billNo,String billDate,Integer transType, String outStorageProducts,String depict,
			Integer totalQuantity,Float totalAmount,
			HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		Map<String, Object> result = new HashMap<String, Object>();
		CmsSite site = CmsUtils.getSite(request);
		CmsUser user = CmsUtils.getUser(request);
		FrontUtils.frontData(request, model, site);
		if (user == null) {
			result.put("status", "401");
			result.put("msg", "failure");
		}
		BsbOutStorage param = new BsbOutStorage();
		param.setCustomerId(customerId);
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
		String msg=validateStorageProduct(outStorageProducts);
		if(StringUtils.isEmpty(msg)){
			outStorageMng.save(param, outStorageProducts);
			result.put("status", "200");
			result.put("msg", "success");
			result.put("data", param);
		}
		else{
			result.put("status", "400");
			result.put("msg", msg);
		}
		return result;
	}
	private String validateStorageProduct(String outStorageProducts) {
		StringBuffer msg = new StringBuffer();
		JSONArray products = new JSONArray(outStorageProducts);
		for (int i = 0; i < products.length(); i++) {
			BsbStorageProduct param = new BsbStorageProduct();
			param.setProductId(products.getJSONObject(i).get("productId").toString());
			param.setStorageId(products.getJSONObject(i).getString("storageId"));
			int quantity=products.getJSONObject(i).getInt("quantity");
			BsbStorageProduct storageProduct=outStorageMng.findByStorageProduct(param);
			if(storageProduct==null){
				BsbProduct product= productMng.findById(param.getProductId());
				BsbStorage storage =storageMng.findById(products.getJSONObject(i).getString("storageId"));
				msg.append("商品：");
				msg.append(product.getMerchantProdId()+" ");
				msg.append(product.getProdName());
				msg.append(" 在 ");
				msg.append(storage.getStorageName());
				msg.append(" 中库存不足");
				msg.append("(");
				msg.append(quantity);
				msg.append(");");
			}if(storageProduct!=null&&(storageProduct.getQuantity()-quantity)<0){
				BsbProduct product= productMng.findById(param.getProductId());
				BsbStorage storage =storageMng.findById(products.getJSONObject(i).getString("storageId"));
				msg.append("商品：");
				msg.append(product.getMerchantProdId()+" ");
				msg.append(product.getProdName());
				msg.append(" 在 ");
				msg.append(storage.getStorageName());
				msg.append(" 中库存不足");
				msg.append("(");
				msg.append(storageProduct.getQuantity()-quantity);
				msg.append(");");				
			}
				

		}
		return msg.toString();
	}
	@Autowired
	private BsbOutStorageMng outStorageMng;
	@Autowired
	private BsbStorageMng storageMng;
	@Autowired
	private BsbProductMng productMng;
}
