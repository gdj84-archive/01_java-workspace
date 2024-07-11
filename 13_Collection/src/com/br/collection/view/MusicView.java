package com.br.collection.view;

import java.util.List;
import java.util.Scanner;

import com.br.collection.controller.MusicController;
import com.br.collection.model.vo.Music;

// 화면을 담당하는 클래스 (출력문, 입력문)
public class MusicView {
	
	private MusicController mc = new MusicController();
	private Scanner sc = new Scanner(System.in);
	
	// 각 화면별 메소드
	
	// 메인화면 : 프로그램 실행시 처음 보여지는 화면
	public void mainMenu() {
		
		while(true) {
			
			System.out.println("\n=== 음악관리프로그램 ===");
			System.out.println("1. 새로운 곡 추가");
			System.out.println("2. 곡 전체 조회");
			System.out.println("3. 특정 곡 삭제");
			System.out.println("4. 특정 곡 검색");
			System.out.println("5. 특정 곡 수정");
			System.out.println("6. 가수명을 통해서 곡명 찾기");
			System.out.println("7. 특정 곡 갯수 조회");
			System.out.println("0. 프로그램 종료");
			
			System.out.print(">> 메뉴 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1: inputMusic(); break;
			case 2: selectMusic(); break;
			case 3: removeMusic(); break;
			case 4: searchMusic(); break;
			case 5: modifyMusic(); break;
			case 6: searchMusicTitle(); break;
			case 7: searchCount(); break;
			case 0: System.out.println("프로그램을 종료합니다. 이용해주셔서 감사합니다."); return;
			default: System.out.println("메뉴를 잘못 선택하셨습니다. 다시 선택해주세요.");
			}
			
		}
		
	}
	
	// 새로운 곡 추가하는 서브 화면 (1번 메뉴 선택시)
	public void inputMusic() {
		
		System.out.println("\n=== 신규 곡 추가 화면 ===");
		
		System.out.print("곡명 입력 : ");
		String title = sc.nextLine();
		
		System.out.print("가수 입력 : ");
		String artist = sc.nextLine();
		
		// 곡 추가 요청보내기! (Controller측 메소드 호출)
		mc.insertMusic(title, artist);
		
		System.out.println("성공적으로 추가되었습니다.");
		
	}
	
	// 전체 곡 조회용 서브화면
	public void selectMusic() {
		System.out.println("\n==== 전체 곡 리스트 ====");
		
		// 전체 곡 조회 요청! (Controller측 메소드 호출)
		List<Music> list = mc.selectMusicList();
		
		if(list.isEmpty()) {// list가 텅 비어있을 경우 => "현재 존재하는 곡이 없습니다."
			System.out.println("현재 존재하는 곡이 없습니다.");
		}else {// list가 비어있지 않을 경우 => 존재하는 Music 객체 전체 출력
			for(int i=0; i<list.size(); i++) {
				System.out.println(list.get(i));
			}		
		}
	}
	
	// 특정 곡 삭제 시키는 서브 화면
	public void removeMusic() {
		System.out.println("\n==== 특정 곡 삭제 화면 ===");
		
		System.out.print("삭제할 곡명 : ");
		String title = sc.nextLine();
		
		// 삭제 요청 보내기! (Controller 메소드 호출)
		int result = mc.deleteMusic(title); // 0 | 1
		
		if(result > 0) {
			System.out.println("성공적으로 삭제되었습니다.");
		}else {
			System.out.println("삭제할 곡을 찾지 못했습니다.");
		}
		
	}
	
	// 특정곡을 찾아 수정하는 서브화면
	public void modifyMusic() {
		
		System.out.println("\n=== 특정 곡 수정 화면 ===");
		
		System.out.print("수정하고자하는 곡명 : ");
		String title = sc.nextLine();
		
		System.out.print("수정 내용(곡명) : ");
		String upTitle = sc.nextLine();
		
		System.out.print("수정 내용(가수명) : ");
		String upArtist = sc.nextLine();
		
		// 수정 요청 보내기! (Controller측 메소드 호출)
		int result = mc.updateMusic(title, upTitle, upArtist); // 0 | 1
		
		if(result > 0) {
			System.out.println("성공적으로 수정되었습니다.");
		}else {
			System.out.println("수정할 곡을 찾지 못했습니다.");
		}
		
	}
	
	public void searchMusic() {
		
		System.out.println("\n=== 특정 곡 검색 화면 ===");
		
		System.out.print("검색할 곡명(키워드) : ");
		String keyword = sc.nextLine();
		
		List<Music> searchList = mc.selectMusicByKeyword(keyword);
		
		
		if(searchList.isEmpty()) {
			System.out.println("검색된 결과가 없습니다.");
		}else {
			for(int i=0; i<searchList.size(); i++) {
				System.out.println(searchList.get(i));
			}
		}
		
	}
	
	public void searchMusicTitle() {
		
		System.out.println("\n=== 가수명을 통해 곡명 찾기 ===");
		
		/*
		 * 사용자에게 가수명을 입력받아 
		 * 현재 list내의 Music객체들 중 해당 가수명과 일치하는 
		 * 곡명들을 출력하시오.
		 */
		System.out.print("검색할 가수명 : ");
		String artist = sc.nextLine();
		
		List<String> searchTitle = mc.searchTitleByArtist(artist);
		
		if(searchTitle.isEmpty()) { // 비어있을 경우 == 검색결과없음
			System.out.println(artist + "에 대한 검색 결과가 없습니다.");
		}else { // 그게아닐경우 == 검색결과있음
			for(String title : searchTitle) {
				System.out.println(title);
			}
		}
		
	}
	
	public void searchCount() {
		System.out.println("\n=== 특정 곡이 몇개인지 ===");
		
		System.out.print("곡명 : ");
		//String title = sc.nextLine();
		//int count = mc.selectCountByTitle(title);
		int count = mc.selectCountByTitle(sc.nextLine());
		
		System.out.println("조회된 곡이 " + count + "개 입니다.");
		
	}

}
