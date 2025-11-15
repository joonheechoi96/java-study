package homework.loop;

import java.util.Scanner;

public class Homework08 {

	public static void main(String[] args) {
		
		
		First : while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("문자열 : ");
			String word = sc.nextLine();
			System.out.println("문자 : ");
			String letter = sc.nextLine();
			char arr[] = new char[word.length()];
			
			for (int i = 0; i < word.length(); i++) {
				arr[i] = word.charAt(i);
				}
			for (int i = 0; i < arr.length; i++)
			
			
			while (true) {
			System.out.println("다시 입력하시겠습니까? : ");
			String again = sc.nextLine();
			if (again == "y" || again == "Y") {
				continue First;
				} else if (again == "n" || again == "N") {
					break;
				} else {
					System.out.println("잘못된 대답입니다. 다시 입력해주세요.");
					continue;
				}
		}
	}

	}
	
}
