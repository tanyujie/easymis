package com.easymis.commons.office;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Tom
 */
public class FileUtils {

	public static String getFilePrefix(String fileName) {
		int splitIndex = fileName.lastIndexOf(".");
		return fileName.substring(0, splitIndex);
	}

	public static String getFileSufix(String fileName) {
		int splitIndex = fileName.lastIndexOf(".");
		return fileName.substring(splitIndex + 1);
	}

	public static String getFileName(String path) {
		int lastIndex = path.lastIndexOf(".");
		int firstIndex = path.lastIndexOf("/");
		return path.substring(firstIndex + 1, lastIndex);
	}

	public static String getFilePath(String fileName) {
		int splitIndex = fileName.lastIndexOf("/");
		return fileName.substring(0, splitIndex + 1);
	}

	public static Set<String> listFiles(File directory, String prefixFileName, String suffix) {
		Set<String> filenames = new HashSet<String>();
		if (directory != null && directory.isDirectory()) {
			File[] files = directory.listFiles();
			for (File f : files) {
				String fname = f.getName();
				if (fname.endsWith(suffix) && fname.startsWith(prefixFileName)) {
					filenames.add(fname);
				}
			}
		}
		return filenames;
	}

    public static boolean deleteGeneralFile(String path) {  
        boolean flag = false;  
  
        File file = new File(path);  
        if (!file.exists()) { // 文件不存在  
            System.out.println("要删除的文件不存在！");  
        }  
  
        if (file.isDirectory()) { // 如果是目录，则单独处理  
            flag = deleteDirectory(file.getAbsolutePath());  
        } else if (file.isFile()) {  
            flag = deleteFile(file);  
        }  
  
        return flag;  
    }
    private static boolean deleteFile(File file) {  
        return file.delete();  
    } 
    private static boolean deleteDirectory(String path) {  
        boolean flag = true;  
        File dirFile = new File(path);  
        if (!dirFile.isDirectory()) {  
            return flag;  
        }  
        File[] files = dirFile.listFiles();  
        for (File file : files) { // 删除该文件夹下的文件和文件夹  
            // Delete file.  
            if (file.isFile()) {  
                flag = deleteFile(file);  
            } else if (file.isDirectory()) {// Delete folder  
                flag = deleteDirectory(file.getAbsolutePath());  
            }  
            if (!flag) { // 只要有一个失败就立刻不再继续  
                break;  
            }  
        }  
        flag = dirFile.delete(); // 删除空目录  
        return flag;  
    } 
    public static boolean copyGeneralFile(String srcPath, String destDir) {  
        boolean flag = false;  
        File file = new File(srcPath);  
        if (!file.exists()) {  
            return false;  
        }  
        if (file.isFile()) { // 源文件  
            flag = copyFile(srcPath, destDir);  
        } else if (file.isDirectory()) {  
            flag = copyDirectory(srcPath, destDir);  
        }    
        return flag;  
    }  
    private static boolean copyFile(String srcPath, String destDir) {  
        boolean flag = false;    
        File srcFile = new File(srcPath);  
        if (!srcFile.exists()) { // 源文件不存在   
            return false;  
        }  
        // 获取待复制文件的文件名  
        String fileName = srcPath  
                .substring(srcPath.lastIndexOf(File.separator));  
        String destPath = destDir + fileName;  
        if (destPath.equals(srcPath)) { // 源文件路径和目标文件路径重复  
            return false;  
        }  
        File destFile = new File(destPath);  
        if (destFile.exists() && destFile.isFile()) { // 该路径下已经有一个同名文件  
            return false;  
        }  
  
        File destFileDir = new File(destDir);  
        destFileDir.mkdirs();  
        try {  
            FileInputStream fis = new FileInputStream(srcPath);  
            FileOutputStream fos = new FileOutputStream(destFile);  
            byte[] buf = new byte[1024];  
            int c;  
            while ((c = fis.read(buf)) != -1) {  
                fos.write(buf, 0, c);  
            }  
            fis.close();  
            fos.close();  
  
            flag = true;  
        } catch (IOException e) {  
            //  
        }  
        return flag;  
    }  

