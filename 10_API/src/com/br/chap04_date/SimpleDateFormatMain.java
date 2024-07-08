package com.br.chap04_date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SimpleDateFormatMain {

	public static void main(String[] args) {
		
		/*
		 * < java.text.SimpleDateFormat >
		 * 
		 * 1. 날짜 및 시간 정보를 내가 원하는 형식의 문자열로 변환시켜주는 객체
		 * 2. 작성가능한 포맷
		 *    y : 년
		 *    M : 월
		 *    d : 일
		 *    E : 요일
		 *    h/H : 시간
		 *    m : 분
		 *    s : 초
		 *    
		 * SimpleDateFormat sdf = new SimpleDateFormat("반영시키고자하는형식(포맷)");
		 * sdf.format(날짜및시간정보의 객체) : String
		 */
		
		// java.util.Date 객체 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh(HH):mm:ss");
		String dateStr = sdf.format(new Date());
		System.out.println(dateStr);
		
		// java.util.Calendar 객체 => 날짜 및 시간 정보를 밀리초로 환산해서 전달
		String calStr = sdf.format(Calendar.getInstance().getTimeInMillis());
		System.out.println(calStr);
		
		//System.out.println(Calendar.getInstance().getTimeInMillis());

	}

}
