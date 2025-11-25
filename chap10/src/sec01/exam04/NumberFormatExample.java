package sec01.exam04;

public class NumberFormatExample {

	public static void main(String[] args) {
		
		String data1 = "100";
		String data2 = "a100";
		
		try {
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
		System.out.println(value1 + value2);
		} catch (NumberFormatException e) {
			System.out.println("숫자로만 구성된 문자열을 입력하세요.");
		} finally {
			System.out.println("종료합니다.");
		}
	}

}
