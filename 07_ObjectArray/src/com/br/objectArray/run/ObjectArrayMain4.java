package com.br.objectArray.run;

import java.util.Scanner;

import com.br.objectArray.controller.PhoneController;
import com.br.objectArray.model.vo.Phone;

public class ObjectArrayMain4 {

	public static void main(String[] args) {
		
		// 현재 판매중인 핸드폰 목록 배열객체 세팅
		// 초기 데이터 세팅
		
		/*
		Phone[] phones = new Phone[5];
		
		phones[0] = new Phone("갤럭시", "삼성", 1600000, "z플립");
		phones[1] = new Phone("아이폰", "애플", 1300000, "15pro");
		phones[2] = new Phone("아이폰", "애플", 1200000, "12pro");
		phones[3] = new Phone("갤럭시", "삼성", 1100000, "s20");
		phones[4] = new Phone("롤리팝", "LG", 600000, "2");
		*/
		
		int[] arr = /*new int[]*/{1,2,3,4,5};
		
		Phone[] phones = /*new Phone[]*/ {
				new Phone("갤럭시", "삼성", 1600000, "z플립"),
				new Phone("아이폰", "애플", 1300000, "15pro"),
				new Phone("아이폰", "애플", 1200000, "12pro"),
				new Phone("갤럭시", "삼성", 1100000, "s20"),
				new Phone("롤리팝", "LG", 600000, "2")				
		};
		
		Scanner sc = new Scanner(System.in);
		PhoneController pc = new PhoneController();
		
		while(true) {
			
			System.out.println("\n========보람폰판매점========");
			System.out.println("1. 판매점 내의 모든 폰 조회");
			System.out.println("2. 판매점 내의 핸드폰 평균가 조회");
			System.out.println("3. 구매하고자 하는 핸드폰의 가격 조회");
			System.out.println("4. 구매하고자 하는 핸드폰들의 가격 조회");
			System.out.println("0. 프로그램 종료");
			System.out.print(">> 메뉴번호: ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			if(menu == 1) {
				
				pc.selectAllPhone(phones);
				
			}else if(menu == 2) {
				
				double avg = pc.selectPhoneAvgPrice(phones);
				System.out.println("평균가격 : " + avg);
				
			}else if(menu == 3) {
				
				System.out.print("구매하고자하는 핸드폰(핸드폰명+시리즈명): ");
				String search = sc.nextLine();
				
				int price = pc.searchPhonePrice(phones, search); // 검색된핸드폰가격|0
				
				if(price == 0) {
					System.out.println(search + "에 해당하는 검색 결과가 없습니다.");
				}else {
					System.out.println("구매하고자 하는 " + search + "의 가격은 " + price + "원입니다.");
				}
				
			}else if(menu == 4) {
				
				System.out.print("구매하고자하는 핸드폰(키워드도 가능): ");
				String search = sc.nextLine();
				
				int[] prices = pc.searchKeywordPhonePrice(phones, search);
								// {0,0,1000000,200000,0} | {0,0,0,0,0}
				for(int i=0; i<prices.length; i++) {
					if(prices[i] != 0) {
						System.out.println("검색된 핸드폰의 가격은 " + prices[i] + "원 입니다.");
					}
				}
				
				
			}else if(menu == 0) {
				System.out.println("프로그램을 종료합니다. 이용해주셔서 감사합니다.");
				break;
			}else {
				System.out.println("잘못된 메뉴번호를 입력하셨습니다. 다시입력해주세요.");
			}
			
		}
		
		
		
		
		
	}

}
