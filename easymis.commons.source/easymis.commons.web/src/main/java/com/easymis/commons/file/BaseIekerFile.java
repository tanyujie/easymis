package com.easymis.commons.file;

import java.io.Serializable;


/**
 * This is an object that contains data related to the jc_file table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="jc_file"
 */

public abstract class BaseIekerFile  implements Serializable {

	public static String REF = "CmsFile";
	public static String PROP_FILE_ISVALID = "fileIsvalid";
	public static String PROP_FILE_NAME = "fileName";
	public static String PROP_FILE_PATH = "filePath";
	public static String PROP_SWF_PATH = "swfPath";
	public static String PROP_CONTENT = "content";


	// constructors
	public BaseIekerFile () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseIekerFile (java.lang.String filePath) {
		this.setFilePath(filePath);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseIekerFile (
		java.lang.String filePath,
		boolean fileIsvalid) {

		this.setFilePath(filePath);
		this.setFileIsvalid(fileIsvalid);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.String filePath;

	// fields
	private java.lang.String fileName;
	private String pdfPath;
	private java.lang.String swfPath;
	private boolean fileIsvalid;

	// many to one
/*	private Content content;*/



	public String getPdfPath() {
		return pdfPath;
	}

	public void setPdfPath(String pdfPath) {
		this.pdfPath = pdfPath;
	}

	public java.lang.String getSwfPath() {
		return swfPath;
	}

	public void setSwfPath(java.lang.String swfPath) {
		this.swfPath = swfPath;
	}

	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="assigned"
     *  column="file_path"
     */
	public java.lang.String getFilePath () {
		return filePath;
	}

	/**
	 * Set the unique identifier of this class
	 * @param filePath the new ID
	 */
	public void setFilePath (java.lang.String filePath) {
		this.filePath = filePath;
		this.hashCode = Integer.MIN_VALUE;
	}




	/**
	 * Return the value associated with the column: file_name
	 */
	public java.lang.String getFileName () {
		return fileName;
	}

	/**
	 * Set the value related to the column: file_name
	 * @param fileName the file_name value
	 */
	public void setFileName (java.lang.String fileName) {
		this.fileName = fileName;
	}


	/**
	 * Return the value associated with the column: file_isvalid
	 */
	public boolean isFileIsvalid () {
		return fileIsvalid;
	}

	/**
	 * Set the value related to the column: file_isvalid
	 * @param fileIsvalid the file_isvalid value
	 */
	public void setFileIsvalid (boolean fileIsvalid) {
		this.fileIsvalid = fileIsvalid;
	}


	/**
	 * Return the value associated with the column: content_id
	 */
/*	public Content getContent () {
		return content;
	}

	*//**
	 * Set the value related to the column: content_id
	 * @param content the content_id value
	 *//*
	public void setContent (Content content) {
		this.content = content;
	}*/



	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof IekerFile)) return false;
		else {/*
			CmsFile cmsFile = (CmsFile) obj;
			if (null == this.getFilePath() || null == cmsFile.getFilePath()) return false;
			else return (this.getFilePath().equals(cmsFile.getFilePath()));
		*/
			return false;}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getFilePath()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getFilePath().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}


}