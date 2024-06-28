package com.br.chap03_class.model.vo;

public class Product {
	
	private String pName;
	private int price;
	private String brand;
	
	// 기본생성자 
	public Product() {}
	
	// 매개변수 3개짜리 생성자 (모든 멤버변수에 값 초기화)
	public Product(String pName, int price, String brand) {
		this.pName = pName;
		this.price = price;
		this.brand = brand;
	}
	
	
	/*
	public void setPName(String pName) {
		this.pName = pName;
	}
	*/
	
	/*
	public void setPname(String pName) {
		this.pName = pName;
	}
	*/
	
	public void setpName(String pName) {
		this.pName = pName;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getpName() {
		return pName;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getBrand() {
		return brand;
	}
	
	// 모든 필드값들을 반환하는 메소드 
	public String information() {
		
		//return pName, price, brand; // 한개의 값으로 합쳐서 반환
		
		return "pName : " + pName + ", price : " + price + ", brand : " + brand;
		
		
	}

}
