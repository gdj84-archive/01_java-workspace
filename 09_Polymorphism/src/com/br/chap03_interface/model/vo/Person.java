package com.br.chap03_interface.model.vo;

public abstract class Person {
	
	private String name;
	private double weight;
	private int health;
	
	public Person() {}

	public Person(String name, double weight, int health) {
		super();
		this.name = name;
		this.weight = weight;
		this.health = health;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	@Override
	public String toString() {
		return "name=" + name + ", weight=" + weight + ", health=" + health;
	}
	
	/*
	public abstract void eat();
	public abstract void sleep();
	*/

}



