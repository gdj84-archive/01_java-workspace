package com.br.objectArray.model.vo;

public class Phone {
	
	// 이름(String), 브랜드명(String), 가격(int), 시리즈(String)
	private String name;
	private String brand;
	private int price;
	private String series;
	
	// 기본생성자, 매개변수생성자(모든필드초기화)
	public Phone() {}
	
	public Phone(String name, String brand, int price, String series) {
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.series = series;
	}

	// getter/setter메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}
	
	// information메소드
	public String information() {
		return name + ", " + brand + ", " + price + ", " + series;
	}
	

}
