package com.pune.city;

public class employee

{

      private int eid;
      private String ename;
      private String eemail;
      private String epass;
      private Address a1;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEemail() {
		return eemail;
	}
	public void setEemail(String eemail) {
		this.eemail = eemail;
	}
	public String getEpass() {
		return epass;
	}
	public void setEpass(String epass) {
		this.epass = epass;
	}
	public Address getA1() {
		return a1;
	}
	public void setA1(Address a1) {
		this.a1 = a1;
	}
	

	public void display() {
		System.out.println("employee id is "+eid);
		System.out.println("employee name is "+ename);
		System.out.println("employee email is "+eemail);
		System.out.println("employee pass is "+epass);
		
		
		System.out.println("city is"+  a1.getName());
		System.out.println("locatin is"+  a1.getLocation());
		System.out.println("pincode is"+   a1.getPincode());
		

		
	}
}
