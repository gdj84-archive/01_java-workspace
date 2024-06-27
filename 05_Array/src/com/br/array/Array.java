package com.br.array;

import java.util.Scanner;

public class Array {
	
	/*
	 * > 변수 : 하나의 공간에 하나의 값을 담을 수 있음
	 * 
	 * < 배열 >
	 * 
	 * 1. 여러개의 값들을 하나로 관리할 수 있는 자료구조 
	 *    (즉, 다수의 값들을 한 공간에 담을 수 있음)
	 * 2. 단, "같은 자료형의 값"들로만 담을 수 있음
	 * 3. 각 값들을 구분하기 위해 인덱스를 활용함
	 * 4. 배열을 이용하면 반복문을 활용할 수 있다는 장점이 있음
	 */
	
	public void method1() {
		
		/*
		// 변수를 활용해서 다수의 데이터 관리
		int num1 = 0;
		int num2 = 1;
		int num3 = 2;
		int num4 = 3;
		int num5 = 4;
		
		// 일괄 출력 => 반복문 활용 불가
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		
		// 총합계 출력 => 반복문 활용 불가
		int sum = num1 + num2 + num3 + num4 + num5;
		*/
		
		/*
		 * < 배열 선언 및 생성(할당) >
		 * 
		 * 여러개의 값들을 보관할 공간을 메모리상에 할당받는 과정
		 * 어떤 "자료형"의 값들을 "몇개" 담을건지 고려해서 만들어야됨
		 * 
		 * 1. 배열 선언 
		 * 
		 * 	  [표현법] 자료형 배열명[];
		 * 			   자료형[] 배열명;  - 추천
		 * 
		 * 2. 배열 생성(할당)
		 *    몇개의 값을 담을건지 그 크기만큼의 배열을 만들어야됨
		 *    
		 *    [표현법] 배열명 = new 자료형[배열크기];
		 *    
		 * 3. 배열 선언과 동시에 생성 (1+2)
		 * 
		 * 	  [표현법] 자료형[] 배열명 = new 자료형[배열크기];
		 * 
		 * 4. 배열 내에 값 대입
		 *    배열이라는 공간 내에 특정위치(인덱스)에 값을 대입
		 * 	
		 *    [표현법] 배열명[인덱스] = 값;
		 */
		
		// 변수 선언
		//int a;
		
		// 배열 선언
		//int arr[];
		//int[] arr;
		
		// 배열 생성
		//arr = new int[5];
		
		// 배열 선언과 동시에 생성
		int[] arr = new int[5]; // 0번인덱스, 1번인덱스, ...., 4번인덱스 방이 만들어짐
		
		// 배열에 값 대입
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		arr[4] = 4;
		
		// 일괄 출력 => 반복문 활용
		/*
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		*/
		for(int i=0; i<5; i++) { // i=0,1,2,3,4
			System.out.println(arr[i]);
		}
		
		// 총합계 출력 => 반복문 활용
		int sum = 0;
		for(int i=0; i<5; i++) {
			sum += arr[i];
		}
		System.out.println("총합계 : " + sum);
		
		System.out.println("전체값 : " + arr); // 배열의자료형@배열의주소값
		
	}
	
	public void method2() {
		
		int i = 10;
		int[] iArr = new int[3];
		
		System.out.println(i);
		System.out.println(iArr);
		
		double[] dArr = new double[3];
		System.out.println(dArr);
		
		/*
		 * 실제 데이터값을 곧바로 담을 수 있는 변수를 일반 변수라고 함
		 * 주소값을 담고 있는 변수는 참조 변수(레퍼런스 변수)라고 함
		 * 
		 * 기본자료형(boolean, char, byte, short, int, long, float, double)으로 선언된 변수
		 * == 일반 변수 == 실제 데이터값을 바로 담기 가능
		 * 
		 * 그 외 자료형(int[], double[], char[], String, Scanner, Variable, ...)으로 선언된 변수
		 * == 참조 변수 == 주소값을 담는 변수 
		 */
		
	}
	
	public void method3() {
		
		int[] iArr = new int[3]; // 0~2번 인덱스
		double[] dArr = new double[2]; // 0~1번 인덱스
		
		// 아직 초기화는 진행하지 않은 상태 (값 대입은 안함)
		
		// iArr배열 출력
		for(int i=0; i<3; i++) {
			System.out.println(iArr[i]);
		}
		
		// dArr배열 출력
		for(int i=0; i<2; i++) {
			System.out.println(dArr[i]);
		}
		
		/*
		 * 내가 각 인덱스 자리에 초기화를 하지 않아도 값들이 담겨있음! 
		 * 
		 * < Heap 메모리 >
		 * 
		 * 1. Heap에 생성된 공간(객체)마다 고유한 주소값을 부여해줌
		 *    ㄴ 중복되지 않음 == 다른 객체들과 구별됨
		 * 2. 절대 빈 공간이 존재할 수 없음
		 *    즉, 초기화를 진행해야됨 
		 *    이때 초기화를 하지 않을 경우 JVM이 알아서 초기화 해줌 (각 자료형에 맞는 기본값으로) ****
		 */
		
	}
	
