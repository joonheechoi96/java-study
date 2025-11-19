package sec05.exam02;

public class CalculatorExample {

	public static void main(String[] args) {
		// 반지름이 10cm인 원의 널비 구하기
		
		// 잘못된 접근 방식(메모리를 낭비하는 방식)
//		Calculator calc = new Calculator();
//		double result1 = 10 * 10 * calc.pi;
		
		// static 접근 방식
		double result1 = 10 * 10 * Calculator.pi;
		System.out.println("result1 : " + result1);
		
		// static 메소드 : 주로 유틸리티성에 접근 용이
		
		int result2 = Calculator.plus(2, 27);
		System.out.println("result2 : " + result2);
		
		int result3 = Calculator.minus(23, 1);
		System.out.println("result3 : " + result3);
		
		
		
	}

}
