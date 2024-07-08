package com.hw1.model.vo;

import java.util.Calendar;
import java.util.Date;

/**
 * @author Boram
 *
 */
public class Book {
	
	private String title;		// 제목
	private String author;		// 저자
	private String publisher;	// 출판사
	private Calendar publishDate;	// 출판일
	private int price;			// 가격
	
	public Book() {
		
	}
	
	public Book(String title, String author, String publisher, Calendar publishDate, int price) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.publishDate = publishDate;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Calendar getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Calendar publishDate) {
		this.publishDate = publishDate;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		
		// 출판일(Calendar publishDate) 형식을  "0000년 00월 00일" 형태의 문자열 형식으로 만들어 하단의 주석에 반영시키시오
		
		// 코드 작성
		
		return "Book [title=" + title + ", author=" + author + ", publisher=" + publisher + ", publishDate="
				+ /* 반영 */ + ", price=" + price + "]";
	}

}
