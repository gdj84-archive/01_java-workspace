package com.br.chap04_field.model.vo;

public class FieldTest2 {
	
	/*
	 * < 접근제한자 | 접근제어자 >
	 * 
	 * 1. public	: 어디서든(같은패키지, 다른패키지) 다 접근 가능
	 * 2. protected	: 같은 패키지일 경우 접근가능, 다른패키지일 경우 상속구조라면 접근 가능
	 * 3. default	: 같은 패키지일때만 접근가능
	 * 4. private	: only 해당 클래스내에서만 접근가능
	 * 
	 * 필드 및 메소드에서는 4가지 접근제한자 다 작성가능
	 * 단, 클래스 선언에서는 public, default만 가능 
	 * 		=> 클래스 선언을 default로 설정시 다른패키지에서 해당 클래스를 사용할 수 없음
	 */
	
	public String pub = "public";
	protected String pro = "protected";
	/**/String def = "default";
	private String pri = "private";	
	

}
