package com.br.chap02_string;

public class StringPoolMain {

	public static void main(String[] args) {
		
		// 문자열을 생성할 때 두가지 방법
		
		// 1. 문자열 객체 : new String("문자열")
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		System.out.println(str1);
		System.out.println(str2);
		// String 클래스에 toString메소드 오버라이딩 : 실제 데이터값 반환
		
		System.out.println(str1 == str2); // false (주소값 비교)
		
		System.out.println(str1.equals(str2)); // true
		// String 클래스에 equals메소드 오버라이딩 : 실제 데이터값 비교 반환
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		// String 클래스에 hashCode메소드 오버라이딩 : 실제 데이터값으로 10진수 반환
		
		// 찐 주소값이 다른지 보고싶으면 => System.identityHashCode(레퍼런스)
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		System.out.println("====================");
		
		// 2. 문자열 리터럴 : "문자열"
		String str3 = "hello";
		String str4 = "hello";
		// 리터럴 제시시 String Pool(상수풀) 영역에 데이터값 올라감
		// String Pool의 특징 : 동일한 문자열을 가질 수 없음
		
		System.out.println(str3);
		System.out.println(str4);
		
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		
		System.out.println(str3 == str4); // true(주소값 비교) == 주소값 일치
		
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		

	}

}
