package homework;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("가로 : ");
		double width = sc.nextDouble();
		System.out.print("세로 : ");
		double height = sc.nextDouble();
		double area = width * height;
		double round = 2 * (width + height);
		System.out.printf("면적 : %4.2f\n" , area);
		System.out.printf("둘레 : %3.1f\n" , round);
	}

}
