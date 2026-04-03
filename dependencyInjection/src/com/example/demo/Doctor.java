package com.example.demo;

public class Doctor

{

	private int did;
	private String dname;
	private String demail;
	private Patients p1;
	public Doctor(int did,String dname,String demail,Patients p1) {
		
		this.did=did;
		this.dname=dname;
		this.demail=demail;
		this.p1=p1;
	}
	
	public void display() {
		System.out.println("Doctor id is"+ did);
		System.out.println("doctor name is"+dname);
		System.out.println("doctor email"+demail);
		System.out.println("patient info is "+p1);
	}
	
}
