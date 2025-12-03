package baekjoon;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		
		for(int i = 0; i < test; i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n > m/2) {
				n = m-n;
			}
			long result = 1;
			//분자
			for (int j = 0; j < n; j++) {
				result *= (m-j);
				result /= (j+1);
			}
			System.out.println(result);
		}
		
		}
}

