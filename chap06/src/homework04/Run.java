package homework04;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		// 객체 생성
		Library check = new Library();
		
		check.printMessage("반갑습니다요");
		
		check.sumTo100();
		
		String result = check.isEven(483573948);
		System.out.println(result);
		
		Boolean result2 = check.hasEnglish("340INF좋아요");
		System.out.println(result2);
		
		check.countLetter("youknowiamsaying?", 'a');
		
		check.gooGoo(11);
		
		
	}

}
