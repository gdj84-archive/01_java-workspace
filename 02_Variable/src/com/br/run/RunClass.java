package com.br.run;

/*
import com.br.variable.Variable;
import com.br.variable.KeyboardInput;
import com.br.variable.Printf;
*/
import com.br.variable.*;

public class RunClass {
	
	public static void main(String[] args) {
		// Variable 클래스 내의 whyUseVariable 메소드 호출
		Variable variable = new Variable();
		//variable.whyUseVariable();
		//variable.declareVariable();
		//variable.constant();
		
		// KeyboardInput클래스의 inputTest1 메소드 호출
		KeyboardInput key = new KeyboardInput();
		//key.inputTest1();
		//key.practice1();
		//key.inputTest2();
		//key.inputTest3();
		//key.charAtTest();
		//key.practice2();
		
		// Printf 클래스의 printfTest 메소드 호출
		Printf pr = new Printf();
		//pr.printfTest();
		
		// Casting 클래스의 autoCasting 메소드 호출
		Casting cast = new Casting();
		//cast.autoCasting();
		cast.forceCasting();
		
	}

}
