package com.easymis.commons.web.springmvc;

public class JsonApi {
	private JsonMessage message;
	private Object data;
	
	public JsonApi(boolean success) {
		super();
		this.message =new JsonMessage(success);
	}
	public JsonApi(boolean success,String code) {
		super();
		this.message =new JsonMessage(success,code);
	}
	public JsonApi(Object data) {
		super();
		this.message =new JsonMessage(true);
		this.data = data;
	}
	public JsonApi(boolean success, Object data) {
		super();
		this.message =new JsonMessage(success);
		this.data = data;
	}
	public JsonApi(boolean success, String code, String msg, Object data) {
		super();
		this.message =new JsonMessage(success,code,msg);
		this.data = data;
	}
	public JsonApi(boolean success, String code, String msg) {
		super();
		this.message =new JsonMessage(success,code,msg);
	}
	public JsonApi(JsonMessage message, Object data) {
		super();
		this.message = message;
		this.data = data;
	}

	public JsonMessage getMessage() {
		return message;
	}

	public void setMessage(JsonMessage message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
