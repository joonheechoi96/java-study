package sec01.homework02;

public class Practice {
		
		public Practice() {
			
		}
	public String takeState(String input) {
		String[] str = input.split(" ");
		if (str[1].substring(str[1].length() - 1).equals("구")) {
			return str[1];
		} else {
			return null;
		}
	}
}
