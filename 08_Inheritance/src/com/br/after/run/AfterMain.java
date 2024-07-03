package com.br.after.run;

import com.br.after.model.vo.Desktop;
import com.br.after.model.vo.SmartPhone;
import com.br.after.model.vo.Tv;

public class AfterMain {

	public static void main(String[] args) {
		
		/*
		 * < 상속 >
		 * 
		 * 1. 부모(상위) 자식(하위) 간의 구조로 클래스를 구성하는 개념
		 * 2. 상위 클래스가 가지고 있는 멤버(필드 및 메소드)들을
		 *    하위 클래스에서 새로 작성할 필요없이 마치 내것처럼 사용할 수 있음
		 *    
		 * < 상속의 장점 >
		 * 
		 * 1. 공통적은 코드를 부모 클래스로 한번 정의해두면 
		 *    새로운 클래스 작성시 보다 적은 양의 코드로 작성 가능
		 * 2. 중복되는 코드를 별도로 관리하기 때문에 
		 *    중복되는 코드를 변경하거나 새로이 추가해야될 때 용이함
		 *    => 즉, 프로그램 생산성과 유지보수에 크게 기여됨
		 *    
		 * < 상속의 특징 >
		 * 
		 * 1. 클래스와 클래스간에 있어서 다중상속이 불가 (부모클래스를 여러개 둘 수 없음)
		 * 2. 자식타입으로 객체 생성시 부모생성자 항상 먼저 호출
		 *    => 내부적으로 부모객체가 먼저 생성됨  
		 * 3. 자식타입의 객체를 통해서 부모클래스에 정의되어있는 멤버에 접근 가능 (단, private은 안됨)
		 * 4. 부모클래스에 있는 메소드를 자식클래스에서 재정의 할 수 있음 (== 오버라이딩)
		 *    => 오버라이딩 된 메소드가 우선권을 가짐
		 */
		
		// Desktop객체 생성
		// brand, pCode, pName, price, allInOne
		Desktop d = new Desktop("삼성", "d-01", "짱짱데스크탑", 1500000, true);
		
		// Tv객체 생성
		// brand, pCode, pName, price, inch
		Tv t = new Tv("엘지", "t-1003", "올레드", 3500000, 65);
		
		// SmartPhone객체 생성
		// brand, pCode, pName, price, mobileAgency
		SmartPhone s = new SmartPhone("애플", "s-2001", "아이폰", 1300000, "KT");
		
		d.setAllInOne(false); // Desktop클래스 메소드 호출
		d.setPrice(2000000);  // Product클래스 메소드 호출
		
		System.out.println(d.information());
		System.out.println(t.information());
		System.out.println(s.information());
		
		
		
	}

}
