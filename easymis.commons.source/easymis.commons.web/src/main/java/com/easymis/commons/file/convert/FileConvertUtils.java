package com.easymis.commons.file.convert;

import java.util.Locale;

import org.apache.commons.io.FilenameUtils;

import com.easymis.commons.file.IekerFile;

public class FileConvertUtils {
	private static final String pdfExt = "*.pdf";
	private static final String wpsExt = "*.wps";
	private static final String microsoftExt = "*.doc;*.docx;*.ppt;*.pptx;*.xls;*.xlsx;*.txt;*.pdf;*.vsd;*.vsdx;*.pps;*.ppsx;*.pot;*.potx;*.rtf;*.et;*.dps;*.jpg;*.png;*.gif;*.bmp;";

	public static void makeFile(IekerFile cmsFile) throws Exception {
		String ext = FilenameUtils.getExtension(cmsFile.getFilePath()).toLowerCase(Locale.ENGLISH);
		if (pdfExt.indexOf(ext) > 0) {
			FileConvert fileConvert = new WpsConvertImpl();
			fileConvert.makeFile(cmsFile);
		} else if (wpsExt.indexOf(ext) > 0) {
			FileConvert fileConvert = new WpsConvertImpl();
			fileConvert.makeFile(cmsFile);
		} else if (microsoftExt.indexOf(ext) > 0) {
			FileConvert fileConvert = new MicrosoftConvertImpl();
			fileConvert.makeFile(cmsFile);

		}
	}

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		String filePath = "f:\\doc\\Velocity用户开发手册.doc";
		String pdfPath = "f:\\doc\\Velocity用户开发手册.pdf";
		String swfPath = "f:\\doc\\Velocity用户开发手册.swf";
		FileConvertUtils fileUtil = new FileConvertUtils();
		IekerFile cmsFile = new IekerFile();
		cmsFile.setFilePath(filePath);
		cmsFile.setPdfPath(pdfPath);
		cmsFile.setSwfPath(swfPath);
		fileUtil.makeFile(cmsFile);

	}
}
