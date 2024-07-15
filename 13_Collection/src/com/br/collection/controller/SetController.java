package com.br.collection.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.br.collection.model.vo.Student;

public class SetController {
	
	/*
	 * < java.util.Collection > java.util.Set > HashSet >
	 * 
	 * 1. 집합 형태로 데이터를 관리하는 컬렉션 
	 * 2. 특징
	 * 	  ㄴ 순서가 유지되지 않은채로 데이터(value)가 저장됨
	 * 	  ㄴ 인덱스로 데이터를 관리 할 수 없음 (즉, 특정 요소 하나만 추출할 수 없음)
	 * 	  ㄴ 중복 데이터(동일객체) 보관 불가 
	 */
	
	public void hashSetTest1() {
		//Set set = new Set();
		Set set = new HashSet();
		
		set.add("안녕");
		set.add(10);
		set.add(10.2);
		set.add(new String("안녕"));
		
		System.out.println(set);
		// 삽입 순서 유지 안됨, 중복 데이터 보관 안됨
		
	}
	
	public void hashSetTest2() {
		
		Set<Integer> set = new HashSet<>();
		
		set.add(10);
		set.add(5);
//		set.add(10.3);
//		set.add("안녕");
		set.add(1);
		set.add(10);
		
		System.out.println(set);
		System.out.println("컬렉션 내의 요소 갯수: " + set.size());
		
	}
	
	public void hashSetTest3() {
		
		Set<Integer> lotto = new HashSet<>(); // 현재 사이즈 0
		
		int count = 0;
		while(lotto.size() < 6) {
			lotto.add( (int)(Math.random() * 45 + 1) );
			count++;
		}
		
		System.out.println(lotto);
		System.out.println("반복수행횟수: " + count);
		
		// Set 컬렉션을 배열로 변환시킬 수 있음 
		Object[] lottoArr = lotto.toArray(); // 단, Object[]로 반환되도록 정의
		for(Object o : lottoArr) {
			System.out.println(o);
		}
		
	}
	
	public void hashSetTest4() {
		
		Set set = new HashSet();
		
		set.add("안녕");
		set.add(10);
		set.add(new Student("홍길동", 15, 70));
		set.add(5.2);
		
		System.out.println(set);
		
		//System.out.println(set.get(0)); // 특정 요소 하나만 뽑기 불가능 (인덱스 x)
		
		
		// 순회(순차탐색)하는 용도로는 사용 가능 
		System.out.println("==========");
		
		// 순회방법1. for문 이용 (향상된 for문만 가능)
		for(Object o : set) {
			System.out.println(o);
		}
		
		System.out.println("==========");
		
		// 순회방법2. Set을 List로 변환 후 이용
		
		//List list = new ArrayList(); // 생성 후
		//list.addAll(set);			   // set의 데이터 통채로 추가
		
		List list = new ArrayList(set); // 생성과 동시에 추가
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("==========");

		// 순회방법3. Iterator(반복자) 이용
		Iterator iterator = set.iterator(); // set 내의 요소들이 Iterator 공간에 차곡 담김
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		// 일회성
		//iterator.next(); // NoSuchElementException 발생
		
		/*
		 * [참고]
		 * Iterator는 Collection를 상속받고있는 List, Set과 함께 사용됨
		 * 
		 * Set컬렉션객체.iterator()	 => Iterator 객체 반환 
		 * List컬렉션객체.iterator() => Iterator 객체 반환
		 */
	}
	
	public void hashSetTest5() {
		
		// Student 타입의 객체만 저장하도록 타입 지정 (E == Student)
		Set<Student> set = new HashSet<>();
		
		System.out.println("초기 set: " + set);
		
		// * add(E e) : Set 내에 전달된 요소를 추가시켜줌 (단, 내부에 동일객체가 있을 경우 추가x)
		set.add(new Student("공유", 45, 100));
		set.add(new Student("김말똥", 26, 40));
		set.add(new Student("홍길동", 24, 20));
		set.add(new Student("공유", 45, 100));
		
		System.out.println("추가후 set: " + set/*.toString()*/); 
		// 오버라이딩전 : 공유 학생 객체 2개 존재 (동일객체로 판별이 안됨)
		// 오버라이딩후 : 공유 학생 객체 1개 존재 (모든 필드값이 일치하면 동일객체로 판별)
		
		/*
		 * [참고]
		 * add 수행시 매번 동일객체 판별 
		 * ㄴ hashCode() 수행 결과가 일치하는지 
		 * ㄴ equals() 비교 결과가 true인지 
		 * 
		 * Student 클래스에 hashCode, equals 메소드가 없을 경우
		 * Object 클래스의 hashCode, equals 메소드 수행 => 주소값 기반으로 비교
		 * 
		 * Student 객체 간에 모든 필드값이 다 일치할 경우 동일객체로 판별됐으면 좋겠다!
		 * => Student 클래스에 hashCode, equals 메소드 오버라이딩해야됨
		 */
		
		// * size() : Set내에 요소의 갯수 반환 
		System.out.println("요소 갯수: " + set.size());
		
		// * contains(Object o) : Set내에 전달한 요소가 포함되어있을 경우 true 반환
		System.out.println(set.contains(new Student("홍길동", 24, 20))); // true
		System.out.println(set.contains(new Student("홍길동", 24, 100)));// false
		
		System.out.println("==========");
		// 순회방법1. 향상된 for문 
		for(Student s : set) {
			System.out.println(s);
		}
		
		System.out.println("==========");
		// 순회방법2. List 담아서 순회
		List<Student> list = new ArrayList<>(set);
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("==========");
		// 순회방법3. Iterator에 담아서 순회 
		Iterator<Student> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
