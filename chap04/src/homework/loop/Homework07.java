package homework.loop;

import java.util.Scanner;

public class Homework07 {

	public static void main(String[] args) {
		
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("정수 : ");
			int num = sc.nextInt();
			String result = "";
			if (num <= 0) {
				System.out.println("양수가 아닙니다.");
				continue;
			} else {
				for (int i=1; i <=num ; i++) {
					if (i%2 == 1) {
						result += "박";
					} else {
						result += "수";
					}	
				}	System.out.println(result);	
				break;
			}	
		}
	}

}
