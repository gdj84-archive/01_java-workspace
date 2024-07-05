package com.br.chap03_interface_practice.model.vo;

public class Dog extends Animal implements Moveable, Swimable {
	
	public Dog() {}
	
	public Dog(String name, String kind) {
		super(name, kind);
	}

	@Override
	public void swim() {
		System.out.println(getName() + "이(가) 개헤엄을 첨벙첨벙칩니다.");		
	}

	@Override
	public void dive() {
		System.out.println(getName() + "이(가) 꼬로록 물속으로 다이빙합니다.");
	}

	@Override
	public void forward() {
		System.out.println(getName() + "이(가) 네발로 앞으로 걸어갑니다.");
	}

	@Override
	public void back() {
		System.out.println(getName() + "이(가) 백스텝 합니다.");
	}

	@Override
	public void jump() {
		System.out.println(getName() + "이(가) 두발을 들며 껑충 뜁니다.");
	}

	@Override
	public String bark() {
		return "멍멍";
	}

}
