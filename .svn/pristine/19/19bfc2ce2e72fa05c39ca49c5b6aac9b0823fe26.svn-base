package com.ieker.ierp.bsb.action.front;

import java.io.IOException;
import java.io.OutputStream;
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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ieker.common.util.StrUtils;
import com.ieker.common.web.page.SimplePage;
import com.ieker.ierp.bsb.entity.BsbProduct;
import com.ieker.ierp.bsb.entity.BsbSales;
import com.ieker.ierp.bsb.entity.BsbSalesSub;
import com.ieker.ierp.bsb.entity.BsbStorage;
import com.ieker.ierp.bsb.entity.BsbStorageProduct;
import com.ieker.ierp.bsb.manager.BsbProductMng;
import com.ieker.ierp.bsb.manager.BsbSalesMng;
import com.ieker.ierp.bsb.manager.BsbStorageMng;
import com.ieker.ierp.core.entity.CmsSite;
import com.ieker.ierp.core.entity.CmsUser;
import com.ieker.ierp.core.web.util.CmsUtils;
import com.ieker.ierp.core.web.util.FrontUtils;
@Controller
public class BsbSalesAct {

		@RequestMapping(value = "/bsb/sales/query.jspx")
		public String query(String businessName,String prodStatus,String prodCatId, Integer page, Integer pageSize,
				HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			CmsSite site = CmsUtils.getSite(request);
			CmsUser user = CmsUtils.getUser(request);
			FrontUtils.frontData(request, model, site);
			if (user == null) {
				return FrontUtils.showLogin(request, model, site);
			}
			PageHelper.startPage(SimplePage.cpn(page), SimplePage.cps(pageSize));
			BsbSales bean = new BsbSales();
			bean.setOrgId(user.getOrgId());
			List<BsbSales> salesList = salesMng.getList(bean);
			PageInfo<BsbSales> p = new PageInfo<BsbSales>(salesList);

			model.put("salesList", salesList);
			FrontUtils.frontData(request, model, site, p);
			return FrontUtils.getTplPath("/bsb/sales/sales_list");
		}
		@RequestMapping(value = "/bsb/sales/search.jspx")
		public String search(String prodId, Integer pageNo, Integer pageSize,
				HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			CmsSite site = CmsUtils.getSite(request);
/*			List<BsbSupplierCategory> sortList = sortMng.getList(new BsbSupplierCategory() );
			model.put("sortList", sortList);*/
			
			FrontUtils.frontData(request, model, site);
			return FrontUtils.getTplPath("/bsb/sales/sales_search");
		}
		@RequestMapping(value = "/crm/sales/sub/ajax/list.jspx")
		@ResponseBody
		public Map<String, Object> listSalesSubByAjax( String salesId,
				HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			CmsSite site = CmsUtils.getSite(request);
			CmsUser user = CmsUtils.getUser(request);

			BsbSalesSub param = new BsbSalesSub();
			param.setSalesId(salesId);
			List<BsbSalesSub> subList = salesMng.getSalesSubList(param);

			Map<String, Object> result = new HashMap<String, Object>();
			result.put("subList", subList);
			return result;
		}
		@RequestMapping(value = "/bsb/sales/add.jspx", method = RequestMethod.GET)
		public String add(String prodId, Integer pageNo, Integer pageSize,
				HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			CmsSite site = CmsUtils.getSite(request);
			CmsUser user = CmsUtils.getUser(request);
			FrontUtils.frontData(request, model, site);
			if (user == null) {
				return FrontUtils.showLogin(request, model, site);
			}		
			model.put("salesId", StrUtils.makePk());
			model.put("billNo", "XH"+StrUtils.makePk());
			
			model.put("billDate", new Date());
			model.put("ownerId", user.getStaffId());
			model.put("staffName", user.getStaffName());
			
			
			FrontUtils.frontData(request, model, site);
			return FrontUtils.getTplPath("/bsb/sales/sales_add");
		}
		@RequestMapping(value = "/bsb/sales/edit.jspx", method = RequestMethod.GET)
		public String edit(String salesId, Integer pageNo, Integer pageSize,
				HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			CmsSite site = CmsUtils.getSite(request);
			BsbSales sales = salesMng.findById(salesId);
			BsbSalesSub sub = new BsbSalesSub();
			sub.setSalesId(salesId);
			List<BsbSalesSub> subList = salesMng.getSalesSubList(sub);
			model.put("subList", subList);
			model.put("sales", sales);
			FrontUtils.frontData(request, model, site);
			return FrontUtils.getTplPath("/bsb/sales/sales_edit");
		}
		@RequestMapping(value = "/bsb/sales/update.jspx", method = RequestMethod.POST)
		public String update(String prodId,String cateId, String brandId,
				HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			CmsSite site = CmsUtils.getSite(request);


			FrontUtils.frontData(request, model, site);
			return FrontUtils.getTplPath("productList");
		}
		@RequestMapping(value = "/bsb/sales/save.jspx", method = RequestMethod.POST)
		@ResponseBody
		public Map<String, Object> save(String ownerId,String customerId, String billNo,String businessId,Integer totalQuantity, 
				Float totalAmount,Float deductionAmount,Float amount,String salesProducts,String salesPrice,String address,String depict,
				HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			Map<String, Object> result = new HashMap<String, Object>();
			CmsSite site = CmsUtils.getSite(request);
			CmsUser user = CmsUtils.getUser(request);
			FrontUtils.frontData(request, model, site);
			if (user == null) {
				result.put("status", "401");
				result.put("msg", "failure");
			}
			BsbSales bean = new BsbSales();
			bean.setOrgId(user.getOrgId());
			bean.setCustomerId(customerId);
			bean.setBusinessId(businessId);
			if(salesPrice!=null&&!"".equals(salesPrice))
			bean.setAmount(new Float(salesPrice));
			bean.setBillNo(billNo);
			bean.setBillDate(new Date());
			bean.setOwnerId(ownerId);
			bean.setCreatorId(user.getStaffId());
			bean.setTotalQuantity(totalQuantity);
			bean.setTotalAmount(totalAmount);
			bean.setAddress(address);
			bean.setDepict(depict);
			bean.setAmount(amount);
			bean.setReceiptStatus(1);
			String msg=validateStorageProduct(salesProducts);
			if(StringUtils.isEmpty(msg)){
				salesMng.save(bean, salesProducts);
				result.put("status", "200");
				result.put("msg", "success");
				result.put("data", bean);
			}
			else{
				result.put("status", "400");
				result.put("msg", msg);
			}
			return result;
		}
		@RequestMapping(value = "/bsb/sales/delete.jspx", method = RequestMethod.GET)
		public String del(String salesId, HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			String[] ids=salesId.split(",");
			for(int i=0;i<ids.length;i++)
				salesMng.deleteById(ids[i]);
			return "redirect:/bsb/sales/query.jspx";
		}
		/**
		 * 导出Excel模板
		 * @param salesId
		 * @param request
		 * @param response
		 * @param model
		 * @return
		 */
		@RequestMapping(value = "/bsb/sales/export/template.jspx", method = RequestMethod.GET)
		public void exportToTemplate(String salesId, HttpServletRequest request, HttpServletResponse response, ModelMap model) {
/*	        List<Student> list = new ArrayList<Student>();    
	        list.add(new Student(1000,"zhangsan","20"));    
	        list.add(new Student(1001,"lisi","23"));    
	        list.add(new Student(1002,"wangwu","25"));    
	        HSSFWorkbook wb = studentExportService.export(list);  */  
	        response.setContentType("application/vnd.ms-excel");    
	        response.setHeader("Content-disposition", "attachment;filename=student.xls");    
	        OutputStream ouputStream;
			try {
				ouputStream = response.getOutputStream();
		        //wb.write(ouputStream);    
		        ouputStream.flush();    
		        ouputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}    

		}
		@RequestMapping(value = "/bsb/sales/export/excel.jspx", method = RequestMethod.GET)
		public void exportToExcel(String salesId, HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			
		}
		/**
		 * 导入数据
		 * @param salesId
		 * @param request
		 * @param response
		 * @param model
		 */
		@RequestMapping(value = "/bsb/sales/import/template.jspx", method = RequestMethod.GET)
		public void excelToImport(String salesId, HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			
		}
		/**
		 * 销售开票记录
		 * @param salesId
		 * @param request
		 * @param response
		 * @param model
		 */
		@RequestMapping(value = "bsb/sales/billing.jspx", method = RequestMethod.GET)
		public String billing(String salesId, HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			CmsSite site = CmsUtils.getSite(request);
			CmsUser user = CmsUtils.getUser(request);
			FrontUtils.frontData(request, model, site);
			if (user == null) {
				return FrontUtils.showLogin(request, model, site);
			}
			return FrontUtils.getTplPath("/bsb/sales/sales_billing_list");
		}
		private String validateStorageProduct(String outStorageProducts) {
			StringBuffer msg = new StringBuffer();
			JSONArray products = new JSONArray(outStorageProducts);
			for (int i = 0; i < products.length(); i++) {
				BsbStorageProduct param = new BsbStorageProduct();
				param.setProductId(products.getJSONObject(i).get("productId").toString());
				param.setStorageId(products.getJSONObject(i).getString("storageId"));
				int quantity=products.getJSONObject(i).getInt("quantity");
				BsbStorageProduct storageProduct=storageMng.findProduct(param);
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
		private BsbSalesMng salesMng;
		@Autowired
		private BsbStorageMng storageMng;
		@Autowired
		private BsbProductMng productMng;
}
