package com.br.chap02.practice.example;

import java.util.Scanner;

public class LoopPracticeAnswer {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int user = sc.nextInt();

		if (user >= 1) { // 1_1. 잘 입력했을 경우 	
			
			for (int i = 1; i <= user; i++) {
				System.out.print(i + " ");
			}
			
		} else { // 1_2. 그게 아닐 경우 (잘못 입력햇을 경우)
			System.out.println("1 이상의 숫자를 입력해주세요.");
			
		}
	}

	public void practice2() {
		
		Scanner sc = new Scanner(System.in);

		// 우선 무한 반복 돌려놓고
		while (true) {
			
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int user = sc.nextInt();
			
			if (user >= 1) { // 1_1. 잘 입력했을 경우 		=> 정상적인 결과 출력 후 반복문 종료
				
				for (int i = 1; i <= user; i++) {
					System.out.print(i + " ");
				}
				break;
				
			} else { // 1_2. 그게 아닐 경우 (잘못 입력햇을 경우) => 다시 반복문 실행
				System.out.println("1 이상의 숫자를 입력해주세요.");
				
			}
		}
	}

	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int user = sc.nextInt();

		if (user >= 1) { // 1_1. 잘 입력했을 경우
			
			for (int i = user; i >= 1; i--) {
				System.out.print(i + " ");
			}
			
		} else {// 1_2. 그게 아닐 경우 (잘못 입력햇을 경우)
			System.out.println("1 이상의 숫자를 입력해주세요.");
			
		}
	}

	public void practice4() {
		Scanner sc = new Scanner(System.in);

		// 우선 무한 반복 돌려놓고
		while (true) {
			
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int user = sc.nextInt();
			
			if (user >= 1) { // 1_1. 잘 입력했을 경우 		=> 정상적인 결과 출력 후 반복문 종료
				
				for (int i = user; i >= 1; i--) {
					System.out.print(i + " ");
				}
				break;
				
			} else { // 1_2. 그게 아닐 경우 (잘못 입력햇을 경우) => 다시 반복문 실행
				System.out.println("1 이상의 숫자를 입력해주세요.");
				
			}
		}
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		for(int i=1; i<=num; i++) { // i값이 1에서부터 사용자가 입력한 수까지 1씩 증가하는 동안 반복
			
			// 매번 sum 변수에 누적해서 더해줌 (총 합계구하는 구문)
			sum += i; 
			
			// 뿐만아니라 매번 출력도 해줄꺼임 .. 근데 문제에서 요구한 대로 출력하고자 한다면
			if(i < num) { // 출력하고자 하는 i 값이 num보다 작을 때 까지는 해당 숫자 뒤에 '+' 붙여가면서 출력
				System.out.print(i + " + ");
			}else { 	  // 그게 아닐 경우(즉, 출력하고자 하는 i값이 num이 될 경우) 그땐 마지막으로 '=' 붙여서 출력
				System.out.print(i + " = ");
			}
		}
		
		System.out.println(sum); // 마지막에 총 합계 출력
		
	}
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1 >= 1 && num2 >= 1) { // 두 수 모두 잘 입력했을 경우 => 작은숫자에부터 큰 숫자까지 매번 1씩 증가하는 값을 출력
			
			// 1) 두 수를 가지고 최소값, 최대값을 알아내야됨!!
			/*
			int min = 0; // 두 수중에 작은 값을 기록하기 위한 변수
			int max = 0; // 두 수중에 큰 값을 기록하기 위한 변수
			if(num1 > num2) {
				max = num1;
				min = num2;
			}else {
				max = num2;
				min = num1;
			}
			*/
			
			int min = Math.min(num1, num2);
			int max = Math.max(num1, num2);
			
			// 2) 최소값에서부터 최대값까지 매번 1씩증가하는 값을 출력
			for(int i=min; i<=max; i++) {
				System.out.print(i + " ");
			}
			
			
		}else { // 잘못 입력했을 경우 => "1이상의 숫자를 입력해주세요." 출력
			System.out.println("1이상의 숫자를 입력해주세요.");
		}
		
	}
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		// 우선 무한 반복 돌려놓고
		while(true) {
			
			System.out.print("첫 번째 숫자 : ");
			int num1 = sc.nextInt();
			
			System.out.print("두 번째 숫자 : ");
			int num2 = sc.nextInt();
			
			if(num1 > 0 && num2 > 0) { // 잘 입력했을 경우
				// 두수를 가지고 최소값과 최대값 판별 후
				int min = Math.min(num1, num2); // Math클래스 min메소드 호출시 비교할 두 값을 전달하면 최소값을 반환
				int max = Math.max(num1, num2); // Math클래스 max메소드 호출시 비교할 두 값을 전달하면 최대값을 반환
				// 최소값에서부터 최대값까지 1씩 증가되는 값 출력
				for(int i=min; i<=max; i++) {
					System.out.print(i + " ");
				}
				
				// 반복문 빠져나가는 구문
				break;
			}else { // 잘못 입력했을 경우 => "안내문구" 출력
				System.out.println("1이상의 숫자를 입력해주세요.");
			}
			
			
		}
	}
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		System.out.println("===== " + num + "단 =====");
		
		for(int i = 1; i < 10; i++) {			
			System.out.printf("%d * %d = %d\n", num, i, num * i);
		}
		
	}
	
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if(num >= 2 && num <= 9) { // 1_1. 잘 입력했을 경우 => 사용자가 입력한 단에서부터 9단까지 출력
			
			
			for(int dan = num; dan <= 9; dan++) {					// 단을 지정하는 for문	(사용자가 입력한 수부터 9까지 매번 1씩 증가)
				System.out.printf("===== %d단 =====\n", dan);
				
				for(int su = 1; su <= 9; su++) {					// 곱해지는 수를 지정하는 for문	
					System.out.printf("%d * %d = %d\n", dan, su, (dan * su));
				}
				
				System.out.println();
			}		
			
			
		} else { // 1_2. 그게 아닐 경우 (즉, 잘못입력했을 경우)
			System.out.println("2~9사이의 숫자만 입력해주세요.");
			
		}
	}
	
	public void practice10() {
		
		Scanner sc = new Scanner(System.in);
		
		// 우선 무한 반복 돌려놓고
		while(true) {			
			
			System.out.print("숫자 : ");
			int num = sc.nextInt();
			
			if(num >= 2 && num <= 9) { // 1_1. 잘 입력했을 경우 => 사용자가 입력한 단에서부터 9단까지 출력 한 후 무한 반복 빠져나가기
				
				for(int dan = num; dan <= 9; dan++) {					// 단을 지정하는 for문
					System.out.printf("===== %d단 =====\n", dan);
					
					for(int su = 1; su <= 9; su++) {				// 곱해지는 수를 지정하는 for문
						System.out.printf("%d * %d = %d%n", dan, su, (dan * su));
					}
					
					System.out.println();
				}	
				break;
				
			} else { // 1_2. 그게 아닐 경우 (즉, 잘못입력했을 경우)
				System.out.println("2~9 사이의 숫자만 입력해주세요.");
			}
		}
	}
	
	public void practice11() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작 숫자 : ");
		int start = sc.nextInt();
		
		System.out.print("공차 : ");
		int num = sc.nextInt();
		
		// start에서부터 num만큼 누적해서 더해지는 값을 총 10개 출력
		for(int i=0; i<10; i++) { // 반복횟수로 10 지정
			System.out.print(start + " ");
			start += num;
		}
		
		
	}
	
	
	public void practice12() {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		 * 무한반복 {
		 * 		1. 연산자 입력받기
		 * 		2. 정수 두개 입력받기
		 * 		3. 연산기호에 따른 결과 출력
		 * }
		 */
		while(true) {
			
			// 1. 연산자 입력받기
			System.out.print("연산자(+, -, *, /, %) : ");
			String op = sc.nextLine(); 
			
			// => 사용자가 입력한 연산자가 exit인지 비교
			//	  => 프로그램 종료 되도록
			if(op.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			// 2. 정수 두개 입력받기
			System.out.print("정수1 : ");
			int num1 = sc.nextInt();
			System.out.print("정수2 : ");
			int num2 = sc.nextInt();
			sc.nextLine(); // 버퍼 비워줌
			
			// => 연산자가 "/"거나 "%"일때 두번째 정수값이 0일 경우 
			//    => "0으로 나눌수 없음. 다시입력" 출력 
			//	  => 입력받는것 부터 다시 진행 
			if( (op.equals("/") || op.equals("%")) && num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다. 다시입력해주세요.\n");
				continue;
			}
			
			// 3. 연산기호에 따른 결과 출력
			int result = 0;
			switch(op) {
			case "+": result = num1 + num2; break;
			case "-": result = num1 - num2; break;
			case "*": result = num1 * num2; break;
			case "/": result = num1 / num2; break;
			case "%": result = num1 % num2; break;
			// => 연산자가 해당 목록의 연산기호들이 아닐 경우 
			//	  => "없는 연산자. 다시입력" 출력 => 다시 입력
			default: System.out.println("없는 연산자입니다. 다시입력해주세요.\n"); continue;
			}
			
			System.out.printf("%d %s %d = %d\n\n", num1, op, num2, result);
			
			
		}
		
		
		
		
		
		
		
	}
	
	// 추가문제 ----------------------------------------------------------------------------
	public void practice13() {
		
		/*
		 * 사용자에게 문자열을 입력 받고 	
		 * 입력받은 문자열에서 검색하고 싶은 문자도 입력받기
		 * 문자열에 그 문자가 몇 개 있는지 개수 출력
		 * 
		 * ex)
		 * 문자열 : banana 		(=> 사용자가 입력한 값)
		 * 찾고자하는 문자 : a 	(=> 사용자가 입력한 값)
		 * 
		 * 포함된 갯수 : 3		(결과출력)
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		System.out.print("찾고자 하는 문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		int count = 0;		// 검색된 문자의 갯수를 담을 변수
		
		for(int i=0; i<str.length(); i++) { // 0부터 문자열의 길이-1 만큼 1씩 증가하는 동안 반복
			
			if(ch == str.charAt(i)) { // 입력받은 문자와 문자열의 각 인덱스 값이 같을 경우
				count++; // 동일한 문자라고 판단하여 count 1 증가
			}
			
		}
		
		System.out.println("포함된 갯수 : " + count);
	}
	
	
	public void practice14() {
		
		/*
		  아래와 같은 형식으로 출력될 수 있도록 중첩 for문을 작성해보시오.
		  (5행 10열짜리 *을 먼저 출력해놓고 거기서 응용한다고 생각해보시오)
		
		
			**********
			*        *
			*        *
			*        *
			**********

		 */
		
		for(int i=1; i<=5; i++) {		
			
			for(int j=1; j<=10; j++) {	
				if(i==1 || i==5) {			
					System.out.print("*");	
				}else {						
					if(j==1 || j==10) {		
						System.out.print("*");
					}else {					
						System.out.print(" ");
					}
				}
			}
			
			System.out.println();
			
		}
		
	}
	
	// 난이도 상
	public void practice15() {
		/*
		  아래와 같은 형식으로 출력될 수 있도록 중첩 for문을 활용하여 작성하시오.
		  
		     1
		    123
		   12345
		  1234567
		 123456789
		  1234567
		   12345
		    123
		     1
		     
	     */
		
		for(int i=-4; i<=4; i++) {	// i는 -4~4까지 1씩 증가 (-4,-3,-2,-1,0,1,2,3,4)
			
			int k = i < 0 ? -i : i;	// i의 절대값을 k변수에 담는 구문 (4,3,2,1,0,1,2,3,4)
			
			// 앞에 공백을 먼저 출력시키는 for문 
			for(int j=0; j<k; j++) { // k횟수만큼 공백이 먼저 출력됨
				System.out.print(" ");
			}
			
			// 그 후에 숫자를 출력시키는 for문 
			for(int j=1; j<=9-2*k; j++) { // 1에서부터 9-2*k까지 1씩 증가되는 구문이 출력
				System.out.print(j);
			}
			
			/*
			 * * 추가설명 
			 * k=4일 경우 j=1까지 출력 (1)
			 * k=3일 경우 j=3까지 출력 (123)
			 * k=2일 경우 j=5까지 출력 (12345)
			 * k=1일 경우 j=7까지 출력 (1234567)
			 * k=0일 경우 j=9까지 출력 (123456789)
			 * 
			 * 따라서 j는 9-2*k 까지로 제시되어야함
			 */
			
			System.out.println(); // 한줄 다 출력되면 그 다음줄로 넘기는 개행출력
			
		}
		
	}
	
	// 난이도 상
	public void practice16() {
		/*
		 아래와 같은 형식으로 출력될 수 있도록 중첩 for문을 활용하여 작성하시오.
		 
		   *
		  * *
		 *   *
		  * *
		   *
		   
		 */
		
		for(int i=-2; i<=2; i++) {		// i는 -2에서부터 2까지 1씩 증가 (-2,-1,0,1,2)
			
			int k = i < 0 ? -i : i;	 	// i의 절댓값을 k변수에 대입해둠 (2,1,0,1,2)
			
			for(int j=0; j<k; j++) {	// k횟수만큼 공백을 먼저 출력
				System.out.print(" ");
			}
			
			for(int j=1; j<=5-2*k; j++) { // 5-2*k만큼 "*" 또는 "공백"이 출력되어야됨
				
				if(j==1 || j==5-2*k) {		// 이때 첫번째열 또는 마지막열에만 * 출력하고
					System.out.print("*");
				}else {						// 그게 아닐경우 공백을 출력하도록
					System.out.print(" ");
				}
				
			}
			
			/*
			 * k=2일때 j=1~1   => *
			 * k=1일때 j=1~3   => * *
			 * k=0일때 j=1~5   => *   * 
			 */
			
			System.out.println();
			
		}
	}
	
	public void practice17() {
		
		/*
		 * 70원씩 모금을 하여 최종 목표 모금액인 10,000원을 달성하려고 한다.
		 * 이때 아래와 같은 출력문이 나올 수 있도록하시오. 
		 * 
		 * 
		 *   1회 모금액 :    70원
		 *   2회 모금액 :   140원
		 *   3회 모금액 :   210원
		 * 			...
		 * 142회 모금액 :  9940원
		 * 143회 모금액 : 10010원 
		 * 
		 * 총 모금횟수 : 143회
		 * 
		 * 
		 * 
		 */
		
		
		// 목표금액 (상수로 선언)
		final int GOAL = 10_000;  // 자바에서 큰 수 제시시 가독성을 위해 _를 사용할 수 있음 (표현만 하는것 뿐 실제로는 숫자만 보관됨)
		
		int money = 70;	// 1회 모금액
		int total = 0;	// 총 모금액
	    int count = 0;  // 모금회차
	    
	    while(total < GOAL) { 
	      total += money;
	      System.out.printf("%3d회 모금액 : %5d원\n", ++count, total);
	    }
	    
	    System.out.println("\n총 모금횟수 : " + count + "회");
		
	}
	
	
	
	
}
