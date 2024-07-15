package com.hw2.view;

import java.util.List;
import java.util.Scanner;

import com.hw2.controller.LibraryManager;
import com.hw2.model.vo.Book;
import com.hw2.model.vo.Member;


public class LibraryMenu {
	
	private LibraryManager lm = new LibraryManager();
	private Scanner sc = new Scanner(System.in);
	
	public void login() {
		
		System.out.println("******** 환영합니다 *******");
		System.out.print("아이디 : ");
		String userId = sc.nextLine();
		System.out.print("비밀번호 : ");
		String userPwd = sc.nextLine();
		
		String user = lm.login(userId, userPwd);
		
		if(user.equals("admin")) {
			System.out.println("관리자님 환영합니다. 도서관리메뉴로 이동합니다.");
			adminMenu();
		}else {
			System.out.println("처음 방문하셨군요. 회원등록부터 진행합니다.");
			mainMenu();
		}
	}
	
	public void adminMenu() {
		
		while(true) {
			System.out.println("\n==== 관리자메뉴 ====");
			System.out.println("1. 도서 전체 조회");	// selectAll()
			System.out.println("2. 새로운 도서 추가");	// 기능 추가 해보기
			System.out.println("3. 기존 도서 삭제");	// 기능 추가 해보기
			System.out.println("4. 기존 도서 수정");	// 기능 추가 해보기
			System.out.println("0. 프로그램 종료하기");
			System.out.print(">> 메뉴 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1: selectAll(); break;
			case 2:  break;
			case 3:  break;
			case 4:  break;
			case 0: System.out.println("안녕히가세요 관리자님."); return;
			default: System.out.println("다시입력해주세용");
			}
			
		}
		
	}
	
	public void mainMenu() {
		
		System.out.print("이름을 입력해주세요 : ");
		String name = sc.next();
		System.out.print("나이를 입력해주세요 : ");
		int age = sc.nextInt();
		System.out.print("성별(M/F) : ");
		char gender = sc.next().charAt(0);
		
		lm.insertMember(name, age, gender);
		
		while(true) {
			System.out.println("\n==== 사용자 메뉴 ====");
			System.out.println("1. 마이페이지");		// myPage()
			System.out.println("2. 도서 전체 조회");	// selectAll()
			System.out.println("3. 도서 검색");			// searchBook()
			System.out.println("4. 도서 대여하기");		// rentBook()
			System.out.println("0. 프로그램 종료하기");
			System.out.print(">> 메뉴 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1: myPage(); break;
			case 2: selectAll(); break;
			case 3: searchBook(); break;
			case 4: rentBook(); break;
			case 0: System.out.println("프로그램을 종료합니다. "); return;
			default: System.out.println("다시 입력해주세요."); break;
			}
		}
	}
	
	public void myPage() {
		
		Member me = lm.getMem();
		System.out.println(me);
		
		System.out.print("수정하시겠습니까? (y/n) : ");
		char ch = sc.nextLine().toLowerCase().charAt(0);
		
		if(ch == 'y') {
			System.out.print("\n수정할 이름 : ");
			String name = sc.nextLine();
			
			System.out.print("수정할 나이 : ");
			int age = sc.nextInt();
			sc.nextLine();
			
			System.out.print("수정할 성별 : ");
			char gender = sc.nextLine().charAt(0);
			
			lm.updateMember(name, age, gender);
			
			System.out.println("성공적으로 수정되었습니다.");
		}
		
	}
	
	// 전체조회 메소드
	public void selectAll() {
		// lm의 selectAll()메소드를 통해 전체 도서 목록 받아오기
		List<Book> bList = lm.selectAll();
		
		System.out.println("===== 도서 목록 =====");
		// for문을 이용하여 출력 + i를 이용하여 인덱스도 같이 출력
		for(int i=0; i<bList.size(); i++) {
			System.out.println(i + "번 도서 : " + bList.get(i)); 
		}
	}
	
	// 도서검색 메소드
	public void searchBook() {
		System.out.print("검색할 제목 입력 : ");
		String keyword = sc.next();
		
		// 입력받은 검색 제목을 lm의 searchTitle()메소드로 전달, 그 검색 결과 검색한 도서목록을 받아옴
		List<Book> searchList = lm.searchBook(keyword);
		
		if(searchList.isEmpty()) {
			System.out.println("검색 결과가 없습니다.");
		}else {
			// 향상된 for문(for each문)를 이용하여 출력
			for(Book bk : searchList) {
				System.out.println(bk);
			}
		}
		
	}
	
	// 도서대여 메소드
	public void rentBook() {
		
		selectAll();
		
		System.out.print("대여 할 도서 선택 : ");
		int num = sc.nextInt();
		
		// 대여할 도서 인덱스 번호를 lm의 rentBook()메소드로 전달하고 그 결과 값을 받아옴
		int result = lm.rentBook(num);

		// 각각에 해당하는 출력문을 출력하기 위해 result 받았음
		if(result == 0) {
			System.out.println("성공적으로 대여되었습니다.");
		}else if(result == 1) {
			System.out.println("나이제한으로 대여 불가능 입니다.");
		}else if(result == 2) {
			System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다.");
		}
	}

}
