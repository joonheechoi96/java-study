package homework;

import java.util.Arrays;

public class Homework08 {

	public static void main(String[] args) {
		
	
		String[] menu = {"Burger" , "Pizza" , "Pasta"};
		String[] add = {"Salad", "Soup"};
		
		String[] menuToday = Arrays.copyOf(menu, menu.length + add.length);
		
		for (int i = 0; i < menuToday.length; i++) {
			if (i < menu.length) {
				menuToday[i] = menu[i];
			} else {
				menuToday[i] = add[i-menu.length];
			}
		}
		
		System.out.println("어제 메뉴판: " + String.join(", ", menu));
		System.out.println("오늘 메뉴판: " + String.join(", ", menuToday));
		
		}
		
}