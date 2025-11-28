package sec01.quiz;

public class DeleteChar {
	
	public DeleteChar() {
	}
	
	public String deleteChar (String original, String willDelete) {
		StringBuilder sb = new StringBuilder(original);
		for(int i = 0; i < original.length(); i++) {
			for (char ch  : willDelete.toCharArray()) {
				if (original.charAt(i) == ch) {
					sb.replace(i, i+1, "");
					
				}
			}
		}
			
			return sb.toString();
		
	}
}
