package exercise;

import java.util.Scanner;

public class M11D12 {

	public static void main(String[] args) {
		// 연습문제 149p
		byte b = 5;
		int c = -b; // b = -b; => 부호 연산이 들어가면 int로 자동 형변이 되므로 type mismatch임
		int result = 10 / c;
		System.out.println(result);
		
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		System.out.println(z);
		
		
		// 연습문제 151p 9번
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 수 : ");
		double num1 = sc.nextDouble();
		System.out.print("두 번째 수 : ");
		double num2 = sc.nextDouble();
		double result2 = num1 / num2;
		
		if (num2 == 0 || num2 == 0.0) {
			System.out.println("결과 : 무한대");
		} else {
			System.out.printf("결과 : %5.2f" , result2);
		}
		
	}

}
