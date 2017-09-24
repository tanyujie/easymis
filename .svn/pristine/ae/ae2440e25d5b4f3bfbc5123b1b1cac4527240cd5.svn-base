package cn.easymis.commons.code.util.model;

/**
 * 构建Action中的代码
 * @author desert
 * @version 1.0 2014/2/12
 */
public class ModelActionUtils {
	
	/**
	 * 构建Action中的content
	 * @return String
	 */
	public String modelActionContent(String packageName,String pojoClassName,String modelName,String fieldName){
		
	        StringBuffer sb = new StringBuffer();
			
			//声明package
			sb.append("package "+packageName+".action.front;"+"\r\n");
			
			//声明需要导入的包
			sb.append("import java.util.List;"+"\r\n");
			sb.append("import java.util.HashMap;"+"\r\n");		
			
			sb.append("import javax.annotation.Resource;"+"\r\n");
			sb.append("import javax.servlet.http.HttpServletRequest;"+"\r\n");
			sb.append("import javax.servlet.http.HttpServletResponse;"+"\r\n");
			
			
			sb.append("import org.apache.commons.logging.Log;"+"\r\n");
			sb.append("import javax.servlet.http.HttpSession;"+"\r\n");
			sb.append("import org.apache.commons.logging.LogFactory;"+"\r\n");
			sb.append("import org.springframework.http.HttpStatus;"+"\r\n");
			sb.append("import org.springframework.stereotype.Controller;"+"\r\n");
			sb.append("import org.springframework.ui.ModelMap;"+"\r\n");
			
			sb.append("import org.springframework.web.bind.annotation.RequestMapping;"+"\r\n");
			sb.append("import org.springframework.web.bind.annotation.RequestMethod;"+"\r\n");
			sb.append("import org.springframework.web.bind.annotation.ResponseBody;"+"\r\n");
			sb.append("import org.springframework.web.bind.annotation.ResponseStatus;"+"\r\n"+"\r\n");
			
			//添加分页
			//sb.append("import com.github.pagehelper.PageHelper;"+"\r\n");
			//sb.append("import com.github.pagehelper.PageInfo;"+"\r\n");
			
			
			//把类名的首字母大写
			StringBuffer classname = new StringBuffer(modelName);
			classname.setCharAt(0, Character.toUpperCase(classname.charAt(0)));
			
			sb.append("import "+packageName+".manager."+classname.toString()+"Mng;"+"\r\n");
			
			//声明类
			sb.append("@Controller"+"\r\n");
			sb.append("@RequestMapping(\"/"+modelName+"\")"+"\r\n");
			sb.append("public class "+classname.toString()+"Act{"+"\r\n");
			
			sb.append("	@Resource"+"\r\n");
			sb.append("	private "+classname.toString()+"Mng service;"+"\r\n");
			
			//声明方法
			
			//转到系统主页的方法
			sb.append("	@RequestMapping(value=\"index.jspx\")"+"\r\n");
			sb.append("	public String forward"+modelName+"IndexJsp(HttpServletRequest request,HttpSession session)throws Exception{"+"\r\n");
			sb.append("		return \""+modelName+"/index\";"+"\r\n");
			sb.append("	}"+"\r\n");
			
			

			//转到系统的列表页面方法
			sb.append("	@RequestMapping(value=\"query.jspx\",method=RequestMethod.POST)"+"\r\n");
			sb.append("	public String query(Integer page, Integer pageSize,HttpServletRequest request, HttpServletResponse response, ModelMap model)throws Exception{"+"\r\n");
			  
/*			sb.append("CmsSite site = CmsUtils.getSite(request);"+"\r\n");
			sb.append("FrontUtils.frontData(request, model, site);"+"\r\n");
			sb.append("CmsUser user = CmsUtils.getUser(request);"+"\r\n");
			sb.append("PageHelper.startPage(SimplePage.cpn(page), SimplePage.cps(pageSize));"+"\r\n");
			sb.append(pojoClassName+" param = new "+pojoClassName+"();"+"\r\n");
			sb.append("param.setOrgId(user.getOrgId());"+"\r\n");			
			 
			sb.append(" HashMap<String, Object> params = new HashMap<String, Object>();"+"\r\n");
			   
			sb.append("List<"+pojoClassName+"> "+modelName+"_list = service.getList(params);"+"\r\n");
			sb.append("PageInfo<"+pojoClassName+"> p = new PageInfo<"+pojoClassName+">("+modelName+"_list);");
			
			sb.append("model.put(\""+modelName+"_list\", "+modelName+"_list);");
			   
			sb.append("FrontUtils.frontData(request, model, site, p);");
			sb.append("return FrontUtils.getTplPath(\"/bsb/storage/transfers/transfers_list\");");*/
			sb.append("		return null;"+"\r\n");
			sb.append("	}"+"\r\n");
			
			//转到增加的页面
			sb.append("	@RequestMapping(value=\"add.jspx\")"+"\r\n");//forwordEdit
			sb.append("	public String forwardAdd(HttpServletRequest request,HttpSession session)throws Exception{"+"\r\n");
			
			sb.append(" 	String id_str = request.getParameter(\"id\");"+"\r\n");
			
			sb.append(" 	if(id_str!=null&&(id_str.length())>0&&(!id_str.trim().equals(\"undefined\"))){"+"\r\n");
			sb.append(pojoClassName+" pojo_model = service.findById(id_str);"+"\r\n");
			sb.append(" 	request.setAttribute(\""+modelName+"_obj\",pojo_model);"+"\r\n");
			sb.append(" }"+"\r\n");
			
			sb.append("		return \""+modelName+"/edit\";"+"\r\n");
			sb.append("	}"+"\r\n");
			
			//转到修改的页面
			sb.append("	@RequestMapping(value=\"edit.jspx\")"+"\r\n");//forwordEdit
			sb.append("	public String forwardEdit(HttpServletRequest request,HttpSession session)throws Exception{"+"\r\n");
			
			sb.append(" 	String id_str = request.getParameter(\"id\");"+"\r\n");
			
			sb.append(" 	if(id_str!=null&&(id_str.length())>0&&(!id_str.trim().equals(\"undefined\"))){"+"\r\n");
			sb.append(pojoClassName+" pojo_model = service.findById(id_str);"+"\r\n");
			sb.append(" request.setAttribute(\""+modelName+"_obj\",pojo_model);"+"\r\n");
			sb.append(" }"+"\r\n");
			
			sb.append("		return \""+modelName+"/edit\";"+"\r\n");
			sb.append("	}"+"\r\n");
			
			//增加方法
			sb.append("	@RequestMapping(value=\"save.jspx\",method=RequestMethod.POST)"+"\r\n");
			sb.append(" @ResponseStatus(value=HttpStatus.OK)"+"\r\n");
			sb.append("	public void save"+modelName+"(HttpServletRequest request,HttpSession session)throws Exception{"+"\r\n");
			     
			sb.append("	}"+"\r\n");
			
			//修改方法
			sb.append("	@RequestMapping(value=\"update.jspx\",method=RequestMethod.POST)"+"\r\n");
			sb.append(" @ResponseStatus(value=HttpStatus.OK)"+"\r\n");
			sb.append("	public void update"+modelName+"(HttpServletRequest request,HttpSession session)throws Exception{"+"\r\n");
			     
			sb.append("	}"+"\r\n");
			
		    //删除方法
			sb.append("	@RequestMapping(value=\"delete.jspx\",method=RequestMethod.POST)"+"\r\n");
			sb.append(" @ResponseStatus(value=HttpStatus.OK)"+"\r\n");
			sb.append("	public void delete"+modelName+"(HttpServletRequest request,String id)throws Exception{"+"\r\n");
			sb.append("		service.delete(id);"+"\r\n");
			sb.append("	}"+"\r\n");
			
		    sb.append("}"+"\r\n");
		
		return sb.toString();
	}

}
