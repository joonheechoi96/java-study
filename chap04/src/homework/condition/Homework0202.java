package homework.condition;

import java.util.Scanner;

public class Homework0202 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("월 : ");
		int month = sc.nextInt();
		System.out.print("기온 : ");
		int temp = sc.nextInt();

		String seanson = "";
		
		if (month < 1 || month > 12) {
			System.out.println("해당하는 계절이 없습니다.");
			return;
		}
		
//		밑에는 동일
		
		
		
	}

}
