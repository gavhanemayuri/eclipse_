package DayHibernate1.DayHibernate1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Doctor
{

	@Id
	private int did;
	private String dname;
	private String demail;
	@OneToOne
	private Patient p1;
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDemail() {
		return demail;
	}
	public void setDemail(String demail) {
		this.demail = demail;
	}
	public Patient getP1() {
		return p1;
	}
	public void setP1(Patient p1) {
		this.p1 = p1;
	}
	@Override
	public String toString() {
		return "Doctor [did=" + did + ", dname=" + dname + ", demail=" + demail + ", p1=" + p1 + "]";
	}
	
	
}
