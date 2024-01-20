package com.osip.model;

public class Response {

	private String responseId;
	private String requestId;
	private String respondingEmployeeId;
	private String responseDate;
	private String status;
	
	public String getResponseId() {
		return responseId;
	}
	public void setResponseId(String responseId) {
		this.responseId = responseId;
	}
	public String getRequestId() {
		return requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRespondingEmployeeId() {
		return respondingEmployeeId;
	}
	public void setRespondingEmployeeId(String respondingEmployeeId) {
		this.respondingEmployeeId = respondingEmployeeId;
	}
	public String getResponseDate() {
		return responseDate;
	}
	public void setResponseDate(String responseDate) {
		this.responseDate = responseDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
