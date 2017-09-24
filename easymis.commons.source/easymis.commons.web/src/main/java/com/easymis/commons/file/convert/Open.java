package com.easymis.commons.file.convert;

import com.easymis.commons.file.IekerFile;

public interface Open {
	public boolean makePdf(IekerFile cmsFile);

	public boolean makePdf(String source, String target);

	public boolean makeSwf(IekerFile cmsFile);

	public boolean makeSwf(String pdfFile, String swfFile);

	public boolean makeFile(IekerFile cmsFile);

}