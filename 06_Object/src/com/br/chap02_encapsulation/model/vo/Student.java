package com.br.chap02_encapsulation.model.vo;

public class Student {

	/*
	 * 1. 필드 | 멤버변수 | 인스턴스(자바에서 생성된 객체)변수
	 * 
	 *   [표현법]
	 *   접근제한자 [예약어] 자료형 변수명;
	 *   
	 *   필드 작성시 접근제한자는 private으로 하는게 
	 *   객체지향설계원칙 중 하나 (캡슐화 내의 정보은닉 개념)
	 *   
	 */
	private String name;
	private int age;
	private double height;
	private int korScore;
	private int mathScore;
	
	/*
	 * 2. 생성자
	 */
	
	/*
	 * 3. 메소드 | 멤버메소드
	 *    기능을 정의하는 부분
	 *    
	 *    [표현법]
	 *    접근제한자 [예약어] 반환형 메소드명([매개변수]) {
	 *    	 // 기능 구현
	 *    }
	 * 
	 * 	  매개변수 : 해당 메소드 호출시 전달되는 값을 담기위한 변수
	 */
	
	/*
	 * * setter메소드 
	 *   특정 필드에 대입시키고자 하는 값을 전달받아
	 *   해당 필드에 대입시켜주는 기능의 메소드
	 *   
	 *   public void setXXX(자료형 매개변수명(주로필드명으로)){
	 *   	this.필드명 = 매개변수명;
	 *   }
	 */
	/*
	public void setName(String newName) { // String newName = "홍길동";
		name = newName;
	}
	*/
	
	public void setName(String name) {
		
		//name = name; // 매개변수 name = 매개변수 name; 
					   // (필드명과 매개변수명이 동일할 경우 {} 내에서 해당 변수 제시시 매개변수를 가리킴)
		
		// name필드 = name매개변수;
		this.name = name; // this에는 해당 객체의 주소값이 담겨있음
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}
	
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	
	/*
	 * * getter메소드 
	 *   특정 필드에 담겨있는 값을 반환해주는 기능의 메소드
	 */
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getHeight() {
		return height;
	}
	
	public int getKorScore() {
		return korScore;
	}
	
	public int getMathScore() {
		return mathScore;
	}
	
	
	
	
	
	
	
	
	
	
	
}
