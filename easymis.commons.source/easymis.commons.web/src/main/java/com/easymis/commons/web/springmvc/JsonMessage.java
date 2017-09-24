package com.easymis.commons.web.springmvc;

public class JsonMessage {
	public static final String SUCCESS = "00";
	public static final String LOGINFAILED = "01";
	public static final String FAILED= "02";

	private boolean success;// 是否成功
	private String code;
	private String msg; // 返回消息
	private String note = "success:true成功，false失败|code：00成功01登录失败02失败|msg:返回消息";

	public JsonMessage(boolean success) {
		super();
		this.success = success;
		if (success) {
			this.code = SUCCESS;
			this.msg = "Ok";
		} else {
			this.code = FAILED;
			this.msg = "Failure";
		}
	}

	public JsonMessage(boolean success, String code) {
		super();
		this.success = success;
		this.code = code;
		if (success) {
			this.msg = "ok";
		} else {
			this.msg = "failure";
		}
	}

	public JsonMessage(boolean success, String code, String msg) {
		super();
		this.success = success;
		this.code = code;
		this.msg = msg;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Override
	public String toString() {
		return "{success:" + success + ", code:" + code + ", msg:" + msg + ", note:" + note + "}";
	}

}
