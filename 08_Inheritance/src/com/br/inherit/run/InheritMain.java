package com.br.inherit.run;

import com.br.inherit.model.vo.Airplane;
import com.br.inherit.model.vo.Car;
import com.br.inherit.model.vo.Ship;

public class InheritMain {

	public static void main(String[] args) {
		
		Car c = new Car(); // 부모객체생성(name, mileage, kind) 메모리에 할당 => 자식객체생성(tire) 메모리에 할당	
		c.setName("벤틀리");
		c.setMileage(7.3);
		c.setKind("세단");
		c.setTire(4);
		
		Airplane a = new Airplane("보잉778", 3.2, "제트기", 8, 4);
		
		Ship s = new Ship("낚시배", 2, "어선", 2);
		
		System.out.println(c.information());
		System.out.println(a.information());
		System.out.println(s.information());
		
		c.move();
		a.move();
		s.move();
		
		
	}

}
