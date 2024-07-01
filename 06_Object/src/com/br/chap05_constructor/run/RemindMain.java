package com.br.chap05_constructor.run;

import com.br.chap05_constructor.model.vo.Bakery;
import com.br.chap05_constructor.model.vo.Bread;

public class RemindMain {

	public static void main(String[] args) {
		
		// 기본생성자로 생성 후 
		Bread br = new Bread(); 
		// setter 이용해서 값 대입
		br.setName("소금빵");
		br.setPrice(2000);
		System.out.println(br.information());
		
		System.out.println("===============");
		
		Bakery ba1 = new Bakery();
		ba1.setBakeryName("파리바게뜨");
		ba1.setBakeryAddr("서울시 금천구");
		System.out.println(ba1.information());
		
		System.out.println("===============");
		
		Bakery ba2 = new Bakery();
		ba2.setBakeryName("뚜레쥬르");
		ba2.setBakeryAddr("서울시 강서구");
		//ba2.setBread(br); // 이미 생성해둔 Bread 객체 br 전달가능
		ba2.setBread(new Bread("소금빵", 1000)); // 생성과 동시에 전달가능
		System.out.println(ba2.information());
		
		System.out.println("===============");
		
		// 2500원짜리 튀김소보로를 판매하는 성심당(대전시) 빵집 만들기(ba3) => 빵집정보 출력
		Bakery ba3 = new Bakery("성심당", "대전시", new Bread("튀김소보로", 2500));
		System.out.println(ba3.information());
		
		// 현재 성심당에서 판매하는 빵 정보 출력
		//Bread b = ba3.getBread();
		//System.out.println(b.information());
		System.out.println(ba3.getBread().information());
	}

}
