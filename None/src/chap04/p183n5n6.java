package chap04;

public class p183n5n6 {

	public static void main(String[] args) {
		
		String result = "";
		for (int i=1; i <= 4; i++) {
			result += "*";
			System.out.println(result);
		}
		
		String result2 = "";
		for (int i=1; i <= 4; i++) {
			result2 += "*";
			System.out.printf("%4s\n",result2);
		}
	}

}
