package com.br.first; // 패키지 선언부

public class FirstClass { // 진짜 클래스명(풀클래스명) : com.br.first.FirstClass
	
	// single-line comment(주석) : 소스코드와 무관한 내용을 기술 / 코드로써 인식되지 않음 
	
	/*
	 * multi-line comment
	 * 여러줄 주석
	 * 
	 * 1. 프로젝트 만들기
	 * 2. 패키지 만들기
	 * 3. 클래스 만들기
	 * 4. 클래스 내에 소스코드 작성
	 * -----------------------------
	 * 프로젝트
	 * 		ㄴ 패키지1
	 * 			ㄴ 패키지1_1
	 * 				ㄴ 클래스1
	 * 				ㄴ 클래스2
	 * 					...
	 * 			ㄴ 패키지1_2
	 * 		ㄴ 패키지2
	 * 			ㄴ 패키지2_1
	 * -----------------------------
	 * 
	 * public class 클래스명 {
	 * 
	 * 		// 메소드 == 기능 
	 * 		A기능의 메소드1 {
	 * 			소스코드;
	 * 		}
	 * 
	 * 		B기능의 메소드2 {
	 * 			소스코드;
	 * 		}
	 * 
	 * 		메인메소드(실행용메소드) {
	 * 			소스코드;
	 * 		}
	 * 
	 * }
	 * 
	 */
	
	public void abc() {
		
	}
	
	public void def() {
		
	}
	
	/*
	 * < 메인메소드 (실행용메소드) >
	 * 
	 * 1. Java Application 실행시 최초로 실행시키고자하는 메소드 
	 * 2. 적어도 main메소드가 포함된 클래스가 한개 이상 존재해야됨
	 * 3. 작성형식
	 * 	  public static void main(String[] args) {   }
	 * 
	 */
	public static void main(String[] args) {
		
		/*
		 * < 출력문 >
		 * 특정 값을 화면(콘솔창)에 출력하고자 할 때 작성하는 명령문
		 * 
		 * 1. println([출력값]);			: 값 출력 후 줄바꿈까지 해줌
		 * 2. print(출력값); 				: 값 출력만 해줌
		 * 3. printf(포맷, [출력값, ...]);	: 형식(포맷) 기반으로 값들을 출력해줌 (줄바꿈x)
		 */
		
		System.out.println(1);
		System.out.println(2);
		System.out.print('A');
		System.out.print('B');
		System.out.println("CD\nEF");
		System.out.printf("안녕하세요 %s에 오신걸 환영합니다. \n%d월 %d일 까지 잘해봐요~~\n", "구디아카데미", 12, 11);
		//System.out.println();
		System.out.println("hello");
		
	}
	
	
	
	
	
	
	
}
