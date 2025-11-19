package homework10;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Library cal = new Library();
		cal.x = sc.nextInt();
		cal.y = sc.nextInt();
		
		cal.plus();
		cal.multiply();
		cal.isSame();
		
	}

}
