package com.br.array;

import java.util.Scanner;

public class DimensionalArray {
	
	/*
     * < 2차원 배열 >
     * 
     * 1. 1차원 배열이 여러 개 모인 자료 구조로
     *    1차원 배열 여러 개를 하나의 이름으로 관리할 수 있다.
     * 3. 행과 열의 집합체인 테이블 구조로 이해를 하면 된다.
     * 4. 사용하는 인덱스가 2개(행, 열)이다.
     * 
     * 
     * < 2차원 배열의 선언과 생성 >
     * 
     * 1. 선언 
     * 		1) 자료형[][] 배열명; - 추천
     * 		2) 자료형 배열명[][];
     * 		3) 자료형[] 배열명[];
     * 
     * 2. 생성(할당)
     * 		1) new 자료형[m][n] - 길이가 n인 1차원 배열이 m개 있는 배열로 만들겠다.
     * 		2) new 자료형[m][ ] - 길이가 ?인 1차원 배열이 m개 있는 배열로 만들겠다. (?는 나중에 결정==가변배열)
     */
    
	
	public void method1() {
		/*
		 * 1. 이차원 배열 선언
		 * 
		 *    자료형 배열명[][];
		 *    자료형[] 배열명[];
		 *    자료형[][] 배열명; - 추천
		 */
		
		int arr1[][];
		int[] arr2[];
		int[][] arr;
		
		/*
		 * 2. 이차원 배열 생성(할당)
		 * 
		 * 배열명 = new 자료형[행크기][열크기];
		 */
		arr = new int[3][5]; // 3행 5열짜리 공간이 만들어짐
		
		/*
		 * 할당을 하게 되면 heap영역에 해당 크기만큼의 공간 할당
		 * 
		 * 	 stack	 	│ 	heap
		 * --------------------------------------------------------------------------
		 * 		┌-------│---┐   0X123		0X234
		 * 	┌---------┐	│	└---┌-------┐	┌---------------------------------------┐
		 * 	│  0X123  │	│ arr[0]│ 0X234	│---│	0	│	0	│	0	│	0	│	0	│
		 * 	└---------┘	│ 		│-------│	└---------------------------------------┘
		 * 	int[][] arr	│ arr[1]│ 0X345	│-┐	0X345
		 * 				│		│-------│ │	┌---------------------------------------┐
		 * 				│ arr[2]│ 0X456	│┐└-│	0	│	0	│	0	│	0	│	0	│
		 * 				│		│-------││	└---------------------------------------┘
		 * 				│ arr[3]│ 0X567	││	0X456
		 * 				│		│-------││	┌---------------------------------------┐
		 * 				│ arr[4]│ 0X678	│└--│	0	│	0	│	0	│	0	│	0	│
		 * 				│		└-------┘	└---------------------------------------┘
		 * 				│				arr	 [2][0]   [2][1]  [2][2]  [2][3]  [2][4]
		 * 				│
		 * 				│		       ....  아래에 두개의 배열이 더있다고 생각... 
		 * 				│					 그리기 넘 힘들어유..ㅎ
		 * ---------------------------------------------------------------------------
		 */
		
		// 행의 길이를 알고자 한다면 : 배열명.length;
		System.out.println("행의 길이 : " + arr.length);   // 3
		
		// 각 행별 열의 길이를 알고자 한다면 : 배열명[행인덱스].length
		System.out.println("열의 길이 : " + arr[0].length); // 5
		System.out.println("열의 길이 : " + arr[1].length); // 5
		System.out.println("열의 길이 : " + arr[2].length); // 5
		
		
		// 할당 직후 출력해보기
		// --> 이차원배열은 중첩for문을 이용해야됨 
		//     바깥쪽 for문은 행을 반복하기 위한 for문으로 두고
		//     안쪽 for문은 각 행별 열을 반복하기 위한 for문으로 둠!
		
		for(int i=0; i<arr.length; i++) { // i는 0행 ~ 2행까지 1씩 증가
			
			for(int j=0; j<arr[i].length; j++) { // i행일때 j는 0열 ~ 4열까지 1씩 증가
				System.out.print(arr[i][j] + " "); // i행j열 자리를 출력
			}
			
			System.out.println(); // 위쪽 for문에 의해 한 행 출력이 되면 줄바꿈
		}
		
	}

