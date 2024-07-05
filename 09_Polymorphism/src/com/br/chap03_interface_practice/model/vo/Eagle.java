package com.br.chap03_interface_practice.model.vo;

public class Eagle extends Animal implements Flyable, Moveable {

	public Eagle() {}
	
	public Eagle(String name, String kind) {
		super(name, kind);
	}

	@Override
	public void forward() {
		System.out.println(getName() + "이(가) 뾰족한 발톱으로 걸어갑니다.");
	}

	@Override
	public void back() {
		System.out.println(getName() + "이(가) 뾰족한 발톱으로 백스텝 합니다.");
	}

	@Override
	public void jump() {
		System.out.println("점프할 순 없습니다.");
	}

	@Override
	public void fly() {
		System.out.println(getName() + "이(가) 큰 날개를 펼치면서 날아갑니다.");
	}

	@Override
	public String bark() {
		return "꺼룩꺼룩";
	}
	
	
	
}
