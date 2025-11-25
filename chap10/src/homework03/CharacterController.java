package homework03;

public class CharacterController {
	
	public int countAlpha(String s) throws CharCheckException {
		int count = 0;
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isLetter(ch)) {
				count ++;
			} else if (ch == ' ') {
				throw new CharCheckException("체크할 문자열 안에 공백이 포함되어 있습니다.");
			}				
		}		return count;
		
	}
	
}