package sec01.exam07;

public class SwitchCharExample {

	public static void main(String[] args) {
		char grade = 'a';
		
		// char 타입 변수도 올 수 있음. (대소문자 구분함)
		switch (grade) {
		case 'A','a' : 
			System.out.println("우수 회원입니다.");
			break;
		case 'B' : 
		case 'b' :
			System.out.println("일반 회원입니다.");
			break;
		default : 
			System.out.println("손님입니다.");
			break;
		}
		
		if (grade == 'A' || grade == 'a') {
			System.out.println("우수 회원입니다.");
		} else if (grade == 'B' || grade == 'b') {
			System.out.println("일반 회원입니다.");
		} else {System.out.println("손님입니다.");
		}

}
}
