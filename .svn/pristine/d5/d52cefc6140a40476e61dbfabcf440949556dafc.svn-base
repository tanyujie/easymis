package com.easymis.commons.office;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.net.ConnectException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.imageio.ImageIO;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;

import com.artofsolving.jodconverter.DocumentConverter;
import com.artofsolving.jodconverter.openoffice.connection.OpenOfficeConnection;
import com.artofsolving.jodconverter.openoffice.connection.SocketOpenOfficeConnection;
import com.artofsolving.jodconverter.openoffice.converter.OpenOfficeDocumentConverter;

public class DocToSwf {
	private static final String RUL_PATH = Thread.currentThread().getContextClassLoader().getResource("").getPath()
			.replace("%20", " ") + "url.properties";

	/**
	 * 将word文档转换成html文档
	 * 
	 * @param docFile
	 *            需要转换的word文档
	 * @param filepath
	 *            转换之后pdf的存放路径
	 * @return 转换之后的pdf文件
	 */
	public static File convertPdf(File docFile, String filepath) {
		// 创建保存html的文件
		File pdfFile = new File(filepath + "/" + new Date().getTime() + ".pdf");
		// 创建Openoffice连接
		OpenOfficeConnection con = new SocketOpenOfficeConnection(8100);
		try {
			// 连接
			con.connect();
			System.out.println("获取OpenOffice连接成功...");
		} catch (ConnectException e) {
			System.out.println("获取OpenOffice连接失败...");
			e.printStackTrace();
		}
		// 创建转换器
		DocumentConverter converter = new OpenOfficeDocumentConverter(con);
		// 转换文档问html
		converter.convert(docFile, pdfFile);

		// 关闭openoffice连接
		con.disconnect();
		return pdfFile;
	}

