package chap13.homework02;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class LotteryMenu {
	Scanner sc = new Scanner(System.in);
	LotteryController lc = new LotteryController();
	
	public void mainMethod() {
		while (true) {
			System.out.println("===== 로또 번호 추첨 =====");
			System.out.println("원하시는 메뉴의 번호를 입력하세요.");
			System.out.println("1. 추첨 대상 추가"); // insertObject()
			System.out.println("2. 추첨 대상 삭제"); // deleteObject()
			System.out.println("3. 추첨 대상 목록 조회"); // searchObject();
			System.out.println("4. 당첨 대상 구성"); // winObject()
			System.out.println("5. 정렬된 당첨 대상 확인"); // sortedWinObject()
			System.out.println("6. 당첨 대상 검색"); // searchWinner()
			System.out.println("9. 종료"); // "프로그램을 종료합니다."출력
			System.out.print("메뉴 번호: ");
			
			try {
				int menuNo = sc.nextInt();
				sc.nextLine();
				switch(menuNo) {
					case 1: insertObject(); break;
					case 2: deleteObject(); break;
					case 3: searchObject(); break;
					case 4: winObject(); break;
					case 5: sortedWinObject(); break;
					case 6: searchWinner(); break;
					case 9: System.out.println("프로그램 종료."); return;
					default: 
						System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
						break;
				}
			} catch (InputMismatchException e) {
				System.err.println("숫자만 입력하라구~~~");
				sc.nextLine();
			}
		}
	
	}
	
	public void insertObject() {
		System.out.println("===== 1. 추첨 대상 추가 =====");
		System.out.print("추가할 추첨 대상 수 : ");
		int num = sc.nextInt();
		sc.nextLine();
		int count = 0;
			while (count < num) {
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("휴대폰 번호 : ");
			String phone = sc.nextLine();
			Lottery l = new Lottery(name, phone);
			if (lc.lottery.contains(l)) {
				System.out.println("중복된 대상입니다. 다시 입력하세요.");
				continue;
			}
			lc.insertObject(l);
			count ++;
		}	System.out.println(num + "명 추가 완료되었습니다.");
	}
	
	public void deleteObject() {
		System.out.println("===== 2. 추첨 대상 삭제 =====");
		System.out.println("삭제할 대상의 이름과 핸드폰 번호를 입력하세요.");
		System.out.print("이름 : ");
		String deleteName = sc.nextLine();
		System.out.print("핸드폰 번호('-'빼고) : ");
		String deletePhone = sc.nextLine();
		Lottery l = new Lottery(deleteName, deletePhone);
		if (!lc.lottery.contains(l)) {
			System.out.println("존재하지 않는 대상입니다.");
		} else {
			System.out.println("삭제 완료되었습니다.");
			lc.deleteObject(l);
		}
	}
	
	public void searchObject() {
		System.out.println("===== 3. 추첨 대상 목록 조회 =====");
		System.out.println(lc.serachObject());
	}
	
	public void winObject() {
		if(lc.winObject() == null) {
			System.out.println("추첨 대상이 4명 이상이어야 당첨 대상을 구성할 수 있습니다.");
		} else {
		System.out.println("===== 4. 당첨 대상 구성 =====");
		System.out.println(lc.winObject());
		}
	}
	
	public void sortedWinObject() {
		System.out.println("===== 5. 정렬된 당첨 대상 확인 =====");
		Iterator<Lottery> iterator = lc.sortedWinObject().iterator();
		while(iterator.hasNext()) {
		Lottery element = iterator.next();
		System.out.println(element);
		}
	}
	
	public void searchWinner() {
		System.out.println("===== 6. 당첨 대상 검색 =====");
		System.out.println("검색할 대상의 이름과 핸드폰 번호를 입력하세요.");
		System.out.print("이름 : ");
		String checkName = sc.nextLine();
		System.out.print("핸드폰 번호('-'빼고) : ");
		String checkPhone = sc.nextLine();
		Lottery l = new Lottery(checkName, checkPhone);
		System.out.println(lc.searchWinner(l)? "축하합니다. 당첨 목록에 존재합니다." : "다음 기회에!");
	}
	
	
}
