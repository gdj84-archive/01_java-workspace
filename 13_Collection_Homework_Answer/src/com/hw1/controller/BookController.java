package com.hw1.controller;

import java.util.ArrayList;
import java.util.List;

import com.hw1.model.vo.Book;

public class BookController {
	
	// 도서들을  담고 있는 bookList
	private List<Book> bookList = new ArrayList<Book>();
	{
		// 초기값 4개정도 추가
		bookList.add(new Book("자바언어의 정석", "홍길동", "기타", 20000));
		bookList.add(new Book("C언어의 보람", "김말똥", "기타", 15000));
		bookList.add(new Book("도움이 되었나요", "강보람", "인문", 17500));
		bookList.add(new Book("여러분", "홍홍홍", "의료", 10000));
	}
	
	
	public void insertBook(String title, String author, int category, String price) {
		/*
		 * 1. 전달받은 값들을 가지고 매개변수 생성자를 이용하여 Book 객체 생성 
		 *    (유의사항 : 장르 번호별로 조건식 이용해서 장르번호가 아닌 장르명을 전달하면서 생성 할 것!, 가격은 숫자로 전달할 것)
		 * 2. bookList에 1번과정에서 생성된 Book객체 추가
		 */
		
		// 1번 과정.
		String categoryStr = "";
		
		switch(category) {
		case 1: categoryStr = "인문"; break;
		case 2: categoryStr = "자연과학"; break;
		case 3: categoryStr = "의료"; break;
		case 4: categoryStr = "기타"; break;
		}
		
		Book bk = new Book(title, author, categoryStr, Integer.parseInt(price));
		
		// 2번 과정.
		bookList.add(bk);
	}
	
	
	public List<Book> selectList(){
		/*
		 * 1. 해당 bookList 반환
		 */
		
		return bookList; 	
	}
	
	
	public List<Book> searchBook(int menu, String keyword){
		/*
		 * 1. 검색결과를 담을 List 생성해두기 
		 * 2. 반복문을 활용하여 bookList에 있는 모든 Book객체들과 비교하되 
		 *    전달받은 메뉴번호가 1일 경우는 Book객체들의 제목값으로
		 *    				2일 경우는 Book객체들의 저자명값으로
		 *    				3일 경우는 Book객체들의 제목값 또는 저자명값으로 
		 *    		전달받은 키워드가 포함되어있는지 비교 
		 *     		이때 포함되어있다면 해당 Book객체를 1번과정에 생성해둔 List에 담기
		 * 3. 해당 ArrayList 반환
		 */
		
		
		// 1번 과정
		List<Book> searchList = new ArrayList<>();
		
		// 2번 과정
		for(Book bk : bookList) {
			if(menu == 1 && bk.getTitle().contains(keyword)) {
				searchList.add(bk);
			}else if(menu == 2 && bk.getAuthor().contains(keyword)) {
				searchList.add(bk);
			}else if(menu == 3 && (bk.getTitle().contains(keyword) || bk.getAuthor().contains(keyword))) {
				searchList.add(bk);
			}
		}
		
		// 3번 과정
		return searchList;
	}
	
	public int deleteBook(String title, String author) {
		/*
		 * 1. 사용자가 입력한 도서명과 저자명이 일치할 경우 성공적으로 삭제 될 것이고, 그게 아닐 경우 삭제할 도서를 찾지 못한 경우이다.
		 *    그래서 이를 처리하기 위한 result 변수를 0으로 초기화 한 채로 만들어 두자.
		 * 2. 반복문을 통해 bookList의 책들 중 책명이 전달받은 title과 동일하고, 저자명이 전달받은 author와 동일한 경우 
		 *    해당 인덱스의 도서 "삭제"하고 result 1로 변경 후 빠져나가기(더이상 반복문을 돌릴 필요없으니깐 break!)
		 * 
		 * 3. result 값 반환
		 */
		
		// 1번 과정
		int result = 0;
		
		// 2번 과정_단순 for문 사용하기
		/* ---------------------------------------------
		for(int i=0; i<bookList.size(); i++) {
		
			Book bk = bookList.get(i); // 먼저 해당 객체를 bk에 담아둬도 된다. 
			
			if(bk.getTitle().equals(title) && bk.getAuthor().equals(author)) {
				bookList.remove(i);
				result = 1;
				break; // 해당 도서를 삭제하고 궂이 반복문 더이상 실행시킬 필요 없기 때문에 빠져나가기
			}
		}
		-----------------------------------------------*/
		
		// 2번 과정_for each문 사용하기 (권장x)
		for(Book bk : bookList) {
			
			if(bk.getTitle().equals(title) && bk.getAuthor().equals(author)) {
				bookList.remove(bk); // remove 메소드 사용시 해당 인덱스를 보내는 것 말고 해당 객체를 전달해서 지워줄 수도 있다!
				result = 1;
				break; // 위의 단순 for문 방식과 비슷하게 생각하면 큰 오산 --> for each문 사용할때는 꼭 break를 통해 빠져나가줘야된다. 
					   // 왜냐면 위의 반복문 기입에 bookList를 작성하게 되면 기존에 리스트의 size()가 처음에 5였다면 무조건 5번 반복한다. 
					   // 따라서 값을 삭제하고 나서도 남아있는 반복이 실행될 수 있어 발생되는 예외로 ConcurrentModificationException 발생
					   // List를 순회하는 for each문을 통해 삭제 또는 변경하는 과정을 하게 되면 볼 수 있는 예외이다.
					   // 즉, 여러분들! for each문은 단순히 조회 목적으로만 쓰는거에요! 변경이나 삭제할때는 안쓰는게 좋아요!
			}
		}
		
		// 3번 과정
		return result; 
	}
	
	
	
	
}
