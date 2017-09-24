/**
 * 
 */
package cn.easymis.commons.code.util.utils;

import java.net.URL;

/**
 * 获取工程的根目录
 * @author desert
 * @version 1.0 2014/2/12
 */
public class GetProjectRoot {
	
	/**
	 * 获取工程的根路径
	 * @return projectpath
	 */
	public String getProjectRoot(){
		
		 URL url = GetProjectRoot.class.getResource("");
		
		 String path = url.toString().replace("file:/", "");
		 
		 path = path.replace("com/tyeryi/utils/", "");
		 
		 System.out.println("类文件生成路径为："+path);
		
		return path;
	}
	
	/**
	 * 测试
	 * @param arg
	 */
	public static void main(String[] arg){
		GetProjectRoot  gpr = new GetProjectRoot();
		
		gpr.getProjectRoot();
		
	}

}
