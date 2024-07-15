package com.br.collection.run;

import com.br.collection.controller.ListController;
import com.br.collection.controller.MapController;
import com.br.collection.controller.SetController;

public class CollectionMain {
	
	/*
	 * < 컬렉션 >
	 * "자료구조"를 담당하는 "프레임워크" (자료구조의 개념이 내장되어있는 자바 클래스)
	 * 
	 * - 자료구조 : 방대한 데이터들을 효율적, 구조적으로 관리(추가, 수정, 삭제, 조회, 정렬) 할 수 있는 개념
	 * - 프레임워크 : 데이터나 기능들을 보다 쉽게 사용할 수 있도록 이미 제공됨 
	 * 
	 * 
	 * < 배열과 컬렉션 차이점 >
	 * 
	 * *  배열
	 * ㄴ 크기에 대한 제약이 많음 (크기지정 필수, 한번지정된 크기 변경불가)
	 * ㄴ 중간 위치에 추가하거나 삭제할 경우 => 복잡한 로직 코드를 직접 작성해야됨 
	 * ㄴ 한 타입의 데이터만 저장 가능
	 * 
	 * *  컬렉션
	 * ㄴ 크기에 대한 제약이 없음 (크기지정 필수x, 유동적으로 크기변경됨)
	 * ㄴ 중간 위치에 추가하거나 삭제할 경우 복잡한 로직을 짤 필요 없음 => 이미 구현되어있는 메소드 이용
	 * ㄴ 여러 타입의 데이터를 저장 할 수 있음 
	 * 
	 * 
	 * < 컬렉션의 종류 >
	 * 
	 * 1. List : 배열 같이 사용되는 컬렉션
	 *    ㄴ 데이터(value)만 저장 가능
	 *    ㄴ 순서 유지됨 (index로써 관리됨)
	 *    ㄴ 중복 데이터 허용됨 
	 *    ㄴ 하위 클래스 : Vector, "ArrayList", LinkedList, ..
	 *    
	 * 2. Set : 집합 형태의 컬렉션
	 * 	  ㄴ 데이터(value)만 저장 가능 
	 * 	  ㄴ 순서 유지되지 않음 (index 개념 없음)
	 * 	  ㄴ 중복 데이터 허용 안됨 
	 * 	  ㄴ 하위 클래스 : "HashSet", TreeSet, ..
	 * 
	 * 3. Map : 객체(인스턴스)를 대신해서 사용되는 컬렉션
	 * 	  ㄴ 키(key)와 함께 데이터(value)를 저장 
	 * 	  ㄴ 순서 유지되지 않음 
	 * 	  ㄴ 중복된 키(key) 허용 안됨
	 * 	  ㄴ 하위 클래스 : "HashMap", TreeMap, "Properties", ...
	 */
	

	public static void main(String[] args) {

		ListController lc = new ListController();
		//lc.arrayListTest1();
		//lc.arrayListTest2();
		//lc.arrayListTest3();
		//lc.arrayListTest4();
		//lc.arrayListTest5();
		//lc.arrayListTest6();
		//lc.arrayListTest7();
		
		SetController sc = new SetController();
		//sc.hashSetTest1();
		//sc.hashSetTest2();
		//sc.hashSetTest3();
		//sc.hashSetTest4();
		//sc.hashSetTest5();
		
		MapController mc = new MapController();
		//mc.hashMapTest1();
		//mc.hashMapTest2();
		mc.hashMapTest3();
		
	}

}
