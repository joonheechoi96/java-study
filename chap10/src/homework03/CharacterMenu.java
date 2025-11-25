package homework03;

import java.util.Scanner;

public class CharacterMenu {
	
	CharacterController ctc = new CharacterController();

	public void menu() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String s = sc.nextLine();
		
		try {
			ctc.countAlpha(s);
			System.out.println("'" + s + "'" + "에 포함된 영문자 개수 : " + ctc.countAlpha(s));
		} catch (CharCheckException e) {
			e.printStackTrace();
		}

	
}

}