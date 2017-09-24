package com.ieker.ierp.bsb.action.front;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ieker.common.web.page.SimplePage;
import com.ieker.ierp.bsb.entity.BsbProductCategory;
import com.ieker.ierp.bsb.entity.BsbStorage;
import com.ieker.ierp.bsb.entity.BsbSupplier;
import com.ieker.ierp.bsb.manager.BsbStorageMng;
import com.ieker.ierp.core.entity.CmsSite;
import com.ieker.ierp.core.entity.CmsUser;
import com.ieker.ierp.core.web.util.CmsUtils;
import com.ieker.ierp.core.web.util.FrontUtils;
/**
 * 库存管理
 * @author lenovo-t
 *
 */
@Controller
public class BsbStorageAct {

		@RequestMapping(value = "/bsb/storage/query.jspx")
		public String query(String businessName,String prodStatus,String prodCatId, Integer page, Integer pageSize,
				HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			CmsSite site = CmsUtils.getSite(request);
			CmsUser user = CmsUtils.getUser(request);
			FrontUtils.frontData(request, model, site);
			if (user == null) {
				return FrontUtils.showLogin(request, model, site);
			}
			PageHelper.startPage(SimplePage.cpn(page), 999);
			BsbStorage param = new BsbStorage();
			param.setOrgId(user.getOrgId());
			List<BsbStorage> storageList = storageMng.getList(param);
			PageInfo<BsbStorage> p = new PageInfo<BsbStorage>(storageList);
			model.put("storageList", storageList);
			FrontUtils.frontData(request, model, site, p);
			return FrontUtils.getTplPath("/bsb/storage/storage_list");
		}
		@RequestMapping(value = "/bsb/storage/ajax/query.jspx")
		@ResponseBody
		public Map<String, Object> queryByAjax( String customerName,Integer page, Integer pageSize,
				HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			CmsSite site = CmsUtils.getSite(request);
			CmsUser user = CmsUtils.getUser(request);
			BsbStorage param = new BsbStorage();
			param.setOrgId(user.getOrgId());
			List<BsbStorage> storageList = storageMng.getList(param);

			Map<String, Object> result = new HashMap<String, Object>();
			result.put("storageList", storageList);
			return result;
		}

		@RequestMapping(value = "/bsb/storage/add.jspx", method = RequestMethod.GET)
		public String add(String prodId, Integer pageNo, Integer pageSize,
				HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			CmsSite site = CmsUtils.getSite(request);

			FrontUtils.frontData(request, model, site);
			return FrontUtils.getTplPath("/bsb/storage/storage_add");
		}
		@RequestMapping(value = "/bsb/storage/edit.jspx", method = RequestMethod.GET)
		public String edit(String storageId, 
				HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			CmsSite site = CmsUtils.getSite(request);
			CmsUser user = CmsUtils.getUser(request);
			FrontUtils.frontData(request, model, site);
			if (user == null) {
				return FrontUtils.showLogin(request, model, site);
			}
			BsbStorage bean = storageMng.findById(storageId);
			model.put("storage", bean);
			return FrontUtils.getTplPath("/bsb/storage/storage_edit");
		}
		@RequestMapping(value = "/bsb/storage/update.jspx", method = RequestMethod.POST)
		public String update(String storageId,String storageNo, String storageName,String depict,
				HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			CmsSite site = CmsUtils.getSite(request);
			CmsUser user = CmsUtils.getUser(request);
			FrontUtils.frontData(request, model, site);
			if (user == null) {
				return FrontUtils.showLogin(request, model, site);
			}
			BsbStorage bean = storageMng.findById(storageId);
			bean.setStorageNo(storageNo);
			bean.setOrgId(user.getOrgId());
			bean.setStorageName(storageName);
			bean.setDepict(depict);
			storageMng.update(bean);
			FrontUtils.frontData(request, model, site);
			return "redirect:/bsb/storage/query.jspx";
		}
		@RequestMapping(value = "/bsb/storage/delete.jspx")
		public String delete(String storageId,
				HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			CmsSite site = CmsUtils.getSite(request);
			CmsUser user = CmsUtils.getUser(request);
			FrontUtils.frontData(request, model, site);
			if (user == null) {
				return FrontUtils.showLogin(request, model, site);
			}
			storageMng.deleteById(storageId);
			FrontUtils.frontData(request, model, site);
			return "redirect:/bsb/storage/query.jspx";
		}
		@RequestMapping(value = "/bsb/storage/save.jspx", method = RequestMethod.POST)
		@ResponseBody
		public Map<String, Object>  save(String storageNo,  String storageName,String depict,
				HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			Map<String, Object> result = new HashMap<String, Object>();
			CmsSite site = CmsUtils.getSite(request);
			CmsUser user = CmsUtils.getUser(request);
			FrontUtils.frontData(request, model, site);
			if (user == null) {
				//return FrontUtils.showLogin(request, model, site);
			}
			BsbStorage bean = new BsbStorage();
			bean.setStorageNo(storageNo);
			bean.setOrgId(user.getOrgId());
			bean.setStorageName(storageName);
			bean.setDepict(depict);
			//storageMng.save(bean);

			result.put("status", "400");
			result.put("msg", "商品：00002 鼠标 在 雅安仓库 中库存不足(-1);商品：00003 内存_1024M 在 雅安仓库 中库存不足(-1);商品：0001 商品名称1 在 雅安仓库 中库存不足(-1);");
			result.put("result", result);
			return result;
		}

		@Autowired
		private BsbStorageMng storageMng;

}
