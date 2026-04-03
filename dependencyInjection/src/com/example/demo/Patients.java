package com.example.demo;

public class Patients
{

	private int pid;
	private String pname;
	private String pdis;
	
	public Patients(int pid,String pname,String pdis) {
		
		this.pid=pid;
		this.pname=pname;
		this.pdis=pdis;
	}

	@Override
	public String toString() {
		return "Patients [pid=" + pid + ", pname=" + pname + ", pdis=" + pdis + "]";
	}
	
}
