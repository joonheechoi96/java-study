package sec01.homework04;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		String str = "";
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("문자열 : ");
			String input = sc.nextLine();
			
			str += input;
			
			if (input.equalsIgnoreCase("N")) {
				break;
			}
		}
			for(int i = 0; i < str.length(); i++) {
				System.out.println("문자열 : " + str.charAt(i));
			}
			System.out.println("프로그램을 종료합니다.");
			System.out.println("최종 문자열 : " + str.substring(0, str.length()-1));
	}

}
