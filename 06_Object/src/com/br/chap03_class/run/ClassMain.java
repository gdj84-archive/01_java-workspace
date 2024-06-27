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

		Product p = new Product();
		
		p.setpName("갤럭시");
		p.setPrice(1200000);
		p.setBrand("삼성");
		
		/*
		System.out.println(p.getpName());
		System.out.println(p.getPrice());
		System.out.println(p.getBrand());
		*/
		
		System.out.println(p.information());
		
		

	}

}
