package homework;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("말해보세요 : ");
		String input = sc.nextLine();
//		String output = input.equals("간다") ? "온다" : "간다";
		String output = "간다".equals(input) ? "온다" : "간다"; // input 값이 null 일 때 false 반환 가능 (더 안전함)
		// 리터럴이나 상수가 앞에 오면 예외 (NPE) 발생 방지 가능
		
		System.out.println(output);
		
	}

}
