package com.easymis.commons.file.convert;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Properties;

import org.apache.commons.io.FilenameUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.easymis.commons.file.IekerFile;
import com.jacob.activeX.ActiveXComponent;
public class MicrosoftImpl implements Microsoft {
	private static final int wdDoNotSaveChanges = 0;// 不保存待定的更改。
	private static final int wdFormatPDF = 17;// word转PDF 格式
	private static final int xlTypePDF = 0;
	private static final int ppSaveAsPDF = 32;
	private static final int msofalse = 0;
	private static final Logger log = LoggerFactory.getLogger(MicrosoftImpl.class);
	private static final String RUL_PATH = Thread.currentThread().getContextClassLoader().getResource("").getPath()
			.replace("%20", " ") + "url.properties";

	public boolean makePdf(IekerFile cmsFile) {
		return makePdf(cmsFile.getFilePath(), cmsFile.getPdfPath());
	}

	public boolean makePdf(String source, String target) {
		log.debug("Word转PDF开始启动...");
		long start = System.currentTimeMillis();
		try {
			File tofile = new File(target);
			if (tofile.exists()) {
				tofile.delete();
			}
			String suffix = FilenameUtils.getExtension(source).toLowerCase(Locale.ENGLISH);
			if (suffix.equals("doc") || suffix.equals("docx") || suffix.equals("txt")) {
				word2PDF(source, target);
			} else if (suffix.equals("ppt") || suffix.equals("pptx")) {
				ppt2PDF(source, target);
			} else if (suffix.equals("xls") || suffix.equals("xlsx")) {
				excel2PDF(source, target);
			}
			long end = System.currentTimeMillis();
			log.debug("转换完成，用时：" + (end - start) + "ms");
			return true;
		} catch (Exception e) {
			log.debug("Word转PDF出错：" + e.getMessage());
			return false;
		}
	}

	public boolean makeSwf(IekerFile cmsFile) throws Exception {
		return makeSwf(cmsFile.getPdfPath(), cmsFile.getSwfPath());
	}

	public boolean makeSwf(String pdfFile, String swfFile) throws Exception {
		// 目标路径不存在则建立目标路径
		File dest = new File(swfFile);
		if (!dest.getParentFile().exists())
			dest.getParentFile().mkdirs();
		// 源文件不存在则返回 空
		File source = new File(pdfFile);
		if (!source.exists())
			return false;
		// SWFTools的安装路径。在我的项目中，我为了便于拓展接口，没有直接将SWFTools的安装路径写在这里，详见附件
		Properties prop = new Properties();
		FileInputStream fis = null;
		fis = new FileInputStream(RUL_PATH);//
		prop.load(fis);//
		fis.close();//
		String t = prop.getProperty("SWFTools_HOME");
		if (t == null)
			return false;
		// 如果从文件中读取的URL地址最后一个字符不是 '\'，则添加'\'
		if (t.charAt(t.length() - 1) != '\\') {
			t += "\\";
		}

		// 调用pdf2swf命令进行转换swfextract -i - sourcefilePath.pdf -o
		// destFilePath.swf
		String command = t + "pdf2swf.exe  -i " + pdfFile + " -o " + swfFile;
		Process pro = Runtime.getRuntime().exec(command);
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(pro.getInputStream()));
		while (bufferedReader.readLine() != null) {

		}
		pro.waitFor();
		pro.exitValue();
		return true;
	}

	public boolean makeFile(IekerFile cmsFile) throws Exception {
		String ext = FilenameUtils.getExtension(cmsFile.getFilePath()).toLowerCase(Locale.ENGLISH);
		if ("*.pdf".indexOf(ext) > 0)
			cmsFile.setPdfPath(cmsFile.getFilePath());
		else
			makePdf(cmsFile);

		makeSwf(cmsFile);
		return true;
	}

	private boolean word2PDF(String inputFile, String pdfFile) {
		// 打开word应用程序
		ActiveXComponent app = new ActiveXComponent("Word.Application");
		try { // 设置word不可见
			app.setProperty("Visible", false);
			// 获得word中所有打开的文档,返回Documents对象
/*			Dispatch docs = app.getProperty("Documents").toDispatch();
			// 调用Documents对象中Open方法打开文档，并返回打开的文档对象Document
			Dispatch doc = Dispatch.call(docs, "Open", inputFile, false, true).toDispatch();
			// 调用Document对象的SaveAs方法，将文档保存为pdf格式
			Dispatch.call(doc, "ExportAsFixedFormat", pdfFile, wdFormatPDF // word保存为pdf格式宏，值为17
			);
			// 关闭文档
			Dispatch.call(doc, "Close", false);*/
			// 关闭word应用程序
			app.invoke("Quit", 0);
			return true;
		} catch (Exception e) {
			return false;
		} finally {
			if (app != null) {
				// 不保存待定的更改,并退出
				app.invoke("Quit", wdDoNotSaveChanges);
			}
		}
	}

	private boolean excel2PDF(String inputFile, String pdfFile) {
		ActiveXComponent app = new ActiveXComponent("Excel.Application");
		try {
			app.setProperty("Visible", false);
/*			Dispatch excels = app.getProperty("Workbooks").toDispatch();
			Dispatch excel = Dispatch.call(excels, "Open", inputFile, false, true).toDispatch();
			Dispatch.call(excel, "ExportAsFixedFormat", xlTypePDF, pdfFile);
			Dispatch.call(excel, "Close", false);*/
			app.invoke("Quit");
			return true;
		} catch (Exception e) {
			return false;
		} finally {
			if (app != null) {
				// 不保存待定的更改,并退出
				app.invoke("Quit", wdDoNotSaveChanges);
			}
		}

	}

	private boolean ppt2PDF(String inputFile, String pdfFile) {
		ActiveXComponent app = new ActiveXComponent("PowerPoint.Application");
		try {
			//app.setProperty("Visible", msofalse);
/*			Dispatch ppts = app.getProperty("Presentations").toDispatch();

			Dispatch ppt = Dispatch.call(ppts, "Open", inputFile, true, // ReadOnly
					true, // Untitled指定文件是否有标题
					false// WithWindow指定文件是否可见
			).toDispatch();

			Dispatch.call(ppt, "SaveAs", pdfFile, ppSaveAsPDF);

			Dispatch.call(ppt, "Close");*/

			app.invoke("Quit");
			return true;
		} catch (Exception e) {
			return false;
		} finally {
			if (app != null) {
				// 不保存待定的更改,并退出
				app.invoke("Quit", wdDoNotSaveChanges);
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String source1 = "F:\\美食俱乐部产品策划书.doc";
		String target1 = "F:\\智慧教育云平台方案.pdf";
		MicrosoftImpl pdf = new MicrosoftImpl();
		pdf.makePdf(source1, target1);
		String ext = FilenameUtils.getExtension(source1).toLowerCase(Locale.ENGLISH);
		String pdfExt = "*.doc";
		if (pdfExt.indexOf(ext) > 0)

			System.out.println("Ok");

	}

}
