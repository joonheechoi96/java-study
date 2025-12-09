package sec08.exam01;

import java.util.Arrays;

public class LoopingExample {

	public static void main(String[] args) {
		int[] intArr = {1, 2, 3, 4, 5};
		
		Arrays.stream(intArr) // IntStream 생성
			.filter(value -> value % 2 == 0)
			.peek(value -> System.out.println(value)); // 최종 처리가 없으므로 동작하지 않음

		int total = Arrays.stream(intArr) // IntStream 생성
				.filter(value -> value % 2 == 0)
				.peek(value -> System.out.println(value)) // 중간처리
				.sum();
			System.out.println("총합: " + total);
			
			System.out.println();
		
		// 최종 처리 메소드 forEach()을 이용해서 반복 처리
		Arrays.stream(intArr) // IntStream 생성
			.filter(value -> value % 2 == 0)
			.forEach(value -> System.out.println(value));
		
		// peek의 권장 용도
		// 디버깅 목적, 로깅 목적, 데이터 가공 없이 흐름 중간값을 확인 할 때
	}

}
