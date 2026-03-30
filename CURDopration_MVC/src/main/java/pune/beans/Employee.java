package pune.beans;



public class Employee 
{

	
	private String eid;
	private String ename;
	private String eemail;
	private String epass;
	private String ecpass;
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
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
	public String getEcpass() {
		return ecpass;
	}
	public void setEcpass(String ecpass) {
		this.ecpass = ecpass;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eemail=" + eemail + ", epass=" + epass + ", ecpass="
				+ ecpass + "]";
	}
	
	
	
}

