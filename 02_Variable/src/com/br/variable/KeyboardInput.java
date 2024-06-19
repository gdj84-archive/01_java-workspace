package com.br.variable;

import java.util.Scanner;

public class KeyboardInput {
	
	public void inputTest1() { // 사용자에게 인적사항을 입력받아 출력해보기
		
		/*
		 * < 사용자로부터 키보드로 값 입력받기 >
		 * 자바에서 제공하는 java.util.Scanner 클래스의 메소드를 이용해서 값을 입력받을 수 있음
		 * 
		 * 1. Scanner 클래스 생성
		 * 2. Scanner 클래스 내의 nextXXX() 메소드 실행
		 * 	  next()		: 사용자가 입력한 값 중에 "공백" 이전까지의 값 문자열로 읽어들이기
		 * 	  nextLine()	: 사용자가 입력한 값 중에 "엔터" 이전까지의 값 전체 문자열로 읽어들이기
		 * 	  nextInt()		: 사용자가 입력한 값 중에 정수값을 읽어들이기
		 * 	  nextDouble() 	: 사용자가 입력한 값 중에 실수값을 읽어들이기
		 * 3. 읽어들인 값을 보관해두고자 한다면 변수에 대입해두기
		 * 
		 */
		
		//java.util.Scanner sc = new java.util.Scanner();
		Scanner sc = new Scanner(System.in); // System.in : 입력받은 값을 바이트단위로 읽어들이겠다 라는걸 의미
		
		System.out.print("당신의 이름은 무엇입니까 : ");
		//String name = sc.next();
		String name = sc.nextLine();
		
		System.out.print("당신의 나이는 몇살입니까(정수값만 입력) : ");
		int age = sc.nextInt();
		
		System.out.print("당신의 키는 몇입니까(소수점 포함해서 입력) : ");
		double height = sc.nextDouble();
		
		// 출력형식 : xxx님은 xx살이며, 키는 xxx.xxcm입니다.
		System.out.println(name + "님은 " + age + "살이며, 키는 " + height + "cm입니다.");
		
	}
	
	
	
	public void practice1() {
		// 사용자에게 이름, 학년, 반 순으로 입력받은 후
		// 결과를 출력해보기 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학년(정수값만 입력) : ");
		int grade = sc.nextInt();
		
		System.out.print("반(정수값만 입력) : ");
		int classNum = sc.nextInt();
		
		// xxx님은 x학년 x반입니다.
		System.out.println(name + "님은 " + grade + "학년 " + classNum + "반입니다.");
		
	}
	
	public void inputTest2() {
		
		// 키보드로 값을 입력(엔터) --> 버퍼에 값+엔터 들어옴 
		//						    --> sc.nextXXX() 메소드 동작
		//								버퍼에 들어온 값을 읽어들이기 --> 변수에 기록
		
		/*
		 * sc.nextLine()  : 버퍼에서 "엔터" 이전까지의 모든 값을 읽어들인 후 "엔터"를 비워주는 역할
		 * 그 외의 메소드 : 버퍼에서 "엔터" 이전까지의 값을 읽어들인 후 "엔터"를 비워주지 않음
		 * 
		 * sc.nextXXX() 후 sc.nextLine()이 오게될 경우
		 * 버퍼에 남아있는 "엔터" 때문에 사용자가 값을 입력했다고 인지해서 
		 * 곧바로 값을 읽어들임 (sc.nextLine() 바로 실행되버림)
		 * 
		 * 해결방법 : sc.nextXXX() 후에 sc.nextLine()이 와야될 경우
		 * 			  sc.nextLine() 수행되기 전에 버퍼에 남아있는 엔터를 비워주는 과정 추가 
		 * 						=> 강제로 sc.nextLine() 한번 더 수행시켜주기
		 * 
		 */
		
		
		// 이름(String), 나이(int), 주소(String), 키(double) 순으로
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("나이 : ");
		int age = sc.nextInt(); // 숫자값만 읽어들여지고 버퍼에는 엔터가 그대로 남아있는 상태
		
		// 해결방법 : 버퍼에 남아있는 엔터를 비워주는 과정
		sc.nextLine();
		
		System.out.print("주소 : ");
		String address = sc.nextLine(); // 버퍼에 남아있는 엔터를 사용자가 입력했다고 인식해서 곧바로 읽어들여짐 => "" 문자열이 읽어들여짐
		
		System.out.print("키 : ");
		double height = sc.nextDouble();
		
		sc.nextLine();
		
		System.out.print("학원 : ");
		String academy = sc.nextLine();
		
		
		// xx님은 xx살이며, 사는곳은 xxxx이고, 키는 xxx.xxcm입니다. 그리고 학원은 xxxx에 다닙니다.
		/*
		System.out.println(name + "님은 "
						 + age + "살이며, 사는 곳은 "
						 + address + "이고, 키는 "
						 + height + "cm입니다. 그리고 학원은 "
						 + academy + "에 다닙니다.");
		*/
		
		// printf로 바꿔보기
		System.out.printf("%s님은 %d살이며, 사는곳은 %s이고, 키는 %.2fcm입니다. 그리고 학원은 %s에 다닙니다.", 
						  name, age, address, height, academy);
		
		
	}
	
