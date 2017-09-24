package com.ieker.ierp.bsb.action.front;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;
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
import com.ieker.common.util.StrUtils;
import com.ieker.common.web.page.SimplePage;
import com.ieker.ierp.bsb.entity.BsbSalesOrder;
import com.ieker.ierp.bsb.entity.BsbSalesOrderSub;
import com.ieker.ierp.bsb.manager.BsbSalesOrderMng;
import com.ieker.ierp.core.entity.CmsSite;
import com.ieker.ierp.core.entity.CmsUser;
import com.ieker.ierp.core.web.util.CmsUtils;
import com.ieker.ierp.core.web.util.FrontUtils;
@Controller
public class BsbSalesOrderAct {

		@RequestMapping(value = "/bsb/sales/order/query.jspx")
		public String query(String businessName,String prodStatus,String prodCatId, Integer page, Integer pageSize,
				HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			CmsSite site = CmsUtils.getSite(request);
			CmsUser user = CmsUtils.getUser(request);
			FrontUtils.frontData(request, model, site);
			if (user == null) {
				return FrontUtils.showLogin(request, model, site);
			}
			PageHelper.startPage(SimplePage.cpn(page), SimplePage.cps(pageSize));
			BsbSalesOrder bean = new BsbSalesOrder();
			bean.setOrgId(user.getOrgId());
			List<BsbSalesOrder> salesList = salesOrderMng.getList(bean);
			PageInfo<BsbSalesOrder> p = new PageInfo<BsbSalesOrder>(salesList);

			model.put("salesList", salesList);
			FrontUtils.frontData(request, model, site, p);
			return FrontUtils.getTplPath("/bsb/sales/order/sales_order_list");
		}
		@RequestMapping(value = "/bsb/sales/order/search.jspx")
		public String search(String prodId, Integer pageNo, Integer pageSize,
				HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			CmsSite site = CmsUtils.getSite(request);
/*			List<BsbSupplierCategory> sortList = sortMng.getList(new BsbSupplierCategory() );
			model.put("sortList", sortList);*/
			
			FrontUtils.frontData(request, model, site);
			return FrontUtils.getTplPath("/bsb/sales/order/sales_order_search");
		}
		@RequestMapping(value = "/crm/sales/order/sub/ajax/list.jspx")
		@ResponseBody
		public Map<String, Object> listSalesSubByAjax( String salesOrderId,
				HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			CmsSite site = CmsUtils.getSite(request);
			CmsUser user = CmsUtils.getUser(request);

			BsbSalesOrderSub param = new BsbSalesOrderSub();
			param.setSalesOrderId(salesOrderId);
			List<BsbSalesOrderSub> subList = salesOrderMng.getSalesOrderSubList(param);

			Map<String, Object> result = new HashMap<String, Object>();
			result.put("subList", subList);
			return result;
		}
		@RequestMapping(value = "/bsb/sales/order/add.jspx", method = RequestMethod.GET)
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
			return FrontUtils.getTplPath("/bsb/sales/order/sales_order_add");
		}
		@RequestMapping(value = "/bsb/sales/order/edit.jspx", method = RequestMethod.GET)
		public String edit(String salesOrderId,
				HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			CmsSite site = CmsUtils.getSite(request);
			BsbSalesOrder sales = salesOrderMng.findById(salesOrderId);
			BsbSalesOrderSub sub = new BsbSalesOrderSub();
			sub.setSalesOrderId(salesOrderId);
			List<BsbSalesOrderSub> subList = salesOrderMng.getSalesOrderSubList(sub);
			model.put("subList", subList);
			model.put("sales", sales);
			FrontUtils.frontData(request, model, site);
			return FrontUtils.getTplPath("/bsb/sales/order/sales_order_edit");
		}
		@RequestMapping(value = "/bsb/sales/order/update.jspx", method = RequestMethod.POST)
		public String update(String prodId,String cateId, String brandId,
				HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			CmsSite site = CmsUtils.getSite(request);


			FrontUtils.frontData(request, model, site);
			return FrontUtils.getTplPath("productList");
		}
		@RequestMapping(value = "/bsb/sales/order/save.jspx", method = RequestMethod.POST)
		public String save(String ownerId,String customerId, String billNo,String businessId,Integer totalQuantity, 
				Float totalAmount,Float deductionAmount,Float amount,String salesProducts,String salesPrice,String address,String depict,
				HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			CmsSite site = CmsUtils.getSite(request);
			CmsUser user = CmsUtils.getUser(request);
			FrontUtils.frontData(request, model, site);
			if (user == null) {
				return FrontUtils.showLogin(request, model, site);
			}
			BsbSalesOrder bean = new BsbSalesOrder();
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
			salesOrderMng.save(bean,salesProducts);
			FrontUtils.frontData(request, model, site);
			return "redirect:/bsb/sales/order/query.jspx";
		}
		@RequestMapping(value = "/bsb/sales/order/delete.jspx", method = RequestMethod.GET)
		public String del(String salesId, HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			String[] ids=salesId.split(",");
			for(int i=0;i<ids.length;i++)
				salesOrderMng.deleteById(ids[i]);
			return "redirect:/bsb/sales/order/query.jspx";
		}
		/**
		 * 导出Excel模板
		 * @param salesId
		 * @param request
		 * @param response
		 * @param model
		 * @return
		 */
		@RequestMapping(value = "/bsb/sales/order/export/template.jspx", method = RequestMethod.GET)
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
		@RequestMapping(value = "/bsb/sales/order/export/excel.jspx", method = RequestMethod.GET)
		public void exportToExcel(String salesId, HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			
		}
		/**
		 * 导入数据
		 * @param salesId
		 * @param request
		 * @param response
		 * @param model
		 */
		@RequestMapping(value = "/bsb/sales/order/import/template.jspx", method = RequestMethod.GET)
		public void excelToImport(String salesId, HttpServletRequest request, HttpServletResponse response, ModelMap model) {
			
		}

		@Autowired
		private BsbSalesOrderMng salesOrderMng;

}
