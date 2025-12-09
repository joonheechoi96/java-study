package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] nums = new int[n];
		
		for(int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		List<Integer> sums = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			int sum = 0;
			sum += nums[i];
			if (sum > m) continue;
			for (int j = i+1; j < n; j++) {
				sum += nums[j];
				if (sum > m) continue;
				for (int k = i+2; k < n; k++) {
					sum += nums[k];
					if (sum <= m) {
						sums.add(sum);
					}
				}
			}
		}	
		int max = sums.get(0);
		
		for (Integer n1 : sums) {
			if (n1 > max) {
				max = n1;
			}
		} System.out.println(max);
		
		
	}
}