	private static boolean copyDirectory(String srcPath, String destDir) {
		boolean flag = false;

		File srcFile = new File(srcPath);
		if (!srcFile.exists()) { // 源文件夹不存在
			return false;
		}
		// 获得待复制的文件夹的名字，比如待复制的文件夹为"E://dir"则获取的名字为"dir"
		String dirName = getDirName(srcPath);
		// 目标文件夹的完整路径
		String destPath = destDir + File.separator + dirName;
		// System.out.println("目标文件夹的完整路径为：" + destPath);

		if (destPath.equals(srcPath)) {
			return false;
		}
		File destDirFile = new File(destPath);
		if (destDirFile.exists()) { // 目标位置有一个同名文件夹
			return false;
		}
		destDirFile.mkdirs(); // 生成目录

		File[] fileList = srcFile.listFiles(); // 获取源文件夹下的子文件和子文件夹
		if (fileList.length == 0) { // 如果源文件夹为空目录则直接设置flag为true，这一步非常隐蔽，debug了很久
			flag = true;
		} else {
			for (File temp : fileList) {
				if (temp.isFile()) { // 文件
					flag = copyFile(temp.getAbsolutePath(), destPath);
				} else if (temp.isDirectory()) { // 文件夹
					flag = copyDirectory(temp.getAbsolutePath(), destPath);
				}
				if (!flag) {
					break;
				}
			}
		}
		return flag;
	}  
    /** 
     * 获取待复制文件夹的文件夹名 
     *  
     * @param dir 
     * @return String 
     */  
    private static String getDirName(String dir) {  
        if (dir.endsWith(File.separator)) { // 如果文件夹路径以"//"结尾，则先去除末尾的"//"  
            dir = dir.substring(0, dir.lastIndexOf(File.separator));  
        }  
        return dir.substring(dir.lastIndexOf(File.separator) + 1);  
    }  
    
	/**
	 * 由上面方法延伸出剪切方法：复制+删除
	 * 
	 * @param srcPath
	 * @param destDir
	 * @return
	 */
	public static boolean cutGeneralFile(String srcPath, String destDir) {
		if (!copyGeneralFile(srcPath, destDir)) {
			return false;
		}
		if (!deleteGeneralFile(srcPath)) {
			return false;
		}
		return true;
	}

	public static String toHtmlString(File file, String filepath) {
		// 获取HTML文件流
		StringBuffer htmlSb = new StringBuffer();
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "gb2312"));
			while (br.ready()) {
				htmlSb.append(br.readLine());
			}
			br.close();
			// 删除临时文件
			file.delete();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// HTML文件字符串
		String htmlStr = htmlSb.toString();
		// 返回经过清洁的html文本
		return htmlStr;
		// return clearFormat(htmlStr, filepath);
	}

	public static String subString(String html, String prefix, String subfix) {
		return html.substring(html.indexOf(prefix) + prefix.length(), html.indexOf(subfix));
	}

	/**
	 * 清除一些不需要的html标记
	 * 
	 * @param htmlStr
	 *            带有复杂html标记的html语句
	 * @return 去除了不需要html标记的语句
	 */
	public static String clearFormat(String htmlStr, String docImgPath) {
		// 获取body内容的正则
		String bodyReg = "<BODY .*</BODY>";
		Pattern bodyPattern = Pattern.compile(bodyReg);
		Matcher bodyMatcher = bodyPattern.matcher(htmlStr);
		if (bodyMatcher.find()) {
			// 获取BODY内容，并转化BODY标签为DIV
			htmlStr = bodyMatcher.group().replaceFirst("<BODY", "<DIV").replaceAll("</BODY>", "</DIV>");
		}
		// 调整图片地址
		htmlStr = htmlStr.replaceAll("<IMG SRC=\"", "<IMG SRC=\"" + docImgPath + "/");
		// 把<P></P>转换成</div></div>保留样式
		// content = content.replaceAll("(<P)([^>]*>.*?)(<\\/P>)",
		// "<div$2</div>");
		// 把<P></P>转换成</div></div>并删除样式
		htmlStr = htmlStr.replaceAll("(<P)([^>]*)(>.*?)(<\\/P>)", "<p$3</p>");
		// 删除不需要的标签
		htmlStr = htmlStr.replaceAll(
				"<[/]?(font|FONT|span|SPAN|xml|XML|del|DEL|ins|INS|meta|META|[ovwxpOVWXP]:\\w+)[^>]*?>", "");
		// 删除不需要的属性
		htmlStr = htmlStr.replaceAll(
				"<([^>]*)(?:lang|LANG|class|CLASS|style|STYLE|size|SIZE|face|FACE|[ovwxpOVWXP]:\\w+)=(?:'[^']*'|\"\"[^\"\"]*\"\"|[^>]+)([^>]*)>",
				"<$1$2>");
		return htmlStr;
	}
	public static void inputStreamToFile(InputStream ins,File file) {
		  try {
		   OutputStream os = new FileOutputStream(file);
		   int bytesRead = 0;
		   byte[] buffer = new byte[8192];
		   while ((bytesRead = ins.read(buffer, 0, 8192)) != -1) {
		    os.write(buffer, 0, bytesRead);
		   }
		   os.close();
		   ins.close();
		  } catch (Exception e) {
		   e.printStackTrace();
		  }
		 }
	public static void main(String[] args) { 
		 cutGeneralFile("E:\\vkdoc\\img\\", "E:\\vkdoc\\file"); // 剪切文件  
	}

}