	public void method4() {
		
		int[] arr = new int[100]; // 0번 ~ 4번(마지막인덱스==배열의크기-1) 
		
		/*
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		*/
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println(arr); // 자료형@주소값의16진수형태
		System.out.println(arr.hashCode()); // 주소값의 10진수 형태
		System.out.println(arr.length); // 배열의 길이(크기)
		
	}
	
	public void method5() {
		
		int result1 = 0;
		
		// 논리형의 기본값 : false
		// 문자형의 기본값 : ' '
		// 정수형의 기본값 : 0
		// 실수형의 기본값 : 0.0
		
		// 참조자료형의 기본값 : null(아무것도 참조하고 있지 않음)
		String result2 = null;
		int[] arr = null;
		
		//int a = null; // 오류
		
		System.out.println(arr);
		
		// NullPointerException : null가지고 특정인덱스에 접근하거나 메소드 호출하거나 할때 발생되는 오류
		//			   해결방법 : 객체생성을 해야됨 
		//System.out.println(arr[0]);
		//System.out.println(arr.hashCode());
		//System.out.println(arr.length);
	}
	
	public void method6() {
		
		int[] arr = new int[5]; // 0번 ~ 4번
		
		/*
		 * arr[0] = 2;		2 * (0+1)
		 * arr[1] = 4;		2 * (1+1)
		 * arr[2] = 6;		2 * (2+1)
		 * arr[3] = 8;		2 * (3+1)
		 * arr[4] = 10;		2 * (4+1)
		 */
		
		// 인덱스를 활용하는 방법
		/*
		for(int i=0; i<arr.length; i++) {
			arr[i] = 2 * (i+1);
		}
		*/
		
		// 임의의 변수를 활용하는 방법
		int value = 2;
		for(int i=0; i<arr.length; i++) {
			arr[i] = value;
			value += 2;
		}
		
		// 출력을 위한 for
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("arr의 해쉬코드 : " + arr.hashCode());
		System.out.println("arr의 길이(크기) : " + arr.length);
		
		// 추가적으로 값을 더 담고싶음
		/*
		 * ArrayIndexOutOfBoundsException : 배열에 부적절한 인덱스 제시시 발생
		arr[5] = 12;
		arr[6] = 14;
		*/
		
		/*
		 * < 배열의 가장 큰 단점 >
		 * 한번 지정된 배열의 크기는 변경이 불가
		 * => 배열의 크기를 변경하고자 할 경우 다시 만들어야됨
		 */
		arr = new int[7]; // 크기 7로 변경
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("변경 후의 arr의 해쉬코드 : " + arr.hashCode()); // 주소값 변경됐음!
		System.out.println("변경 후의 arr의 길이 : " + arr.length);
		
		/*
		 * 연결이 끊겨진 기존 배열은 Heap영역에 둥둥떠다님 == 불필요한 존재가됨 == 지워주는게 좋음
		 * => 일정 시간이 지나면 "가비지컬렉터(GC)"가 알아서 지워줌 (자바의 특징)
		 *    자바에서의 "자동메모리관리" 특징 == 개발자는 그냥 코드작성에만 신경쓰면됨
		 */
		
		// 배열을 강제로 삭제시키고자 할 경우 == 연결고리를 끊으면 됨
		arr = null; 
		
	}
	
