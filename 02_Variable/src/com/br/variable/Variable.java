package com.br.variable;

public class Variable {
	
	/*
	 * < 메모리 >
	 * 
	 * 1. 램(RAM)
	 * 2. 자바 프로그램이 동작할 때 사용되는, 필요한 값들이 저장되는 장소 
	 * 3. 휘발성이기 때문에 프로그램 종료시 메모리상에 존재한 것들은 다 사라짐
	 * 4. 특정값을 메모리상에 보관(기록)하고자 할 경우 변수라는걸 먼저 메모리상에 만들어야됨
	 * 
	 */
	
	public void whyUseVariable() {
		
		System.out.println("변수 사용 전");
		System.out.println(9860 * 8);
		System.out.println(9860 * 8 * 5);
		System.out.println(9860 * 8 * 5 * 4);
		System.out.println(9860 * 8 * 5 * 4 * 0.1);
		
		/*
		 * < 변수 >
		 * 특정 값을 메모리상에 기록하기 위한 공간 (박스)
		 */
		int pay = 9860;		// 시급
		int hour = 8;		// 하루 중 근무시간
		int day = 5;		// 일주일 중 근무일수
		int week = 4;		// 한달 중 근무주수
		double tax = 0.1;	// 세금 10%
		
		System.out.println("변수 사용 후");
		System.out.println(pay * hour);
		System.out.println(pay * hour * day);
		System.out.println(pay * hour * day * week);
		System.out.println(pay * hour * day * week * tax);
		
		/*
		 * < 변수 사용 이유 >
		 * 
		 * 1. 값에 의미를 부여할 수 있음 (가독성이 좋아짐)
		 * 2. 자주 사용하는 값을 변수에 담아두면 동일한 값을 계속 사용할 수 있음
		 * 3. 유지보수에 용이함 
		 */
		
	}
	
	public void declareVariable() {
		
		/*
		 * < 변수 선언 및 값 대입 >
		 * 
		 * 1. 변수 선언 
		 *    저장할 값을 기록하기 위한 변수를 메모리 공간에 확보해 놓는 과정
		 *    
		 *    [표현법] 자료형 변수명;
		 *    
		 * 2. 변수에 값 대입
		 * 
		 * 	  [표현법] 변수명 = 값;
		 * 
		 * 3. 변수 선언과 동시에 값 대입 (초기화)
		 * 
		 * 	  [표현법] 자료형 변수명 = 값;
		 * 
		 * - 자료형 : 어떤 값을 담아낼건지, 어떤 크기의 값을 담아낼건지에 따라서 변수의 크기 및 모양을 정하는 부분
		 * - 변수명 : 변수의 이름을 정하는 부분 (의미부여할 것)
		 * 
		 */
		
		/*
		 * < 기본 자료형 (primitive type) >
		 * 1. 논리형 : boolean(1byte)
		 * 2. 정수형 : byte(1byte), short(2byte), int(4byte), long(8byte)
		 * 3. 실수형 : float(4byte), double(8byte)
		 * 4. 문자형 : char(2byte)
		 * 
		 * < 참조 자료형 (reference type) >
		 * 1. 문자열 : String
		 * 
		 */
		
		
		
		
		
	}
	
	
	
	
	
	

}
