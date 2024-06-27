package com.br.chap03_class.model.vo;

public class Product {
	
	private String pName;
	private int price;
	private String brand;
	
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