	/**
	 * 将word文档转换成html文档
	 * 
	 * @param docFile
	 *            需要转换的word文档
	 * @param filepath
	 *            转换之后pdf的存放路径
	 * @return 转换之后的pdf文件
	 */
	public static String convertPdf(String docPath, String filePath) {
		try {
			File docFile = new File(docPath);
			if (!docFile.exists()) {
				return "";// 找不到源文件, 则返回-1
			}
			// 如果目标路径不存在, 则新建该路径
			/* filePath=filePath + "/" + new Date().getTime() + ".pdf"; */
			File pdfFile = new File(filePath);
			if (!pdfFile.getParentFile().exists()) {
				pdfFile.getParentFile().mkdirs();
			}

			String OpenOffice_HOME = "C:\\Program Files (x86)\\OpenOffice 4\\";// 这里是OpenOffice的安装目录,
																				// 在我的项目中,为了便于拓展接口,没有直接写成这个样子,但是这样是绝对没问题的
			// 如果从文件中读取的URL地址最后一个字符不是 '\'，则添加'\'
			if (OpenOffice_HOME.charAt(OpenOffice_HOME.length() - 1) != '\\') {
				OpenOffice_HOME += "\\";
			}
			// 启动OpenOffice的服务
			String command = OpenOffice_HOME
					+ "program\\soffice.exe -headless -accept=\"socket,host=127.0.0.1,port=8100;urp;\"";
			Process pro = Runtime.getRuntime().exec(command);
			// connect to an OpenOffice.org instance running on port 8100
			OpenOfficeConnection connection = new SocketOpenOfficeConnection("127.0.0.1", 8100);
			connection.connect();

			// convert
			DocumentConverter converter = new OpenOfficeDocumentConverter(connection);
			converter.convert(docFile, pdfFile);

			// close the connection
			connection.disconnect();
			// 关闭OpenOffice服务的进程
			pro.destroy();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return "";
		} catch (ConnectException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return filePath;
	}

	/**
	 * 将word文档转换成html文档
	 * 
	 * @param docFile
	 *            需要转换的word文档
	 * @param filePath
	 *            转换之后swf的存放路径
	 * @return 转换之后的swf文件
	 */
	public static File convertSwf(File docFile, String filePath) {
		// 创建保存html的文件
		File swfFile = new File(filePath + "/" + new Date().getTime() + ".swf");
		// 创建Openoffice连接
		OpenOfficeConnection con = new SocketOpenOfficeConnection(8100);
		try {
			// 连接
			con.connect();
			System.out.println("获取OpenOffice连接成功...");
		} catch (ConnectException e) {
			System.out.println("获取OpenOffice连接失败...");
			e.printStackTrace();
		}
		// 创建转换器
		DocumentConverter converter = new OpenOfficeDocumentConverter(con);
		// 转换文档问html
		converter.convert(docFile, swfFile);
		// 关闭openoffice连接
		con.disconnect();
		return swfFile;
	}

	/**
	 * 将pdf文档首页转换成jpg文件
	 * 
	 * @param pdfFile
	 * @param jpgFile
	 * @return
	 */

	public static String pdf2jpg(String pdfFile, String jpgFile) {
		File file = new File(pdfFile);
		try {
			RandomAccessFile raf = new RandomAccessFile(file, "r");
			FileChannel channel = raf.getChannel();
			ByteBuffer buf = channel.map(FileChannel.MapMode.READ_ONLY, 0, channel.size());
			// PDFFile pdffile = new PDFFile(buf);
			String getPdfFilePath = jpgFile;
		} catch (Exception e) {

		}
		return null;

	}

	/**
	 * 
	 * @param source
	 *            源文件
	 * @param target
	 *            目标文件
	 * @param x
	 *            读取源文件中的第几页
	 */
	public static int pdf2Jpg(String source, String target, int x) {
		PDDocument doc;
		try {
			doc = PDDocument.load(source);
			List<?> pages = doc.getDocumentCatalog().getAllPages();
			if (pages.size() > 0) {
				PDPage page = (PDPage) pages.get(x);
				BufferedImage image = page.convertToImage();
				File file = new File(target);
				ImageIO.write(image, "jpg", file);
			}
			return pages.size();
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}

	}

	public static String pdf2SWF(String pdfFile, String swfFile) {

		// 目标路径不存在则建立目标路径
		File dest = new File(swfFile);
		if (!dest.getParentFile().exists())
			dest.getParentFile().mkdirs();

		// 源文件不存在则返回 空
		File source = new File(pdfFile);
		if (!source.exists())
			return "";

		// SWFTools的安装路径。在我的项目中，我为了便于拓展接口，没有直接将SWFTools的安装路径写在这里，详见附件
		Properties prop = new Properties();
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(RUL_PATH);//
			prop.load(fis);//
			fis.close();//
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return "";
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}

		String t = prop.getProperty("SWFTools_HOME");
		if (t == null)
			return "";
		// 如果从文件中读取的URL地址最后一个字符不是 '\'，则添加'\'
		if (t.charAt(t.length() - 1) != '\\') {
			t += "\\";
		}

		try {
			// 调用pdf2swf命令进行转换swfextract -i - sourcefilePath.pdf -o
			// destFilePath.swf
			String command = t + "pdf2swf.exe  -i " + pdfFile + " -o " + swfFile;
			Process pro = Runtime.getRuntime().exec(command);

			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(pro.getInputStream()));
			while (bufferedReader.readLine() != null) {

			}
			pro.waitFor();
			pro.exitValue();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		return swfFile;
	}

	public static void main(String[] args) {/*
		String sourceFile = "F:\\doc\\test.doc";
		String destFile = "F:\\doc\\test2.pdf";
		// System.out.println(DocToSwf.convertPdf(sourceFile, destFile));

		sourceFile = "D:\\company\\tomcat7\\7.0.62\\webapps\\cms\\u\\cms\\www\\201605\\1314304718m8.jpg";
		destFile = "D:\\company\\tomcat7\\7.0.62\\webapps\\cms\\u\\cms\\www\\201605\\13143043d9re.jpg";
		try {
			MagickImageScale.resizeFix(new File(sourceFile), new File(destFile), 110, 120);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MagickException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	*/}
}
