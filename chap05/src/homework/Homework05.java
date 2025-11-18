package homework;

import java.util.Scanner;

public class Homework05 {
	
	public static void main(String[] args) {
		// 사용자에게 입력 받기
		Scanner sc = new Scanner(System.in);
		
		
		// 컴퓨터에서 랜덤값
		String[] choices = {"가위", "바위", "보"};
		
		int win = 0;
		int lose = 0;
		int draw = 0;
		
		while(true) {
			// 사용자가 낸 것
			System.out.print("가위바위보 : ");
			String user = sc.nextLine();
			
			// 컴퓨터가 낸 것
			String npc = choices[(int) (Math.random() * (3))];
			
			
			
			if (!"바위".equals(user) && !"가위".equals(user) && !"보".equals(user) && !"stop".equals(user)) {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
			
			System.out.println("컴퓨터 : " + npc);
			System.out.println("사용자 : " + user);
			
			if (npc.equals(user)) {
				System.out.println("비겼습니다");
				draw += 1;
				continue;
			}
			
			if ("가위".equals(user)) {
				if (npc == "바위") {
					System.out.println("졌습니다 ㅠㅠ");
					lose += 1;
				} else if (npc == "보") {
					System.out.println("이겼습니다 !");
					win += 1;
				}	continue;
			}
			if ("바위".equals(user)) {
				if (npc == "보") {
					System.out.println("졌습니다 ㅠㅠ");
					lose += 1;
				} else if (npc == "가위") {
					System.out.println("이겼습니다 !");
					win += 1;
				}	continue;
			}
			if ("보".equals(user)) {
				if (npc == "가위") {
					System.out.println("졌습니다 ㅠㅠ");
					lose += 1;
				} else if (npc == "바위") {
					System.out.println("이겼습니다 !");
					win += 1;
				}	continue;
			}
			if ("stop".equals(user)) {
				System.out.print(win+lose+draw + "전 " + win + "승 " + draw + " 무" + lose + " 패");
				break;
			}
			
			
		}
		
 }
}