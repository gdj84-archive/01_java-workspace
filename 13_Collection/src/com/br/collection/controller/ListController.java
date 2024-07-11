package com.br.collection.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.br.collection.model.vo.Music;

public class ListController {
	
	/*
	 * < java.util.Collection > List > ArrayList >
	 * 
	 * 1. 선형자료구조의 컬렉션으로 배열을 가지고 있어 
	 *    데이터가 순차적으로 보관되어 관리됨 
	 * 2. 특징
	 * 	  ㄴ 순서대로 데이터(value)가 저장
	 * 	  ㄴ 인덱스로 각 데이터가 관리 
	 * 	  ㄴ 중복 데이터 보관 가능 
	 */
	
	public void arrayListTest1() {
		
//		List list = new List(); // List는 인터페이스임 == 객체생성 불가능
		
		// 제네릭 타입을 지정하지 않을 경우 => Object타입으로 E 타입이 지정
		List list = new ArrayList(); // List<Object> 
		
		list.add(10);
		list.add("안녕하세요");
		list.add(5.12);
		System.out.println(list/*.toString()*/); // [요소, 요소, 요소, ..]
		
		list.add(2, "안녕하세요");
		System.out.println(list);
		
		System.out.println(list.get(0)); 
		System.out.println(list.get(1)); 
		System.out.println(list.get(2)); 
		System.out.println(list.get(3)); 
		
		//System.out.println(list.get(4)); // IndexOutOfBoundsException발생
		
	}
	
	public void arrayListTest2() {
		
		// 정수값만 저장 가능한 list 생성 
		List<Integer> numList = new ArrayList<>();
		
		numList.add(1);
		numList.add(2);
		numList.add(3);
//		numList.add("안녕");
		
		System.out.println(numList);
		
		System.out.println("요소 갯수(리스트의 사이즈): " + numList.size());
		System.out.println("리스트의 마지막 인덱스수: " + (numList.size()-1));
		
		for(int i=0; i<numList.size(); i++) {
			System.out.println(numList.get(i));
		}
		
	}
	
	public void arrayListTest3() {
		
		// 문자열만 저장가능한 list 생성
		List<String> strList = new ArrayList<>();
		
		strList.add("안녕");
		strList.add("hello");
		strList.add("bye");
//		strList.add(4);
		
		System.out.println(strList);
		
		/*
		for(int i=0; i<strList.size(); i++) {
			System.out.println(strList.get(i));
		}
		*/
		
		for(String s : strList) { // 변수 = strList.get(0); => 변수 = strList.get(1); => .. 마지막인덱스
			System.out.println(s);
		}
		
	}
	
	public void arrayListTest4() {
		
		String[] seasonArr = {"봄", "여름", "가을", "겨울"};
		
		// 현재 배열을 List로 변경하고자 할 경우 
		
		// * Arrays.asList(배열) : 전달된 배열을 List로 바꿔서 반환 (fixed-size list반환)
		List<String> seasonList = Arrays.asList(seasonArr);
		System.out.println(seasonList);
		
		// * Arrays.asList 메소드 이용해서 리스트 생성시 유의사항
		//   해당 메소드 호출시 fixed-size list 반환함 (길이 변경이 불가한 리스트)
		//   새로운 요소 추가 및 요소 삭제 불가능 / 기존의 요소를 새로운 요소로 변경은 가능
		//seasonList.add("계절");	// 추가 불가능
		//seasonList.remove(1);		// 삭제 불가능
		seasonList.set(0, "spring");// 수정 가능
		System.out.println(seasonList);
		
		
		// * Arrays.asList(요소, 요소, ..) : 전달된 요소들을 List에 담아서 반환 
		List<String> carList = Arrays.asList("제네시스", "벤츠", "BMW");
		System.out.println(carList);
		
		//carList.add("기아"); 
		
	}
	
	public void arrayListTest5() {
		// * List.of(요소, 요소, ..) : 전달된 요소들을 List에 담아 반환 (unmodifiable list)
		List<String> hobbyList = List.of("운동", "게임", "영화", "산책");
		System.out.println(hobbyList);
		
		// * List.of 이용해서 리스트 생성시 유의사항
		//   해당 메소드 호출시 unmodifiable list 반환함 (수정 자체가 불가능한 리스트)
		//   새로운 요소 추가, 삭제, 변경 모두 안됨 (오로지 조회만 가능)
		//hobbyList.add("요리");
		//hobbyList.remove(1);
		//hobbyList.set(1, "요리");
	}
	
	public void arrayListTest6() {
		
		// Music 객체들만 저장되는 list 생성
		
		List<Music> list = new ArrayList<>();
		System.out.println("초기 list: " + list);
		
		// * add(E e) : 리스트 공간 끝에 전달된 요소를 추가시켜줌
		list.add(new Music("Good Bye", "박효신"));
		list.add(new Music("이 밤", "양다일"));
		list.add(new Music("잊혀지다", "정키"));
		
		System.out.println("추가후 list: " + list);
		
		// * add(int index, E e) : 리스트 내에 특정 인덱스 위치에 전달된 요소를 추가시켜줌
		list.add(1, new Music("진심이 담긴 노래", "케이시"));
		
		System.out.println("추가후 list: " + list);
		
		// * remove(int index) : 리스트 내에 특정 인덱스 위치의 요소를 제거시켜줌
		list.remove(1);
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
