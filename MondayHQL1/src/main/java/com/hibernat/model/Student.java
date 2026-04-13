package com.hibernat.model;



import javax.persistence.Entity;




import javax.persistence.Id;

@Entity
public class Student
{

	@Id
	private int sid;
	private String sname;
	private String semail;
	private String spass;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSemail() {
		return semail;
	}
	public void setSemail(String semail) {
		this.semail = semail;
	}
	public String getSpass() {
		return spass;
	}
	public void setSpass(String spass) {
		this.spass = spass;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", semail=" + semail + ", spass=" + spass + "]";
	}
	
	
	
}



