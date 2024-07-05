package com.br.chap03_interface_practice.model.vo;

public abstract class Animal {
	
	private String name;
	private String kind;
	
	public Animal() {}

	public Animal(String name, String kind) {
		super();
		this.name = name;
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}
	
	public abstract String bark();
	
	

}
