package com.br.collection.controller;

import java.util.HashMap;
import java.util.Map;

import com.br.collection.model.vo.Snack;

public class MapController {
	
	/*
	 * < java.util.Map > HashMap >
	 * 
	 * 1. key-value 함께 저장하는 구조로 
	 *    객체를 대신해서 사용하는 개념
	 * 2. 특징
	 * 	  ㄴ 담고자하는 데이터(value)를 키(key)와 함께 저장
	 * 	  ㄴ 순서 유지 되지 않음 (index개념x, key가 각 데이터를 식별함)
	 * 	  ㄴ 키는 중복을 허용하지 않음 
	 * 3. 구성요소
	 * 	  ㄴ Key 	: 각 데이터(Value)들의 식별자같은 존재, Set의 특성(순서 없고, 중복허용x)
	 * 	  ㄴ Value	: 데이터 
	 * 	  ㄴ Entry	: Key와 Value를 함께 칭함
	 */
	
	public void hashMapTest1() {
		
		// 학생 한명의 정보를 담는 map컬렉션 
		// K == String, V == Object
		Map<String, Object> stu = new HashMap<>();
		
		stu.put("name", "홍길동");
		stu.put("age", 10);
		stu.put("height", 180.2);
		stu.put("kor", 100);
		stu.put("eng", 80);
		stu.put("math", 60);
		
		stu.put("kor", 20);
		
		// 일회용 vo 같은 느낌 
		// key == vo의 필드
		// value == vo의 필드에 담긴 값
		
		System.out.println(stu); // 순서유지 안됨, 키가 중복될 경우 value는 덮어씌워짐
		
		// get(Object key) : 전달된 key 정보를 통해서 value를 V 타입으로 반환 
		double height = (double)stu.get("height");
		System.out.println(height);
		
		String name = (String)stu.get("name");
		System.out.println(name);
		
	}
	
	public void hashMapTest2() {
		// 초기에 데이터를 담아둔 채로 바로 생성 
		// * Map.of(key1, value1, key2, value2, ...) : unmodifiable map 반환 
		Map<String, Object> stu = Map.of("name", "홍길동"
									   , "age", 10
									   , "height", 180.2);
		
		System.out.println(stu);
		
		//stu.put("kor", 100);		// 더이상 추가 불가능
		//stu.remove("name");		// 삭제 불가능
		//stu.replace("age", 20);	// 수정 불가능
	}
	
	public void hashMapTest3() {
		
		// K == String, V == Snack
		Map<String, Snack> map = new HashMap<>();
		
		// * put(K key, V value) : 맵 컬렉션에 키-밸류 세트로 추가시켜주는 메소드
		map.put("다이제", new Snack("초코맛", 1500));
		map.put("칸초", new Snack("단맛", 600));
		map.put("새우깡", new Snack("짠맛", 500));
		
		map.put("포테이토칩", new Snack("짠맛", 500));
		
		System.out.println(map); // {키=밸류, 키=밸류, ..}
		
		map.put("새우깡", new Snack("매운맛", 700));
		// 동일한 키값으로 다시 추가할 경우 value값이 덮어씌워짐
		
		System.out.println(map);
		
	}
	
	
	
	

}
