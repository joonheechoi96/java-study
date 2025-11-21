package homework05;

public class Library {
	
	
	void printMessage(String str) {
		System.out.println(str);
	}
	
	void sumTo100 () {
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			sum += i;
		} System.out.println(sum);
	}
	
	String isEven (int x) {
		if (x%2 == 0) {
			return "Even";
		} else {
			return "Odd";
		} 
	}
	
	boolean hasEnglish (String str) {
		  for (char ch : str.toCharArray()) {
	            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
	                return true;
	            }
	        }
	        return false;
	}
	
	void countLetter (String str, char ch) {
		int count = 0;
		for (char c : str.toCharArray()) {
			if (ch == c) {
				count ++;
			}
		} System.out.println("포함된 문자열의 개수 : " + count);
	}
	
	void gooGoo (int x) {
		for (int i = 1; i <= 9; i++) {
			System.out.println(x + " x " + i + " = " + x*i);
		}
	}
}
