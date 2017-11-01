package com.tcs.Repo.model;

import java.math.BigInteger;

public class ProjectionVO {
	
	private String updt_user, month;
	private Double onsite_rev,offsite_rev,near_rev,total_rev;
	private BigInteger Holiday_count, rec_key, year, onsite_hc, offsite_hc, near_hc;
	public String getUpdt_user() {
		return updt_user;
	}
	public void setUpdt_user(String updt_user) {
		this.updt_user = updt_user;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public Double getOnsite_rev() {
		return onsite_rev;
	}
	public void setOnsite_rev(Double onsite_rev) {
		this.onsite_rev = onsite_rev;
	}
	public Double getOffsite_rev() {
		return offsite_rev;
	}
	public void setOffsite_rev(Double offsite_rev) {
		this.offsite_rev = offsite_rev;
	}
	public Double getNear_rev() {
		return near_rev;
	}
	public void setNear_rev(Double near_rev) {
		this.near_rev = near_rev;
	}
	public Double getTotal_rev() {
		return total_rev;
	}
	public void setTotal_rev(Double total_rev) {
		this.total_rev = total_rev;
	}
	public BigInteger getHoliday_count() {
		return Holiday_count;
	}
	public void setHoliday_count(BigInteger holiday_count) {
		Holiday_count = holiday_count;
	}
	public BigInteger getRec_key() {
		return rec_key;
	}
	public void setRec_key(BigInteger rec_key) {
		this.rec_key = rec_key;
	}
	public BigInteger getYear() {
		return year;
	}
	public void setYear(BigInteger year) {
		this.year = year;
	}
	public BigInteger getOnsite_hc() {
		return onsite_hc;
	}
	public void setOnsite_hc(BigInteger onsite_hc) {
		this.onsite_hc = onsite_hc;
	}
	public BigInteger getOffsite_hc() {
		return offsite_hc;
	}
	public void setOffsite_hc(BigInteger offsite_hc) {
		this.offsite_hc = offsite_hc;
	}
	public BigInteger getNear_hc() {
		return near_hc;
	}
	public void setNear_hc(BigInteger near_hc) {
		this.near_hc = near_hc;
	}
		
	
	
}
