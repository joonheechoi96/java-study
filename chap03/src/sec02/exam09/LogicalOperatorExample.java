package sec02.exam09;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		int charCode = 'A';
		System.out.println(charCode);  //65
		
		if (charCode >= 65 & charCode <= 90) { // true & true => true
			System.out.println("대문자군요");		
		}
		if (charCode >= 97 && charCode <= 122) { // false && 생 =>false ,,,,  // 숫자 대신 문자 넣는게 가독성 더 좋음. 
			System.out.println("소문자군요");		
		}
		if (charCode >= 48 && charCode <= 57) {  // t && f => false
			System.out.println("숫자군요");		
		}
		
		int value = 6;
		
		if (value%2 == 0 || value%3 == 0) { // true & true => true (뒤 로직까지 검사)
			System.out.println("2또는 3의 배수군요");		
		}
		if (value%2 == 0 || value%3 == 0) { // true & true => true (숏 서킷 동작 뒤 연산 x)
			System.out.println("2또는 3의 배수군요");		
		}
		
		// 정리: 연산의 결과는 같은데 효율성(속도) 높으므로 &&,|| 를 사용
	}

}
