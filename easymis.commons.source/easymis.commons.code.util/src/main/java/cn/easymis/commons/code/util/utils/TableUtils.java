/**
 * 
 */
package cn.easymis.commons.code.util.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



/**
 * 表的结构信息
 * @author zhangai
 */
public class TableUtils{
	
	/**
	 * 连接mysql数据库时操作方法
	 * @param tableName 表名
	 * 
	 */
	public  List<TableStructs>  connectDataBase(String tableName,String databaseName)throws Exception{
		
		DBPropertiesUtil  dbutile = new DBPropertiesUtil();
		List<TableStructs>  ts_list = new ArrayList<TableStructs>();
		Connection con = null; //数据库的连接对象  
        Statement stmt = null;  //数据库的更新操作  
        Class.forName(dbutile.jdbcdrive); //1、使用CLASS 类加载驱动程序  
        con = DriverManager.getConnection(dbutile.jdbcurl,dbutile.jdbcuser,dbutile.jdbcpassword); //2、连接数据库 操作 
        stmt = con.createStatement(); //3、Statement 接口需要通过Connection 接口进行实例化操作
		
		  String sql = "SELECT tco.COLUMN_NAME,tco.IS_NULLABLE,tco.COLUMN_TYPE,tco.COLUMN_KEY,tco.COLUMN_COMMENT,tco.CHARACTER_MAXIMUM_LENGTH FROM information_schema.COLUMNS tco  WHERE tco.TABLE_NAME='"+tableName+"' AND tco.TABLE_SCHEMA='"+databaseName+"'";
		  ResultSet rs = stmt.executeQuery(sql);
  		  
		  while(rs.next()){
  				   TableStructs  ts_obj = new TableStructs();
  				   ts_obj.setColumnName(rs.getString("COLUMN_NAME"));
  				   ts_obj.setColumniskey(rs.getString("COLUMN_KEY"));
				   ts_obj.setTextlength(rs.getString("CHARACTER_MAXIMUM_LENGTH"));//文本的长度
  				   ts_obj.setColumnComent(rs.getString("COLUMN_COMMENT"));
  				   ts_obj.setColumnisNull(rs.getString("IS_NULLABLE")); //判断是否允许为空
  				   ts_obj.setColumnType(rs.getString("COLUMN_TYPE"));
  				   ts_list.add(ts_obj);
  		  }
  		  
        rs.close();  
        con.close(); // 4、关闭数据库连接  
        return ts_list;
	}
	
