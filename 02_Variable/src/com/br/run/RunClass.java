package com.br.run;

import com.br.variable.Variable;
import com.br.variable.KeyboardInput;

public class RunClass {
	
	public static void main(String[] args) {
		// Variable 클래스 내의 whyUseVariable 메소드 호출
		Variable variable = new Variable();
		//variable.whyUseVariable();
		//variable.declareVariable();
		//variable.constant();
		
		// KeyboardInput클래스의 inputTest1 메소드 호출
		KeyboardInput key = new KeyboardInput();
		key.inputTest1();
		
	}

}
