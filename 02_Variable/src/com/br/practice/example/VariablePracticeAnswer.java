package com.br.practice.example;

import java.util.Scanner;

public class VariablePracticeAnswer {

	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		sc.nextLine(); // nextInt() 메소드 뒤에 nextLine() 메소드가 올 것이기 때문에 그 사이에 엔터를 버퍼에서 빼주는 작업을 해줘야된다. 
		
		System.out.print("성별을 입력하세요(남/여) : ");
		char gender = sc.nextLine().charAt(0);
		System.out.print("키를 입력하세요(cm) : ");
		double height = sc.nextDouble();
		
		System.out.println("키 " + height + "인 " + age + "살 " + gender + "자 " + name + "님 반갑습니다^^");
	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		// 산술 연산 순서 (*,/,%    >    +,-)
		System.out.println("더하기 결과 : " + (num1 + num2));	// 괄호를 안하게 되면 문자열로 인식하여 숫자 두개가 붙어서 나온다.
		System.out.println("빼기 결과 : " + (num1 - num2));	// 마찬가지로 괄호를 안하게되면  '문자열-정수'로 인식하여 오류 발생
		System.out.println("곱하기 결과 : " + num1 * num2);	// 덧셈보다 뺄셈이 우선순위가 높아서 곱셈연산먼저 진행됨	
		System.out.println("나누기 몫 결과 : " + num1 / num2); // 나눗셈도 마찬가지로
	}
	
	public void method3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 : ");
		double width = sc.nextDouble();
		System.out.print("세로 : ");
		double height = sc.nextDouble();
		
		/* 방법1. 면적과 둘레를 각각 구해 각 변수에 담아둔 후 출력하는 방법 -----------
		double area = width * height;			// 면적 구해서 기록하기
		double perimeter = (width + height) * 2;// 둘레 구해서 기록하기
		
		System.out.println("면적 : " + area);
		System.out.println("둘레 : " + perimeter);
		------------------------------------------------------------------------------*/
		
		// 방법2. 아싸리 바로 면적과 둘레를 구한 결과를 바로 출력하는 방법
		System.out.println("면적 : " + width * height);
		System.out.println("둘레 : " + (width + height) * 2);
		
	}
	
	public void method4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		
		/* 방법1. 문자열로 부터 각 문자값을 뽑아서 각 char 변수에 담아둔 후 출력하는 방법 ------
		char ch1 = str.charAt(0);
		char ch2 = str.charAt(1);
		char ch3 = str.charAt(2);
		
		System.out.println("첫 번째 문자 : " + ch1);
		System.out.println("두 번째 문자 : " + ch2);
		System.out.println("세 번째 문자 : " + ch3);
		-------------------------------------------------------------------------------------*/
		
		
		// 방법2. 아싸리 char변수에 안담아주고 바로 뽑아서 출력하는 방법
		System.out.println("첫 번째 문자 : " + str.charAt(0));
		System.out.println("두 번째 문자 : " + str.charAt(1));
		System.out.println("세 번째 문자 : " + str.charAt(2));
	}
	
	
	
	
	
	
	// 추가 문제 -----------------------------------------------------------------------
	public void method5() {
		
		/*
		 * 키보드로 문자 하나를 입력 받아 그 문자와 그 문자의 고유숫자 값을 출력하시오. 
		 * 
		 * ex) 
		 * 
		 * 문자 : A		 (=> 사용자가 입력한 값)
		 * 
		 * A 숫자값 : 65 (결과 출력)
		 */
		
		
		
	}
	
	public void method6() {
		/*
		 * 정수형으로 국어, 영어, 수학 세 과목의 점수를 입력받아 총점과 평균을 출력하시오.
		 * 단, 평균은 실수형으로 출력되도록 하시오. 
		 * 
		 * ex) 
		 * 국어 : 90 (=> 사용자가 입력한 값)
		 * 영어 : 91 (=> 사용자가 입력한 값)
		 * 수학 : 85 (=> 사용자가 입력한 값)
		 * 
		 * 총점 : 266  	  (결과 출력)
		 * 평균 : 88.67   (결과 출력, 반드시 소수점아래 둘째짜리까지 출력되도록)
		 */
		
		
	}
	
	public void method7() {
		/*
		 * 아래의 코드에 선언된 5개의 변수를 가지고 
		 * 산술연산(+,-,*,/)과 형변환을 적절히 활용하여
		 * 주석에 적힌 값과 같은 값이 나올 수 있도록
		 * 출력문 안의 구문을 수정하시오. 
		 * (출력문 안에 이미 쓰여져있는 변수를 활용할 것)
		 */
		
		int iNum1 = 10;
        int iNum2 = 4;
        
        float fNum = 3.0f; 
        double dNum = 2.5;
        
        char ch = 'A';
        
        System.out.println( iNum1 iNum2 ); // 2
        System.out.println( dNum ); // 2
        
        System.out.println( iNum2 dNum ); // 10.0
        System.out.println( iNum1 ); // 10.0
        
        System.out.println( iNum1 iNum2 ); // 2.5
        
        System.out.println( fNum ); // 3
        System.out.println( iNum1  fNum ); // 3

        System.out.println( iNum1 fNum );// 3.3333333
        System.out.println( iNum1 fNum ); // 3.333333333333335
        
        System.out.println( ch ); // 65
        System.out.println( ch  iNum1 ); // 75
        System.out.println( ch  iNum1 ); // 'K'

	}
}
