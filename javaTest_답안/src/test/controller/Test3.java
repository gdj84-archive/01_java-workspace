package test.controller;

public class Test3 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		int n = 1;
		while(n <= 100){
			sum += n++;
		}
		
		System.out.println("합계 : " + sum);
		System.out.printf("평균 : %.1f", (sum / 100.0));		
	}

}
