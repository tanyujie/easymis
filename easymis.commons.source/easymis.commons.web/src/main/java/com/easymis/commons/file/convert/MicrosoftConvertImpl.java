package com.easymis.commons.file.convert;

import com.easymis.commons.file.IekerFile;

public class MicrosoftConvertImpl implements FileConvert {

	public boolean makeFile(IekerFile cmsFile) throws Exception {
		// TODO Auto-generated method stub
		return (new MicrosoftImpl()).makeFile(cmsFile);
	}
}
