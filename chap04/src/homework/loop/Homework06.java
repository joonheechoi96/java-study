package homework.loop;

public class Homework06 {

	public static void main(String[] args) {
		
		String tree = "";
		
		for (int i = 1; i <= 9; i++) {
				if (i%2 == 0) {
					tree += "*";
					continue;
				} else {
					tree += "*";
				}
			for (int j = 0; j <= 1; j++) {
				tree = tree + " ";
			}	System.out.printf("%7s\n" ,tree);
		}	

		String a = " ";
		String b = "^";
		
		System.out.println(a + b);
		System.out.println(a + b + b);
		System.out.println(a + b + b + b);
		System.out.println(a + b + b + b + b);
		System.out.printf("%7s\n" ,b + a);
		System.out.printf("%7s\n" ,b + a + a);
		System.out.printf("%7s\n" ,b + b + a + a + a);
		System.out.printf("%7s\n" ,b + b + b + a + a + a + a);
		
}
	
}
