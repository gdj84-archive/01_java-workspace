package com.br.exception.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedException {
	
	/*
	 * * CheckedException == 반드시 예외처리구문을 작성해놔야되는 Exception들
	 *   => 조건문을 제시할 수 없음 (예측이 불가능함)
	 *   => 외부 매개체와 입출력이 일어날 때 주로 발생 (IOException, SqlException)
	 */

	public void method1() {
		
		// 키보드로 값 입력받기 (BufferedReader를 이용)
		// Scanner와의 차이점은 무조건 문자열로만 읽어들여짐 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("아무거나 입력해주세요 : ");
		
		// 1. try~catch문
		try {
			String str = br.readLine(); // 애초에 컴파일 에러로 반드시 예외처리구문을 작성하라고함
			System.out.println("str : " + str);
		}catch(IOException e) {
			System.out.println("예외가 발생했습니다.");
		}
		
		System.out.println("프로그램을 종료합니다.");
		
	}
	
	public void method2() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("아무거나 입력해주세요 : ");
		
		// 2. throws 떠넘기기 
		String str = br.readLine(); // readLine메소드에 throws IOException 진행중
		System.out.print("str : " + str);
		
		System.out.println("프로그램을 종료합니다.");
		
	}
	
	/*
	 * 				  	 |      예외클래스	    |    예외발생시점 	  |      예외처리구문작성
	 * =============================================================================================
	 * UnCheckedException| RuntimeException후손 |    런타임시 에러	  | 세모(if문 또는 예외처리구문)
	 * ---------------------------------------------------------------------------------------------
	 *  CheckedException |        그 외 		| 컴파일 에러(빨간줄) | 필수(if문 조건식 작성 불가)
	 */
	
}
