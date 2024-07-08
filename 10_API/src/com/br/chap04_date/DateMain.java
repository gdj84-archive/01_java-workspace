package com.br.chap04_date;

import java.util.Date;

public class DateMain {

	public static void main(String[] args) {
		
		/*
		 * < java.util.Date >
		 * 
		 * 1. 날짜 및 시간에 대한 값을 담을 수 있는 객체
		 * 2. 자바 1 때부터 만들어진 클래스로 급하게 만들어짐
		 *    => 다국적으로 쓰기에 적합하지 않음 
		 *    => 대부분의 구문들이 deprecated 되어있음
		 */
		
		// 기본생성자로 생성 => 현재 시스템 날짜 및 시간에 대한 정보 가짐
		Date date1 = new Date();
		System.out.println(date1);
		
		// 매개변수생성자로 생성 => 내가 원하는 날짜 및 시간 설정
		Date date2 = new Date(2024 - 1900, 6 - 1, 17, 13, 30, 15);
		System.out.println(date2);
		

	}

}
