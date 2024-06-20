package com.br.practice.example;

import java.util.Scanner;

public class VariablePracticeAnswer {

	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();	
		
		sc.nextLine(); // 버퍼 비워주는 코드
		
		System.out.print("성별을 입력하세요(남/여) : ");
		char gender = sc.nextLine().charAt(0);		
		System.out.print("키를 입력하세요(cm) : ");
		double height = sc.nextDouble();
		
		//System.out.println("\n키 " + height + "인 " + age + "살 " + gender + "자 " + name + "님 반갑습니다^^");
		System.out.printf("\n키 %.1f인 %d살 %c자 %s님 반갑습니다^^", height, age, gender, name);
		
	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		// 산술연산(* /   >   + -)
		System.out.println("\n더하기 결과 : " + (num1 + num2));
		System.out.println("빼기 결과 : " + (num1 - num2));
		System.out.println("곱하기 결과 : " + num1 * num2);
		System.out.println("나누기 몫 결과 : " + num1 / num2);
		
		
	}
	
	public void method3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 : ");
		double width = sc.nextDouble();
		System.out.print("세로 : ");
		double height = sc.nextDouble();
		
		/* 곧바로 출력하는 방법 -------------------------------
		System.out.println("\n면적 : " + width * height);
		System.out.println("둘레 : " + (width + height) * 2);
		------------------------------------------------------*/
		
		// 연산결과를 변수에 담아놓고 활용하는 방법
		double area = width * height;				// 면적 구해서 변수에 기록해두기
		double perimeter = (width + height) * 2;	// 둘레 구해서 변수에 기록해두기
		
		System.out.println("\n면적 : " + area);
		System.out.println("둘레 : " + perimeter);	
		
		
		
	}
	
	public void method4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 (3글자이상) : ");
		String str = sc.nextLine();   // 사용자가 입력한 문자열값이 str에 기록이 됨!
	
		/* charAt으로 뽑은 문자값을 출력식안에 바로 기술하는 방법 -----------
		System.out.println("첫 번째 문자 : " + str.charAt(0));
		System.out.println("두 번째 문자 : " + str.charAt(1));
		System.out.println("세 번째 문자 : " + str.charAt(2));
		--------------------------------------------------------------------*/
		
		// 추출한 문자값을 char변수에 담은 후 출력하는 방법
		char ch1 = str.charAt(0);
		char ch2 = str.charAt(1);
		char ch3 = str.charAt(2);
		
		System.out.println("첫 번째 문자 : " + ch1);
		System.out.println("두 번째 문자 : " + ch2);
		System.out.println("세 번째 문자 : " + ch3);
		
		
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
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		System.out.println(ch + " 숫자값 : " + (int)ch);
		
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
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int sum = kor + eng + math;
		double avg = (double)sum / 3;
		
		System.out.println("총점 : " + sum);
		System.out.printf("평균 : %.2f", avg);
		
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
        
        System.out.println( iNum1 / iNum2 ); // 2
        System.out.println( (int)dNum ); // 2
        
        System.out.println( iNum2 * dNum ); // 10.0
        System.out.println( (double)iNum1 ); // 10.0
        
        System.out.println( iNum1 / (double)iNum2 ); // 2.5
        
        System.out.println( (int)fNum ); // 3
        System.out.println( (int)(iNum1 / fNum) ); // 3

        System.out.println( iNum1 / fNum );// 3.3333333
        System.out.println( (double)iNum1 / fNum ); // 3.333333333333335
        
        System.out.println( (int)ch ); // 65
        System.out.println( ch + iNum1 ); // 75
        System.out.println( (char)(ch + iNum1) ); // 'K'

	}
}
