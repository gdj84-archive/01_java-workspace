package com.br.inherit.model.vo;

public class Car extends Vehicle {
	
	private int tire;
	
	public Car() {}
	
	public Car(String name, double mileage, String kind, int tire) {
		super(name, mileage, kind);
		this.tire = tire;
	}

	public int getTire() {
		return tire;
	}

	public void setTire(int tire) {
		this.tire = tire;
	}
	
	// 오버라이딩
	public String information() {
		return super.information() + ", tire: " + tire;
	}
	
	// 오버라이딩 
	public void move() {
		System.out.println(tire + "개의 타이어를 굴려가며 움직인다.");
	}

}
