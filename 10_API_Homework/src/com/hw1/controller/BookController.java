package com.hw1.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;

import com.hw1.model.vo.Book;

public class BookController {
	
	private Book[] list = new Book[5];
	{ 	// 초기화블럭
		list[0] = new Book("자바의 정석", "제임스 고슬링", "나무", new GregorianCalendar(2018, 4-1, 15), 20000);
		list[1] = new Book("여러분들 성공할꺼에요", "보람쌤", "BR", new GregorianCalendar(2019, 6-1, 15), 30000);
		list[2] = new Book("API의 모든것", "강보람", "BR", new GregorianCalendar(2017, 2-1, 13), 15000);
		list[3] = new Book("씨언어 프로그래밍", "김절차", "문학동네", new GregorianCalendar(2016, 8-1, 30), 10000);
	}
	
	
	public BookController() {}
	
	// 1. 도서 전체 출력 기능 메소드
	public void printAll() {
		
		// list에 담긴 전체 Book객체의 정보 출력하는 구문 작성하시오.
		// 1) for loop문 
		/*
		for(int i=0; i<list.length; i++) {
			if(list[i] != null) {
				System.out.println(list[i]);
			}
		}
		*/
		
		// 2) for each문 (향상된 for문)
		for(Book bk : list) {
			if(bk != null) {
				System.out.println(bk);
			}
		}

		
	}
	
	
	
	// 2. 도서 추가 기능 메소드
	public void insertBook(String newTitle, String newAuthor, String newPublisher, String newDate, String newPrice) {
		
		// String newPrice(사용자가입력한가격 문자열형태) => int price(숫자로 변환)
		int price = Integer.parseInt(newPrice);
		
		// String newDate(사용자가입력한출판일 문자열형태) => Calendar publishDate(Calendar객체로 변환)
		//            "특정년도-특정월-특정일"
		
		//			"특정년도"  "특정월"  "특정일" String형
		String[] dateArr = newDate.split("-"); // {"특정년도", "특정월", "특정일"}
		
		//           특정년도    특정월    특정일    int형 
		int year = Integer.parseInt(dateArr[0]);   // "특정년도" -> 특정년도
		int month = Integer.parseInt(dateArr[1]);  // "특정월" -> 특정월
		int date = Integer.parseInt(dateArr[2]);   // "특정일" -> 특정일
		
		Calendar publishDate = new GregorianCalendar(year, month-1, date);
		
		
		// ------------------------------------------------------
		// 3. 나머지 전달받은 값들과 위에서 변환작업을 해준 price와 date값을 가지고
		//	  Book클래스의 매개변수 생성자를 통해 생성
		list[4] = new Book(newTitle, newAuthor, newPublisher, publishDate, price);

	
	}
	
	
	// 3. 도서 출간일 출력 기능 메소드
	public void printBookPublishDate() {
		// "xxxx년 xx월 xx일 출간" 과 같은 패턴으로 출력
		
		//       Calendar객체					String 문자열화
		// list[4].getPublishDate()  -->  "xxxx년 xx월 xx일 출간" 
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 출간");
		String result = sdf.format(list[4].getPublishDate().getTimeInMillis());
		System.out.println(result);
		
	}
	
	
	// 4. 도서 검색 기능 메소드
	public void searchBook(String searchTitle) {
		
		// 도서 리스트를 전체적으로 조회하면서 (for문 이용)
		// 전달받은 검색명을 포함(HINT : String클래스의 contains메소드 활용)한!! 도서들 전체 출력  
		
		// 1. for loop문
		/*
		for(int i=0; i<list.length; i++) {
			if(list[i].getTitle().contains(searchTitle)) {
				System.out.println(list[i]);
			}
		}
		*/
		
		// 2. for each문 (향상된 for문)
		for(Book bk : list) {
			if(bk.getTitle().contains(searchTitle)) {
				System.out.println(bk);
			}
		}
		
		
	}
	
	
	

}
