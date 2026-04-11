package com.example.laptop;

public class College 

{

	private int cid;
	private String cname;
	private String caddress;
	private Student s1;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCaddress() {
		return caddress;
	}
	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}
	public Student getS1() {
		return s1;
	}
	public void setS1(Student s1) {
		this.s1 = s1;
	}
	public void show() {
	System.out.println("College id is" +cid);
	System.out.println("College id is" +cname);
	System.out.println("College id is" +caddress);
	
	
	System.out.println("student id is" +s1.getSid());
	System.out.println("Student name is" +s1.getSname());
	System.out.println("Student Email is "+s1.getSemail());
	}
}