	public void method2() {
		
		int[][] arr = new int[3][5];
		
		
		// 아래와 같은 데이터를 담고자 할때
		// 즉, 1부터 1씩 증가되는 데이터값을 순차적으로 담고자 할 경우
		// 1   2  3  4  5
		// 6   7  8  9 10
		// 11 12 13 14 15
		
		
		// 1. 인덱스를 통해 접근하여 값 기록
		/*
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[0][3] = 4;
		arr[0][4] = 5;
		
		arr[1][0] = 6;
		arr[1][1] = 7;
		arr[1][2] = 8;
		arr[1][3] = 9;
		arr[1][4] = 10;
		
		arr[2][0] = 11;
		arr[2][1] = 12;
		arr[2][2] = 13;
		arr[2][3] = 14;
		arr[2][4] = 15;
		*/
		
		// 2. 중첩 for문을 이용하여 값 기록
		int value = 1; // 대입시킬 값 (반복문이 진행될때마다 1씩 증가시킬 예정)
		
		for(int i=0; i<arr.length; i++) { // 행을 지정해주는 for문
			for(int j=0; j<arr[i].length; j++) { // 열을 지정해주는 for문
				//arr[i][j] = value;
				//value++;
				arr[i][j] = value++;
			}
		}
		
		// 3. 결과 출력
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr[i].length; j++) {
				//System.out.print(arr[i][j] + " ");
				System.out.printf("%2d ", arr[i][j]);
			}
			
