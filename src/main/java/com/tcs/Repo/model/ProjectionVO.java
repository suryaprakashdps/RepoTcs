package com.tcs.Repo.model;

import java.math.BigInteger;
import java.sql.Timestamp;

public class ProjectionVO {
	
	private String tower, project, won_type, month, updt_user;
	private Double revenue;
	private BigInteger rec_key, Year, resource_count, Holiday_count,won_number;
	private Timestamp updt_ts;
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
	public BigInteger getWon_number() {
		return won_number;
	}
	public void setWon_number(BigInteger won_number) {
		this.won_number = won_number;
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
	public BigInteger getRec_key() {
		return rec_key;
	}
	public void setRec_key(BigInteger rec_key) {
		this.rec_key = rec_key;
	}
	public BigInteger getYear() {
		return Year;
	}
	public void setYear(BigInteger year) {
		this.Year = year;
	}
	public BigInteger getResource_count() {
		return resource_count;
	}
	public void setResource_count(BigInteger resource_count) {
		this.resource_count = resource_count;
	}
	public BigInteger getHoliday_count() {
		return Holiday_count;
	}
	public void setHoliday_count(BigInteger holiday_count) {
		Holiday_count = holiday_count;
	}
	public Timestamp getUpdt_ts() {
		return updt_ts;
	}
	public void setUpdt_ts(Timestamp updt_ts) {
		this.updt_ts = updt_ts;
	}
	
	
	
	
}