	public void method7() {
		// 1. 크기 10짜리 정수 배열 생성 
		int[] arr = new int[10];
		
		// 2. 반복문을 활용해서 0번~마지막인덱스까지 순차적으로 접근하면서 값 대입
		//    매번 1~100사이의 랜덤값을 발생시켜서 대입
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 100 + 1);
		}
		
		// 3. 반복문을 활용해서 해당 배열의 모든인덱스에 담겨있는 값 출력
		//    단, 인덱스에 담겨있는 값이 홀수인 것만 출력
		//    arr[x] : xx   형식대로 출력
		
		int sum = 0; 	// 짝수값들의 총 합계를 담을 변수
		int count = 0;	// 짝수값들의 갯수를 담을 변수
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 2 == 1) { // 홀수일 경우
				System.out.println("arr[" + i + "] : " + arr[i]);
			}else { // 짝수일 경우
				sum += arr[i];
				count++;
			}
		}
		
		// 짝수 값들의 총 합계, 갯수 출력
		System.out.println("짝수의 총합 : " + sum);
		System.out.println("짝수의 갯수 : " + count);
	}
	
	
	public void method8() { // method8 body start
		
		Scanner sc = new Scanner(System.in);
		
		// 1. 사용자에게 배열의 길이(크기) 입력받은 후 
		//    그 크기만큼의 문자열 배열 생성
		System.out.print("배열의 크기 : ");
		int size = sc.nextInt();
		sc.nextLine();
		
		String[] arr = new String[size]; // 0번 ~ size-1번
		
		// 2. 반복문을 활용해서 매번 과일명을 입력받아
		//	  사용자가 입력한 과일명값이 exit일 경우 반복이 종료되도록
		//    각 인덱스 자리에 대입 
		for(int i=0; i<size; i++) {
			System.out.print(i + "번째 과일명 입력 : ");
			//arr[i] = sc.nextLine();
			String fruit = sc.nextLine();
			
			if(fruit.equals("exit")) {
				break;
			}
			
			arr[i] = fruit;
		}
		
		// 3. 반복문을 활용해서 모든 값 출력
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
	}// method8 body end
	
	public void method9() { // method9 start
		/*
		 * 세 학생의 키 정보를 담기위한 double배열 생성
		 * 반복적으로 사용자에게 키 정보를 입력받아 대입
		 * 각 인덱스에 대입된 값 출력
		 * 
		 * x번 학생의 키 : xxx.xcm 형식
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		
		double[] arr = new double[3];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("키 입력 : ");
			arr[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%d번 학생의 키 : %.1fcm\n", i+1, arr[i]);
			sum += arr[i];
		}
		
		System.out.println("학생들의 키 총합 : " + sum);
		System.out.println("학생들의 키 평균 : " + sum / arr.length);
		
		
	}// method9 end
	
	// 과제
	public void method10() {
		
		// 사용자에게 문자열하나 입력받은 후 
		// 각각의 인덱스에 있는 문자들을 char배열에 옮겨담고 출력
		
		// 1. 사용자에게 문자열 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine(); 
		
		// 2. char배열 생성해두기 (이때 배열의 크기 == 문자열의 길이)
		char[] arr = new char[str.length()];
		
		// 3. 반복문을 활용해서 문자열의 각 인덱스자리의 문자를 
		//    배열의 각 인덱스 자리에 대입
		/*
		 * arr[0] = str.charAt(0);
		 * arr[1] = str.charAt(1);
		 * ....
		 * arr[마지막] = str.charAt(마지막);
		 */
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		
		// 4. 배열에 담긴 값 전체 출력
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	public void method11() {
		/*
		 * 사용자에게 문자열을 입력받아
		 * 이때 각 문자마다 +1이 진행된 문자열을 얻고싶다.
		 * 
		 * ex) "AAP" (입력) => "BBQ" (출력)
		 *     "GDKKN" (입력) => "HELLO" (출력)
		 *     
		 *    해당 출력할 결과값을 String result에 기록한 후 출력하시오.
		 */
		
		// 1. 사용자에게 문자열입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		// 2. 문자열의 글자수만큼의 문자를 보관할 char배열 생성
		char[] arr = new char[str.length()];
		
		// 3. char배열의 각인덱스 자리에 문자열로부터 추출된 문자값의 그 다음문자값을 대입
		for(int i=0; i<arr.length; i++) {
			arr[i] = (char)(str.charAt(i) + 1);
		}
		
		// 4. char배열에 대입되어있는 각 문자들을 문자열로 연이어줌 => String result에 기록
		
		//"" + 'a' + 'b' + 'c'
		/*
		String result = ""; // 초기화를 null로 해두면 연이어질때 null부터 연이어짐
		for(int i=0; i<arr.length; i++) {
			result += arr[i];
		}
		*/
		
		// * String.valueOf(문자열화시키고자하는값);  : 전달된 값을 가지고 문자열로 만들어 반환해주는 메소드
		String result = String.valueOf(arr);
		
		
		// 5. result 출력
		System.out.println(result);
		
		
	}
	
	public void method12() {
		/*
		 * < 배열 선언과 동시에 초기화 >
		 * 배열 생성과 동시에 각 인덱스에 초기값 대입하는 과정
		 * 
		 * [표현법]
		 * 자료형[] 배열명 = new 자료형[]{값1, 값2, ...};	- 방법1
		 * 자료형[] 배열명 = {값1, 값2, ...};				- 방법2
		 */
		
		int[] arr1 = new int[] {1, 2, 3, 4};
		int[] arr2 = {1, 2, 3, 4};
		
		// 배열을 먼저 선언 한 후에 초기화를 진행하고자한다면 반드시 방법1을 이용
		int[] arr;
		//arr = {1, 2, 3, 4};
		arr = new int[] {1, 2, 3, 4};
		
		System.out.println(arr1 == arr2); // false
		// 각 변수에 담겨있는 주소값을 가지고 비교하기 때문에 
	}
	
	public void advancedFor() {
		
		int[] arr = {1, 2, 3, 4, 5};
		
		// for loop문 
		for(int i=0; i<arr.length; i++) {
			System.out.println(i + "번째 : " + arr[i]);
		}
		System.out.println("----------");
		
		// advanced for문 (향상된 for문)
		/*
		 * for(변수 : 순회하고자하는배열|컬렉션){
		 * 
		 * }
		 * 반복문이 돌때 마다 매번 앞쪽 변수에는
		 * 각 인덱스에 담겨있는 실제 데이터값이 매번 담김
		 */
		int index = 0;
		for(int value : arr) {// 변수 = arr[0]; => 변수 = arr[1]; .... => 변수 = arr[마지막];
			System.out.println(index++ + "번째 : " + value);
			//index++;
		}
		// 모든 인덱스에 순차적으로 접근하고자할 때 사용
		
		/*
		 * for(int:int[])
		 * for(char:char[])
		 * for(String:String[])
		 */
		
		
	}
	
	
	
	

}
