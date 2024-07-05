package com.br.chap02_string;

public class StringMethodMain {

	public static void main(String[] args) {
		
		String str1 = "Hello World";
		
		// 문자열.charAt(인덱스) : 문자열에서 해당 인덱스의 문자를 반환
		char ch = str1.charAt(3);
		System.out.println(ch);
		
		// 문자열.concat(문자열) : 기존문자열에 전달된 문자열을 덧붙여서 새로운 문자열로 반환
		String str2 = str1.concat("!!!");
		System.out.println(str2);
		
		// 문자열.equals(문자열) 		   : 두 문자열이 일치하는지 비교 결과값 반환
		// 문자열.equalsIgnoreCase(문자열) : 두 문자열이 일치하는지 비교 결과값 반환 (단, 대소문자는 무시)
		String str3 = "hello world";
		System.out.println(str1.equals(str3));
		System.out.println(str1.equalsIgnoreCase(str3));
		
		// 문자열.length() : 문자열의 글자수 반환
		System.out.println(str1.length());
		
		// 문자열.contains(문자열) : 기준이 되는 문자열에 전달된 문자열이 포함되어있을 경우 true반환
		System.out.println(str1.contains("llo"));
		
		// 문자열.substring(시작인덱스) 		  : 문자열로부터 시작인덱스에서부터 끝까지 추출해서 반환
		// 문자열.substring(시작인덱스, 끝인덱스) : 문자열로부터 시작인덱스에서부터 끝인덱스 "이전"까지 추출해서 반환
		System.out.println(str1.substring(6));
		System.out.println(str1.substring(0, 4)); // 0 <= < 4
		
		// 문자열.indexOf(탐색할문자열) : 문자열로 부터 전달된 문자열의 위치(시작인덱스) 반환 
		// 문자열.lastIndexOf(탐색할문자열) : 위와 동일하나 뒤에서부터 탐색
		System.out.println(str1.indexOf("l")); // 2 (앞에서 부터 탐색)
		System.out.println(str1.lastIndexOf("l")); // 9 (뒤에서 부터 탐색)
		System.out.println(str1.indexOf("a")); // -1 (찾지 못했을 경우 -1반환)
		
		// 문자열.replace(old, new) : 문자열로부터 old문자열찾아서 new문자열로 치환(변경)한 결과 반환
		System.out.println(str1.replace("l", "c"));
		
		// 문자열.toUpperCase() : 문자열을 다 대문자로 변경해서 반환
		// 문자열.toLowerCase() : 문자열을 다 소문자로 변경해서 반환
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		
		// 문자열.trim() : 문자열의 앞 뒤 공백을 제거시킨 값 반환 
		String str4 = "   JA   VA    ";
		System.out.println(str4);
		System.out.println(str4.trim());
		
		// 문자열.toCharArray() : 문자열의 각 문자들을 char[]배열에 담아 반환
		char[] arr = str1.toCharArray();
		System.out.println(arr[0]);
		
		// 문자열.isBlank() : 빈문자열이든 공백문자열이든 true 반환
		// 문자열.isEmpty() : 빈문자열일때만 true 반환 (공백도 존재하는 문자열로 인식)
		System.out.println("".isBlank()); // true
		System.out.println(" ".isBlank());// true
		
		System.out.println("".isEmpty()); // true
		System.out.println(" ".isEmpty());// false
		
		// 문자열.split(구분자) : 문자열로부터 구분자들을 통해 분리시킨후 String[]에 담아 반환
		String str5 = "Java,Oracle,HTML,CSS,JavaScript";
		String[] strs = str5.split(","); // {"Java", "Oracle", "HTML", "CSS", "JavaScript"}
		System.out.println("배열의 크기(분리된문자열수) : " + strs.length);
		for(String s : strs) {
			System.out.println(s);
		}
		
		String str6 = "강보람\n홍길동\n김말똥";
		System.out.println(str6);
		String[] names = str6.split("\n");
		System.out.println("배열의 크기(분리된문자열수) : " + names.length);
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
	}

}
