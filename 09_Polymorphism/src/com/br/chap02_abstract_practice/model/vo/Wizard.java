package com.br.chap02_abstract_practice.model.vo;

public class Wizard extends GameCharacter { // 마법사 캐릭터

	private int mp;
	
	public Wizard() {}
	
	public Wizard(String name, int hp, int level, int exp, int mp) {
		super(name, hp, level, exp);
		this.mp = mp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
		
		if(this.mp <= 0) {
			System.out.println("마력이 다 소진되었습니다. 방어하시면 다시 충전됩니다.");
			this.mp = 0;
		}
	}

	@Override
	public String toString() {
		return super.toString() + ", mp=" + mp;
	}

	@Override
	public void attack() {
		System.out.println("마법을 쓰면서 공격한다.");
		
		setMp(getMp() - 10); // 마력 10감소
		/*super.*/setExp(/*super.*/getExp() + 20); // 경험치 20증가
	}

	@Override
	public void defence() {
		System.out.println("방어막을 쳐서 방어한다.");
		
		setMp(getMp() + 5); // 마력 5증가
		setHp(getHp() - 5); // 체력 5감소
	}
	
	
	
	
}
