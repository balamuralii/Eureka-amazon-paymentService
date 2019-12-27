package com.springcloud.eureka.client;

public class Book {
	private String name;
	private String id ;
	public String getName() {
		return name;
	}
	public Book(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	

}
