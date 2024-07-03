package com.br.override.run;

import com.br.override.model.vo.Book;

public class OverrideMain {

	public static void main(String[] args) {

		Book bk1 = new Book("수학의 정석", "나수학", 100);
		Book bk2 = new Book("칭찬은 고래도 춤추게한다.", "고래", 200);
		
		System.out.println(bk1/*.toString()*/);
		System.out.println(bk2/*.toString()*/);
		
		// 레퍼런스(참조변수)를 출력할때 
		// JVM이 자동으로 레퍼런스.toString() 메소드 호출
		
		// 1. toString()
		// 오버라이딩전 : Object클래스의 toString()호출 : return 풀클래스명 + @ + 주소값16진수;
		// 오버라이딩후 : Book클래스의 toString()호출 : return 해당객체의 멤버변수값들;
		
		// ------------------------------------------------------
		
		Book bk3 = new Book("자바", "홍길동", 300);
		Book bk4 = new Book("자바", "홍길동", 300);
		// 동일한 데이터의 Book객체 2개 작성
		
		
		
		
		
		
	}

}
