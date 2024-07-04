package com.br.chap02_abstract.model.vo;

public abstract class Sports {
	
	private int people;
	
	public Sports() {}
	
	public Sports(int people) {
		this.people = people;
	}

	public int getPeople() {
		return people;
	}

	public void setPeople(int people) {
		this.people = people;
	}

	@Override
	public String toString() {
		return "Sports [people=" + people + "]";
	}
	
	public abstract void rule();
	/*
	 * < 추상메소드 >
	 * 
	 * 1. 미완성된 메소드
	 * 2. 몸통부(body)가 구현되어있지 않은 메소드
	 * 3. 추상메소드가 존재하는 클래스는 추상클래스로 선언해야됨
	 */

}
