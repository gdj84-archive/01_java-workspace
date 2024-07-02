package com.br.objectArray.run;

import java.util.Scanner;

import com.br.objectArray.model.vo.Book;

public class ObjectArrayMain1 {

	// 다수의 객체들을 하나의 배열로 관리해보기
	public static void main(String[] args) {
								//  int           int           int
		int[] arr = new int[3]; // arr[0] <= 0 / arr[1] <= 0 / arr[2] <= 0
		
		// 세 개의 Book객체를 담기위한 배열
									//  Book                Book              Book
		Book[] books = new Book[3]; // books[0] <= null / books[1] <= nul / books[2] <= null
		
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
			
			// 각각의 인덱스 자리에 차곡차고 객체 생성 대입
			books[i] = new Book(title, author, price, publisher);
			
		}
		
		// 전체 조회 서비스
		/*
		for(int i=0; i<books.length; i++) {
			System.out.println(i + "번째 : " + books[i].information());
		}
		*/
		for(Book bk:books) { // 변수 = books[0]; => 변수 = books[1]; => .... => 변수 = books[마지막];
			System.out.println(bk.information());
		}
		

		
		// 검색 서비스
		System.out.print("검색할 책 제목 : ");
		String search = sc.nextLine();
		/*
		for(int i=0; i<books.length; i++) {
			if(books[i].getTitle().equals(search)) {
				System.out.println(books[i].information());
			}
		}
		*/
		for(Book bk : books) {
			if(bk.getTitle().equals(search)) {
				System.out.println(bk.information());
			}
		}
		
		
		
		
		
		
		
		
		
	}

}