	public void inputTest3() {
		
		// 문자열을 입력받을 때 --> sc.nextLine()  --> String
		// 정수값을 입력받을 때 --> sc.nextInt()   --> int
		// 실수값을 입력받을 때 --> sc.nextDouble()--> double
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		//char gender = sc.nextChar(); // Scanner 클래스에 nextChar 메소드 존재하지 않음
		char gender = sc.nextLine().charAt(0);
		//  "M" => 0번인덱스 자리의 문자 하나를 추출 => 'M'
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.println("===" + name + "님의 개인정보===");
		System.out.println("성별 : " + gender);
		System.out.println("나이 : " + age);
		
	}
	
	public void charAtTest() {
		// 문자열.charAt(추출하고자하는인덱스수);  --> 문자열로부터 해당 인덱스의 문자값 뽑아서 돌려줌
		
		System.out.println("apple".charAt(3));
		
		String fruit = "kiwi";
		System.out.println(fruit.charAt(2));
		//System.out.println(fruit.charAt(10)); // 문자열의 부적절한 인덱스 접근시 => StringIndexOutOfBoundsException발생
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("과일(4글자 이상) : ");
		System.out.println(sc.nextLine().charAt(3));
		
	}
	
	public void practice2() {
		/*
		 * 상품을 등록하는 페이지라는 가정하에 
		 * 
		 * 사용자에게 등록하고자 하는 상품의 
		 * 상품명(String), 브랜드명(String), 가격(int), 
		 * 제조국가(String), 할인율(double), 등급(A~D)(char) 
		 * 순으로 입력받은 후 출력해보기 (출력형식은 자유)
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("======== 상품 등록 화면 ========");
		System.out.println("등록하고자 하는 상품의 정보를 입력하시오.");
		
		System.out.print("상품명 : ");
		String productName = sc.nextLine();
		
		System.out.print("브랜드 : ");
		String brand = sc.nextLine();
		
		System.out.print("가격(정수만) : ");
		int price = sc.nextInt();
		
		sc.nextLine(); // 버퍼 깔끔하게 비워주는
		
		System.out.print("제조국 : ");
		String national = sc.nextLine();
		
		System.out.print("할인율(실수만) : ");
		double discountRate = sc.nextDouble();
		
		sc.nextLine(); // 버퍼 깔끔하게 비워주기
		
		System.out.print("등급(A/B/C/D) : ");
		char grade = sc.nextLine().charAt(0);
		
		System.out.println("\n상품명 : " + productName);
		System.out.println("브랜드명 : " + brand);
		System.out.println("가격 : " + price + "원");
		System.out.println("제조국 : made in " + national);
		System.out.println("할인율 : " + (int)(discountRate * /*(double)*/100) + "%");
		System.out.println("등급 : " + grade + "급");
		
	}
	
	/*
	 * ** 정리 **
	 * 
	 * 1. 콘솔창(화면)에 출력하기위해 : System.out.printXX()메소드 이용
	 * 2. 콘솔창(화면)으로 입력받기위해
	 *  : Scanner sc = new Scanner(System.in);
	 *    sc.next(), sc.nextLine(), sc.nextInt(), sc.nextDouble()
	 *    
	 *    sc.nextXXX() 후에 sc.nextLine()이 와야될 경우 
	 *    버퍼에 남은 "엔터" 비워주는 과정 필수!! 
	 *    
	 *    문자 값을 입력받아 char변수에 기록하고자 할 경우 
	 *    sc.nextLine()으로 문자열로 읽어들인 후 charAt메소드 이용해서 
	 *    문자값 추출해서 기록
	 * 
	 */
	
	
	
	

}
