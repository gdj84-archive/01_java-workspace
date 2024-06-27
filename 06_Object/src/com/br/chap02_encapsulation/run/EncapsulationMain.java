package com.br.chap02_encapsulation.run;

import com.br.chap02_encapsulation.model.vo.Student;

public class EncapsulationMain {
	
	/*
	 * 7. 캡슐화까지 적용시켜서 완벽한 클래스 형태를 갖추도록
	 * 
	 *    * 캡슐화 : 추상화를 통해 정의된 속성들과 기능들을 하나로 묶어 관리하는 기법
	 *               외부로부터 "데이터의 직접 접근을 막고" 
	 *               대신에 "데이터를 간접적으로나마 처리(값을 대입, 값을 조회)"할 메소드들을 
	 *               클래스 내부에 같이 작성해서 관리하는 기법
	 *               
	 *    1) 정보은닉 : private 
	 *       직접 접근을 막기 위해 private라는 접근제한자 사용
	 *       
	 *    2) setter/getter메소드
	 *    		ㄴ setter 메소드 : 특정 필드에 값을 대입해주는 용도의 메소드
	 *    		ㄴ getter 메소드 : 특정 필드에 담긴 값을 반환해주는 용도의 메소드
	 *    
	 * 
	 */

	public static void main(String[] args) {
		
		Student hong = new Student();
		
		/*
		hong.name = "홍길동";
		hong.age = 20;
		hong.height = 172.3;
		hong.korScore = 80;
		hong.mathScore = 100;
		*/
		
		// private 때문에 직접 접근이 안됨
		// => 간접적으로나마 접근해서 대입할 수 잇는 기능을 정의 
		//		Student 클래스내에 setter메소드로 정의 
		
		hong.setName("홍길동");
		hong.setAge(20);
		hong.setHeight(172.3);
		hong.setKorScore(80);
		hong.setMathScore(100);
		
		System.out.println(hong);
		
		//System.out.println(hong.name);
		
		// 간접적으로나마 해당 필드값을 돌려주는 기능의 메소드 정의
		// =>  Student클래스내에 getter메소드
		
		System.out.println(hong.getName());
		System.out.println(hong.getAge());
		System.out.println(hong.getHeight());
		System.out.println(hong.getKorScore());
		System.out.println(hong.getMathScore());
		
	}

}
