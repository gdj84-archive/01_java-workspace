package com.hw1.model.vo;

import java.text.SimpleDateFormat;
import java.util.Calendar;

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
		/*
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		String result = sdf.format(publishDate.getTimeInMillis()); // "2022년 12월 01일"
		
		return "Book [title=" + title + ", author=" + author + ", publisher=" + publisher + ", publishDate="
				+ result + ", price=" + price + "]";
		*/
		
		return "Book [title=" + title + ", author=" + author + ", publisher=" + publisher + ", publishDate="
				+ new SimpleDateFormat("yyyy년 MM월 dd일").format(publishDate.getTimeInMillis()) + ", price=" + price + "]";
	}

}
