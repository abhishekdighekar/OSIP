package com.osip.model;

public class Warehouse {

	private String warehouseId;
	private String location;
	private String capacity;
	private String currentInventory;
	private String managerId;
	
	public String getWarehouseId() {
		return warehouseId;
	}
	public void setWarehouseId(String warehouseId) {
		this.warehouseId = warehouseId;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCapacity() {
		return capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	public String getCurrentInventory() {
		return currentInventory;
	}
	public void setCurrentInventory(String currentInventory) {
		this.currentInventory = currentInventory;
	}
	public String getManagerId() {
		return managerId;
	}
	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}
	
	
}
