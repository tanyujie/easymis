package cn.easymis.entitys.mybatis;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import cn.easymis.commons.code.util.utils.GenFile;
import cn.easymis.commons.code.util.utils.TableUtils;



/**
 * 生成pojo对象
 * @author zhangai 
 */
public class GenerateDataToObjectMain {
	
	/**
	 * 获取工程的根路径名称
	 * @return projectpath
	 */
	public String getProjectRoot(){
		 URL url = GenerateDataToObjectMain.class.getResource("");
		 String path = url.toString().replace("file:/", "");
		 path = path.replace("cn/easymis/entitys/mybatis", "");//需要修改
		 path = path.replace("target/classes/","src/main/java/");
		 path = path.replace("%20", " ");
		return path;
	}
	
	/**
	 * 生成pojo对象的方法
	 * 
	 * @param packageName
	 *            包名
	 * @param ModelName
	 *            模块名
	 * @param tableName
	 *            表名
	 * @param databaseName
	 *            数据库名称
	 * @param fileName
	 */
	public void generateDataToObject(String packageName,String ModelName ,String tableName,String databaseName,String fileName){
		
		//生成pojo类
		StringBuffer sb = new StringBuffer();
		//包名称
		sb.append("package "+packageName+".entity;\r\n");
		//需要导入的类名
		sb.append("import java.io.Serializable; \r\n");
		sb.append("import cn.easymis.commons.code.util.annotation.GenField; \r\n");
		sb.append("import cn.easymis.commons.code.util.annotation.GenModel; \r\n");
		sb.append("import cn.easymis.commons.code.util.annotation.GenTable; \r\n");
		sb.append("import java.util.*; \r\n");
		//加入几个空白行
		sb.append(" \r\n ");
		sb.append(" \r\n ");
		sb.append(" \r\n ");
		//文件的类定义
		sb.append("@GenTable(name=\""+tableName+"\") \r\n");
		sb.append("@GenModel(packageName=\""+packageName+"\",modelName=\""+ModelName+"\")  \r\n");
		sb.append(" public class "+fileName+" implements Serializable{  \r\n");
		TableUtils tu = new TableUtils();
		sb.append(tu.construtsPojo(tableName, databaseName));
		sb.append("}");
		//生成文件
		String FilePath  = this.getProjectRoot();
		 GenFile  genFile = new GenFile();
		 try {
			File file = genFile.createFile(FilePath+File.separator+packageName.replace(".", "/")+"/dto", fileName+".java");
		    genFile.writeFile(file, sb.toString()); //向文件中写内容
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] arg){
		GenerateDataToObjectMain  dto = new GenerateDataToObjectMain();
		dto.generateDataToObject("cn.easymis.entitys.mybatis", "OaFunction", "oa_function", "ierp", "OaFunctionDto");

	}

}
