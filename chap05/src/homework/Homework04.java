package homework;

import java.util.Arrays;

public class Homework04 {

	public static void main(String[] args) {
		
		// 1~45 중 임의의 정수 추출
		 
		 
		 int[] arr = new int[6];
		 
		 
		 for (int i = 0; i < arr.length; i++) {
			 int num ;
			 boolean same ;
			 
			 do {
				 num = (int) (Math.random() * (45)) + 1;
				 same = false;
				 
				 for (int j = 0; j <= i; j++) {
					 if (arr[j] == num) {
						 same = true;
						 break;
					 }
				 }		 
			 } while (same) ;
			 
			 arr[i] = num;
		 }
		 
		 Arrays.sort(arr);
		 
		 for(int i = 0; i < arr.length; i++) {
			 System.out.print(arr[i] + " ");
		 }

		 
}
}
