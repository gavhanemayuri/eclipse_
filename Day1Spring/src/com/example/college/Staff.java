package com.example.college;

public class Staff

{
	private int sid;
	private String sname;
	private String semail;
	private String spass;
	
	public Staff()
	{
		super();
	}

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

	public void display() {
		System.out.println("Staff id is"+sid);
		System.out.println("Staff name is"+sname);
		System.out.println("Staff email is"+semail);
		System.out.println("Staff pass is"+spass);
		
	}
	
	
	
	
}
