package sec01.homework06;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		String sentence = "the quick brown fox jumps over the lazy dog";
		Scanner sc = new Scanner(System.in);
		System.out.print("단어를 입력하세요 : ");
		String input = sc.nextLine();
		String[] words = sentence.split(" ");
		boolean found = false;
		
		
		for(int i = 0; i < words.length; i++) {
			if(input.equals(words[i])) {
				if (i == words.length-1) {
					found = true;
					System.out.println("마지막 단어입니다.");
					break;					
				}
				found = true;
				System.out.println(words[i] + " 다음 단어: " + words[i+1]);
				break;
			}	
		}	if(!(found)) System.out.println("존재하지 않는 단어입니다.");
		
	}

}
