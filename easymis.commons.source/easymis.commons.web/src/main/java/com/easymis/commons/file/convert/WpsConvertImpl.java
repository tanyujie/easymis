package com.easymis.commons.file.convert;

import com.easymis.commons.file.IekerFile;

public class WpsConvertImpl implements FileConvert {

	public boolean makeFile(IekerFile cmsFile) {
		// TODO Auto-generated method stub
		return (new WpsImpl()).makeFile(cmsFile);
	}
}
