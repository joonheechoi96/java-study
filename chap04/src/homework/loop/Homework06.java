package homework.loop;

public class Homework06 {

	public static void main(String[] args) {
		
		String left = "";
		String right = "";
		
		for (int i = 1; i <= 5; i++) {
			left += "*";
			for (int j = 1; j <= 1; j++) {			
				if (i == 1) {
					System.out.printf("%5s\n" , left);
					continue;
				} right += "*";
				
				System.out.printf("%5s%-4s\n" , left , right);
				}
			}
		
		System.out.println();
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

}
	
}
