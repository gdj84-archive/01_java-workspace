package com.hw2.controller;

import java.util.ArrayList;
import java.util.List;

import com.hw2.model.vo.AniBook;
import com.hw2.model.vo.Book;
import com.hw2.model.vo.CookBook;
import com.hw2.model.vo.Member;

public class LibraryManager {
	
	private Member mem = null;

	private List<Book> bookList = new ArrayList<>();
	{ // 샘플 데이터
		bookList.add(new CookBook("백종원의 집밥", "백종원", "tvN", true));
		bookList.add(new AniBook("한번 더 해요", "미티", "원모어", 19));
		bookList.add(new AniBook("루피의 원피스", "루피", "japan", 12));
		bookList.add(new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false));
		bookList.add(new CookBook("최현석 날 따라해봐", "최현석", "소금책", true));
	}
	
	public String login(String userId, String userPwd) {
		
		if(userId.equals("admin") && userPwd.equals("1234")) {
			return "admin";
		}
		
		return "member";
	}
	
	// 전달 받은 내 신상 정보를 등록
	public void insertMember(String name, int age, char gender) {
		mem = new Member(name, age, gender);
	}
	
	// 회원 레퍼런스 주소값 리턴
	public Member getMem() {
		return mem;
	}
	
	// 전달 받은 값으로 내 신상 정보 수정 
	public void updateMember(String name, int age, char gender) {
		mem.setName(name);
		mem.setAge(age);
		mem.setGender(gender);
	}
	
	// 도서리스트 주소값 리턴
	public List<Book> selectAll() {
		return bookList;
	}
	
	// 도서검색 리스트 리턴
	public List<Book> searchBook(String keyword) {
		List<Book> searchList = new ArrayList<>();
		
		for(int i=0; i<bookList.size(); i++) {
			if(bookList.get(i).getTitle().contains(keyword)) {
				searchList.add(bookList.get(i));
			}
		}
		
		return searchList;
	}
	
	// 대여하기
	public int rentBook(int index) {
		
		int result = 0;
		Book rentBk = bookList.get(index);
		
		if(rentBk instanceof AniBook) { // 대여하고자 하는 도서가 AniBook일 경우 현재 회원 나이와 도서의 제한나이와 비교해야된다.  
			if(((AniBook)rentBk).getAccessAge() > mem.getAge()) { 
				result = 1;
			}
		}else if(rentBk instanceof CookBook) { // 대여하고자 하는 도서가 CookBook일 경우 해당 도서에 쿠폰이 있는지 판단해야된다. 
			if(((CookBook)rentBk).isCoupon()){
				mem.setCouponCount(mem.getCouponCount()+1);
				result = 2;
			}
		}
		
		return result;
	}

}
