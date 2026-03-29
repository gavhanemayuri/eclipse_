package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Manager
{

	@Id
	private String mid;
	private String mname;
	private String memail;
	private String mpass;
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMemail() {
		return memail;
	}
	public void setMemail(String memail) {
		this.memail = memail;
	}
	public String getMpass() {
		return mpass;
	}
	public void setMpass(String mpass) {
		this.mpass = mpass;
	}
	@Override
	public String toString() {
		return "Manager [mid=" + mid + ", mname=" + mname + ", memail=" + memail + ", mpass=" + mpass + "]";
	}
	
	
}
