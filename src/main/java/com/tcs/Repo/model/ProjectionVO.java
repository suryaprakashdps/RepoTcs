package com.tcs.Repo.model;


public class ProjectionVO {
	
	private String tower, project, won_type, month, updt_user;
	private Double revenue;
	private Integer rec_key, Year, resource_count, Holiday_count,won_number, ExtProjection;
	public String getTower() {
		return tower;
	}
	public void setTower(String tower) {
		this.tower = tower;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public String getWon_type() {
		return won_type;
	}
	public void setWon_type(String won_type) {
		this.won_type = won_type;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getUpdt_user() {
		return updt_user;
	}
	public void setUpdt_user(String updt_user) {
		this.updt_user = updt_user;
	}
	public Double getRevenue() {
		return revenue;
	}
	public void setRevenue(Double revenue) {
		this.revenue = revenue;
	}
	public Integer getRec_key() {
		return rec_key;
	}
	public void setRec_key(Integer rec_key) {
		this.rec_key = rec_key;
	}
	public Integer getYear() {
		return Year;
	}
	public void setYear(Integer year) {
		Year = year;
	}
	public Integer getResource_count() {
		return resource_count;
	}
	public void setResource_count(Integer resource_count) {
		this.resource_count = resource_count;
	}
	public Integer getHoliday_count() {
		return Holiday_count;
	}
	public void setHoliday_count(Integer holiday_count) {
		Holiday_count = holiday_count;
	}
	public Integer getWon_number() {
		return won_number;
	}
	public void setWon_number(Integer won_number) {
		this.won_number = won_number;
	}
	public Integer getExtProjection() {
		return ExtProjection;
	}
	public void setExtProjection(Integer extProjection) {
		ExtProjection = extProjection;
	}

	
	
	
	
}
