package com.br.chap01_poly.run;

import com.br.chap01_poly.model.vo.Child1;
import com.br.chap01_poly.model.vo.Parent;

public class PolyMain {

	public static void main(String[] args) {
		
		// = 대입연산자 왼쪽, 오른쪽 자료형이 같아야됨!
		
		System.out.println("1. 부모타입 레퍼런스로 부모객체를 다루는 경우");
		
		Parent p1 = new Parent();
		p1.printParent();
		// p1 레퍼런스로 Parent에만 접근 가능
		
		System.out.println("2. 자식타입 레퍼런스로 자식객체를 다루는 경우");
		
		Child1 c1 = new Child1();
		c1.printChild1();
		c1.printParent();
		// c1 레퍼런스로 Child1, Parent에 둘 다 접근 가능
		
		System.out.println("3. 부모타입 레퍼런스로 자식객체를 다루는 경우 (다형성)");
		
		Parent p2 = /*(Parent)*/new Child1();   // 자동형변환 
		
		
		
		
		/*
		 * * 상속 구조의 클래스들 간 형변환 가능
		 * 
		 * 1. UpCasting
		 *    자식 타입 -> 부모 타입 
		 *    자동형변환 
		 * 
		 * 2. DownCasting
		 *    부모 타입 -> 자식 타입 
		 *    강제형변환
		 * 
		 */
		
		
		
		
		
		
		
		
	}

}
