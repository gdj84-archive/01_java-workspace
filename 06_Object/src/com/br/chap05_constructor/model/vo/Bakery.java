package com.br.chap05_constructor.model.vo;

public class Bakery {
	
	private String bakeryName;
	private String bakeryAddr;
	private Bread bread;
	
	public Bakery() {}
	
	public Bakery(String bakeryName, String bakeryAddr, Bread bread) {
		this.bakeryName = bakeryName;
		this.bakeryAddr = bakeryAddr;
		this.bread = bread;
	}
	
	public String getBakeryName() {
		return bakeryName;
	}
	public void setBakeryName(String bakeryName) {
		this.bakeryName = bakeryName;
	}
	
	public String getBakeryAddr() {
		return bakeryAddr;
	}
	public void setBakeryAddr(String bakeryAddr) {
		this.bakeryAddr = bakeryAddr;
	}
	
	public Bread getBread() {
		return bread;
	}
	public void setBread(Bread bread) { // Bread bread = new Bread("소금빵", 1000);
		this.bread = bread;
	}
	
	public String information() {
		String str = "빵집명 : " + bakeryName + ", 빵집주소 : " + bakeryAddr;
		
		if(bread != null) { // bread가 null이 아닐 경우 == bread에 생성된 객체가 담겨있을 경우
			str += ", 판매하는 빵 : " + bread.information();
		}
		
		return str;
	}
	

}
