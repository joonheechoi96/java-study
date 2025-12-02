package programmers;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	
	 public List<Integer> solution(int[] answers) {
		 	List<Integer> list = new ArrayList<>();
	        int[] score = new int[3];
	        int[] aStyle = {1,2,3,4,5,1,2,3,4,5};
	        int[] cStyle = {3,3,1,1,2,2,4,4,5,5};
	        int[] bStyle = {2,1,2,3,2,4,2,5};
	        for(int i = 0; i < answers.length; i++){
	        	score[0] = answers[i] == aStyle[i % aStyle.length] ? score[0] + 1 : score[0];
	            score[1] = answers[i] == bStyle[i % bStyle.length] ? score[1] + 1 : score[1];
	            score[2] = answers[i] == cStyle[i % cStyle.length] ? score[2] + 1 : score[2];
	        }
	        
	        int maxScore = Math.max(Math.max(score[0],score[1]),score[2]);
	        for(int i = 0; i < score.length; i++) {
	        	if (score[i] == maxScore) {
	        		list.add(i+1);
	        	}
	        }
	        
	        
	        return list;
	        
	    }
	
}
