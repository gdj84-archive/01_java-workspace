package com.br.variable;

public class Printf {
	
	public void printfTest() {
		/*
		 * print(출력값) 		: 값 출력만 해줌 (줄바꿈x)
		 * println([출력값])	: 값 출력 후 줄바꿈 o
		 * 
		 * printf("출력하고자하는형식(포맷)", [출력값, ...])
		 * : 출력하고자하는 값들이 제시한 형식에 맞춰서 출력 (줄바꿈x)
		 * 
		 * < 포맷 안에 쓰일수 있는 키워드 >
		 * %d : 정수값이 들어갈 자리 확보
		 * %f : 실수값이 들어갈 자리 확보
		 * %s : 문자열이 들어갈 자리 확보 (문자도 가능)
		 * %c : 문자값이 들어갈 자리 확보 (문자열 안됨)
		 * 
		 * %% : %문자가 출력
		 * %n : 개행문자 (줄바꿈) => printf 에서만 사용가능
		 */
		
		int iNum1 = 10;
		int iNum2 = 20;
		
		// 10 20%
		System.out.println(iNum1 + " " + iNum2 + "%");
		System.out.printf("%d %d%% %n", iNum1, iNum2);
		
		System.out.printf("%d\n", iNum1, iNum2); // 두번째 값은 무시됨
		//System.out.printf("%d %d\n", iNum1); // 에러발생 => 두번째 포맷에 들어갈 값이 없어서
		
		System.out.printf("%5d\n", iNum1); // 5칸의 공간 확보 후 오른쪽 정렬 해서 출력 (음수일 경우 왼쪽정렬)
		System.out.printf("%5d\n", 250);
		System.out.printf("%5d\n", 3000);
		System.out.printf("%5d\n", 2);
		
		double dNum1 = 1.23456789;
		double dNum2 = 4.53;
		
		System.out.printf("%f %f\n", dNum1, dNum2); // 기본적으로 %f는 무조건 소수점 아래 6째짜리까지 표현함
		System.out.printf("%.2f %.1f\n", dNum1, dNum2);
		
		char ch = 'a';
		String str = "Hello";
		
		System.out.printf("%c %10s %s\n", ch, str, ch);
		
		System.out.printf("%C %S\n", ch, str); // 대문자로 변환시켜서 출력
		
		
		
		
		
	}
	
	
	
	
	
	

}
