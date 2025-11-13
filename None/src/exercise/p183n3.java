package exercise;

public class p183n3 {

	public static void main(String[] args) {
//		183p 3번
		
		int x = 0;
		int y = 0;
		
		while (x+y != 5) {
			x = (int) (Math.random() * 6) + 1;
			y = (int) (Math.random() * 6) + 1;
			System.out.println("("+ x + ", " + y + ")");
		}
	}

}
