package baekjoon;

import java.util.*;

class Solution {
	
    public boolean solution(String[] phone_book) {
    	
        boolean answer = true;
        
        Arrays.sort(phone_book, (a,b) -> a.length() - b.length());
        
        for (int i = 0; i < phone_book.length; i++) {
        		String str = phone_book[i];
        	for (int j = i+1; j < phone_book.length; j++) {
        		if (phone_book[j].startsWith(str)) {
        			answer = false;
            }
         }
      }
        return answer;
    }
}