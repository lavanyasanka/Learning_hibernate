package edu.lavanya.learn.hibernate.model;

import java.util.Set;

public class EmployeeManyToMany {
	
	   private int id;
	   private String firstName; 
	   private String lastName;   
	   private int salary;
	   private Set certificates;
	   
	   //getters and setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Set getCertificates() {
		return certificates;
	}
	public void setCertificates(Set certificates) {
		this.certificates = certificates;
	}
	//constructors
	public EmployeeManyToMany(String firstName, String lastName, int salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	public EmployeeManyToMany() {
		super();
	}
	
	@Override
	public String toString() {
		return "EmployeeManyToMany [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary="
				+ salary + ", certificates=" + certificates + "]";
	}
	   
	   

}
