package com.br.before.run;

import com.br.before.model.vo.Desktop;
import com.br.before.model.vo.SmartPhone;
import com.br.before.model.vo.Tv;

public class BeforeMain {

	public static void main(String[] args) {
		// Desktop객체
		// brand, pCode, pName, price, allInOne
		Desktop d = new Desktop("삼성", "d-02", "짱짱데스크탑", 1500000, true);
		
		// Tv객체
		// brand, pCode, pName, price, inch
		Tv t = new Tv("엘지", "t-1003", "올레드", 3500000, 65);
		
		// SmartPhone객체
		// brand, pCode, pName, price, mobileAgency
		SmartPhone s = new SmartPhone("애플", "s-2001", "아이폰", 1300000, "KT");
		
		System.out.println(d.information());
		System.out.println(t.information());
		System.out.println(s.information());
		
		/*
		 * 세 클래스에 공통적인 필드와 공통적인 메소드가 존재 
		 * 
		 * > 문제점 : 중복된 코드를 수정해야만 할 때 
		 *            일일히 찾아서 다 수정해야됨 (유지보수 불편)
		 *            
		 * > 해결방법 : 중복된 코드를 하나의 클래스로 정의해두고	
		 * 				상속구조를 갖춰서 가져다 쓸 수 있도록 작업
		 * 
		 * 		brand, pCode, pName, price, getter/setter메소드
		 *      		=> Product 클래스로 정의해두기
		 */
		
		
		
		
	}

}
