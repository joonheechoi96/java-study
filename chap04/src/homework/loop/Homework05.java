package homework.loop;

import java.util.Scanner;

public class Homework05 {

	public static void main(String[] args) {
		int sum = 0;
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("숫자(0을 입력하면 종료) : ");
			int num = sc.nextInt();
			if (num < 0) {
				continue;
			} else if (num > 0) {
				sum += num;
			} else {
				break;
			}
		} System.out.println("양수의 합계 : " + sum);
	}

}
