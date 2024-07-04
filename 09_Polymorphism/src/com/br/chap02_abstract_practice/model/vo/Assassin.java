package com.br.chap02_abstract_practice.model.vo;

public class Assassin extends GameCharacter { // 암살자 캐릭터
	
	public Assassin() {}
	
	public Assassin(String name, int hp, int level, int exp) {
		super(name, hp, level, exp);
	}
	
	// toString 생략 => GameCharacter에 있는 toString 실행됨

	@Override
	public void attack() {
		System.out.println("주먹으로 암살공격한다.");
		setExp(getExp() + 5); // 경험치 5증가
	}

	@Override
	public void defence() {
		System.out.println("은둔해서 피한다.");
	}
	
	
	

}
