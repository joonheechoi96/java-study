package chap13.sec01.exam07;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {	// Linked = 연결된 - 순서 유지와 관련
	
	public static void main(String[] args) {
		// HashSet
		// 요소를 추가한 순서를 보장하지 않음
		// 빠르게 요소 추가, 삭제, 검색 가능
//		Set<String> set = new HashSet<>();
		
		// LinkedHashSet
		// 요소를 추가한 순서대로 저장됨
		// HashSet에 비해 메모리와 소요 시간이 많음
		Set<String> set = new LinkedHashSet<>();
		
		set.add("동");
		set.add("서");
		set.add("남");
		set.add("북");
		System.out.println(set);
		
		
		
		
		
	}
}
