package com.br.chap03_class.run;

import java.util.Scanner;

import com.br.chap03_class.model.vo.Snack;

public class RemindMain {

	public static void main(String[] args) {
		
		//Snack meok;
		//meok = new Snack();
		
		// 객체생성을 해야 해당 객체의 멤버(멤버변수, 멤버메소드)에 접근 가능
		Snack meok = new Snack();
		
		meok.setsName("먹태깡");
		//meok.setBrand("농심");
		meok.setPrice(2000);
		meok.setKcal(1000);
		
		System.out.println(meok.information());
		
		// 사용자에게 과자 정보를 입력받아 대입
		Scanner sc = new Scanner(System.in);
		System.out.print("과자명 : ");
		String name = sc.nextLine();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		System.out.print("칼로리 : ");
		int kcal = sc.nextInt();
		
		Snack s = new Snack();
		s.setsName(name);
		s.setPrice(price);
		s.setKcal(kcal);
		
		System.out.println(s.information());
		
		

	}

}
