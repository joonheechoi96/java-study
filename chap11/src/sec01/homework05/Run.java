package sec01.homework05;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("생년월일 : ");
		int birth = sc.nextInt();
		
		String nameFront = name.substring(0, 1);
		String nameBack = name.substring(1, name.length());
		
		String birthToNum = String.valueOf(birth);

		String birthFront = birthToNum.substring(2, 4);

		String birthBack = birthToNum.substring(6, birthToNum.length());
	
		String result = nameFront + birthFront + birthBack + nameBack;
		
		System.out.println(result);
	}

}
