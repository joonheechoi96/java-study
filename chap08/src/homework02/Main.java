package homework02;

public class Main {

	public static void main(String[] args) {
		Menu[] menu = new Menu[5];
		for(int i = 0; i < 5; i ++) {
			int x = (int)(Math.random()*2 + 1);
			if (x == 1) {
				menu[i] = new Dish("스테이크", 30000, "소고기,소금,후추");
			} else {
				menu[i] = new Drink("아메리카노", 5000, "에스프레소 1샷, 물");
			}
		}
			for (Menu mn : menu) {
				mn.cook();
			}
	}

}
