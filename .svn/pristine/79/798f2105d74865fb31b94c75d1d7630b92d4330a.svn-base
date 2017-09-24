/**
 * 
 */
package cn.easymis.commons.code.util.utils;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.net.URL;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * spring解析Properties文件
 * @author tanYuJie
 */
public class DBPropertiesUtil implements Serializable{

	private static final long serialVersionUID = 1L;
	public static  String ctijdbcdrive = "com.mysql.jdbc.Driver";
	public static  String ctijdbcurl = "jdbc:mysql://localhost:3306/ierp";
	public static  String ctijdbcuser = "root";
	public static  String ctijdbcpassword = "root";	
	
	public static  String jdbcdrive = "com.mysql.jdbc.Driver";
	public static  String jdbcurl = "jdbc:mysql://localhost:3306/ierp";
	public static  String jdbcuser = "root";
	public static  String jdbcpassword = "root";
	
	//解析数据库配置文件
	public DBPropertiesUtil() {/*
		Properties p = new Properties();
		InputStream in = null;

		try {
			in = new BufferedInputStream(new FileInputStream(this.getPropertiesPath()));
			p.load(in);

			jdbcdrive = p.get("jdbc.drive").toString();
			jdbcurl = p.get("jdbc.url").toString();
			jdbcuser = p.get("jdbc.user").toString();
			jdbcpassword = p.get("jdbc.password").toString();

			ctijdbcdrive = p.get("jdbc.ctidrive").toString();
			ctijdbcurl = p.get("jdbc.ctiurl").toString();
			ctijdbcuser = p.get("jdbc.ctiuser").toString();
			ctijdbcpassword = p.get("jdbc.ctipassword").toString();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	*/}
	//解析数据库配置文件
/**
 * 
 * @param filePath 数据库文件路径
 */
	public DBPropertiesUtil(String filePath) {
		Properties p = new Properties();
		InputStream in = null;

		try {
			in = new BufferedInputStream(new FileInputStream(filePath));
			p.load(in);

			jdbcdrive = p.get("jdbc.drive").toString();
			jdbcurl = p.get("jdbc.url").toString();
			jdbcuser = p.get("jdbc.user").toString();
			jdbcpassword = p.get("jdbc.password").toString();

			ctijdbcdrive = p.get("jdbc.ctidrive").toString();
			ctijdbcurl = p.get("jdbc.ctiurl").toString();
			ctijdbcuser = p.get("jdbc.ctiuser").toString();
			ctijdbcpassword = p.get("jdbc.ctipassword").toString();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	public String  getPropertiesPath(){
        URL url = DBPropertiesUtil.class.getResource(""); 
		
		String filePath="";
		filePath = url.toString().replace("file:", "").replace("com/tyeryi/base/utils/", "config/db.properties"); 
		filePath = filePath.replace("%20", " ");
	
		return filePath;
	}
	
	public static void main(String[] arg){
		DBPropertiesUtil  dbpu_obj =  new DBPropertiesUtil();
		
		String filePath= dbpu_obj.getPropertiesPath();
		
		System.out.println(filePath);
		
	}
}
