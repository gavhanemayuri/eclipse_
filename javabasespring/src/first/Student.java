package first;

public class Student 
{

	private int eid;
	private String ename;
	private String eemail;
	private String epass;
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
	public void show() {
		System.out.println("emp id "+ eid);
		System.out.println("emp ename "+ ename);
		System.out.println("emp email "+ eemail);
		System.out.println("emp pass "+ epass);
		
	}
}

