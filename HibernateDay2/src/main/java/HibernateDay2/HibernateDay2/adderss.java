package HibernateDay2.HibernateDay2;

import javax.persistence.Embeddable;

@Embeddable
public class adderss
{

	private String location;
	private String city;
	private String pincode;
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "adderss [location=" + location + ", city=" + city + ", pincode=" + pincode + "]";
	}
	
	
	
}
