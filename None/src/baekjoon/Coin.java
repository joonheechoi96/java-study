package baekjoon;

import java.util.Scanner;

public class Coin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int total = sc.nextInt();
		
		int[] coin = new int[x];
		
		for(int i = 0; i < x; i++) {
			coin[i] = sc.nextInt();
		}
		
		int count = 0;
		
		for(int i = x-1; i >= 0; i--) {
			count += total / coin[i];
			total = total % coin[i];
		}
		
		System.out.println(count);
	}

}
