package com.soul.springboot.app.controller.element;

public class Element {
	private String name;
	private Integer id;
	private String description;
	
	
	public Element() {
	
	}
	
	public Element(String name, Integer id, String description) {
		this.name = name;
		this.id = id;
		this.description = description;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
}
