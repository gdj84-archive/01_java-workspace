package com.br.run;

import com.br.first.SecondClass;

public class RunClass {
	
	public static void main(String[] args) {
		// 메소드 호출 : 메소드명();
		
		//methodA();
		
		/*
		 * < 다른 클래스에 정의되어있는 메소드 호출 방법 >
		 * 
		 * 1. 해당 클래스를 생성(new) 하기
		 *    [표현법] 클래스명 사용할이름 = new 클래스명();
		 *    
		 * 2. 생성된 해당 클래스를 통해 메소드 호출
		 * 	  [표현법] 사용할이름.메소드명();
		 */
		
		// 클래스명에 빨간줄 뜨는 이유 : 다른패키지에 존재하는 클래스기때문에
		//SecondClass second = new SecondClass();
		
		// 다른패키지의 클래스를 사용하는 방법
		// 1) 해당 클래스가 어떤 패키지안에 존재하는지 정확히 표기하는 방법 (풀클래스명 제시)
		//com.br.first.SecondClass second = new com.br.first.SecondClass();
		
		// 2) import문으로 한번만 선언해두는 방법
		SecondClass second = new SecondClass();
		
		// 메소드 호출
		second.methodA();
		second.methodB();
		second.methodC();
		
		
	}

}
