package com.hw3.run;

import com.hw3.controller.Function;

public class Run {

	public static void main(String[] args) {
		
		Function f = new Function();
		
		System.out.print("1. 랜덤 값 : ");
		f.printLottoNumbers();
		
		System.out.print("2. a문자 5개 출력 : ");
		f.outputChar(5, 'a');
		
		System.out.println("3. 랜덤 영문자 출력 : " + f.alphabette());
		
		System.out.println("4. apple의 2번 4번 인덱스 사이의 값 출력 : " + f.mySubstring("apple", 2, 4));
		
	}

}
