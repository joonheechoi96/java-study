package homework;

import java.util.Scanner;

public class Homework05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호(-) : ");
		char input = sc.nextLine().charAt(7);
		
		String result = (input == '1' || input == '3') ? "남성" : ((input == '2' || input == '4') ? "여성" : "잘못된 값");
		
		System.out.println("입력하신 주민번호는 " + result + "입니다.");
	}

}
