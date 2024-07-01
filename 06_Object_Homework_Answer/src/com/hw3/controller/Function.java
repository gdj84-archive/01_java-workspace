package com.hw3.controller;

public class Function {
	
	/**
	 * 1. 반환값 없고 매개변수 없는 메소드
	 * -  실행 요청시 1~45까지의 임의의 정수 6개가 발생되어 출력되는 메소드
	 */
	public void printLottoNumbers() {
		
		/* 
		< 그냥 아무 랜덤값 6개 출력시키는 단순 방법 => 단, 중복값이 출력될 수도 있음! >
		for(int i=0; i<6; i++) {
			System.out.print((int)(Math.random() * 45 + 1) + " ");			
		}
		*/
		
		
		// [난이도상 응용] 만일 중복값 없이 출력시키고자 한다면 배열을 활용할 수 있음! 
		// 크기 6짜리 int배열을 생성하여 순차적으로 인덱스자리에 접근하여 매번 랜덤값을 담는데 
		// 이때 기존에 담겨있었던 값들과 일일히 비교하여 혹시라도 중복된 값이 존재할 경우 
		// 다시 그 자리에 새로운 랜덤값을 발생시켜 담게끔 코드 작성해볼수 있음
		int[] lottoNumbers = new int[6];
		for(int i=0; i<lottoNumbers.length; i++) {
			lottoNumbers[i] = (int)(Math.random() * 45 + 1); // 우선 랜덤값 발생시켜서 담고
			
			for(int j=0; j<i; j++) { // 0번인덱스부터 현재 인덱스 전까지의 모든 값들과 순차적으로 비교할 목적의 for문
				if(lottoNumbers[i] == lottoNumbers[j]) { // 일치하는게 존재하는 순간
					i--; 
					break; // 현재 for문을 빠져나가서 다시 바깥쪽 for문이 실행되는데 i가 현재 인덱스로 유지될 수 있도록 i--처리해야됨
				}
			}
		}

		for(int i=0; i<lottoNumbers.length; i++) {
			System.out.print(lottoNumbers[i] + " ");
		}
		
		System.out.println();
	}
	
	/**
	 * 2. 반환값 없고 매개변수 있는 메소드
	 * -  실행 요청시 정수 하나, 문자 하나를 전달 받아 전달받은 문자를 전달받은 정수 갯수만큼 출력하는 메소드
	 * @param num
	 * @param c
	 */
	public void outputChar(int num, char c) {
		
		for(int i=0; i<num; i++) { // num 횟수 만큼 반복
			System.out.print(c + " ");
		}
		
		System.out.println();
	}
	
	/**
	 * 3. 반환값 있고 매개변수 없는 메소드
	 * -  실행 요청시 알파벳 범위의 임의의 영문자를 하나 발생시켜 리턴하는 메소드
	 * @return 
	 */
	public char alphabette() {
		
		/*
		 * 아스키코드표를 보면
		 * 'A' ~ 'Z'  =>   65 ~ 90
		 * 'a' ~ 'z'  =>   97 ~ 122
		 * 
		 * 즉, 'A'(65) ~ 'Z'(90)  ~~~~~   'a'(97) ~ 'z'(122)
		 * 이때 91 ~ 96 은 영문자가 아닌 다른 문자이다. 
		 * 
		 * 따라서 우선 65 ~ 122 사이의 정수 랜덤값을 발생 시킨 후에 
		 * 이때 발생된 랜덤값이 저 범위에 속해있다면 char로 강제형변환해서 return하고
		 * 그게 아닐 경우 다시 랜덤값을 발생시킬 수 있도록 코드 작성
		 */
		
		/*
		int num = 0;
		while(true) { // 우선 무한반복문 돌리기 
			num = (int)(Math.random() * 58 + 65); // 우선 65부터 58개의 랜덤값 (즉, 65~122 사이의 랜덤값)
			if(num >= 'a' && num <= 'z' || num >= 'A' && num <= 'Z') { // 문자값으로도 비교 가능하다
				break; // 반복문 빠져나가도록
			}
		}
		
		return (char)num; // 랜덤값을 문자로 강제형변환해서 반환해야됨 (왜? char반환형이기 때문에)
		*/
		
		// 아니면 바로 랜덤한 문자값을 발생시킬 수도 있다. 
		char ch = ' ';
		while(true) {
			ch = (char)(Math.random() * ('z' - 'A' + 1) + 'A'); // 이렇게도 가능함
			if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
				break;
			}
		}
		return ch;
	
	}
	
	

	/**
	 * 4. 반환값 있고 매개변수 있는 메소드
	 * -  실행 요청시 문자열과 시작인덱스, 끝인덱스를 전달받아 해당 인덱스 범위의 문자열을 
	 *    추출하여 리턴하는 메소드. 단, 문자열은 반드시 값이 있어야한다. 없으면 null 리턴처리
	 * @param str
	 * @param index1
	 * @param index2
	 * @return 
	 */
	public String mySubstring(String str, int index1, int index2) {
		
		if(str != null && !str.equals("")) { // 전달받은 문자열이 null이 아니고 ""이 아닐 경우 (즉, 빈문자열이 아닌 어떤 문자열값이 잘 담겨있을 경우)
			
			String result = "";
			
			// 방법1. 내가 직접 반복문을 이용해서 index1~index2-1 사이의 문자들을 하나의 문자열로 연이어주는 방법
			/*
			for(int i=index1; i<index2; i++) {
				
				result += str.charAt(i); 
			}
			*/
			
			// 방법2. 사실 위의 과정을 아래의 한 문장으로 처리할 수 있다. (String 클래스에서 제공하는 substring(시작인덱스, 끝인덱스))
			//		단, 시작인덱스 <=  < 끝인덱스   사이 범위의 문자열만을 추출해준다. 
			result = str.substring(index1, index2);

			return result;
			
		}else { // 전달받은 문자열이 null이거나 ""일 경우 (즉, 제대로된 값이 아닐경우)
			return null;
		}
		
		
		
	 }
}
