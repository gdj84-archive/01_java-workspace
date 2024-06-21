package com.br.practice.example;

import java.util.Scanner;

public class OperatorPracticeAnswer {
	
	// 실습문제 1
	// 키보드로 입력 받은 하나의 정수가 양수이면 "양수다", 양수가 아니면 "양수가 아니다"를 출력하세요.
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : " );
		int num = sc.nextInt();
		
		String result = num > 0 ? "양수다." : "양수가 아니다";
		System.out.println(result);
		
	}
	
	// 실습문제 2
	// 키보드로 입력 받은 하나의 정수가 양수이면 "양수다", 
	// 양수가 아닌 경우 중에서 0이면 "0이다", 0이 아니면 "음수다"를 출력하세요.
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
//		String result =   num > 0 ? "양수다" : (num == 0 ? "0이다" : "음수다");
//		String result =   num > 0 ? "양수다" : (num < 0 ? "음수다" : "0이다");
		String result =   num == 0 ? "0이다" : (num < 0 ? "음수다" : "양수다");
		
		System.out.println(result);
		
		
	}
	
	
	// 실습문제 3
	// 키보드로 입력 받은 하나의 정수가 짝수이면 "짝수다", 
	// 짝수가 아니면 "홀수다"를 출력하세요.
	public void practice3() {
		
		/*
		 * 수정.
		 * 사용자가 입력한 정수값이 0보다 작거나 같을 경우 "잘못입력하였습니다" 출력
		 * 그게 아닐경우 짝수면 "짝수다", 홀수면 "홀수다"
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();

		String result =  num <= 0 ? "잘못입력하였습니다" : (num % 2 == 1 ? "홀수다" : "짝수다");
		System.out.println(result);
	}
	
	// 실습문제 4
	// 모든 사람이 사탕을 골고루 나눠가지려고 한다. 인원 수와 사탕 개수를 키보드로 입력 받고 
	// 1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int people = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int candy = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 : " + candy / people);
		System.out.println("남는 사탕 개수 : " + candy % people);
		
	}
	
	// 실습문제 5
	// 키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요.
	// 이 때 성별이 'M'이면 남학생, 'M'이 아니면 여학생으로 출력 처리 하세요.	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		
		System.out.print("반(숫자만) : ");
		int classNum = sc.nextInt();
		
		System.out.print("번호(숫자만) : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double score = sc.nextDouble();
		
		String student = (gender == 'M' || gender == 'm') ? "남학생" : "여학생";
		
		// x학년 xx반 x번 xxx xxx의 성적은 xx.xx이다
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다", grade, classNum, num, name, student, score);
		
	}
	
	// 실습문제 6
	// 나이를 키보드로 입력 받아 어린이(13세 이하)인지, 청소년(13세 초과 ~ 19세 이하)인지, 
	// 성인(19세 초과)인지 출력하세요.	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		String result = age <= 13 ? "어린이" : age <= 19 ? "청소년" : "성인";
		System.out.println(result);
		
	}
	
	// 실습문제 7
	/*
	국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고, 
	세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.
	세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데 
	세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력하세요
	*/	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int sum = kor + eng + math; // 합계
		double avg = sum / 3.0; // 평균
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		
		System.out.println( (kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) ? "합격" : "불합격" );
		
	}

	// 실습문제 8
	// 주민번호를 이용하여 남자인지 여자인지 구분하여 출력하세요.	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.print("주민번호를 입력하세요(-포함) : ");
		String str = sc.nextLine(); // "950918-1234567"
									//  0123456789...
		
		char gender = str.charAt(7); // '1' '2' '3' '4'
		
		System.out.println( gender == '1' || gender == '3' ? "남자" : "여자" );
		*/
		
		
		System.out.print("주민번호를 입력하세요(-포함) : ");
		char gender = sc.nextLine().charAt(7); // '1' '2' '3' '4'
		System.out.println( gender == '1' || gender == '3' ? "남자" : "여자" );
		
	}
	
	public void practice() {
		/*
		 * 사용자에게 두개의 정수값 입력받고
		 * + 또는 -를 입력받아 그에 맞는 연산결과를 출력해주기 
		 * 단, + 또는 - 외의 다른 문자를 입력했을 경우 "잘못입력했습니다" 출력
		 * 
		 * ex)
		 * 첫번째 정수 : 5 		(=> 사용자 입력값)
		 * 두번째 정수 : 3 		(=> 사용자 입력값)
		 * 연산자(+또는-) : - 	(=> 사용자 입력값)
		 * 
		 * 결과 : 2 	(결과출력)
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.print("연산자(+또는-) : ");
		char op = sc.nextLine().charAt(0);
		
		String result =  op == '+' ? (num1 + num2 + "") : op == '-' ? (num1 - num2 + "") : "잘못입력했습니다.";
		System.out.println("결과 : " + result);
		
	}
	
	
	// 추가문제  -------------------------------------------------------------
	public void practice9() {
		/*
		 * 키보드로 두개의 정수를 입력 받아 각각 num1, num2 변수에 기록한 후
		 * 다시 또 다른 정수를 입력받아 
		 * 해당 그 수가 num1 이하이거나 num2 초과일 경우 true, 그게 아닐경우 false가 출력될수 있도록 
		 * 
		 * 
		 * ex)
		 * 정수1 : 4	(=> 사용자가 입력한값)
		 * 정수2 : 11 	(=> 사용자가 입력한값)
		 * 입력 : 13	(=> 사용자가 입력한값)
		 * 
		 * true		(결과출력)
		 */
		
		Scanner sc = new Scanner(System.in);

		System.out.print("정수1 : ");
		int num1 = sc.nextInt();

		System.out.print("정수2 : ");
		int num2 = sc.nextInt();

		System.out.print("입력 : ");
		int input = sc.nextInt();
		
		System.out.println(input <= num1 || input > num2);
		
	}
	
	public void practice10() {
		/*
		 * 3개의 정수를 입력받은 후 입력받은 수가 모두 같으면 true, 그게 아닐경우 false가 출력될 수 있도록
		 * 
		 * 
		 * ex)
		 * 입력1 : 5	(=> 사용자가 입력한값)
		 * 입력2 : -8	(=> 사용자가 입력한값)
		 * 입력3 : 5	(=> 사용자가 입력한값)
		 * 
		 * false	(결과출력)
		 */
		
		Scanner sc = new Scanner(System.in);

		System.out.print("입력1 : ");
		int num1 = sc.nextInt();

		System.out.print("입력2 : ");
		int num2 = sc.nextInt();

		System.out.print("입력3 : ");
		int num3 = sc.nextInt();

		boolean isTrue = (num1 == num2) && (num2 == num3);
		System.out.println(isTrue);
		
	}
	
	public void practice11() {
		
		/*
		 * 사용자에게 점수값을 정수로 입력받아 
		 * 해당 점수가 90점대일 경우 "축하합니다." 
		 * 			  그게 아닐 경우 "분발하세요." 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 : ");
		int score = sc.nextInt();
		
		// 1. 점수가 90점 이상, 100 미만인지 비교
		//String result = score >= 90 && score < 100 ? "축하합니다." : "분발하세요.";
		
		// 2. 점수값을 10으로 나누었을때 몫이 9인지 비교 ==> 이것도 90점대에 해당됨!!
		String result = score / 10 == 9 ? "축하합니다." : "분발하세요.";
		
		System.out.println(result);
	}
	
	
	public void practice12() {
		/*
		 * A,B,C 세명의 사원의 연봉을 정수형으로 입력받고 
		 * 각 사원의 인센티브를 포함한 연봉을 계산하여 출력하고 
		 * 이때 인센티브 포함한 연봉이 3000만원 이상일 경우 "3000만원 이상", 
		 * 										미만일 경우 "3000만원 미만"을 같이출력하시오.
		 * (A 사원의 인센티브는 0.4, B 사원의 인센티브는 없으며, C 사원의 인센티브는 0.15이다.)
		 * 
		 * 
		 * 
		 * ex) 
		 * A 사원의 연봉 : 2500		(=> 사용자가 입력한값)
		 * B 사원의 연봉 : 2900		(=> 사용자가 입력한값)
		 * C 사원의 연봉 : 2600		(=> 사용자가 입력한값)
		 * 
		 * A 사원의 인센티브 포함 연봉이 3500.0만원 이며 3000만원 이상입니다.  (결과출력)
		 * B 사원의 인센티브 포함 연봉이 2900.0만원 이며 3000만원 미만입니다.  (결과출력)
		 * C 사원의 인센티브 포함 연봉이 2990.0만원 이며 3000만원 미만입니다.  (결과출력)
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("A 사원의 연봉 : ");
		int a = sc.nextInt();
		System.out.print("B 사원의 연봉 : ");
		int b = sc.nextInt();
		System.out.print("C 사원의 연봉 : ");
		int c = sc.nextInt();

		// 인센티브 포함 연봉 구하기
		double aIncen = a * 1.4; // a + a * 0.4 --> a * (1 + 0.4) --> a * 1.4
		double bIncen = b;
		double cIncen = c * 1.15; 
		
		// 출력결과값을 String형 변수에 담아두기
		String result1 = "3000만원 이상";
		String result2 = "3000만원 미만";
		
		System.out.printf("A 사원의 인센티브 포함 연봉이 %.1f만원 이며 %s입니다.\n", aIncen, aIncen >= 3000 ? result1 : result2);
		System.out.printf("B 사원의 인센티브 포함 연봉이 %.1f만원 이며 %s입니다.\n", bIncen, bIncen >= 3000 ? result1 : result2);
		System.out.printf("C 사원의 인센티브 포함 연봉이 %.1f만원 이며 %s입니다.\n", cIncen, cIncen >= 3000 ? result1 : result2);
		
		
	}
	
	

}
