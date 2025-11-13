package homework.condition;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("나이 : ");
		int age = sc.nextInt();
		int cost ;
		
		if (age >= 65) {
			cost = 0;
		} else if (age >= 19) {
			cost = 30000;
		} else if (age >= 13) {
			cost = 20000;
		} else if (age >= 3) {
			cost = 10000;
		} else  {
			cost = 0;
		} 
		
		System.out.println("당신의 놀이동산 요금은 " + cost + "원입니다.");
	}

}
