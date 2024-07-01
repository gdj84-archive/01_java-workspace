package com.br.chap06_method.controller;


public class StaticTest {
	
	public static void method1() {
		System.out.println("static method1");
	}
	
	// 1부터 랜덤값(1~100)까지의 총 합계 구해서 반환 static메소드
	public static int method2() {
		System.out.println("static method2");
		
		int random = (int)(Math.random() * 100 + 1);
		int sum = 0;
		for(int i=1; i<=random; i++) {
			sum += i;
		}
		return sum;
	}
	
	// 두 수를 전달받아서 나눗셈 연산 결과를 출력해주는 static메소드
	public static void method3(int a, int b) {
		System.out.println("static method3");
		
		if(b == 0) {
			System.out.println("0으로 나눌수 없습니다.");
		}else {
			System.out.println("나눗셈 결과: " + a/b);
		}
		
	}
	
	// 두개의 문자열을 전달받아서 
	// 두 문자열이 일치하는지 아닌지의 값을 반환해주는 static메소드
	public static boolean method4(String str1, String str2) {
		System.out.println("static method4");
		
		return str1.equals(str2);
	}
	
	

}
