package chap07.homework02;

import java.util.Scanner;

public class CakeMenu {
	Scanner sc = new Scanner(System.in);
	
	ChocolateController cc = new ChocolateController();
	GreenTeaController gtc = new GreenTeaController();
	
	public void mainMenu() {
		
		while(true) {
		System.out.println("==== 어떤 케이크를 만드시겠습니까? ====");
		System.out.print("1.초콜릿 케이트\n2.녹차 케이크\n9.취소\n메뉴 번호 : ");
		int menuNum = sc.nextInt();
		if (menuNum == 1) {
			chocolateMenu();
		} else if (menuNum == 2) {
			greenTeaMenu();
		} else if (menuNum == 9) {
			System.out.println("종료합니다.");
			break;
		} else {
			System.out.println("잘못된 번호입니다.");
		}
	}
	}
		public void chocolateMenu() {
			System.out.print("밀가루(g) : ");
			double flour = sc.nextDouble();
			System.out.print("\n크림(g) : ");
			double cream = sc.nextDouble();
			System.out.print("\n체리(개) : ");
			int cherry = sc.nextInt();
			System.out.print("\n초콜릿 칩(개) : ");
			int chip = sc.nextInt();
			String result = cc.bakeChocolateCake(flour, cream, cherry, chip);
			System.out.println(result);
	}
		
		public void greenTeaMenu() {
			System.out.print("밀가루(g) : ");
			double flour = sc.nextDouble();
			System.out.print("\n크림(g) : ");
			double cream = sc.nextDouble();
			System.out.print("\n녹차 파우더(g) : ");
			double powder = sc.nextDouble();
			System.out.print("\n치즈 큐브(개) : ");
			int cheese = sc.nextInt();
			String result = gtc.bakeGreenTeaCake(flour, cream, powder, cheese);
			System.out.println(result);
	}
}
