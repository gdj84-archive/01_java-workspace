package test.controller;

public class Test2 {

	public static void main(String[] args) {
		
		// * 참고 * 
		// 만일 둘 중에 하나라도 짝수라면 결과는 짝수가 나올수 밖에 없다.
		// 즉, 홀수단, 홀수수의 곱셈연산 결과는 무조건 홀수이다. 
		
		for(int dan = 2; dan <= 5; dan++){
			for(int su = 1; su < 10; su++){
				int result = dan * su;
				if(result % 2 == 1) { // 따라서 dan이 홀수인지, su가 홀수인지 따로 비교할 필요없이 곱셈연산결과가 홀수인지만 비교하면됨다.
					System.out.println(dan + "*" + su + "=" + result);
				}
			}
		}

	}

}
