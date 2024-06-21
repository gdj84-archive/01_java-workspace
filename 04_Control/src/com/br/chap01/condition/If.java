package com.br.chap01.condition;

import java.util.Scanner;

public class If {
	
	/*
	 * 프로그램의 진행은 위에서 부터 아래로 순차적으로 진행
	 * 
	 * 소스코드1;
	 * 
	 * 조건문() {
	 * 	소스코드2;	// 선택적으로 실행 => 조건문
	 * }
	 * 
	 * 반복문() {
	 * 	소스코드3;	// 반복적으로 실행 => 반복문
	 * }
	 * 
	 * 소스코드4;
	 * 
	 * 
	 * 
	 * < 조건문 >
	 * 조건식을 제시해서 참이냐 거짓이냐를 판단해서 
	 * 해당 조건이 참일 경우 그에 해당하는 구문을 실행 
	 * 
	 * 조건식은 반드시 true/false로 나오도록 작성 
	 * 
	 * 1. if문 (단독if문 / if-else문 / if-else if문)
	 * 2. switch문
	 * 
	 */
	
	/*
	 * * 단독 if문
	 * 
	 * if(조건식) {
	 * 	선택적으로 실행시키고자하는 코드;
	 * }
	 * 
	 */
	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("양수다");
		}
		
		if(num <= 0) {
			System.out.println("양수가 아니다");
		}
		
	}
	
	/*
	 * * if-else문
	 * 
	 * if(조건식) {
	 * 	해당 조건이 참일경우 실행코드;
	 * }else {
	 * 	해당 조건이 거짓일경우 실행코드;
	 * }
	 * 
	 */
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("양수다");
		}else {
			System.out.println("양수가 아니다");
		}
		
	}
	
	/*
	 * if-else if문
	 * 
	 * 같은 비교대상으로 여러개의 조건을 제시해야될 경우
	 * 
	 * if(조건식1) {
	 * 	조건식1이 참일경우 실행코드;
	 * }else if(조건식2) {
	 * 	조건식2가 참일경우 실행코드;
	 * }else if(조건식3) {
	 * 	조건식3이 참일경우 실행코드;
	 * }[else {
	 * 	위의 조건들이 다 false일 경우 실행코드;
	 * }]
	 */
	
	public void method3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num < 0) {
			System.out.println("음수다");
		}else if(num == 0) {
			System.out.println("0이다");
		}else /*if(num > 0)*/ {
			System.out.println("양수다");
		}
		
	}
	
	public void method4() {
		// 나이 입력받아
		// 13세 이하 : 어린이
		// 13세 초과 19세 이하 : 청소년
		// 19세 초과 : 성인
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		/*
		if(age <= 13) {
			System.out.println("어린이");
		}else if(age <= 19) { // age가 13초과인건 이미 내제되어있음
			System.out.println("청소년");
		}else {
			System.out.println("성인");
		}
		*/
		
		// 변수 활용하는 방법
		String result;
		
		if(age >= 0 && age <= 120) { // 유효한 범위로 나이값을 잘 입력했을 경우
			
			if(age <= 13) {
				result = "어린이";
			}else if(age <= 19) {
				result = "청소년";
			}else {
				result = "성인";
			}
			
			// 조건검사 후에는 result에 그에 맞는 결과값이 담겨있을 거임
			System.out.println(result);
			
		}else {
			System.out.println("나이를 잘못하셨습니다. 0~120사이의 숫자를 입력하셔야됩니다.");
		}
		
	}
	
	public void method5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		// xxx님은 남학생이다.
		// 또는 xxx님은 여학생이다. 
		/*
		if(gender == 'M' || gender == 'm') {
			System.out.println(name + "님은 남학생이다.");
		}else if(gender == 'F' || gender == 'f') {
			System.out.println(name + "님은 여학생이다.");
		}
		*/
		
		String result = ""; // 변수를 미리 세팅해둘때 반드시 초기화해놓는 습관을 들이자!
		if(gender == 'M' || gender == 'm') {
			result = "남학생";					
		}else if(gender == 'F' || gender == 'f') {
			result = "여학생";
		}else {
			System.out.println("성별을 잘못 입력하였습니다.");
			return; // 현재 속해있는 메소드를 빠져나가는 구문 (뒤쪽의 코드는 더이상 수행되지 않음)
		}
		
		
		System.out.println(name + "님은 " + result + "이다.");
		
		// return;
	}
	
	public void method6() {
		// 사용자에게 이름 입력받아서
		// "홍길동"과     일치할 경우 => "반갑습니다." 출력
		//			일치하지 않을 경우 => "안녕히가세요." 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		//if(name == "홍길동") { // 정상적으로 비교안됨
		if(name.equals("홍길동")) {
			System.out.println("반갑습니다");
		}else {
			System.out.println("안녕히가세요");
		}
		
		/*
		 * 				   1 	   1	 2	   4	8	   4	  8		 2
		 * 기본자료형 : boolean, byte, short, int, long, float, double, char (8개)
		 * 참조자료형 : String, ... 기본자료형을 제외한 나머지 자료형들 
		 * 
		 * 기본자료형들끼리는 동등비교시 == != 사용가능 (정상적으로 비교됨)
		 * 참조자료형들끼리는 동등비교시 == != 사용시 정상적으로 비교가 안됨 
		 * 		=> equals() 메소드를 이용해서 비교하면됨 
		 * 			ex) 문자열A.equals(문자열B)		=>  문자열A와 문자열B가 일치하는지
		 * 				!문자열A.equals(문자열B)	=>  문자열A와 문자열B가 일치하지 않는지
		 */
		
		
		
	}
	
	// 조건문 중첩사용
	public void method7() {
		
		/*
		 * 사용자가 입력한 정수값이 양수가 아닐 경우 => "양수가 아닙니다."
		 * 							양수일 경우 => 이때 3의 배수일 경우 => "3의 배수입니다."
		 * 												   아닐 경우 => "3의 배수가 아닙니다." 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수(양수) : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			
			if(num % 3 == 0) {
				System.out.println("3의 배수입니다.");
			}else {
				System.out.println("3의 배수가 아닙니다.");
			}
			
		}else {
			System.out.println("양수가 아닙니다. 잘못 입력하셨습니다.");
		}
		
		
	}
	
	public void method8() {
		
		/*
		 * 사용자에게 점수, 학년을 입력받아 합격, 불합격 여부를 출력
		 * 
		 * 1~3학년 : 60점 이상이면 합격, 아니면 불합격
		 * 4~6학년 : 70점 이상이면 합격, 아니면 불합격
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);

		System.out.print("점수 : ");
		int score = sc.nextInt();

		System.out.print("학년 : ");
		int grade = sc.nextInt();

		
		/*
		if (grade >= 1 && grade <= 3) { // 1~3학년

			if (score >= 60) {
				System.out.println("합격");
			} else {
				System.out.println("불합격");
			}

		} else if (grade >= 4 && grade <= 6) { // 4~6학년

			if (score >= 70) {
				System.out.println("합격");
			} else {
				System.out.println("불합격");
			}

		}
		*/
		
		int pass = 0; // 합격점수 (60 | 70)
		if(grade >= 1 && grade <= 3) {
			pass = 60;
		}else if(grade >= 4 && grade <= 6) {
			pass = 70;
		}
		// pass 변수에는 학년에 따른 합격 점수값이 잘 담겨있음
		
		if(score >= pass) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		
		
	}
	
	
	
	

}
