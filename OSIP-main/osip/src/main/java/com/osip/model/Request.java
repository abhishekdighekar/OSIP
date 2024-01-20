package com.osip.model;

public class Request {

	private String requestId;
	private String productId;
	private String quantity;
	private String requestingEmployeeId;
	private String requestDate;
	private String status;
	
	public String getRequestId() {
		return requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getRequestingEmployeeId() {
		return requestingEmployeeId;
	}
	public void setRequestingEmployeeId(String requestingEmployeeId) {
		this.requestingEmployeeId = requestingEmployeeId;
	}
	public String getRequestDate() {
		return requestDate;
	}
	public void setRequestDate(String requestDate) {
		this.requestDate = requestDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
