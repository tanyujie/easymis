/**
 * 
 */
package cn.easymis.uc.web;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;

import cn.easymis.commons.code.util.model.ModelActionUtils;
import cn.easymis.commons.code.util.model.ModelPageUtils;
import cn.easymis.commons.code.util.model.ModelServiceUtils;
import cn.easymis.commons.code.util.reflect.FieldColumnPojo;
import cn.easymis.commons.code.util.reflect.ReflectMain;
import cn.easymis.commons.code.util.reflect.ReflectVo;
import cn.easymis.commons.code.util.utils.GenFile;


/**
 * 生成代码工具
 * @author desert
 * @version 1.0 
 */
public class GenCodeMain {
	
	/**
	 * 根据模块中的所有类及所有页面
	 * @param pojoclass
	 */
	public void  genFile(Class pojoclass,String filePath){
		
        ReflectMain  rm = new ReflectMain();
		
		ReflectVo vo = rm.getReflectFieldAnnotation(pojoclass);
		
		if(vo!=null){
			FieldColumnPojo keyValue = vo.getKeyvalue_obj();
			List<FieldColumnPojo> list = vo.getFcp_list();
			String modelName = vo.getModelName();
			String tableName = vo.getTableName();
			String modelPackage = vo.getPackageName();
			String pojoClassName = vo.getPojoClassName();
			
			
			if(keyValue!=null){
				String keyColumn = keyValue.getColumn();
				String idValues = keyValue.getFieldName();
				
/*				//生成maper xml文件
				ModelMapperXMLUtils  mmu_obj = new ModelMapperXMLUtils();
				String mapperXmlContent = mmu_obj.construtMapperContent(modelPackage,pojoClassName, modelName, tableName, list, keyColumn, idValues);
				System.out.println(mapperXmlContent);
				
				this.genModelFolder(filePath, modelPackage, modelName, "mapperxml", mapperXmlContent);
				
				//生成maper java文件
				ModelMapperJava mmj = new ModelMapperJava();
				String mapperJavaContent = mmj.getModelJavaInterface(modelPackage, pojoClassName, modelName, idValues);
				System.out.println(mapperJavaContent);
				
				this.genModelFolder(filePath, modelPackage, modelName, "mapperjava", mapperJavaContent);*/
							
				//生成service java文件
				ModelServiceUtils   msu = new ModelServiceUtils();
				String intefaceJavaContent = msu.getModelServiceInterface(modelPackage+".uc",modelPackage, pojoClassName, modelName, idValues);
				System.out.println(intefaceJavaContent);
				
				this.genModelFolder(filePath, modelPackage, modelName, "serviceinterface", intefaceJavaContent);
				
				//service 实现类中的内容
				String implJavaContent = msu.getModelServiceImpl(modelPackage+".uc", modelPackage,pojoClassName, modelName, idValues);
				System.out.println(implJavaContent);
				
				this.genModelFolder(filePath, modelPackage, modelName, "serviceImpl", implJavaContent);
				
				
				//action中的内容
				ModelActionUtils  mau = new ModelActionUtils();
				String actionJavaContent = mau.modelActionContent(modelPackage+".uc", pojoClassName, modelName, idValues);
				System.out.println(actionJavaContent);
				
				this.genModelFolder(filePath, modelPackage, modelName, "action", actionJavaContent);
				
				/*					
				//生成页面
				ModelPageUtils  mpu = new ModelPageUtils();
				String indexJspContent = mpu.getIndexJsp(list, modelName);
				System.out.println(indexJspContent);
				this.genModelFolder(filePath, modelPackage, modelName, "indexjsp", indexJspContent);
				
				
				String gridJspContent = mpu.getGridContentJsp(list, modelName);
				System.out.println(gridJspContent);
				this.genModelFolder(filePath, modelPackage, modelName, "gridjsp", gridJspContent);
				
				String editContent = mpu.getEditJspContent(list, modelName);
				System.out.println(editContent);
				this.genModelFolder(filePath, modelPackage, modelName, "editjsp", editContent);*/
			}
		}
	}
	
	/**
	 * 只生成页面
	 * @param pojoclass
	 * @param filePath
	 * @param filePrefixName
	 */
	public  void  genOnlyPage(Class pojoclass,String filePath,String filePrefixName){
		  ReflectMain  rm = new ReflectMain();
			
			ReflectVo vo = rm.getReflectFieldAnnotation(pojoclass);
			
			if(vo!=null){
				FieldColumnPojo keyValue = vo.getKeyvalue_obj();
				List<FieldColumnPojo> list = vo.getFcp_list();
				String modelName = vo.getModelName();
				String tableName = vo.getTableName();
				String modelPackage = vo.getPackageName();
				String pojoClassName = vo.getPojoClassName();
				
				
				if(keyValue!=null){
					String keyColumn = keyValue.getColumn();
					String idValues = keyValue.getFieldName();
					
					//生成页面
					ModelPageUtils  mpu = new ModelPageUtils();
					String indexJspContent = mpu.getIndexJsp(list, modelName);
					System.out.println(indexJspContent);
					this.genOnlyPage(modelName,indexJspContent,filePath,filePrefixName,"index");
					
					
					String gridJspContent = mpu.getGridContentJsp(list, modelName);
					System.out.println(gridJspContent);
					this.genOnlyPage(modelName,gridJspContent,filePath,filePrefixName,"grid");
					
					String editContent = mpu.getEditJspContent(list, modelName);
					System.out.println(editContent);
					this.genOnlyPage(modelName,editContent,filePath,filePrefixName,"edit");
					
					
				} //end if
			}//end if		
	}
	
