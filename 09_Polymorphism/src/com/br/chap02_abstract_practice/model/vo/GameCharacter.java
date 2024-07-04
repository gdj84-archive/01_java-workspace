package com.br.chap02_abstract_practice.model.vo;

public abstract class GameCharacter {

	private String name;
	private int hp;
	private int level;
	private int exp;
	
	public GameCharacter() {}

	// alt+shift+s > o > enter
	public GameCharacter(String name, int hp, int level, int exp) {
		super();
		this.name = name;
		this.hp = hp;
		this.level = level;
		this.exp = exp;
	}

	// alt+shift+s > r > alt+a > alt+r
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	// alt+shift+s > s > enter
	@Override
	public String toString() {
		return "name=" + name + ", hp=" + hp + ", level=" + level + ", exp=" + exp;
	}
	
	// 자식클래스들에게 공통적으로 만들어지게할 메소드 => 추상메소드
	public abstract void attack();
	public abstract void defence();
	
}
