package homework.condition;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("월 : ");
		int month = sc.nextInt();
		System.out.print("기온 : ");
		int temp = sc.nextInt();
		String info;
		
		if (month == 3 || month == 4 || month == 5) {
			info = "봄";
		} else if (month == 6 || month == 7 || month == 8) {
			if (temp >= 35) {
				info = "여름 폭염 경보";
			} else if (temp >= 33)	{
				info = "여름 폭염 주의보";				
			} else {
				info = "여름";
			}
		}
		  else if (month == 9 || month == 10 || month == 11) {
			 info = "가을";			
		} else if (month == 12 || month == 1 || month == 2) {
			if (temp <= -15) {
				info = "겨울 한파 경보";
			} else if (temp <= -12)	{
				info = "겨울 한파 주의보";				
			} else {
				info = "겨울";
			} 
		} else {
			info = "해당하는 계절이 없습니다.";
		} System.out.println(info);
	}

}
