package com.osip.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@EntityScan
@Data
@Document(collection= "Project")
public class Project {
	@Id
	private String projectId;
	private String projectName;
	private String projectSite;
	private String projectStatus;
	private String projectManager;
	private String projectStaff;
	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectSite() {
		return projectSite;
	}
	public void setProjectSite(String projectSite) {
		this.projectSite = projectSite;
	}
	public String getProjectStatus() {
		return projectStatus;
	}
	public void setProjectStatus(String projectStatus) {
		this.projectStatus = projectStatus;
	}
	public String getProjectManager() {
		return projectManager;
	}
	public void setProjectManager(String projectManager) {
		this.projectManager = projectManager;
	}
	public String getProjectStaff() {
		return projectStaff;
	}
	public void setProjectStaff(String projectStaff) {
		this.projectStaff = projectStaff;
	}
	
}
