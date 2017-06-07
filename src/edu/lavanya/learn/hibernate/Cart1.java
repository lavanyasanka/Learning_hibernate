package edu.lavanya.learn.hibernate.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name= "CART")
public class Cart1 {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "cart_id")
	private long id;
	
	@Column(name = "total")
	private double total;
	
	@Column(name = "name")
	private String name;
	
	@OneToMany 
	private Set<Items1> items1;
	
	//getters and setters

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Items1> getItems1() {
		return items1;
	}

	public void setItems1(Set<Items1> items1) {
		this.items1 = items1;
	}



	
	//constructors
	public Cart1() {
		super();
	}

	public Cart1(double total, String name, Set<Items1> items1) {
		super();
		this.total = total;
		this.name = name;
		this.items1 = items1;
	}

	@Override
	public String toString() {
		return "Cart1 [id=" + id + ", total=" + total + ", name=" + name + ", items1=" + items1 + "]";
	}


	
	
	
}
