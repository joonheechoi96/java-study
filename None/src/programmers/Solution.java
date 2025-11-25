package programmers;

import java.util.Iterator;

public class Solution {
	
	public static void main(String[] args) {
		int x = 9000000;
		int n = 500;
		
		 long[] answer = {};
	        answer = new long[n];
	        for (int i = 0; i < n; i++) {
	            answer[i] =  x + (long) x*i;
	        }
	        
	      for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + " ");
		}
	}

}
