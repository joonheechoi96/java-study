package homework.loop;

import java.util.Scanner;

public class Homework03 {

	public static void main(String[] args) {
		
		
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("입력 : ");
			String input = sc.nextLine();
			if (input.equals("탈출")) {
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println(input);
				continue;
			}
		}
		
	}

}
