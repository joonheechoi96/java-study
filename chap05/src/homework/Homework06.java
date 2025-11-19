package homework;

import java.util.Arrays;
import java.util.Scanner;

public class Homework06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기를 입력하세요 : ");
		int leng = sc.nextInt();
		sc.nextLine(); // 개행 문자 제거 !
		String[] arr = new String[leng];
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i+1 + "번째 문자열 : ");
			String input = sc.nextLine();	
			arr[i] = input;
		}
			String arr2[] = arr;
		
			
		while(true) {
			System.out.println("더 값을 입력하시겠습니까?(Y/N)");
			String yorn = sc.nextLine();
			
			if ("n".equalsIgnoreCase(yorn)) {
				break;
			}
			
			if (!"n".equalsIgnoreCase(yorn) && !"y".equalsIgnoreCase(yorn)) {
				System.out.println("입력할 수 없는 값입니다.");
				continue;
			}
			
			System.out.print("더 입력하고 싶은 개수 : ");
			int more = sc.nextInt();
			sc.nextLine();
			String[] add = new String[more];
			for (int i = 0; i < add.length; i ++) {
				System.out.println(leng + i + 1 + "번째 문자열 : ");
				String input = sc.nextLine();
				add[i] = input;
			}
			leng += more;
			arr2 = Arrays.copyOf(arr2, leng);
			for (int i = arr2.length; i < leng; i++) {
				arr2[i] = add[i - arr2.length];
			}
	}		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
	}

	}
}
