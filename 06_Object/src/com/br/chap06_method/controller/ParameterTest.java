package com.br.chap06_method.controller;

import com.br.chap05_constructor.model.vo.User;

public class ParameterTest {
	
	/*
	 * < 메소드 >
	 * 한 기능을 처리하기 위해 실행될 코드를 정의해두는 개념
	 * 
	 * [표현법]
	 * 접근제한자 [예약어] 반환형 메소드명([매개변수, 매개변수, ..]) {
	 * 		수행내용;
	 * 		[return 결과값;]
	 * }
	 * 
	 * 1. 반환형 : 메소드 실행 후 반환되는 값의 타입(자료형) | void(반환값이 없을경우)
	 * 2. 매개변수(parameter) : 메소드 호출시 전달되는값(인자, 인수, argument)을 저장할 변수
	 * 
	 */
	
	public void method1() {
		System.out.println("method1");
	}
	
	public void method2(int a) { // int a = 전달값;
		System.out.println("method2: " + a);
	}
	
	public void method3(String str) { // String str = 전달값;
		System.out.println("method3: " + str);
	}
	
	public void method4(int a, String str) { // int a = 첫번째전달값; String str = 두번째전달값;
		System.out.println("method4: " + a + ", " + str);
	}

	// 두 수를 가지고 덧셈연산후 해당 결과를 출력해주는 기능
	public void sum(int a, int b) {
		System.out.println("덧셈결과: " + (a + b));
	}
	
	// 가변 매개변수 (전달되는 값의 갯수가 정해져있지 않을 경우)
	public void method5(int... params) { // params는 사실 int[]배열임
		System.out.println("method5: " + params);
		System.out.println("params의 길이: " + params.length);
		for(int i=0; i<params.length; i++) {
			System.out.print(params[i] + " ");
		}
		System.out.println();
	}
	
	// 가변 매개변수와 다른 타입의 매개변수를 같이 기술할 경우 => 가변 매개변수를 마지막 위치로
	public void method6(String str, int... params) {
		System.out.println("method6: " + str + ", " + params);
	}
	
	// 배열 매개변수
	public void method7(String[] arr) {
		System.out.println("method7: " + arr);
		for(String s : arr) { // 향상된 for문
			System.out.print(s + " ");
		}
		System.out.println();
	}
	
	// 객체 매개변수
	public void method8(User u) {
		System.out.println("method8: " + u);
		u.setUserPwd("5678");
		System.out.println(u.information());
	}
	
	
}
