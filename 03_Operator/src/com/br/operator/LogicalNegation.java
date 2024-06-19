package com.br.operator;

public class LogicalNegation {
	
	/*
	 * < 논리 부정 연산자 (단항연산자 == 하나의 값을 가지고 연산) >
	 * 		!
	 * 논리값(true/false)을 반대로 바꾸는 연산자
	 * 
	 * => 결과값 마저도 논리값임!
	 */
	
	public void method1() {
		System.out.println("true의 부정 : " + !true);
		System.out.println("false의 부정 : " + !false);
		
		boolean b1 = true;
		System.out.println("b1의 부정 : " + !b1);
		
		boolean b2 = !b1;
		System.out.println("b2의 결과 : " + b2);
		
		boolean b3 = !(5 > 3); // !true => false
		System.out.println("b3의 결과 : " + b3);
		
	}
	

}
