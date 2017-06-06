package edu.lavanya.learn.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	@Column
	private String streetnumber;
	@Column
	private String Street;
	@Column
	private String city;
   @Column
   private int pin_code;

	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreetnumber() {
		return streetnumber;
	}
	public void setStreetnumber(String streetnumber) {
		this.streetnumber = streetnumber;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public int getPin_code() {
		return pin_code;
	}
	public void setPin_code(int pin_code) {
		this.pin_code = pin_code;
	}
	@Override
	public String toString() {
		return "Address [streetnumber=" + streetnumber + ", Street=" + Street + ", city=" + city + ", pin_code="
				+ pin_code + "]";
	}
	
	

}