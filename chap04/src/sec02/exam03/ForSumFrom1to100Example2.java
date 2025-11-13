package sec02.exam03;

import java.util.Scanner;

public class ForSumFrom1to100Example2 {

	public static void main(String[] args) {
		// 1부터 100까지 합
		int sum = 0;
		int x = 0;
		for (int i=0; i <= 100; i++) {
			sum += i;
			x = i;
		}
		
		int sum2 = 0;
		int a = 0;
		for (; a <= 100; a++) {
			sum2 += a;
		}
		System.out.println(sum);
		System.out.println("1~ " + x + "합: " + sum);
		System.out.println("1~ " + (a-1) + "합: " + sum2);
//		System.out.println("1~ " + i + "합: " + sum); // i는 for문 내부에서만 사용 가능하 지역 변수
		
		// (참고) 무한 루프
		
	
	
		// Quiz1: 1부터 100까지 짝수의 합
		
		int sum1 = 0;
		
		for (int i=0; i <= 100; i++) {
			if (i%2 ==0) {
				sum1 += i;
			} else {
				continue;
			}
		}
			System.out.println(sum1);
		
		
		
				// Quiz2: 
//				숫자를 입력받아 입력받은 수가 
//				짝수인 경우: 2부터 해당 숫자까지 짝수의 합
//				홀수인 경우: 1부터 해당 숫자까지 홀수의 합
//				을 구하는 프로그램을 구현하시오
			
			int sum3 = 0;

			for (int i =0; i <= 100;  i++) {
			        if (i % 2 == 0) {
			                 sum3 += i;
			             } else {
			                    continue;
			                 }
			        }

		//
//				[입력]  [출력]
//				 10  => 30
//				 11  => 36
			Scanner sc = new Scanner(System.in);
			System.out.print("숫자 입력 : ");
			int input = sc.nextInt();
			sum3 = 0;
			
			if (input % 2 == 0) {
				for (int i = 0; i <= input; i=i+2) {
					sum3 += i;
				} 
			} else { 
				for (int i = 0; i <= input; i=i+2) {
					sum3 += i;
			} 
			}
			System.out.println(sum3);
			

			
	}
}

