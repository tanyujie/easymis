/**
 * 
 */
package cn.easymis.commons.code.util.model;

import java.io.Serializable;

/**
 * 生成Mapper xml对应的Java文件
 * @author desert
 * @version 1.0 2014/2/13
 */
public class ModelMapperJava implements Serializable {

	private static final long serialVersionUID = 1L;
	
    /**
     * 获取mapper xml 对应的java interface
     * @return content String
     */
	public String  getModelJavaInterface(String packageName,String pojoClassName,String modelName,String fieldName){
		
		StringBuffer sb = new StringBuffer();
		
		//声明package
		sb.append("package "+packageName+".mapper;");
		
		//声明需要导入的包
		sb.append("import java.util.List;");
		sb.append("import java.util.HashMap;");
		sb.append("import org.apache.ibatis.annotations.Param;");
		
		sb.append("import "+pojoClassName+";");
		
		//把类名的首字母大写
		StringBuffer classname = new StringBuffer(modelName);
		classname.setCharAt(0, Character.toUpperCase(classname.charAt(0)));
		
		//声明类
		sb.append("public interface "+classname.toString()+"Mapper {");
		
		//声明方法
		
		//查询方法
		sb.append("public List<"+pojoClassName+"> getList(@Param(\"map\")HashMap<String, Object> params);");
		
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
	

}
