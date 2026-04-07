package HibernateDay2.HibernateDay2;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student")

public class Student {
	@Id
	private int sid;
	private String sname;
	private String semail;
	private adderss a1;
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
	public adderss getA1() {
		return a1;
	}
	public void setA1(adderss a1) {
		this.a1 = a1;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", semail=" + semail + ", a1=" + a1 + "]";
	}
	
	

}
