package com.br.chap06_method.controller;

import java.util.Scanner;

import com.br.chap05_constructor.model.vo.User;

public class ReturnTest {

	// 1부터 100까지의 총 합계를 구해서 반환
	public int method1() {
		System.out.println("method1");
		int sum = 0;
		for(int i=1; i<=100; i++) {
			sum += i;
		}
		return sum;		
	}
	
	// 사용자에게 이름을 입력받아 반환
	public String method2() {
		System.out.println("method2");
		Scanner sc = new Scanner(System.in);
		System.out.print("이름: ");
		//String name = sc.nextLine();
		//return name;
		return sc.nextLine();
	}
	
	// 랜덤실수값 발생시켜서 반환
	public double method3() {
		System.out.println("method3");
		return Math.random();
	}
	
	// 두 정수값의 뺄셈연산 결과를 반환
	public int minus(int a, int b) {
		return a - b;
	}
	
	// 배열 반환 => 사실상 배열의 주소값 반환
	public int[] method4(int size) {
		System.out.println("method4");
		int[] arr = new int[size];
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
		}
		return arr;
	}
	
	// 객체 반환 => 사실상 객체의 주소값 반환
	
	/**
	 * 전달받은 값으로 User객체를 생성해서 반환해주는 메소드
	 * 
	 * @author boram
	 * @param id   생성하고자 하는 User객체의 아이디값
	 * @param pwd  생성하고자 하는 User객체의 비밀번호값
	 * @param name 생성하고자 하는 User객체의 이름값
	 * @return 새로이 생성된 User객체의 주소값
	 */
	public User makeUser(String id, String pwd, String name) {
		System.out.println("method5");
		
		//return new User(id, pwd, name);
		
		User u = new User(id, pwd, name); // 0X123
		return u; // return 0X123;
		
	}
	

}
