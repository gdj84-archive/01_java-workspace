package com.br.chap02_string;

import java.util.StringTokenizer;

public class StringTokenizerMain {

	public static void main(String[] args) {
		
		String str = "Java,Oracle,HTML,CSS,Spring";
		
		// 구분자를 통해 문자열들을 분리시키는 방법
		
		// 방법1. 분리된 문자열들을 String[]에 담아 관리하고자 할 경우 (한번 담긴 데이터 영구적으로 사용가능)
		//        String클래스에 정의되어있는 split 메소드 사용
		//		  문자열.split("구분자") : String[]
		String[] arr = str.split(",");
		System.out.println("분리된 문자열의 갯수(배열의 길이) : " + arr.length);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(i + "번째 인덱스 : " + arr[i]);
		}
		
		
		// 방법2. 분리된 문자열들을 각각의 토큰으로 관리하고자 할 경우 
		// 		  java.util.StringTokenizer 클래스 사용 
		// 		  StringTokenizer 변수 = new StringTokenizer("문자열", "구분자");
		//		  단, StringTokenizer에 담긴 분리된 문자열들은 한번 꺼내 쓰면 끝 (일회성)
		StringTokenizer stn = new StringTokenizer(str, ",");
		
		System.out.println("분리된 문자열의 갯수(토큰 갯수) : " + stn.countTokens());
		
		/*
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		
		System.out.println("남은 토큰 갯수 : " + stn.countTokens());
		
		System.out.println(stn.nextToken()); // NoSuchElementException 발생(더이상의 요소가 없습니다)
		*/
		
		/*
		for(int i=0; i<stn.countTokens(); i++) {
			System.out.println(stn.nextToken());
		}
		*/
		
		/*
		 * i=0   i<5   true   출력("Java")   i++ 
		 * i=1   i<4   true   출력("Oracle") i++
		 * i=2   i<3   true   출력("HTML")   i++
		 * i=3   i<2   false   => 반복문 종료
		 */
		
		// 해결방법1. 분리된 문자열의 갯수를 고정시켜두기
		/*
		int count = stn.countTokens(); // count = 5
		for(int i=0; i<count; i++) {
			System.out.println(stn.nextToken());
		}
		*/
		
		// 해결방법2. 매번 stn에 남아있는 토큰이 있는지 비교하는 메소드 활용
		while(stn.hasMoreTokens()) {
			System.out.println(stn.nextToken());
		}
		
		
		

	}

}
