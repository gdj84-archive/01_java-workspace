package com.hw2.common;

public interface MathCalculator {
	
	/**
	 * 1. 전달받은 두 숫자(문자열형태)의 덧셈 결과를 구해 반환하기
	 *    단, 실수값형태의 문자열일 경우 덧셈 연산 후 반올림해서 반환하기
	 *    
	 * @param num1
	 * @param num2
	 * @return
	 */
	int sumString(String num1, String num2); 
	
	
	/**
	 * 2. 전달받은 두 숫자(문자열형태)의 차(절대값)를 구해 반환하기
	 *    단, 실수값형태의 문자열일 경우 -1을 바로 반환할 것
	 *    
	 * @param num1
	 * @param num2
	 * @return
	 */
	int minusString(String num1, String num2);
	
	
	

}
