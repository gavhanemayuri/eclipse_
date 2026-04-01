package com.exmaple.metro;

public class employee 

{
 private int eid;
 private String ename;
 private String eemail;
 private String eaddress;
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
public String getEaddress() {
	return eaddress;
}
public void setEaddress(String eaddress) {
	this.eaddress = eaddress;
}
  
   
public void display() {
	
	 System.out.println("employee id"+eid);
	   System.out.println("employee name"+ename);
	   System.out.println("employee email"+eemail);
	   System.out.println("employee address"+eaddress);
 
	
	
}


	
}
