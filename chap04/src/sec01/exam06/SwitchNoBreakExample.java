package sec01.exam06;

public class SwitchNoBreakExample {

	public static void main(String[] args) {
		// 8~38 사이의 정수 얻기
		int time = (int) (Math.random()*4) + 8;
		System.out.println("[현재시간 " + time + "시]");
		
		switch (time) {
		case 8 :
			System.out.println("출근합니다.");
			break;
		case 9 :
			System.out.println("회의를 합니다.");
		case 10 :
			System.out.println("업무를 봅니다.");
		default :
			System.out.println("외근을 나갑니다.");
		}
		
		// Quiz
		// 위 switch 문을 if문으로 변경.
		
		if (time == 8) {
			System.out.println("출근합니다.");
		} else if (time == 9 ) {
			System.out.println("회의를 합니다.");
		} else if (time == 10 ) {
			System.out.println("업무를 봅니다.");
		} else {
			System.out.println("외근을 나갑니다.");
		}

}
}
