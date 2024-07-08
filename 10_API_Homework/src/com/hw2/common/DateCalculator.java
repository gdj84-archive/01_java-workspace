package com.hw2.common;

import java.util.Calendar;

public interface DateCalculator {
	
	/**
	 * 1. LocalDateTime을 이용하여 현재 날짜 및 시간의 정보를 얻어 출력하는 메소드
	 *    단, "2024-01-04 17:30:05"  과 같은 형식으로 출력될 수 있도록 하시오. 
	 *    (toString, replace, substring, indexOf 메소드 모두 사용하여 푸시오)
	 */
	void printNowDateTime();
	
	
	/**
	 * 2. 전달받은 년도,월,일(문자열형태)을 가지고 Calendar객체에 반영시켜 반환하는 메소드
	 * 
	 * @param year
	 * @param month
	 * @param date
	 * @return
	 */
	Calendar makeCalendar(String year, String month, String date);
	
	
	/**
	 * 3. 전달받은 Calendar 객체를 가지고 아래와 같은 형식으로 출력하는 메소드
	 *    "2024-01-04 목요일" 
	 *    
	 * @param calc
	 */
	void printFormat(Calendar calc);
	
	/**
	 * 4. 전달된 년도가 윤년인지 여부값을 반환하는 메소드 
	 * 
	 * * 윤년이란? 
	 *   년도가 4의 배수여야하고 뿐만아니라 400의 배수이거나 100의배수가 아닌 경우를 의미한다.
	 *   윤년일때는 2월이 29일까지 있다. 
	 *   
	 *   따라서 윤년은 1년이 총 366일이고
	 *   그 외의 평년은 1년이 총 365일이다. 
	 *   
	 * @param year
	 * @return
	 */
	boolean isLeapYear(int year);
	
	/**
	 * 5. 전달된 시작년도의 1월 1일부터 끝년도의 12월 31일까지의 총 일수를 계산해서 반환하는 메소드 
	 *    
	 *    * 참고사항 
	 *      윤년일 경우는 1년이 366일
	 *      평년일 경우는 1년이 365일 
	 *      
	 *    이때, 특정년도가 윤년인지 비교하는 구문을 사용해야될 경우 위의 isLeapYear 메소드를 호출시켜서 비교하시오.
	 *    
	 * @param startYear
	 * @param endYear
	 * @return
	 */
	long leapDate(int startYear, int endYear);
	

}
