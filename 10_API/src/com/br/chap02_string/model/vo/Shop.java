package com.br.chap02_string.model.vo;

public class Shop {
	
	private String num;			// 맛집번호(식별번호)
	private String shopName;	// 맛집명
	private String shopAddr;	// 맛집주소
	private String phoneNum;	// 맛집전화번호
	private String category;	// 맛집카테고리
	private String registDt;	// 맛집등록일
	
	public Shop() {}

	public Shop(String num, String shopName, String shopAddr, String phoneNum, String category, String registDt) {
		super();
		this.num = num;
		this.shopName = shopName;
		this.shopAddr = shopAddr;
		this.phoneNum = phoneNum;
		this.category = category;
		this.registDt = registDt;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getShopAddr() {
		return shopAddr;
	}

	public void setShopAddr(String shopAddr) {
		this.shopAddr = shopAddr;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getRegistDt() {
		return registDt;
	}

	public void setRegistDt(String registDt) {
		this.registDt = registDt;
	}

	@Override
	public String toString() {
		return "Shop [num=" + num + ", shopName=" + shopName + ", shopAddr=" + shopAddr + ", phoneNum=" + phoneNum
				+ ", category=" + category + ", registDt=" + registDt + "]";
	}
	

}
