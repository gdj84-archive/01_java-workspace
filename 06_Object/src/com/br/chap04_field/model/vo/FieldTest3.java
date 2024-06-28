package com.br.chap04_field.model.vo;

public class FieldTest3 {
	
	/*
	 * < 클래스 변수 | static 변수 >
	 * 
	 * 1. 필드 선언문에서 static 예약어와 함께 기술
	 * 2. 클래스영역(static영역)에 저장되는 변수
	 * 3. 인스턴스 생성하지 않아도 메모리 상에 이미 할당되어있음
	 * 4. 라이프사이클
	 * 		ㄴ 생성시점 : 프로그램 실행시 곧바로 메모리에 할당됨
	 * 		ㄴ 소멸시점 : 프로그램이 종료되면 소멸됨
	 * 
	 * [표현법]
	 * public static 자료형 변수명 [= 값];
	 * 
	 * < + 상수 필드 >
	 * 
	 * 1. final 예약어까지 같이 기술
	 * 2. 초기화 구문을 같이 기술
	 * 3. 값 변경이 불가함
	 * 
	 * [표현법]
	 * public static final 자료형 변수명 = 값;
	 * 
	 * 공통적으로 
	 * 위의 변수들은 객체생성 없이도 사용 가능 
	 * 		클래스명.변수명 - 추천
	 * 		인스턴스.변수명 - 가능하긴하지만 비추천
	 */
	public static String sta = "FieldTest3의 클래스변수";
	public static final String STA_FIN = "static final";

}
