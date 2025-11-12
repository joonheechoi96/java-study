package sec02.homework.copy;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("가로, 세로 입력 : ");
		double width = sc.nextDouble();
		double height = sc.nextDouble();
		double area = width * height;
		double round = 2 * (width + height);
		System.out.printf("가로 : %3.1f\n" , width);
		System.out.printf("세로 : %3.1f\n" , height);
		System.out.printf("면적 : %4.2f\n" , area);
		System.out.printf("둘레 : %3.1f\n" , round);
	}

}
