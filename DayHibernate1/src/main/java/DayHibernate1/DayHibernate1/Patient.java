package DayHibernate1.DayHibernate1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Patient

{
 @Id
 private int pid;
 private String pname;
 private String pdis;
 @OneToOne
 private Doctor d1;
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public String getPdis() {
	return pdis;
}
public void setPdis(String pdis) {
	this.pdis = pdis;
}
public Doctor getD1() {
	return d1;
}
public void setD1(Doctor d1) {
	this.d1 = d1;
}
@Override
public String toString() {
	return "Patient [pid=" + pid + ", pname=" + pname + ", pdis=" + pdis + ", d1=" + d1 + "]";
}

 
	
	
}
