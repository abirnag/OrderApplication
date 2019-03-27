package com.demo.axon.OrderApplication;

public class Status {

	
	int code;
	String status;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getStatus() {
		return status;
	}
	public Status() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Status(int code, String status) {
		super();
		this.code = code;
		this.status = status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
