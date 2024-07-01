package com.br.chap05_constructor.model.vo;

public class Cosmetic {
	
	/*
	 * < 필드 >
	 * 
	 * 1. 표현법
	 *    접근제한자 [예약어] 자료형 변수명 [= 값];
	 *    
	 * 2. 변수 종류
	 * 	ㄴ멤버변수 | 인스턴스변수 : 객체생성시 메모리에 할당 / 객체 소멸시 함께 소멸
	 * 	ㄴ클래스변수 | static변수 : 프로그램 실행시 메모리에 할당 / 프로그램 종료시 소멸
	 * 
	 * 3. 접근제한자
	 *    public > protected > default > private
	 *    
	 * 4. 예약어
	 * 	ㄴstatic : 공유의 개념 (쉐어할 변수)
	 * 	ㄴfinal  : 상수의 개념 (상수 변수)
	 *  ㄴstatic final : 상수필드 (공유도 하는데 변경은 불가하도록)
	 */
	
	private String cName;
	private int price;
	private String brand;
	private String category;
	
	// 참조자료형의 필드도 둘 수 있다.
	private String[] ingredient;
	
	
	/*
	 * < 생성자 >
	 * 
	 * 1. 표현법
	 *    public 생성자명([매개변수, 매개변수, ..]) {
	 *    		[실행내용;]
	 *    }
	 *    
	 * 2. 생성자 목적
	 * 	ㄴ객체 생성을 위해
	 * 	ㄴ객체 생성과 동시에 각 필드에 값을 대입(초기화)하기 위해
	 * 
	 * 3. 유의사항
	 * 	ㄴ생성자명은 클래스명과 동일하게 작성
	 * 	ㄴ반환형 기술 x 
	 * 	ㄴ매개변수 생성자 작성시 기본생성자를 JVM이 만들어주지 않음
	 * 
	 * 4. 추가
	 * 	ㄴ생성자 내에서 또다른 생성자 호출시 this() 이용해서 호출 
	 * 	  단, 해당 구문은 첫문장으로 작성
	 * 
	 */
	public Cosmetic() {}
	
	public Cosmetic(String cName, int price, String brand, String category, String[] ingredient) {
		this.cName = cName;
		this.price = price;
		this.brand = brand;
		this.category = category;
		this.ingredient = ingredient;
	}
	
	/*
	 * < 메소드 >
	 * 
	 * 1. 표현법
	 *    접근제한자 [예약어] 반환형 메소드명([매개변수, 매개변수, ..]) {
	 *    		실행내용
	 *    }
	 *    
	 * 2. 멤버변수 관리하는 메소드
	 * 	ㄴgetter메소드 : 멤버변수에 담긴 값을 반환하는 목적의 메소드
	 * 	ㄴsetter메소드 : 멤버변수에 값을 대입하기 위한 목적의 메소드
	 * 
	 * > 추가적인 메소드 더 작성 가능
	 *   단, 멤버변수와 밀접하게 연관되어있는 코드를 작성
	 * 
	 */
	public String getcName() {
		return cName;
	}
	
	public void setcName(String cName) {
		this.cName = cName;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	public String[] getIngredient() {
		return ingredient;
	}
	
	public void setIngredient(String[] ingredient) {
		this.ingredient = ingredient;
	}
	
	
	public String information() {
		
		String str = "화장품명: " + cName + "\n가격: " + price + "원"
				 + "\n브랜드명: " + brand + "\n종류: " + category + "\n성분: ";
		
		for(int i=0; i<ingredient.length; i++) {
			str += ingredient[i];
			if(i < ingredient.length-1) {
				str += ", ";
			}
		}
		
		return str;
	}
	
	
	
	
	

}