			System.out.println();
		}
	}
	
	public void method3() {
		
		// 이차원 배열 선언과 동시에 초기화
		int[][] arr = {{1, 2, 3, 4, 5}
					 , {6, 7, 8, 9, 10}
					 , {11, 12, 13, 14, 15}};
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			
			System.out.println();
		}
	}
	
	
	public void method4() {
		
		/*
		 * < 가변 배열 >
		 * 행 수는 정해졌으나 각 행에 대한 열의 수가 정해지지 않은 상태
		 * 
		 * 자료형이 같은 1차원 배열을 여러개 묶어둔 걸 2차원 배열이라함
		 * 따라서 묶여있는 1차원 배열의 길이가 꼭 같을 필요는 없다!!
		 */
		
		int[][] arr = new int[3][];	// 가변 배열 할당 (행의 크기는 3행으로)
		
		arr[0] = new int[2]; // 0행은 2열
		arr[1] = new int[1]; // 1행은 1열
		arr[2] = new int[3]; // 2행은 3열
		
		/*
		 * o o		
		 * o
		 * o o o
		 * 
		 * 위와 같은 형태임
		 */
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			
			System.out.println();
		}
		
		// 값 초기화
		// 1. 인덱스 접근
		/*
		arr[0][0] = 1;
		arr[0][1] = 2;
		
		arr[1][0] = 3;
		
		arr[2][0] = 4;
		arr[2][1] = 5;
		arr[2][2] = 6;
		*/
		
		// 2. 반복문을 통해서
		int value=1;
		for(int i=0; i<arr.length; i++	) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = value++;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	public void method5() {
		// 가변배열의 선언과 동시에 초기화
		int[][] arr = {{1, 2}, {3}, {4, 5, 6}};
		
		for(int i=0; i<arr.length; i++	) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public void method6() {
		
		double[][] arr = new double[2][4]; // 2행 4열짜리 배열 생성 
		
		// 3명 학생의 국어점수, 영어점수를 기록하고 국어점수의 총합, 영어점수의 총합을 기록
		
		// 0행 => 3학생의 국어점수들 대입 하고 / 마지막에는 국어점수의 총합 기록
		// 1행 => 3학생의 영어점수들 대입 하고 / 마지막에는 영어점수의 총합 기록
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<arr.length; i++) {
			
			double sum = 0;
			
			for(int j=0; j<arr[i].length-1; j++) {
				
				if(i == 0) { // 첫 번째 행의 경우
					System.out.print("국어 점수 : ");
				}else {
					System.out.print("영어 점수 : ");
				}
				
				arr[i][j] = sc.nextDouble();
				
				sum += arr[i][j]; // 총합까지 바로 구하기
			}
			
			arr[i][3] = sum;
		}
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			
			System.out.println();
		}
		
		System.out.println("국어점수 평균 : " + arr[0][3] / 3);
		System.out.println("영어점수 평균 : " + arr[1][3] / 3);
	}
	
	
	// 빙고게임 5행 5열짜리 빙고
	public void bingo() {
		Scanner sc = new Scanner(System.in);
		
		
		// 중복값 제거하는 방법_일차원 배열로 중복값 제거후 이차원 배열에 대입 --------------
		
		int[] temArr = new int[25]; // 일차원 배열 생성
		
		// 중복값 제거하면서 랜덤값 집어넣기
		for(int i=0; i<temArr.length; i++) {
			
			temArr[i] = (int)(Math.random()*(25))+1; // temArr[0~tempArr.length-1]에 각각 랜덤값 생성
			
			// 중복제거를 위한 for문
			for(int j=0; j<i; j++) {		 // i인덱스와   0~i-1인덱스끼리 비교
				if(temArr[i] == temArr[j]) { // 비교 대상 인덱스(i)와 비교할 대상 인덱스(j)가 같은 경우 --> 즉, 중복될 경우
					i--;					 // i를 감소시키고
					break;					 // 현재의 for문을 빠져나감 
				}							 // --> 즉, i+1인덱스로 가지 않고 다시 i인덱스에 랜덤값 부여하고 중복비교 .... 
			}					
		}
		// 껄껄..ㅎ
			
		
		// 위에서 만들어진 중복제거한 일차원 배열을 --> 이차원 배열로 넣기
		int[][] arr = new int[5][5]; 
		
		int index = 0; // 일차원 배열 인덱스를 위한 변수
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				arr[i][j] = temArr[index]; // 일차원 배열은 0번부터 25까지 돌것이다.
				index++;
			}
		}
		
		//----------------------------------------------------
		
		// 중복값 신경안쓰고 그냥 랜덤 값 넣기
		/*
		int[][] arr = new int[num][num];
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				arr[i][j] = (int)(Math.random()*(num*num))+1;
			}
		}
		*/
		
		// 내 랜덤 빙고판 출력
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				//System.out.print(arr[i][j] + "\t");
				System.out.printf("%4d ", arr[i][j]);
			}
			System.out.println();
		}
		
		int count=0; // 몇번 입력했는지 갯수 세기 위한 변수
		
		System.out.println("================빙고게임 시작==============");
		
		while(true) {
			System.out.print("정수를 입력하시오 : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			count++; // 한번 입력할 때 마다 갯수 세기
			
			for(int i=0; i<5; i++) {
				for(int j=0; j<5; j++) {
					
					if(arr[i][j] == num) {
						arr[i][j] = 0;	// 일치하는걸 찾은 위치에 0을 대입 (색칠할 순 없으니깐)
					}
					
					System.out.printf("%4d ", arr[i][j]);
				}
				System.out.println();
			}
			
			System.out.print("게임을 끝내겠습니까??(y/n) : ");
			char ch = sc.nextLine().toUpperCase().charAt(0);
			
			if(ch == 'Y') {
				break;
			}
				
		}
		
		System.out.println(count + "번 입력하였습니다.");
		
	}
}
