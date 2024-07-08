package com.hw2.model.vo;

public class FoodShop { // 식당에 대한 정보를 보관하기 위한 vo 클래스
	
	private int num; // 순번
	private String shopName; // 식당명
	private String address;  // 식당주소
	private String phoneNumber; // 식당전화번호
	private String category; // 식당분류(카테고리)
	private String registDate; // 식당등록일
	
	public FoodShop() {
		
	}

	public FoodShop(int num, String shopName, String address, String phoneNumber, String category, String registDate) {
		super();
		this.num = num;
		this.shopName = shopName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.category = category;
		this.registDate = registDate;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getRegistDate() {
		return registDate;
	}

	public void setRegistDate(String registDate) {
		this.registDate = registDate;
	}

	@Override
	public String toString() {
		return "FoodShop [num=" + num + ", shopName=" + shopName + ", address=" + address + ", phoneNumber=" + phoneNumber
				+ ", category=" + category + ", registDate=" + registDate + "]";
	}

}
