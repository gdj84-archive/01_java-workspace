package com.br.chap02_abstract.run;

import com.br.chap02_abstract.model.vo.BasketBall;
import com.br.chap02_abstract.model.vo.FootBall;
import com.br.chap02_abstract.model.vo.Sports;

public class AbstractMain {

	public static void main(String[] args) {
		
		
		//Sports s = new Sports();
		//Sports s; // 객체생성은 안되고 레퍼런스로는 사용가능
		
		// 다형성 적용해서 부모타입으로 자식객체 받아주기 가능
		Sports s1 = new FootBall();
		Sports s2 = new BasketBall();
		
		Sports[] arr = new Sports[2];
		arr[0] = new FootBall();
		arr[1] = new BasketBall();
		
		for(int i=0; i<arr.length; i++) {
			arr[i].rule();  // 동적바인딩
		}
		
		/*
		 * < 추상클래스 >
		 * 
		 * 1. 미완성된 클래스
		 * 2. 객체 생성 불가능 (단, 레퍼런스 변수로 선언은 가능)
		 * 3. 일반필드 + 일반메소드 [+ 추상메소드]
		 *    ㄴ 추상메소드가 없어도 추상클래스로 선언 가능함! 
		 *    		언제? => 해당 클래스를 통해 객체 생성 불가능하게끔 하고자 할 때
		 *    
		 * * 주로 추상메소드를 포함한 추상클래스를 선언하는 케이스
		 *   자식클래스들에 실행시킬 내용은 다르지만
		 *   동일한 형태의 메소드로 구현됐으면 할 때 
		 *   	=> 강제로 해당 메소드가 오버라이딩 됨 
		 *   		ㄴ 메소드 통일성 확보 목적
		 *   		ㄴ 표준화된 틀을 제공할 목적
		 * 
		 * >> 강제성을 부여할 목적 
		 */
		
	}

}
