package com.br.chap02_abstract_practice.run;

import com.br.chap02_abstract_practice.model.vo.Archor;
import com.br.chap02_abstract_practice.model.vo.Assassin;
import com.br.chap02_abstract_practice.model.vo.GameCharacter;
import com.br.chap02_abstract_practice.model.vo.Warrior;
import com.br.chap02_abstract_practice.model.vo.Wizard;

public class GameMain {

	public static void main(String[] args) {
		
		GameCharacter[] arr = new GameCharacter[4];
		
		arr[0] = new Wizard("마법사", 100, 1, 90, 10);
		arr[1] = new Archor("궁수", 80, 4, 20, 100, 3);
		arr[2] = new Warrior("전사", 100, 3, 60, "나무칼", new String[]{"빨간약", "부활돌"});
		arr[3] = new Assassin("암살자", 70, 10, 90);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("============================");
		
		for(GameCharacter gc : arr) {
			gc.attack();
			gc.defence();
			System.out.println("----------------");
		}
		
		System.out.println("============================");
		
		for(GameCharacter gc : arr) {
			System.out.println(gc);
		}
		
	}

}
