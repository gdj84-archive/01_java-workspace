package test.controller;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 두 개 입력 : ");
		int first = sc.nextInt();
		int second = sc.nextInt();
		
		if((first >= 1 && first <= 9) && (second >= 1 && second <= 9)){
			if(first * second < 10) {
				System.out.println("한자리 수 입니다.");
			}else {
				System.out.println("두자리 수 입니다.");
			}
		}

	}

}
