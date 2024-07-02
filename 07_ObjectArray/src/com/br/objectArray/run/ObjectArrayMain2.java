package com.br.objectArray.run;

import com.br.objectArray.model.vo.Book;

public class ObjectArrayMain2 {
	
	public static void main(String[] args) {
		
		int[] arr = new int[3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		Book[] books = new Book[3];
		books[0] = new Book();
		books[1] = new Book("C언어", "강개순", 1000, "구디");
		books[2] = new Book("파이썬", "김말똥", 2000, "나무");
		
		/*
		System.out.println(books);
		System.out.println(books[1]);
		System.out.println(books[1].information());
		*/
		
		books[0].setTitle("자바");
		books[0].setAuthor("홍길동");
		books[0].setPrice(500);
		books[0].setPublisher("문학");
		
		// 모든 도서의 총 가격을 구하기
		int totalPrice = 0;
		/*
		for(int i=0; i<books.length; i++) {
			System.out.println(books[i].information());
			totalPrice += books[i].getPrice();
		}
		*/
		for(Book bk : books) {
			System.out.println(bk.information());
			totalPrice += bk.getPrice();
		}
		
		System.out.println("모든 도서의 총가격 : " + totalPrice);
		
		
		
		
	}

}
