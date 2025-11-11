package sec03.exam01;

public class PromotionExample {

	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue; // 1byte -> 4byte, 자동 형변환됨.
		System.out.println("intValue: " + intValue);
		
		char charValue = '가';
		intValue = charValue; // 2byte -> 4byte, 자동 형변환됨.
		System.out.println("intValue: " + intValue); // 유니코드 값 출력
		
		intValue = 30;
		long longValue = intValue; // 4byte -> 8byte, 자동 형변환됨.
		System.out.println("longValue: " + longValue);
		
		longValue = 100;
		float floatValue = longValue; // 실게 저장할 수 있는 값의 범위는 long < float 더 넓음 => 자동 형변환됨.
		System.out.println("floatValue: " + floatValue);
		
		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println("doubletValue: " + doubleValue);
		
		// 주의! byte -> char 타입으로 자동 형변환 불가능 ~~
		byte byteVal = 65;
//		char charVal = byteVal; // char는 byte와 달리 음수를 포함하지 않기 때문에 x.
		
		int intValue2 = 7000;
		byte byteValue2 = (byte) intValue2;
		System.out.println(byteValue2);
		
		
	}

}
