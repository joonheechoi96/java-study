package homework04;

import java.util.Scanner;

public class NumberMenu {
	NumberController numcont = new NumberController();
	
	public void menu() {
	Scanner sc = new Scanner(System.in);
	System.out.print("정수1 : ");
	int x = sc.nextInt();
	System.out.print("정수2 : ");
	int y = sc.nextInt();
	
	try {
		System.out.println(x + "은(는) " + y + "의 배수인가? " + numcont.checkDouble(x, y));
	} catch (NumberFormatException e) {
		e.printStackTrace();
	}
	
	
	
}

}