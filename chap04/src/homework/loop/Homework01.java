package homework.loop;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		
		
		while (true) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수(1~50) : ");
		int num = sc.nextInt();
		int sum = 0;
		if (num < 1 || num > 50) {
			System.out.println("1~50 사이의 정수를 입력하세요.");
			continue;
		} else {
			for(int i=num; i <= 50; i++) {
				if (i%2 == 0) {
					sum += i;
				} else {
					continue;
				}
			} System.out.println("합계 : " + sum);
		}	break;
	}

	}
}
