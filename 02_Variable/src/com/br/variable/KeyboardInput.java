package com.br.variable;

import java.util.Scanner;

public class KeyboardInput {
	
	public void inputTest1() { // 사용자에게 인적사항을 입력받아 출력해보기
		
		/*
		 * < 사용자로부터 키보드로 값 입력받기 >
		 * 자바에서 제공하는 java.util.Scanner 클래스의 메소드를 이용해서 값을 입력받을 수 있음
		 * 
		 * 1. Scanner 클래스 생성
		 * 2. Scanner 클래스 내의 nextXXX() 메소드 실행
		 * 	  next()		: 사용자가 입력한 값 중에 "공백" 이전까지의 값 문자열로 읽어들이기
		 * 	  nextLine()	: 사용자가 입력한 값 중에 "엔터" 이전까지의 값 전체 문자열로 읽어들이기
		 * 	  nextInt()		: 사용자가 입력한 값 중에 정수값을 읽어들이기
		 * 	  nextDouble() 	: 사용자가 입력한 값 중에 실수값을 읽어들이기
		 * 3. 읽어들인 값을 보관해두고자 한다면 변수에 대입해두기
		 * 
		 */
		
		//java.util.Scanner sc = new java.util.Scanner();
		Scanner sc = new Scanner(System.in); // System.in : 입력받은 값을 바이트단위로 읽어들이겠다 라는걸 의미
		
		System.out.print("당신의 이름은 무엇입니까 : ");
		//String name = sc.next();
		String name = sc.nextLine();
		
		System.out.print("당신의 나이는 몇살입니까(정수값만 입력) : ");
		int age = sc.nextInt();
		
		System.out.print("당신의 키는 몇입니까(소수점 포함해서 입력) : ");
		double height = sc.nextDouble();
		
		// 출력형식 : xxx님은 xx살이며, 키는 xxx.xxcm입니다.
		System.out.println(name + "님은 " + age + "살이며, 키는 " + height + "cm입니다.");
		
	}
	
	
	
	public void practice1() {
		// 사용자에게 이름, 학년, 반 순으로 입력받은 후
		// 결과를 출력해보기 
		
	}
	
	

}
