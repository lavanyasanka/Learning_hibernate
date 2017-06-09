package edu.lavanya.learn.hibernate.model;

public class Certificate {

	private int id;
	private String name;


	//getters and setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	//constructors

	public Certificate() {
		super();
	}
	public Certificate(String name) {
		super();
		this.name = name;
	}
	public Certificate(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	} 




}
