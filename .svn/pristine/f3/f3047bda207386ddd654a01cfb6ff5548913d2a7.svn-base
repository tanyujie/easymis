/**
 * 
 */
package cn.easymis.commons.code.util.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 生成类文件或前台网页文件
 * @author desert
 * @version 1.0 2014/2/12
 */
public class GenFile {
	
	
	/**
	 * 生成类文件
	 * @param fileDir     文件路径
	 * @param fileName    文件名称
	 * @throws IOException 
	 */
	public File  createFile(String fileDir,String fileName) throws IOException{
		
		  //创建文件夹
		  if(fileDir!=null){
			  File dir = new File(fileDir);
			  if(!dir.exists()){
				  dir.mkdirs(); 
			  }
		  }else{
			  System.err.print("文件路径不存在！");
			  return null;
		  }
		  
		  File  file = null;
		  
		  //创建文件
		  if(fileName!=null){
			  file = new File(fileDir,fileName);
              
			  if(!file.exists()){
				  file.createNewFile();
			  }
		  }//end if
		  
		  return file;
	}
	
	/**
	 * 向文件中写入内容
	 * @param file
	 * @throws FileNotFoundException 
	 */
	public void  writeFile(File file,String content) throws FileNotFoundException{
	        RandomAccessFile mm = null;
	        try {
	            mm = new RandomAccessFile(file, "rw");
	            mm.write(content.getBytes());
	        } catch (IOException e1) {
	            // TODO 自动生成 catch 块
	            e1.printStackTrace();
	        } finally {
	            if (mm != null) {
	                try {
	                    mm.close();
	                } catch (IOException e2) {
	                    // TODO 自动生成 catch 块
	                    e2.printStackTrace();
	                }
	            }
	        }
	}

}
