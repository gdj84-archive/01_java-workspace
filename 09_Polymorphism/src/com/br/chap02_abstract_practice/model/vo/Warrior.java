package com.br.chap02_abstract_practice.model.vo;

import java.util.Arrays;

public class Warrior extends GameCharacter { // 전사 캐릭터

	private String weapon;
	private String[] items;
	
	public Warrior() {}
	
	public Warrior(String name, int hp, int level, int exp, String weapon, String[] items) {
		super(name, hp, level, exp);
		this.weapon = weapon;
		this.items = items;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public String[] getItems() {
		return items;
	}

	public void setItems(String[] items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return super.toString() + ", weapon=" + weapon + ", items=" + Arrays.toString(items);
	}

	@Override
	public void attack() {
		System.out.println(weapon + "과 같은 무기를 휘두르면서 공격한다.");
		setExp(getExp() + 10); // 경험치 10증가
	}

	@Override
	public void defence() {
		System.out.println("방패를 이용해서 방어한다.");
		setHp(getHp() - 2); // 체력 2감소
	}
	
	
	
}
