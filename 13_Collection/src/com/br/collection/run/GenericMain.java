package com.br.collection.run;

import com.br.collection.model.vo.Container;

public class GenericMain {

	public static void main(String[] args) {

		// Container 객체 생성시 Integer 데이터 보관 
		Container<Integer> intContainer = new Container<Integer>();
		intContainer.setItem(10);
		System.out.println(intContainer);
		
		// Container 객체 생성시 String 데이터 보관
		Container<String> strContainer = new Container<String>();
		strContainer.setItem("안녕하세요");
		System.out.println(strContainer);
		
		// Container 객체 생성시 String[] 데이터 보관
		Container<String[]> strsContainer = new Container<String[]>();
		strsContainer.setItem(new String[] {"안녕", "잘가"});
		System.out.println(strsContainer);
		
		// 타입을 지정하지 않는다면? => Object 로 자동 지정
		Container whatContainer = new Container();
		whatContainer.setItem("안녕");
		whatContainer.setItem(10);
		System.out.println(whatContainer);
		
	}

}
