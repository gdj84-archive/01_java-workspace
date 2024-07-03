package com.br.after.model.vo;

public class Product {
	
	// 세클래스에 모두 공통적으로 가져야할 요소(필드,메소드)들을 기술
	private String brand;
	private String pCode;
	private String pName;
	private int price;
	
	public Product() {}
	
	public Product(String brand, String pCode, String pName, int price) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getpCode() {
		return pCode;
	}

	public void setpCode(String pCode) {
		this.pCode = pCode;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public String information() {
		return "brand: " + brand + ", pCode: " + pCode + ", pName: " + pName + ", price: " + price;
	}
	

}
