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
		
		System.out.println("안녕하세요 여러분");
		
		
	}
	
	
	
	
	
	

}
