package homework;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 배열의 길이 입력 받기
		System.out.print("정수 : ");
		int leng = sc.nextInt();
		// 배열 생성
		int[] arr = new int[leng];
		
		// 배열 값 입력 받고 그 합계 저장
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
			System.out.println("\n총 합 : " + sum);
			}

}
