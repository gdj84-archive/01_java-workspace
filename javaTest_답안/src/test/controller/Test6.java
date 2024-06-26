package test.controller;

public class Test6 {

	public static void main(String[] args) {
		
		int[] array = {1, 4, 71, 23, 6, 8, 19, 201, 12, 11};  
		
		int sum = 0;
		int count = 0;
		for(int i=0; i<array.length; i++){
			if(array[i] % 2 == 0) {
				continue;
			}
			
			System.out.println(array[i]);
			sum += array[i];
			count++;
		}
		
		System.out.println("더해진 갯수 : " + count);
		System.out.println("합계 : " + sum);
		System.out.printf("평균 : %.1f", sum / (double)count);

	}

}
