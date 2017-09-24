package com.easymis.commons.file.convert;

import java.util.Locale;

import org.apache.commons.io.FilenameUtils;

import com.easymis.commons.file.IekerFile;

public class OpenImpl implements Open {

	public boolean makePdf(IekerFile cmsFile) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean makePdf(String source, String target) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean makeSwf(IekerFile cmsFile) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean makeSwf(String pdfFile, String swfFile) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean makeFile(IekerFile cmsFile) {
		String ext = FilenameUtils.getExtension(cmsFile.getFileName()).toLowerCase(Locale.ENGLISH);
		if ("*.pdf".indexOf(ext) > 0)
			makePdf(cmsFile);
		else
			cmsFile.setPdfPath(cmsFile.getFilePath());
		makeSwf(cmsFile);
		return true;
	}
}