	/**
	 * 生成pojo对象
	 * @param tableName 表名
	 * @param databaseName 数据库名
	 * @return
	 */
	public String construtsPojo(String tableName,String databaseName){
		
		StringBuffer sb = new StringBuffer();
		
		try {
			List<TableStructs>  ts_list = this.connectDataBase(tableName, databaseName);
			
			if(ts_list!=null&&ts_list.size()>0){
				sb.append("");
				boolean iskeyExist = false;
				String prototype = "";
				//产生属性值
				for(TableStructs obj : ts_list){
			          System.out.println(obj.getColumnName()+"  "+obj.getColumnType()+"  "+obj.getColumniskey());
			          sb.append("      @GenField(labelname=\""+obj.getColumnComent()+"\",column=\""+obj.getColumnName()+"\"");
			          if(obj.getColumniskey()!=null&&obj.getColumniskey().toLowerCase().equals("pri")&&!iskeyExist){
			        	  sb.append(",id=true");
			          }
			          
			          //获取字符的长度
			          String length = obj.getTextlength();
			          if(length!=null&&!length.trim().equals("")){
			        	  sb.append(",length="+length);
			          }
			          //在生成页面验证时使用如下代码
			          String isnull = obj.getColumnisNull();
			          
			          if(isnull!=null&&isnull.toLowerCase().trim().equals("no")){
			        	  sb.append(",isnull=false");
			          }else{
			        	  sb.append(",isnull=true");
			          }
			          String columnType = obj.getColumnType().toLowerCase();
			          sb.append(") \r\n");
			          //操作前对数据库中的属性分类
			          //判断是否是 int类型
			          if(columnType.indexOf("int")!=-1){
			        	  prototype = "Integer";
			          }
			          //判断是否是浮点型
			          if(columnType.indexOf("real")!=-1||columnType.indexOf("float")!=-1||columnType.indexOf("numeric")!=-1){
			        	  prototype = "Float";
			          }
			          //判断是否是双精度
			          if(columnType.indexOf("double")!=-1){
			        	  prototype = "Double";
			          }
			          //bit
			          if(columnType.indexOf("bit")!=-1){
			        	  prototype = "Short";
			          }
			          //判断是否是字符型
			          if(columnType.indexOf("blob")!=-1||columnType.indexOf("text")!=-1||columnType.indexOf("varchar")!=-1){
			        	  prototype = "String";
			          }
			          //判断是否是日期型
			          if(columnType.indexOf("date")!=-1||columnType.indexOf("year")!=-1
			        		           ||columnType.indexOf("time")!=-1){
			        	  prototype = "Date";
			          }
			          //二进制  暂时不 支持提供生成代码
				  		String vName =obj.getColumnName();
						String propertyName = "";					
						//首字母转大写
						String vNameArray[]=vName.split("_");
						if(vNameArray.length>1)
						for(int i=0;i<vNameArray.length;i++){
							vName=vNameArray[i];
							  if(i>0&&!Character.isUpperCase(vName.charAt(0)))
								  vName= new StringBuilder().append(Character.toUpperCase(vName.charAt(0))).append(vName.substring(1)).toString();
							  propertyName=propertyName+vName;	
							  
						}
						else
							propertyName=vName;
			          
			          sb.append("      private "+prototype+" "+propertyName+"; \r\n");
			          
			    }
			   //构建setter getter方法
				for(TableStructs obj : ts_list){
					String columnType = obj.getColumnType().toLowerCase();
			          //操作前对数据库中的属性分类
			          //判断是否是 int类型
			          if(columnType.indexOf("int")!=-1){
			        	  prototype = "Integer";
			          }
			          //判断是否是浮点型
			          if(columnType.indexOf("real")!=-1||columnType.indexOf("float")!=-1||columnType.indexOf("numeric")!=-1){
			        	  prototype = "Float";
			          }
			          //判断是否是双精度
			          if(columnType.indexOf("double")!=-1){
			        	  prototype = "Double";
			          }
			          //bit
			          if(columnType.indexOf("bit")!=-1){
			        	  prototype = "Short";
			          }
			          //判断是否是字符型
			          if(columnType.indexOf("blob")!=-1||columnType.indexOf("text")!=-1||columnType.indexOf("varchar")!=-1){
			        	  prototype = "String";
			          }
			          //判断是否是日期型
			          if(columnType.indexOf("date")!=-1||columnType.indexOf("year")!=-1
			        		           ||columnType.indexOf("time")!=-1){
			        	  prototype = "Date";
			          }
			          //二进制  暂时不 支持提供生成代码
				  		String vName =obj.getColumnName();
						String methodName = "";
						String propertyName = "";
						String vNameArray[]=vName.split("_");
						if(vNameArray.length>1)
						for(int i=0;i<vNameArray.length;i++){
							vName=vNameArray[i];
							  if(!Character.isUpperCase(vName.charAt(0)))
								  vName= new StringBuilder().append(Character.toUpperCase(vName.charAt(0))).append(vName.substring(1)).toString();
							  methodName=methodName+vName;	
							  
						}
						else{
							  if(!Character.isUpperCase(vName.charAt(0)))
								  methodName= new StringBuilder().append(Character.toUpperCase(vName.charAt(0))).append(vName.substring(1)).toString();
						}
						propertyName=new StringBuilder().append(Character.toLowerCase(methodName.charAt(0))).append(methodName.substring(1)).toString();
						
			          sb.append("      public "+prototype+" get"+methodName+"(){ \r\n");
			          sb.append("      	   return "+propertyName+";\r\n");
			          sb.append("      }\r\n");
			          
			          sb.append("      public void set"+methodName+"("+prototype+" "+ propertyName+"){ \r\n");
			          sb.append("      	   this."+propertyName+"="+propertyName+"; \r\n");
			          sb.append("      } \r\n");
			          
			    }
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sb.toString();
	}
	
}
