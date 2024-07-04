package com.br.chap02_abstract_practice.run;

import java.util.Scanner;

import com.br.chap02_abstract_practice.model.vo.Archor;
import com.br.chap02_abstract_practice.model.vo.Assassin;
import com.br.chap02_abstract_practice.model.vo.GameCharacter;
import com.br.chap02_abstract_practice.model.vo.Warrior;
import com.br.chap02_abstract_practice.model.vo.Wizard;

public class GameProgram {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== 캐릭터 선택 ===");
		System.out.println("1. 전사");
		System.out.println("2. 마법사");
		System.out.println("3. 궁수");
		System.out.println("4. 어쌔신");
		System.out.print("번호 > ");
		int chNum = sc.nextInt();
		sc.nextLine();
		
		// 캐릭터의 기본 정보 입력받기 
		System.out.print("이름 : ");
		String gcName = sc.nextLine();
		System.out.print("체력 : ");
		int gcHp = sc.nextInt();
		System.out.print("레벨 : ");
		int gcLevel = sc.nextInt();
		System.out.print("경험치 : ");
		int gcExp = sc.nextInt();
		sc.nextLine();
		
		GameCharacter gc = null;
		if(chNum == 1) { // 전사 선택시 => 추가로 무기, 아이템들(2개)에 대한 정보 입력받은 후 Warrior 객체 생성 진행 
			
			System.out.print("무기명 : ");
			String weapon = sc.nextLine();
			System.out.print("아이템1 : ");
			String item1 = sc.nextLine();
			System.out.print("아이템2 : ");
			String item2 = sc.nextLine();
			gc = new Warrior(gcName, gcHp, gcLevel, gcExp, weapon, new String[] {item1, item2});
			
		}else if(chNum == 2) { // 마법사 선택시 => 초기 마력값 입력받은 후 Wizard 객체 생성 진행 
			
			System.out.print("마력 : ");
			gc = new Wizard(gcName, gcHp, gcLevel, gcExp, sc.nextInt());
			
		}else if(chNum == 3) { // 궁수 선택시 => 사격거리, 초기 활 갯수 입력받은 후 Archor 객체 생성 진행 
			
			System.out.print("사격거리(m) : ");
			int distance = sc.nextInt();
			System.out.print("활 갯수 : ");
			int count = sc.nextInt();
			gc = new Archor(gcName, gcHp, gcLevel, gcExp, distance, count);
			
		}else if(chNum == 4) { // 어쌔신 선택시 => 별도로 입력받을 값 없이 바로 Assassin 객체 생성 진행 
			
			gc = new Assassin(gcName, gcHp, gcLevel, gcExp);
			
		}else { // 잘못 입력시 => 그냥 프로그램 종료 되도록
			System.out.println("잘못입력하였으므로 프로그램을 종료합니다."); 
			return;
		}
		
		
		
		// 위의 과정으로 캐릭터 생성이 다 되면 게임이 진행 되도록
		// 프로그램을 종료하겠다는 의사를 밝히기 전까지 계속 지속될 수 있도록 무한반복문 활용
		while(true) {
			
			System.out.println("\n== 게임진행 ==");
			System.out.println("1. 캐릭터 정보보기");
			System.out.println("2. 공격하기");
			System.out.println("3. 방어하기");
			System.out.println("0. 게임종료");
			System.out.print("메뉴선택 > ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1: System.out.println(gc); break;
			case 2: gc.attack(); break;
			case 3: gc.defence(); break;
			case 0: System.out.println("프로그램을 종료합니다."); return;
			default: System.out.println("메뉴를 잘못 입력하셨습니다. 다시입력해주세요.");
			}
			
			
		}
		
		
	}

}
