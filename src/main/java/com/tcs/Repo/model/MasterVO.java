package com.tcs.Repo.model;

import java.math.BigInteger;

public class MasterVO {
	
	private String tower,project,onsite_won,offsite_won,near_won,offsite_location,service_line,sub_sp,project_type,brm_name;
	private Double onsite_rate,offsite_rate,near_rate;
	private BigInteger probability, rec_key;
	
	
	public BigInteger getRec_key() {
		return rec_key;
	}
	public void setRec_key(BigInteger rec_key) {
		this.rec_key = rec_key;
	}
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
	public String getOnsite_won() {
		return onsite_won;
	}
	public void setOnsite_won(String onsite_won) {
		this.onsite_won = onsite_won;
	}
	public String getNear_won() {
		return near_won;
	}
	public void setNear_won(String near_won) {
		this.near_won = near_won;
	}
	public String getOffsite_location() {
		return offsite_location;
	}
	public void setOffsite_location(String offsite_location) {
		this.offsite_location = offsite_location;
	}
	public String getService_line() {
		return service_line;
	}
	public void setService_line(String service_line) {
		this.service_line = service_line;
	}
	public String getSub_sp() {
		return sub_sp;
	}
	public void setSub_sp(String sub_sp) {
		this.sub_sp = sub_sp;
	}
	public String getProject_type() {
		return project_type;
	}
	public void setProject_type(String project_type) {
		this.project_type = project_type;
	}
	public String getBrm_name() {
		return brm_name;
	}
	public void setBrm_name(String brm_name) {
		this.brm_name = brm_name;
	}
	public Double getOnsite_rate() {
		return onsite_rate;
	}
	public void setOnsite_rate(Double onsite_rate) {
		this.onsite_rate = onsite_rate;
	}
	public Double getOffsite_rate() {
		return offsite_rate;
	}
	public void setOffsite_rate(Double offsite_rate) {
		this.offsite_rate = offsite_rate;
	}
	public Double getNear_rate() {
		return near_rate;
	}
	public void setNear_rate(Double near_rate) {
		this.near_rate = near_rate;
	}
	public BigInteger getProbability() {
		return probability;
	}
	public void setProbability(BigInteger probability) {
		this.probability = probability;
	}
	public String getOffsite_won() {
		return offsite_won;
	}
	public void setOffsite_won(String offsite_won) {
		this.offsite_won = offsite_won;
	}

}
