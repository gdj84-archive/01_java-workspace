package test.controller;

import java.util.Scanner;

public class Test4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		if(num1 >= 0 && num1 <=9  && num2 >=0 && num2 <= 9) {
			System.out.println("합 : " + (num1 + num2));
			System.out.println("차 : " + (num1 - num2));
			System.out.println("곱 : " + (num1 * num2));
			System.out.println("나누기 : " + (num2 == 0 ? "0" : (num1 / num2)));
		}else {
			System.out.println("잘못 입력하였습니다.");
		}
		
		
	}

}
