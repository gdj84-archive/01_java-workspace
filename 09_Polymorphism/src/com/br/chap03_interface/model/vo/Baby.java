package com.br.chap03_interface.model.vo;

public class Baby extends Person implements Behavior {

	public Baby() {}
	
	public Baby(String name, double weight, int health) {
		super(name, weight, health);
	}

	@Override
	public String toString() {
		return "Baby [" + super.toString() + "]";
	}

	@Override
	public void eat() {
		// 밥먹으면 몸무게 3증가 / 건강도 1증가
		setWeight(getWeight() + 3);
		setHealth(getHealth() + 1);
	}

	@Override
	public void sleep() {
		// 잠자면 건강도 3증가
		setHealth(getHealth() + 3);
	}
	
	
}
