/**
 * 
 */
package cn.easymis.commons.code.util.model;

import java.util.List;

import cn.easymis.commons.code.util.reflect.FieldColumnPojo;

/**
 * 构建Mapper中的代码
 * @author desert
 * @version 1.0 2014/2/12
 */
public class ModelMapperXMLUtils {
	
	/**
	 * 构建mapper中的namespace
	 * @return
	 */
	public String getMapperNameSpace(){
		StringBuffer sb = new StringBuffer();
		
		sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>  \r\n ");
		sb.append("<!DOCTYPE mapper  \r\n ");
		sb.append(" PUBLIC \"-//mybatis.org//DTD Mapper 3.0//EN\"   \r\n ");
		sb.append(" \"http://mybatis.org/dtd/mybatis-3-mapper.dtd\">   \r\n ");
		
		
		return sb.toString();
	}
	
	
	public String construtMapperContent(String modelpackage,String pojoClassName,String modelName,String tableName,List<FieldColumnPojo> list,String keyColumn,String idvalue){
		
		String mapper_content = this.getMapperNameSpace();                            //构建 Mapper namespace
		
		//把类名的首字母大写
		StringBuffer classname = new StringBuffer(modelName);
		classname.setCharAt(0, Character.toUpperCase(classname.charAt(0)));
		
		mapper_content += "<mapper namespace=\""+modelpackage+".mapper."+classname.toString()+"Mapper\">   \r\n ";
		mapper_content += this.consttrutResultMap(modelpackage,pojoClassName,list, modelName, tableName);  //构建ResultMap
		
		mapper_content += this.consttrutSelectSql(pojoClassName, modelName, tableName);  //构建select语句
		
		mapper_content +=this.construtInsertSql(pojoClassName, tableName, modelName, list); //构建insert语句
		
		mapper_content +=this.construtUpdateSQL(pojoClassName, list, modelName, tableName, keyColumn,idvalue); //构建更新语句
		
		mapper_content +=this.construtdeleteSql(modelName, tableName, idvalue, keyColumn);    //构建删除语句
		
		mapper_content +=this.construtsFindById(pojoClassName, list, modelName, tableName, keyColumn, idvalue); //构建查询根据Id进行查询的查询语句
		
		mapper_content +="</mapper>  \r\n ";
		
		return mapper_content;
	}
	public String consttrutResultMap(String modelpackage,String className,List<FieldColumnPojo> list,String modelName,String tableName){
		 StringBuffer sb = new StringBuffer();
		 sb.append("<resultMap id=\""+modelName+"ResultMap\" type=\""+className+"\">  \r\n");
			for( int i = 0;i<list.size();i++){				
				FieldColumnPojo pojo  = list.get(i);					
				String column = pojo.getColumn();
				String field = pojo.getFieldName();
				String jdbcType= pojo.getJdbcType();
				
				sb.append("<result column=\""+column+"\"");
				sb.append(" property=\""+field+"\"");
				sb.append(" jdbcType=\""+jdbcType+"\"/> \r\n");
			}
		 sb.append("</resultMap>  \r\n");
		 return sb.toString();
	}
	

		
	
	
	
	
	/**
	 * 查询sql
	 * @param pojoClassName
	 * @return
	 */
	public String consttrutSelectSql(String pojoClassName,String modelName,String tableName){
		//<select id="getNavigationByPage" parameterType="map" resultMap="com.tyeryi.navigation.pojo.NavigationPojo">
        StringBuffer sb = new StringBuffer();
		
		sb.append("<select id=\"getList\" parameterType=\"map\" resultMap=\""+modelName+"ResultMap\">   \r\n ");
		
		sb.append(" SELECT t.* FROM "+tableName+" t ");
		
		//这个后面还需要添加sql的条件
		
		sb.append("  \r\n </select>  \r\n ");
		
		return sb.toString();
	}
	
	/**
	 * 构建Update语句
	 * @param updateSql 更新sql
	 * @return
	 */
	public String construtUpdateSQL(String pojoClassName,List<FieldColumnPojo> list,String modelName,String tableName,String keyColumn,String idvalue){
		StringBuffer sb = new StringBuffer();
		
		sb.append("<update id=\"update\" parameterType=\""+pojoClassName+"\">  \r\n ");
		
		sb.append(" UPDATE "+tableName+" SET ");
				
		for( int i = 0;i<list.size();i++){
			
			FieldColumnPojo pojo  = list.get(i);
				
			String column = pojo.getColumn();
			String field = pojo.getFieldName();
			boolean id = pojo.getId();
			
			//针对mysql
			sb.append( column+"= #{"+field+"}");
			
			if(i<(list.size()-1)){
				sb.append(",");
			}
		
		}
	
		sb.append(" WHERE "+keyColumn+"= #{"+idvalue+"}");
           		
		sb.append(" \r\n </update> \r\n ");
		
		return sb.toString();
	}	
	/**
	 * 构建插入语句
	 * @param insertSql 插入sql
	 * @return 
	 */
	public String  construtInsertSql(String pojoClassName,String tableName,String modelName,List<FieldColumnPojo> list){
		
		//<insert id="saveNavigationPojo" parameterType="com.tyeryi.navigation.pojo.NavigationPojo">
		StringBuffer sb = new StringBuffer();
		
		sb.append("<insert id=\"save\" parameterType=\""+pojoClassName+"\">  \r\n ");
		
		//针对mysql 插入时不添加组件
        sb.append("INSERT INTO "+tableName+"(");
        
	    StringBuffer values_sb = new StringBuffer(); 
		
		for( int i = 0;i<list.size();i++){
			
			FieldColumnPojo pojo  = list.get(i);
				
			String column = pojo.getColumn();
			String field = pojo.getFieldName();
			//boolean id = pojo.getId();
			
			//针对mysql
			//if(!id){
				sb.append(column);
				
				values_sb.append("#{"+field+"}");
				
				if(i<(list.size()-1)){
					sb.append(",");
					values_sb.append(",");
				}
			//}//end if
		}
		
		sb.append(")values(").append(values_sb).append(")");
		
		sb.append(" \r\n </insert>  \r\n ");
		
		return sb.toString();
	}
	
	/**
	 * 根据Id主键查询对象
	 * @param pojoClassName
	 * @param list
	 * @param modelName
	 * @param tableName
	 * @param keyColumn
	 * @param idvalue
	 * @return
	 */
	public String construtsFindById(String pojoClassName,List<FieldColumnPojo> list,String modelName,String tableName,String keyColumn,String idvalue){
		StringBuffer sb = new StringBuffer();
		
		sb.append("<select id=\"findById\" parameterType=\"java.lang.String\" resultMap=\""+modelName+"ResultMap\">  \r\n ");
		 
		sb.append(" SELECT t.* FROM "+tableName+" t WHERE t."+keyColumn+" = #{"+idvalue+"}");
		
		sb.append(" \r\n </select>  \r\n ");
		
		return sb.toString();
	} 
	
	/**
	 * 删除sql
	 * @param deleteSql
	 * @return
	 */
	public String construtdeleteSql(String modelname,String tableName,String idvalue,String keyColumn){
		StringBuffer  sb = new StringBuffer();
		
		sb.append("<delete id=\"delete\" parameterType=\"java.lang.String\"> \r\n ");
		
		sb.append(" DELETE FROM "+tableName+" WHERE "+keyColumn+" = #{"+idvalue+"}");
		
		sb.append(" \r\n </delete>  \r\n ");
		
		return sb.toString();
	}

}
