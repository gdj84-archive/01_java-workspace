package com.br.objectArray.run;

import java.util.Scanner;

import com.br.objectArray.model.vo.Book;

public class ObjectMain {

	// 다수의 객체들을 따로따로 관리해보기
	public static void main(String[] args) {
		
		Book bk1 = null;
		Book bk2 = null;
		Book bk3 = null;
		
		/*
		// bk1. 기본생성자로 생성후 setter이용해서 값 대입
		bk1 = new Book();
		bk1.setTitle("자바의 정석");
		bk1.setAuthor("홍길동");
		bk1.setPrice(20000);
		bk1.setPublisher("문학");
		
		// bk2. 매개변수생성자로 생성과 동시에 값 대입
		bk2 = new Book("C언어의 정석", "강개순", 15000, "나무");
		
		// bk3. 사용자에게 도서정보를 입력받아 매개변수생성자로 생성
		Scanner sc = new Scanner(System.in);
		
		System.out.print("도서명: ");
		String title = sc.nextLine();
		System.out.print("저자명: ");
		String author = sc.nextLine();
		System.out.print("가격: ");
		int price = sc.nextInt();
		sc.nextLine();
		System.out.print("출판사: ");
		String publisher = sc.nextLine();
		
		bk3 = new Book(title, author, price, publisher);
		
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		System.out.println(bk3.information());
		*/
		
		// 세 도서에 대한 정보를 반복적으로 사용자에게 입력 => 각 객체 생성
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<3; i++) { // i=0 => i=1 => i=2
			
			System.out.println((i+1) + "번째 도서정보 입력");
			
			System.out.print("도서명: ");
			String title = sc.nextLine();
			System.out.print("저자명: ");
			String author = sc.nextLine();
			System.out.print("가격: ");
			int price = sc.nextInt();
			sc.nextLine();
			System.out.print("출판사: ");
			String publisher = sc.nextLine();
			
			// 매번 조건검사 후 각 객체 생성해야됨
			if(i == 0) {
				bk1 = new Book(title, author, price, publisher);
			}else if(i == 1) {
				bk2 = new Book(title, author, price, publisher);
			}else {
				bk3 = new Book(title, author, price, publisher);
			}
			
		}
		
		
		// 현재 보유하고 있는 모든 도서 정보 조회 
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		System.out.println(bk3.information());
		
		// 도서 제목으로 검색하는 서비스 (보유하고 있는 모든 도서의 제목과 검색어를 비교)
		System.out.print("검색할 책 제목 : ");
		String search = sc.nextLine();
		
		if(bk1.getTitle().equals(search)) {
			System.out.println(bk1.information());
		}
		
		if(bk2.getTitle().equals(search)) {
			System.out.println(bk2.information());
		}
		
		if(bk3.getTitle().equals(search)) {
			System.out.println(bk3.information());
		}
		
		
	}

}
