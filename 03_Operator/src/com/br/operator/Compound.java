package com.br.operator;

public class Compound {
	
	/*
	 * < 복합 대입 연산자 >
	 * 산술연산자와 대입연산자가 결합되어있는 형태 
	 * 연산처리 속도가 빨라지기때문에 사용하는걸 권장
	 * 
	 * += -= *= /= %=
	 */
	
	public void method1() {
		int num = 12;
		
		num++;
		
		System.out.println(num); // 13
		
		num = num + 3; 
		System.out.println(num); // 16
		
		num += 3; // 복합대입연산자
		System.out.println(num); // 19
		
		num -= 5; // num = num - 5;
		System.out.println(num); // 14
		
		num *= 3; // num = num * 3;
		System.out.println(num); // 42
		
		num /= 2; // num = num / 2;
		System.out.println(num); // 21
		
		num %= 4; // num = num % 4;
		System.out.println(num); // 1
		
		String str = "Hello";
		//str = str + "World";
		str += "World";
		System.out.println(str);
		
		System.out.println(str += "ttt");
		
	}

}
