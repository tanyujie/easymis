/**
 * 
 */
package cn.easymis.commons.code.util.model;


/**
 * 构建模块中的Service 接口类的代码
 * @author desert 
 * @version 1.0
 */
public class ModelServiceUtils {

	 /**
     * 获取mapper xml 对应的java interface
     * @return content String
     */
	public String  getModelServiceInterface(String packageName,String importPackageName,String pojoClassName,String modelName,String fieldName){
		
		StringBuffer sb = new StringBuffer();
		
		//声明package
		sb.append("package "+importPackageName+";");
		
		//声明需要导入的包
		sb.append("import java.util.List;");
		sb.append("import java.util.HashMap;");
		
		sb.append("import "+pojoClassName+";");
		
		//把类名的首字母大写
		StringBuffer classname = new StringBuffer(modelName);
		classname.setCharAt(0, Character.toUpperCase(classname.charAt(0)));
		
		//声明类
		sb.append("public interface "+classname.toString()+"Mng {");
		
		//声明方法
		
		//查询方法
		sb.append("public List<"+pojoClassName+"> getList(HashMap<String, Object> params);");
		
		//插入方法
		sb.append("public void save("+pojoClassName+" pojo);");
		
		//更新方法
		sb.append("public void update("+pojoClassName+" pojo);");
		
	    //删除方法
		sb.append("public void delete(String "+fieldName+");");
		
		//根据id进行查询sql
		sb.append("public "+pojoClassName+" findById(String "+fieldName+");");
		
		sb.append("}");
		
		
		return sb.toString();
	}
	
	
	 /**
     * 获取mapper xml 对应的java Impl class
     * @return content String
     */
	public String  getModelServiceImpl(String packageName,String importPackageName,String pojoClassName,String modelName,String fieldName){
		
		StringBuffer sb = new StringBuffer();
		
		//声明package
		sb.append("package "+importPackageName+".impl;"+"\r\n");
		
		//声明需要导入的包
		sb.append("import java.util.List;"+"\r\n");
		sb.append("import java.util.HashMap;"+"\r\n");
		sb.append("import org.springframework.beans.factory.annotation.Autowired;"+"\r\n");
		sb.append("import org.springframework.stereotype.Service;"+"\r\n");
		
		//把类名的首字母大写
		StringBuffer classname = new StringBuffer(modelName);
		classname.setCharAt(0, Character.toUpperCase(classname.charAt(0)));
		sb.append("import "+packageName+".manager."+classname.toString()+"Mng;"+"\r\n");
		
		sb.append("import "+importPackageName+".mapper."+classname.toString()+"Mapper;"+"\r\n");
		
		//声明类
		sb.append("@Service"+"\r\n");
		sb.append("public class "+classname.toString()+"MngImpl implements "+classname.toString()+"Mng{"+"\r\n");
		
		sb.append("@Autowired"+"\r\n");
		sb.append("private "+classname.toString()+"Mapper mapper;"+"\r\n");
		
		//声明方法
		
		//查询方法
		sb.append("public List<"+pojoClassName+"> getList(HashMap<String, Object> params){"+"\r\n");
		   //查询方法的方法体
		    sb.append(" return this.mapper.getList(params);"+"\r\n");
		sb.append("}"+"\r\n");
		
		//插入方法
		sb.append("public void save("+pojoClassName+" bean){"+"\r\n");
		   sb.append(" this.mapper.save(bean);"+"\r\n");
		sb.append("}"+"\r\n");
		
		//更新方法
		sb.append("public void update("+pojoClassName+" bean){"+"\r\n");
		     sb.append(" this.mapper.update(bean);"+"\r\n");
		sb.append("}"+"\r\n");
		
	    //删除方法
		sb.append("public void delete(String "+fieldName+"){"+"\r\n");
		     sb.append(" this.mapper.delete("+fieldName+");"+"\r\n");
		sb.append("}"+"\r\n");
		
		//根据id进行查询sql
		sb.append("public "+pojoClassName+" findById(String "+fieldName+"){"+"\r\n");
		     sb.append(" return this.mapper.findById("+fieldName+");"+"\r\n");
		sb.append("}"+"\r\n");
		
	    sb.append("}"+"\r\n");
		
		return sb.toString();
	}
	
}
