package com.hw1.view;

import java.util.List;
import java.util.Scanner;

import com.hw1.controller.BookController;
import com.hw1.model.vo.Book;

public class BookMenu {
	
	Scanner sc = new Scanner(System.in); // 사용자에게 키보드로 값을 입력 받기 위한 Scanner 객체
	BookController bc = new BookController(); // BookController의 메소드들을 사용하기 위한 레퍼런스
	
	public void mainMenu() {
		
		System.out.println("== Welcome BR Library ==");
		
		while(true) {
			System.out.println("\n===== 메인 메뉴 ====");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색 조회");
			System.out.println("4. 도서 삭제하기");
			System.out.println("0. 프로그램 종료하기");
			
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1: insertBook(); break;
			case 2: selectList(); break;
			case 3: searchBook(); break;
			case 4: deleteBook(); break;
			case 0: System.out.println("프로그램을 종료합니다."); return;
			default: System.out.println("잘못입력하였습니다. 다시 입력해주세요"); break;
			}
		}
		
	}
	
	// 1. 새 도서 추가용 view 메소드
	public void insertBook() {
		/*
		 * 1. 도서명 입력받기 (String title)
		 * 2. 저자명 입력받기 (String author)
		 * 3. 장르 입력받기 (int category) --> 숫자로 입력받기 (1.인문 / 2.자연과학 / 3.의료 / 4.기타)
		 * 4. 가격 입력받기 (String price)
		 * 
		 * 5. bc(BookController)의 insertBook메소드 호출하면서 위의 내용들 전달
		 */
		
		// 1번 ~ 4번 과정
		System.out.print("도서명 : ");
		String title = sc.nextLine();
		System.out.print("저자명 : ");
		String author = sc.nextLine();
		System.out.print("장르번호(1.인문 / 2.자연과학 / 3.의료 / 4.기타) : ");
		int category = sc.nextInt();
		sc.nextLine();
		System.out.print("가격 : ");
		String price = sc.nextLine();
		
		// 5번 과정
		bc.insertBook(title, author, category, price);
		
		System.out.println("성공적으로 추가되었습니다.");
	}
	
	
	// 2. 도서 전체용 view 메소드
	public void selectList() {
		/*
		 * 1. bc(BookController)의 selectList() 메소드를 호출 후
		 *    --> 돌아온 결과 값을 리스트(ArrayList<Book> bookList)하나 만들어서 대입
		 * 
		 * 2. 조건식 이용해서 
		 * 2_1. bookList가 "비어있는 경우"    -->   "존재하는 도서가 없습니다." 라는 알람 문구 출력
		 * 2_2. bookList가 "비어있지 않은 경우" -->   반복문을 통해 bookList 안의 Book 객체들 출력
		 * 
		 */
		
		// 1번 과정
		List<Book> bookList = bc.selectList();
		
		// 2번 과정
		if(bookList.isEmpty()) {
			System.out.println("존재하는 도서가 없습니다.");
		}else {
			for(int i=0; i<bookList.size(); i++) {
				System.out.println(bookList.get(i));				
			}
		}
	}
	
	
	// 3. 도서 검색용 view 메소드
	public void searchBook() {
		
		/*
		 * 1. 반복적으로 서브메뉴를 출력하되 이때 메뉴 구성으로는 아래와 같다. 
		 * 		 1) 도서명으로 검색
		 * 		 2) 저자명으로 검색
		 * 		 3) 도서명 또는 저자명으로 검색 
		 * 		 0) 뒤로가기 
		 * 
		 * 2. 위의 메뉴를 출력시킨 후 사용자에게 이용할 메뉴 번호를 선택받고 
		 *    잘못된 메뉴번호라면 다시 입력할 수 있도록
		 *    0번 메뉴 선택이라면 return으로 메인메뉴로 돌아갈수 있도록 하기 
		 * 
		 * 3. 검색하고자 하는 키워드 입력받기 (String keyword)
		 * 4. bc(BookController)의 searchBook 메소드 호출 하면서 메뉴번호와 키워드값 전달 
		 *    --> 이때 돌아오는 결과값을 List<Book> 타입의 변수로 받은 후 
		 *    
		 * 5. 해당 리스트가 비어있을 경우 => "검색 결과가 없습니다." 출력
		 *             그게 아닐 경우 => 해당 리스트 안의 도서객체들 전체 출력
		 */
		
		
		while(true) {
			// 1번 과정
			System.out.println("\n===== 검색 메뉴 ====");
			System.out.println("1. 도서명으로 검색");
			System.out.println("2. 저자명으로 검색");
			System.out.println("3. 도서명 또는 저자명으로 검색");
			System.out.println("0. 뒤로가기");
			
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			// 2번 과정
			if(menu == 0) {
				return;
			}else if(!(menu >= 1 && menu <= 3)) {
				System.out.println("다시 입력해주세요");
				continue;
			}
			
			// 3번 과정
			System.out.print("검색 키워드 : ");
			String keyword = sc.nextLine();
			
			// 4번 과정
			List<Book> searchList = bc.searchBook(menu, keyword);
			
			// 5번 과정
			if(searchList.isEmpty()) {
				System.out.println("검색 결과가 없습니다.");
			}else {
				for(Book bk : searchList) {
					System.out.println(bk);
				}
			}
			
		}
		
	}
	
	
	// 4. 도서 삭제용 view 메소드
	public void deleteBook() {
		/*
		 * 1. 삭제할 도서명 입력받기 (String title)
		 * 2. 삭제할 저자명 입력받기 (String author)
		 * 3. bc(BookConroller)의 deleteBook() 메소드로 위의 title, author 값 전달 하면서 호출
		 * 	  --> 이때 돌아온 결과 값을 result에 받기!
		 * 
		 * 4. 조건식 이용해서
		 * 4_1. result가 1일 경우       -->  "성공적으로 성공적으로 삭제되었습니다." 라는 알람 문구 출력
		 * 4_2. result가 0일 경우    	  -->  "삭제할 도서를 찾지 못했습니다." 라는 알람 문구 출력
		 *  
		 */
		
		// 1번 ~ 2번 과정
		System.out.print("삭제할 도서명 : ");
		String title = sc.nextLine();
		System.out.print("삭제할 저자명 : ");
		String author = sc.nextLine();
		
		// 3번 과정
		int result = bc.deleteBook(title, author);
		
		// 4번 과정
		if(result == 1) {
			System.out.println("성공적으로 삭제되었습니다.");
		}else {
			System.out.println("삭제할 도서를 찾지 못했습니다.");
		}
	}
	

}
