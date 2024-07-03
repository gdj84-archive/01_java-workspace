package com.br.override.model.vo;

public class Book /*extends Object*/ {
	
	private String title;
	private String author;
	private int price;
	
	public Book() {}

	// alt + shift + s > o > enter
	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}

	// alt + shift + s > r > alt + a > alt + r
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	/*
	 * < 오버라이딩 >
	 * 
	 * 자식클래스에서 상속받고 있는 부모클래스의 메소드를 재정의하는 개념
	 * 
	 * 
	 * < 오버라이딩 성립 조건 >
	 * 
	 * 1. 부모메소드명과 동일
	 * 2. 부모메소드의 매개변수 갯수, 자료형, 순서 동일 (매개변수명은 상관없음)
	 * 3. 부모메소드의 반환형 동일 (JDK버전업되면서 부모메소드 반환형의 자식타입까지는 가능)
	 * 4. 부모메소드의 접근제한자보다 범위가 같거나 커야됨
	 *    ex) 부모메소드 protected => 자식메소드 protected, public
	 * 
	 * 
	 * < @Override 어노테이션 >
	 * 1. JVM에게 해당 메소드는 오버라이딩된 메소드임을 알리는 역할 
	 *    + 다른 개발자에게도 알리는 역할
	 * 2. 생략가능함 (단, 작성 권장함)
	 *    ㄴ 후에 부모메소드가 변경되었을 경우 => 자식클래스에 오류 발생 => 수정해야되는걸 알려줌
	 *       또는 자식메소드로 작성시 실수로 잘못작성했을 경우 => 오류 발생 => 수정해야되는걸 알려줌
	 */
	
	@Override
	public String toString() { // Object클래스의 toString메소드 오버라이딩
        // 재정의 : 해당 객체의 멤버변수의 값들을 반환 
		return "title: " + title + ", author: " + author + ", price: " + price;
    }
	
	
}
