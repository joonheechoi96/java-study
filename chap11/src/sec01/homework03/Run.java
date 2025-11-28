package sec01.homework03;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String email = sc.nextLine();
		email = email.trim();
		
		if(email.substring(email.length()-13).equals("@goodee.co.kr")) {
			System.out.println("아이디 : " + email.substring(0, email.length()-13).toUpperCase());
		} else {
			System.out.println("유효하지 않은 이메일입니다.");
		}
		
	}

}
