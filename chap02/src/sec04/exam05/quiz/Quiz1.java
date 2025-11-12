package sec04.exam05.quiz;

import java.util.Scanner;

public class Quiz1 {
	// Quiz
//	2개의 int 값을 입력받아 입력받은 값을 화면에 ,로 연결하여 출력하시오.
//	[입력]    [출력]
//	10 20 => 10,20
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			// Scanner 클래스는 사용자의 입력을 다양한 타입으로 자동 변환해주는 편리한 기능을 ㅔ공
			
			/*int inputNum1 = sc.nextInt();
			int inputNum2 = sc.nextInt();
			System.out.println(inputNum1 + "," + inputNum2);
			System.out.println("퀴즈 종료\n");*/		
		
		
			//주의!
			// nextInt()나 next()는 입력 후 개행 문자(\n)를 버퍼에 남김
			// 따라서 그 다음에 nextLine()을 쓰면 개행을 읽어버려서 빈 문자열("")이 들어감
			// 해결법: 중간에 sc.nextLine()을 한번 호출해서 버퍼를 정리
			System.out.println("나이: ");
			int age = sc.nextInt();
			sc.nextLine(); // 버퍼 지우기 (중요!)
			System.out.println("이름: ");
			String name = sc.nextLine();
			
			System.out.println("너의 나이는 " + age);
			System.out.println("너의 이름은 " + name);
			
			// 스캐너 사용이 끝나면 OS 자원을 반환
			sc.close(); // (참고) 프로그램 실행이 끝나면 자동으로 반환하긴 함
	}
}
