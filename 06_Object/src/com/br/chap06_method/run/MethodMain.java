package com.br.chap06_method.run;

import com.br.chap06_method.controller.OverloadingTest;
import com.br.chap06_method.controller.StaticTest;

public class MethodMain {

	public static void main(String[] args) {
		/*
		// 객체 생성을 해야 해당 객체의 멤버(멤버변수, 멤버메소드)에 접근할 수 있음
		ParameterTest pt = new ParameterTest();
		
		pt.method1();
		pt.method2(10);
		pt.method2(20);
		pt.method3(null);
		pt.method3("홍길동");
		//pt.method4("abc", 10);
		pt.method4(10, "abc");
		
		pt.sum(5, 3);
		
		pt.method5(3);
		pt.method5(3, 4, 5);
		pt.method5(2, 5);
		
		pt.method6("홍길동", 10, 20);
		
		pt.method7(new String[] {"홍길동", "김말순"});
		
		System.out.println("==============");
		
		pt.method8(new User("user01", "pass01", "강개똥"));
		*/
		
		
		/*
		ReturnTest rt = new ReturnTest();
		//int result = rt.method1();
		//System.out.println("1부터 100까지의 총 합계: " + result);
		System.out.println("1부터 100까지의 총 합계: " + rt.method1());
		
		//String result = rt.method2();
		//System.out.println("사용자가 입력한 이름: " + result);
		//System.out.println("사용자가 입력한 이름: " + rt.method2());
		
		System.out.println("실수 랜덤값: " + rt.method3());
		
		System.out.println("10 - 3: " + rt.minus(10, 3));
		System.out.println("5 - 4: " + rt.minus(5, 4));
		
		int[] result = rt.method4(3); // result는 메소드내에 생성된 배열객체를 가리킴
		for(int i=0; i<result.length; i++) {
			System.out.print(result[i] + " ");
		}
		
		User user = rt.makeUser("aaa01", "ppp01", "강개순"); // User user = 0X123;
		System.out.println(user.information());
		*/
		
		
		// static메소드 호출은
		// 객체생성을 하지 않아도
		// 클래스명.메소드명(); 호출 가능
		
		StaticTest.method1();
		
		int result = StaticTest.method2();
		System.out.println("result : " + result);
		
		StaticTest.method3(10, 5);
		StaticTest.method3(5, 0);
		
		boolean bool = StaticTest.method4("홍길동", "홍길동");
		System.out.println(bool);
		
		System.out.println("==============");
		
		// 대표적인 static 메소드
		System.out.println(Math.random());
		System.out.println(Math.min(3, 5));
		System.out.println(Math.max(4, 10));
		
		OverloadingTest ot = new OverloadingTest();
		
		ot.test();
		ot.test(10);
		ot.test(10, "abc");
		ot.test("abc", 20);
		ot.test(10, 20);
		
		// 대표적인 오버로딩의 예시 : print(), println() 
	}

}
