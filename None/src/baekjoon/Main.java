package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int target = sc.nextInt();
		List<Integer> firstArr = new ArrayList<>();
		firstArr.add(1);
		int size = 2;
		for(int i = 1; i <= 1000000000; i++) {
			if (size > target) break;
			firstArr.add(size);
			size += 6*i;
		} 
		if (target == 1) {
			System.out.println(1);
		} else {
			System.out.println(firstArr.size());
		}
	}
}


// 벌집 테두리 갯수 - 1, 6(2), 12(8), 18(20), 24