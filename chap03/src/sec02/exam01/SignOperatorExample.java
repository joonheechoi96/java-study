package sec02.exam01;

public class SignOperatorExample {
	
	public static void main(String[] args) {
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		
		byte b = 100;
//		byte result3 = -b; // int 이하 정수의 산술(부호) 연산은 int로 변환
		int result3 = -b;
		System.out.println("result3: " + result3);
		
		char c = 21504;
		int result4 = -c; // int로 형변환 되기 때문에 마이너스도 가능
		char result5 = (char) -c; // 언더플로우 발생
		System.out.println("result4: " + result4);
		System.out.println("result5: " + result5);
	}
	
}
