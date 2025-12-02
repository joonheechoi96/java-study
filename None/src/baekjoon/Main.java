package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		
		List<Integer> total1 = new ArrayList<Integer>();
		List<Integer> total2 = new ArrayList<Integer>();
		
		total1.add(0, 0);
		total1.add(1, 1);
		
		total2.add(0, 1);
		total2.add(1, 0);
		
		for(int j = 0; j < test; j++) {
			int n = sc.nextInt();
			if (n == 0) {
				System.out.println(1+" "+0);
			}
			else {
			// 1의 개수
			for (int i = 0; i < n; i++) {
				total1.add(i+2, total1.get(i) + total1.get(i+1));
			}
			// 0의 개수
			for (int i = 0; i < n; i++) {
				total2.add(i+2, total2.get(i) + total2.get(i+1));
			}		
			System.out.println(total2.get(n) + " " + total1.get(n));
			}
			
		
		}	
			
			
		}
}

