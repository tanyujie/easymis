package cn.easymis.entitys.mybatis.dto;

import cn.easymis.entitys.mybatis.dto.base.BaseCmsFile;

public class CmsFile extends BaseCmsFile {
	private static final long serialVersionUID = 1L;

	/* [CONSTRUCTOR MARKER BEGIN] */
	public CmsFile() {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public CmsFile(java.lang.String filePath) {
		super(filePath);
	}

	/**
	 * Constructor for required fields
	 */
	public CmsFile(java.lang.String filePath, boolean fileIsvalid) {

		super(filePath, fileIsvalid);
	}

	public Boolean getFileIsvalid() {
		return super.isFileIsvalid();
	}

	/* [CONSTRUCTOR MARKER END] */
	private String titleImg;
	private int docPage;

	public String getTitleImg() {
		return titleImg;
	}

	public void setTitleImg(String titleImg) {
		this.titleImg = titleImg;
	}

	public int getDocPage() {
		return docPage;
	}

	public void setDocPage(int docPage) {
		this.docPage = docPage;
	}


}