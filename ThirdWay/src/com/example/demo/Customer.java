package com.example.demo;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Component;

@Component
public class Customer {
	@Value("101")
	private int cid;
	
	@Value("mayuri")
	private String cname;
	
	@Value("mayuri@gmail.com")
	private String cemail;
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
	public String getCemail() {
		return cemail;
	}
	public void setCemail(String cemail) {
		this.cemail = cemail;
	}
	
	public void display() {
		System.out.println("customer id"+cid);
		System.out.println("customer name"+cname);
		System.out.println("customer email"+cemail);
	}

}
