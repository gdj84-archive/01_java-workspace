package com.br.operator;

import java.util.Scanner;

public class Triple {
	
	/*
	 * < 삼항 연산자 >
	 * 
	 * 조건식 ? 참일 경우 돌려줄 결과값 : 거짓일 경우 돌려줄 결과값
	 * 
	 */
	
	public void method1() {
		// 입력받은 정수값이 양수인지 아닌지 판별 후 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 : ");
		int num = sc.nextInt();
		
		//System.out.println(  num > 0 ? "양수이다" : "양수가 아니다"  );
		
		//String result = num > 0 ? "양수이다" : "양수가 아니다";
		String result = num <= 0 ? "양수가 아니다" : "양수이다";
		System.out.println(num + "은 " +  result);
		
	}
	
	public void method2() {
		// 입력받은 정수값이 짝수인지 홀수인지 판별 후 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		//String result = num % 2 == 0 ? "짝수이다" : "홀수이다";
		String result = num % 2 != 0 ? "홀수이다" : "짝수이다";
		
		System.out.println(result);
	}
	
	public void method3() {
		
		// 사용자에게 종료의사 입력받아서 판별해서 출력 
		// 사용자가 입력한 문자값이 y또는 Y일 경우 "프로그램을 종료합니다." 출력
		//							그게 아닐 경우 "계속 진행하겠습니다." 출력 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("종료하시려면 y또는Y 입력 : ");
		char ch = sc.nextLine().charAt(0);
		
		System.out.println( ch == 'y' || ch == 'Y' ? "프로그램을 종료합니다" : "계속 진행하겠습니다" );
		
		
	}
	
	public void method4() {
		
		// 입력받은 문자값이 영문자인지 아닌지 판별해서 출력
		// 사용자가 입력한 문자값이 영문자(소문자 또는 대문자)일경우 "영문자이다." 출력
		//												그게아닐경우 "영문자가 아니다" 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		System.out.println(  (ch >= 'a' && ch <= 'z') 
								|| (ch >= 'A' && ch <= 'Z') ? "영문자이다" : "영문자가 아니다" );
		
		
	}

}
