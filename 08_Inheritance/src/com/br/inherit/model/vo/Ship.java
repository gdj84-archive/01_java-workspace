package com.br.inherit.model.vo;

public class Ship extends Vehicle {
	
	private int propeller;
	
	public Ship() {}
	
	public Ship(String name, double mileage, String kind, int propeller) {
		super(name, mileage, kind);
		this.propeller = propeller;
	}

	public int getPropeller() {
		return propeller;
	}

	public void setPropeller(int propeller) {
		this.propeller = propeller;
	}
	
	
	// 오버라이딩
	public String information() {
		return super.information() + ", propeller: " + propeller;
	}
	
	// 오버라이딩
	@Override
	public void move() {
		System.out.println(propeller + "개의 프로펠러를 돌려 움직인다.");
	}
	

}
