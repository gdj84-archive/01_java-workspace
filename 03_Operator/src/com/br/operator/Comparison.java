package com.br.operator;

import java.util.Scanner;

public class Comparison {
	
	/*
	 * < 비교연산자|관계연산자 (이항연산자) >
	 * 두 값을 비교하는 연산자 
	 * 비교연산자는 조건을 만족하면 true, 만족하지 않을 경우 false를 반환 
	 * 
	 * 대소비교연산자 : < > <= >=
	 * 동등비교연산자 : ==  != 
	 */
	
	public void method1() {
		
		int a = 10;
		int b = 25;
		
		System.out.println("a == b : " + (a == b));
		System.out.println("a <= b : " + (a <= b));
		
		boolean result = a > b;
		System.out.println("result : " + result);
		
		// 산술연산 + 비교연산
		System.out.println((a * 2) > (b / 5));
		
		// 짝수 == 2로 나누어 떨어짐 == 2로 나누었을때의 나머지값이 0임
		// 홀수 == 2로 나누어 떨어지지 않음 == 2로 나누었을때의 나머지값이 1임 (0이 아님)
		System.out.println("a가 짝수인가 : " + (a % 2 == 0));
		System.out.println("a가 홀수인가 : " + (a % 2 != 0));
		System.out.println("a가 홀수인가 : " + (a % 2 == 1));
	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		System.out.println("첫번째 정수값이 두번째값보다 큽니까 : " + (num1 > num2));
		System.out.println("첫번째 정수값이 짝수입니까 : " + (num1 % 2 == 0));
		
		
		// 특이케이스 
		System.out.println(num2 < 'A'); // 'A'(65) ~ 'Z'(90)
	}
	
	
	
	
	
	
	

}
