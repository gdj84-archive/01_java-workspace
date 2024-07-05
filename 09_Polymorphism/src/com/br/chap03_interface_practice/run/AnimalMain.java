package com.br.chap03_interface_practice.run;

import com.br.chap03_interface_practice.model.vo.Animal;
import com.br.chap03_interface_practice.model.vo.Dog;
import com.br.chap03_interface_practice.model.vo.Dolphin;
import com.br.chap03_interface_practice.model.vo.Eagle;
import com.br.chap03_interface_practice.model.vo.Flyable;
import com.br.chap03_interface_practice.model.vo.Moveable;
import com.br.chap03_interface_practice.model.vo.Swimable;

public class AnimalMain {

	public static void main(String[] args) {
		
		Animal[] arr = new Animal[3]; // {Animal타입, Animal타입, Animal타입}
		
		arr[0] = new Dolphin("돌순이", "남방큰돌고래");
		arr[1] = new Dog("뽀삐", "말티즈");
		arr[2] = new Eagle("독돌이", "대머리독수리");
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i].bark());
			
			if(arr[i] instanceof Swimable) {
				((Swimable)arr[i]).swim();
				((Swimable)arr[i]).dive();
			}
			
			if(arr[i] instanceof Moveable) {
				((Moveable)arr[i]).forward();
				((Moveable)arr[i]).back();
				((Moveable)arr[i]).jump();
			}
			
			if(arr[i] instanceof Flyable) {
				((Flyable)arr[i]).fly();
			}
			
		}
		
		/*
		 * 클래스에서 클래스를 상속받을 때 		  : 클래스 extends 클래스 (단일상속)  : 화살표 "실선"
		 * 클래스에서 인터페이스를 구현(상속)할때 : 클래스 implements 인터페이스, 인터페이스 (다중상속) : 화살표 "점선"
		 * 인터페이스에서 인터페이스를 상속받을때 : 인터페이스 extends 인터페이스, 인터페이스 (다중상속) : 화살표 "실선"
		 * 
		 * 				|		추상클래스		 | 		 인터페이스 
		 * ===================================================================
		 *  상속 갯수	|       단일상속		 |  		다중상속
		 * -------------------------------------------------------------------
		 *    키워드	| 		extends			 |		  implements
		 * -------------------------------------------------------------------
		 *  추상메소드	|  추상메소드 0개 이상	 |	모든메소드가 추상메소드
		 *  표현법/갯수	| 명시적으로 abstract기술| 묵시적으로 abstract (생략가능)
		 * -------------------------------------------------------------------
		 *  일반메소드	|			o			 |			x
		 * -------------------------------------------------------------------
		 *    필드		|  일반필드 + 상수필드	 |	상수필드 (묵시적으로 public static final=>생략가능)
		 * 
		 * 
		 * extends 일반클래스   ---->  extends 추상클래스  ----->  implements 인터페이스
		 * ---------------------------------------------------------------------------->
		 * 					강제성이 더 짙어짐 (규약이 더 쎄짐)
		 * 
		 * 
		 */
		
		

	}

}