	/**
	 * 只生成编辑页面
	 * @param pojoclass
	 * @param filePath
	 */
	public void  genOnlyEditPageJsp(Class pojoclass,String filePath){
		  ReflectMain  rm = new ReflectMain();
			
			ReflectVo vo = rm.getReflectFieldAnnotation(pojoclass);
			
			if(vo!=null){
				FieldColumnPojo keyValue = vo.getKeyvalue_obj();
				List<FieldColumnPojo> list = vo.getFcp_list();
				String modelName = vo.getModelName();
				String modelPackage = vo.getPackageName();
				
				
				if(keyValue!=null){
					
					//生成页面
					ModelPageUtils  mpu = new ModelPageUtils();
					
					String editContent = mpu.getEditJspContent(list, modelName);
					System.out.println(editContent);
					this.genModelFolder(filePath, modelPackage, modelName, "editjsp", editContent);
					
				} //end if
			}//end if		
	}
	
	
	
	//生成指定的页面
	public void genOnlyPage(String modelName,String content,String filePath,String filePrefixName,String typeName){
		
		 GenFile  genFile = new GenFile();
		 
		 String pagePath = filePath.replace("src", "")+"WebRoot/pages/";
		 
		 try {
				File file = genFile.createFile(pagePath+modelName, filePrefixName+"_"+typeName+".jsp");
			    genFile.writeFile(file, content); //向文件中写内容
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	
	
	/**
	 * 根据模块生成文件夹结构
	 * @param filePath
	 * @param packageName
	 */
	public void  genModelFolder(String filePath,String packageName,String modelName,String classType,String content){
		if(packageName!=null&&filePath!=null){
			filePath = filePath.replace("%20", " ");
			
			String packageNamePath =filePath+"/"+packageName.replace(".", "/");
			
			
			
			StringBuffer sb = new StringBuffer(modelName);
			sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));

			
			System.out.println("packageNamePath===="+packageNamePath);
			//创建文件
			if(classType.trim().equals("action")){
				 GenFile  genFile = new GenFile();
				 try {
					File file = genFile.createFile(packageNamePath+"/uc/action/front", sb.toString()+"Act.java");
				    genFile.writeFile(file, content); //向文件中写内容
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else if(classType.trim().equals("serviceImpl")){
				 GenFile  genFile = new GenFile();
				 try {
					File file = genFile.createFile(packageNamePath+"/uc/manager/impl", sb.toString()+"MngImpl.java");
				    genFile.writeFile(file, content); //向文件中写内容
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}else if(classType.trim().equals("serviceinterface")){
				 GenFile  genFile = new GenFile();
				 try {
					File file = genFile.createFile(packageNamePath+"/uc/manager", sb.toString()+"Mng.java");
				    genFile.writeFile(file, content); //向文件中写内容
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}else if(classType.trim().equals("indexjsp")){
				 GenFile  genFile = new GenFile();
				 try {
					File file = genFile.createFile(filePath.replace("src", "")+"WebRoot/pages/"+modelName, "index.jsp");
				    genFile.writeFile(file, content); //向文件中写内容
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}else if(classType.trim().equals("gridjsp")){
				 GenFile  genFile = new GenFile();
				 
				 System.out.println("====="+filePath.replace("src", "")+"WebRoot/pages/");
				 
				 try {
					File file = genFile.createFile(filePath.replace("src", "")+"/WebRoot/pages/"+modelName, "grid.jsp");
				    genFile.writeFile(file, content); //向文件中写内容
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else if(classType.trim().equals("editjsp")){
				 GenFile  genFile = new GenFile();
				 
				 System.out.println("====="+filePath.replace("src", "")+"WebRoot/pages/");
				 
				 try {
					File file = genFile.createFile(filePath.replace("src", "")+"/WebRoot/pages/"+modelName, "edit.jsp");
				    genFile.writeFile(file, content); //向文件中写内容
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
		}
			}
		}
	}
	

	/**
	 * 获取项目的根路径
	 * 
	 * @return projectpath
	 */
	public String getProjectRoot() {
		 URL url = GenCodeMain.class.getResource("");
		 String path = url.toString().replace("file:/", "");
		 path = path.replace("com/taier/emergency/uc/", "");
		 path = path.replace("target/classes/","src/main/java");
		 path = path.replace("%20", " ");
		return path;
	}

	public static void main(String[] arg) {
		// 获取工程路径名称
		GenCodeMain gct = new GenCodeMain();
		String filePath = gct.getProjectRoot();
		// 根据pojo对象生成代码
	//	Class pojoclass = UserRoleDto.class;
		GenCodeMain gcm = new GenCodeMain();
		// 生成文件的路径名称
	//	gcm.genFile(pojoclass, filePath);

	}

}
