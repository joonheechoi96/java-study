package chap13.sec01.exam13;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		// TreeMap
		// key를 기준으로 자동 정렬해서 저장 (기본은 오름차순)
		
		Map<String, Object> flower = new TreeMap<String, Object>();
		flower.put("name", "튤립");
		flower.put("lang", "고백");
		flower.put("price", 20000);
		flower.put("day", 10);
		System.out.println(flower);
		System.out.println();
		// 내림차순
		flower = new TreeMap<String, Object>(Collections.reverseOrder());
		flower.put("name", "튤립");
		flower.put("lang", "고백");
		flower.put("price", 20000);
		flower.put("day", 10);
		System.out.println(flower);
	}

}
