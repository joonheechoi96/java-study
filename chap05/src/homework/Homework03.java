package homework;

import java.util.Scanner;

public class Homework03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			// 정수 값 입력받기
			System.out.print("정수 : ");
			int leng = sc.nextInt();
			
			// 3미만 or 짝수 돌려보내기
			if (leng < 3 || leng%2 == 0) {
				System.out.println("다시 입력하세요");
				continue;
			}
			
			int[] arr = new int[leng];
			
			for (int i = 0; i < arr.length/2 + 1; i++) {
				arr[i] = arr[leng-i-1] = i+1;				
			}
			for (int j = 0; j < arr.length; j++) {
				if (j == arr.length - 1) {
					System.out.println(arr[j]);
				} else System.out.print(arr[j] + ", ");
			}	break;
			
		}
			sc.close();
	}

}
