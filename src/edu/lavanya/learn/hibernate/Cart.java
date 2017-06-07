package edu.lavanya.learn.hibernate.model;

import java.util.Set;

public class Cart {
	

	private long id;
	private double total;
	private String name;
	private Set<Items> items;
	
	
	//getter and setter methods
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
	public Set<Items> getItems() {
		return items;
	}
	public void setItems(Set<Items> items) {
		this.items = items;
	}

	
	//constructors
	public Cart() {
		super();
	}
	public Cart(long id, double total, String name, Set<Items> items) {
		super();
		this.id = id;
		this.total = total;
		this.name = name;
		this.items = items;
	}
	@Override
	public String toString() {
		return "Cart [id=" + id + ", total=" + total + ", name=" + name + "]";
	}
	
}
