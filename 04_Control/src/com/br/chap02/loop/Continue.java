package com.br.chap02.loop;

public class Continue {
	
	/*
	 * continue; : 반복문 안에 기술되는 구문으로
	 * 			   continue; 실행시 그 뒤의 구문들은 실행되지 않고
	 * 			   그 즉시 현재 속해있는 반복문 위로 올라가서
	 * 			   이어서 진행됨
	 */
	
	public void method1() {
		// 1부터 10까지 홀수 출력
		// 1 3 5 7 9
		
		/*
		for(int i=1; i<=10; i++) { // 1에서부터 10까지 1씩증가되는 동안 반복 (12345678910)
			if(i % 2 == 1) { // 홀수일 경우 해당 출력문이 실행되도록
				System.out.print(i + " ");
			}
		}
		*/
		
		for(int i=1; i<=10; i++) {
			
			// 짝수일 경우 뒤의 내용을 건너뛰게끔
			if(i % 2 == 0) {
				continue; // 반복문이 곧바로 이어서 진행됨 => 증감식으로 곧바로 넘어감
			}
			
			System.out.print(i + " ");
			
		}
		
	}
	
	public void method2() {
		// 1부터 100까지의 총 합계
		// 단, 6의 배수값은 빼고 덧셈연산
		int sum = 0;
		for(int i=1; i<=100; i++) {
			
			if(i % 6 == 0) {
				continue;
			}
			
			sum += i;
		}
		
		System.out.println("결과 : " + sum);
	}
	
	public void method3() {
		/*
		 * 2단 ~ 9단까지 출력
		 * 단, 3의 배수단은 제외하고 출력
		 * 
		 * 2단
		 * 4단
		 * 5단
		 * 7단
		 * 8단
		 */
		
		for(int dan=2; dan<=9; dan++) {
			
			if(dan % 3 == 0) {
				continue;
			}
			
			System.out.println("=== " + dan + "단 ===");
			for(int su=1; su<=9; su++) {
				System.out.printf("%d x %d = %d\n", dan, su, dan*su);
			}
			System.out.println();
			
		}
		
		
	}
	
	
	
	
	
	

}
