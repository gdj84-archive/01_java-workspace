package com.br.first;

public class SecondClass {
	
	// 메소드 작성 형식 : 접근제한자 반환형 메소드명() { 소스코드 }
	public void methodA() {
		System.out.println("안녕하세요");
	}
	
	public void methodB() {
		System.out.println("반갑습니다");
	}
	
	public void methodC() {
		System.out.println("다시만나요");
		methodD(); // 같은 클래스내에 존재하는 메소드 호출방법
	}
	
	public void methodD() {
		System.out.println("어서오세요");
	}

}
