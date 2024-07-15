package com.hw2.run;

import com.hw2.view.LibraryMenu;

public class Run {
	
	public static void main(String[] args) {
		
		//new LibraryMenu().mainMenu(); // 원래 실습문제
		
		new LibraryMenu().login();  // 로그인 기능처럼 => 아이디:admin / 비번:1234 입력시 관리자메뉴 뜸 => 기능은 추가로 구현해보기 
									// 다른아이디 비번치면 원래 실습문제 대로 회원등록부터 메뉴출력까지 진행됨
	}

}
