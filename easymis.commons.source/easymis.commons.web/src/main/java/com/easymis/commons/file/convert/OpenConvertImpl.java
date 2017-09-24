package com.easymis.commons.file.convert;

import com.easymis.commons.file.IekerFile;

public class OpenConvertImpl implements FileConvert {

	public boolean makeFile(IekerFile cmsFile) {
		// TODO Auto-generated method stub
		return (new OpenImpl()).makeFile(cmsFile);
	}
}
