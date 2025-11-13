package sec02.exam10;

import java.util.Scanner;

public class AssignmentOperatorExample {

	public static void main(String[] args) {
		/*int result = 10;
		
		result += 10; // result = result + 10;
		System.out.println("result=" + result);
		
		result -= 5; // result = result - 5;
		System.out.println("result=" + result);
		
		result *= 3; // result = result * 3;
		System.out.println("result=" + result);
		
		result /= 5; // result = result / 5;
		System.out.println("result=" + result);
		
		result %= 3; // result = result % 3;
		System.out.println("result=" + result);*/
		
		// Quiz
//		금액을 입력받아 500원, 100원, 50원, 10원, 1원 동전으로 변경하려고 합니다.
//		최소 필요한 동전의 개수를 출력하는 프로그램을 구현하시오.
//
//		[입력]
//		5640
//
//		[출력]
//		500원: 11개
//		100원: 1개
//		50원: 0개
//		10원: 4개
//		1원: 0개

		Scanner sc = new Scanner(System.in);
		
		System.out.print("금액 입력 : ");
		int money = sc.nextInt();
		int coin500 = 0;
		int coin100 = 0;
		int coin50 = 0;
		int coin10 = 0;
		int coin1 = 0;
		
		coin500 = money/500;
		System.out.println("500원: " + coin500 + "개");
		money %= 500;
		coin100 = money/100;
		System.out.println("100원: " + coin100 + "개");
		money %= 100;
		coin50 = money/50;
		System.out.println("50원: " + coin50 + "개");
		money %= 50;
		coin10 = money/10;
		System.out.println("10원: " + coin10 + "개");
		money %= 10;
		coin1 = money/1;
		System.out.println("1원: " + coin1 + "개");
		
		System.out.print("금액 입력 : ");
		int currentMoney = sc.nextInt();
		int coin = 0;
		
		coin = currentMoney/500;
		System.out.println("500원: " + coin + "개");
		currentMoney %= 500;
		coin = currentMoney/100;
		System.out.println("100원: " + coin + "개");
		currentMoney %= 100;
		coin = currentMoney/50;
		System.out.println("50원: " + coin + "개");
		currentMoney %= 50;
		coin = currentMoney/10;
		System.out.println("10원: " + coin + "개");
		currentMoney %= 10;
		coin = currentMoney/1;
		System.out.println("1원: " + coin + "개");
}
	
}
