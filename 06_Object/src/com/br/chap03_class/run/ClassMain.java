package com.br.chap03_class.run;

import com.br.chap03_class.model.vo.Person;
import com.br.chap03_class.model.vo.Product;

public class ClassMain {

	public static void main(String[] args) {
		
		/*
		 * 						 new      생성된 객체들(인스턴스)
		 * 클래스(틀) ----------생성----------> A객체
		 * 			  ----------생성----------> B객체
		 * 			  ----------생성----------> C객체
		 * 				   인스턴스화 한다.
		 * 					 실체화 한다.
		 */
		
		Person a = new Person();
		
		System.out.println(a.getId()); // null
		System.out.println(a.getAge());// 0
		// 생성 직후에는 JVM이 초기값들을 세팅해준다.
		
		a.setId("user01");
		a.setPwd("pass01");
		a.setName("강보람");
		a.setAge(36);
		a.setGender('F');
		a.setPhone("01055119220");
		a.setEmail("aaa@naver.com");
		
		System.out.println(a.getId());
		System.out.println(a.getPwd());
		System.out.println(a.getName());
		System.out.println(a.getAge());
		System.out.println(a.getGender());
		System.out.println(a.getPhone());
		System.out.println(a.getEmail());
		
		System.out.println("=============");

		
		// 내가 원하는 데이터가 담긴 객체를 생성하기 위한 방법
		// 방법1. 기본생성자로 생성 후 setter메소드를 이용해서 값 대입
		Product p = new Product();
		
		p.setpName("갤럭시");
		p.setPrice(1200000);
		p.setBrand("삼성");
		
		System.out.println(p.information());
		
		// 방법2. 매개변수 생성자를 정의해두고 실행시켜 생성과 동시에 값 대입
		Product p2 = new Product("아이폰", 1000000, "애플");
		System.out.println(p2.information());
		
		// 두번째 상품이 10프로 할인한다고 한다.
		// 두번째 상품의 정상가격과, 할인가격을 출력
		System.out.println("두번째 상품의 정상가 : " + p2.getPrice() + "원");
		System.out.println("두번째 상품의 할인가 : " + (int)(p2.getPrice() * 0.9) + "원");
		
		
		/*
		 *  com.br.chap03_class.model.vo에 
		 *  하단의 클래스 다이어그램을 
		 *  참고해서 작성해보시오.
		 *  
	     * ┌-----------------┐
	     * │      Snack      │
	     * │-----------------│
	     * │- sName : String │
	     * │- brand : String │
	     * │- price : int    │
	     * │- kcal  : int    │ 
	     * │-----------------│
	     * │+ setter : void  │
	     * │+ getter : 자료형│
	     * └-----------------┘
	     *     
	     */
		
		
		
		
		
		
		
		

	}

}
