package com.br.chap04_date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeMain {

	public static void main(String[] args) {
		
		/*
		 * < java.time.LocalDate|LocalTime|LocalDateTime >
		 * 
		 * 1. 자바 8이상부터 사용 가능 클래스
		 * 2. 날짜만 또는 시간만 또는 둘 다의 정보를 가질 수 있음
		 * 3. 생성자가 정의되어있지 않아 객체 생성을 할 수 없음
		 *    ㄴ static 메소드인 now() : 현재 날짜 및 시간 정보를 가져올 수 있음
		 *    ㄴ static 메소드인 of() : 특정 날짜 및 시간 정보를 설정할 수 있음
		 */
		
		// * LocalDate ----------------------------
		LocalDate date1 = LocalDate.now();
		System.out.println(date1);
		
		System.out.println(date1.getYear());
		System.out.println(date1.getMonth());
		System.out.println(date1.getMonthValue());
		System.out.println(date1.getDayOfMonth());
		
		LocalDate date2 = LocalDate.of(2024, 12, 11);
		System.out.println(date2);
		
		System.out.println("============");
		
		// * LocalTime --------------------------------
		LocalTime time1 = LocalTime.now();
		
		System.out.println(time1); // 24시형식 시:분:초.나노초
		System.out.println(time1.toString().substring(0, 8));
		
		LocalTime time2 = LocalTime.of(13, 30, 20);
		System.out.println(time2); // 나노초가 0일 경우 . 아래 구문 출력 안됨
		
		// getHour() / getMinute() / getSecond() / getNano()
		
		System.out.println("============");
		
		// * LocalDateTime ----------------------------
		LocalDateTime dateTime1 = LocalDateTime.now();
		System.out.println(dateTime1.toString());
		
		LocalDateTime dateTime2 = LocalDateTime.of(2024, 12, 11, 13, 0, 15);
		System.out.println(dateTime2);
		
		LocalDateTime dateTime3 = LocalDateTime.of(date2, time2);
		System.out.println(dateTime3);
		
		System.out.println("============");
		
		
		// * LocalDateTime 객체를 원하는 형식으로 반영시켜서 출력
		//   => java.time.format.DateTimeFormatter
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 hh(HH)시 mm분 ss초");
		String str = dtf.format(dateTime3);
		System.out.println(str);
		

	}

}
