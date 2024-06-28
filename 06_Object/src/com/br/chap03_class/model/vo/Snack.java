package com.br.chap03_class.model.vo;

public class Snack {
	
	private String sName;
	//private String brand = "농심"; // 객체생성시 해당 멤버변수에는 "농심"이 담겨있을 것
	private int price;
	private int kcal;
	
	public static final String BRAND = "농심";
	
	// 기본생성자
	public Snack() {}
	
	// 과자명, 가격, 칼로리 전달받아서 
	// 객체 생성과 동시에 초기화하는 매개변수생성자
	public Snack(String sName, int price, int kcal) {
		this.sName = sName;
		this.price = price;
		this.kcal = kcal;
	}
	
	
	/*
	public void setBrand(String brand) {
		this.brand = brand;
	}
	*/
	
	
	public void setsName(String sName) {
		this.sName = sName;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setKcal(int kcal) {
		this.kcal = kcal;
	}
	
	public String getsName() {
		return sName;
	}
	
	/*
	public String getBrand() {
		return brand;
	}
	*/
	
	public int getPrice() {
		return price;
	}
	
	public int getKcal() {
		return kcal;
	}
	
	public String information() {
		return "과자명: " + sName + ", 브랜드명: " + Snack.BRAND
			 + ", 가격: " + price + "원, 칼로리: " + kcal;
	}
	
	

}
