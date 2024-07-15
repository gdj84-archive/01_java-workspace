package com.br.collection.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

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
		
		// * get(Object key) : 맵 컬렉션에서 해당 키값을 가지는 Value값을 V타입으로 반환
		Snack s = map.get("다이제");
		System.out.println(s);
		
		// * size() : 컬렉션 내에 담겨있는 요소들의 갯수 반환 
		System.out.println("몇 개: " + map.size());
		
		// * replace(K key, V value) : 컬렉션내에 해당 키 값 찾아서 새로 전달한 Value값으로 수정
		map.replace("포테이토칩", new Snack("겁나짠맛", 1000));
		System.out.println(map);
		
		// * remove(Object key) : 컬렉션으로 부터 전달된 키값에 해당하는 키-밸류 제거
		map.remove("포테이토칩");
		System.out.println(map);
		
		// 순회하는 방법 
		/* 향상된 for문 불가능
		for(String key, Snack value : map) {
			
		}
		*/
		
		// List로 변환 불가능
		//List list = new ArrayList(map);
		
		// * Iterator를 이용하는 방법만 가능
		//   map.iterator() : 불가능 
		
		//  Map => Set => Iterator
		
		// 1. keySet() 이용 방법
		//	  1) map에 있는 키들만 Set에 담기 (키들의 집합 형태)
		Set<String> keySet = map.keySet(); // ["다이제", "새우깡", "칸초"]
		//    2) keySet에 담겨있는 키들을 Iterator에 담기
		Iterator<String> itKey = keySet.iterator();
		//    3) 반복문을 통해 뽑기
		while(itKey.hasNext()) {
			String key = itKey.next();
			Snack value = map.get(key);
			System.out.println(key + ", " + value);
		}
		// map----.keySet()--->Set(key값들만담겨있음)----.iterator()--->Iterator(key값들만담겨있음)
		
		System.out.println("========================");
		
		// 2. entrySet()
		//    1) map에 Entry(키+밸류) 세트로 Set 컬렉션
		Set<Entry<String, Snack>> entrySet = map.entrySet();
		
		//    2) entrySet으로 부터 Iterator에 담기
		Iterator<Entry<String, Snack>> itEntry = entrySet.iterator();
		
		//    3) 반복문
		while(itEntry.hasNext()) {
			Entry<String, Snack> entry = itEntry.next();
			System.out.println(entry.getKey() + ", " + entry.getValue());
		}
		
		
	}
	
	/*
	 * < java.util.Map > Properties >
	 * 
	 * 1. map을 구현하고 있는 클래스이므로 map의 특징을 가지고 있음
	 *    ㄴ key-value 보관
	 *    ㄴ put(), get()등 사용 가능
	 * 2. .properties 또는 .xml 파일과 입출력때 주로 사용됨
	 * 	  ㄴ 키, 밸류를 "문자열"의 형태로 보다 단순하게 써둘 수 있는 파일
	 * 	  ㄴ 주로 프로그램의 환경설정(ip주소, dbms url 등) 관련 내용을 포함하고 있음
	 * 3. 위와 같이 데이터 출력 또는 입력을 할 경우 
	 *    키, 밸류 모두 String으로 작업해야됨 
	 *    ㄴ setProperty(), getProperty() 메소드를 주로 사용
	 * 
	 */
	
	public void propertiesTest1() {
		
		Properties prop = new Properties();
		
		prop.put("다이제", new Snack("초코맛", 1500));
		prop.put("새우깡", new Snack("짠맛", 700));
		
		System.out.println(prop);
		System.out.println(prop.get("다이제"));
		
		try {
			prop.store(new FileOutputStream("test.properties"), "propertiesTest");
			// 내부적으로 저장을 할 때 
			// key, value 모두 String 형변환 하면서 저장함 
			// 부적절한 형변환일 경우 ClassCastException 발생
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void propertiesTest2() {
		
		Properties prop = new Properties();
		
		// * setProperty(String key, String value) : 전달된 키-밸류 문자열을 저장
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		prop.setProperty("Map", "HashMap");
		
		prop.setProperty("Map", "Properties");
		
		System.out.println(prop); // 저장순서유지안됨, key값중복시덮어씌워줌
		
		// * getProperty(String key) : 전달된 키에 해당하는 value값을 문자열로 반환
		System.out.println(prop.getProperty("Set"));
		System.out.println(prop.getProperty("set")); // *** 존재하지 않는 키값 제시시 null 반환 ***
		
		
		try {
			// * store(스트림, String comments) : 컬렉션에 담겨있는 key-value 값들을 파일로 출력(내부적으로 String형변환)
			prop.store(new FileOutputStream("test.properties"), "propertiesTest");
			
			// * storeToXML(스트림, String comments) : .xml 확장자 파일로 저장시킬때 
			prop.storeToXML(new FileOutputStream("test.xml"), "propertiesTest");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	public void propertiesTest3() {
		// 외부 파일에 기록되어있는 키-밸류를 읽어들이기 *** 
		
		Properties prop = new Properties(); // 비어있음
		
		try {
			// * load(입력용스트림)
			//prop.load(new FileInputStream("test.properties"));
			
			// * loadFromXML(입력용스트림)
			prop.loadFromXML(new FileInputStream("test.xml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(prop);
		System.out.println(prop.getProperty("selectMember"));
		System.out.println(prop.getProperty("selectMemeber"));
		
		/*
		 * * .properties 파일과 .xml파일을 사용하는 경우 
		 * ㄴ 프로그램상에 필요한 환경설정 내용을 기술해둠
		 *    해당 파일에 기술된 내용을 읽어들여서 자바측에서 사용 
		 *    
		 * ㄴ 해당 파일 안에 내용은 다 텍스트(문자열)이기 때문에 
		 *    개발자가 아닌 일반인 관리자가 해당 문서를 파악해서 수정할 수 있음 
		 *    
		 * ㄴ .xml 파일 같은 경우 타언어에 있어서도 호환이 쉽다
		 * 
		 */
		
	}
	
	
	
	
	
	
	

}
