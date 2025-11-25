package homework01;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		int num = (int) (Math.random() * 50) + 1;
		
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			try {
			System.out.print("1~50 사이의 숫자 : ");
			int x = sc.nextInt();
			if (x > num) {
				System.out.println("Down!");
			} else if (x < num) {
				System.out.println("Up!");
			} else {
				System.out.println("축하합니다 ~ 정답이에요.");
				break;
			}
		
			} catch (NumberFormatException e) {
				System.out.println("잘못된 값입니다. 숫자를 입력해주세요.");
			}
			
			
		}
	}

}
