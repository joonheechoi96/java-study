package homework03;

import java.io.IOException;

import java.util.Scanner;



public class FileMenu {
	Scanner sc = new Scanner(System.in);
	FileController fc = new FileController();
	
	public void mainMenu() throws IOException {
		while (true) {
			System.out.println("***** My Note *****");
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호: ");
			
			int menuNo = Integer.parseInt(sc.nextLine());
			switch (menuNo) {
				case 1: fileSave(); break;
				case 2: fileOpen(); break;
				case 3: fileEdit(); break;
				case 9:
					System.out.println("프로그램을 종료합니다.");
					return;
				default:
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					break;
			}
		} 
	}
	
	public void fileSave() throws IOException {
			System.out.print("파일에 저장할 내용을 입력하세요.\nexit 라고 입력하면 종료됩니다.\n");
			StringBuilder sb = new StringBuilder();
			while(true) {
				System.out.print("내용 : ");
				String input = sc.nextLine();
				if(input.equalsIgnoreCase("exit")) break;
				sb.append(input + "\n");
			}
			while(true) {
			System.out.print("저장할 파일 명을 입력해주세요 : ");
			String fileName = sc.nextLine();
			Boolean isFile = fc.checkName(fileName);
			if (isFile) {
				System.out.print("이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/n)");
				if (sc.nextLine().equalsIgnoreCase("y")) {
					fc.fileEdit(fileName, sb);
					break;
				} else {
					continue;
				}
			}
			fc.fileEdit(fileName, sb);
			break;
			}
		}
	
	
	public void fileOpen() throws IOException {
		System.out.print("열 파일 명 : ");
		String fileName = sc.nextLine();
		if (!fc.checkName(fileName)) {
			System.out.println("없는 파일입니다.");
			mainMenu();
		} else {
			System.out.println(fc.fileOpen(fileName).toString());
		}
	}
	
	public void fileEdit() throws IOException {
		System.out.print("열 파일 명 : ");
		String fileName = sc.nextLine();
		if (!fc.checkName(fileName)) {
			System.out.println("없는 파일입니다.");
			mainMenu();
		} 
		System.out.print("파일에 저장할 내용을 입력하세요.\nexit 라고 입력하면 종료됩니다.\n");
		StringBuilder sb = new StringBuilder();
		while(true) {
			System.out.print("내용 : ");
			String input = sc.nextLine();
			if(input.equalsIgnoreCase("exit")) break;
			sb.append(input+"\n");
		}
		fc.fileEdit(fileName, sb);
}
}
