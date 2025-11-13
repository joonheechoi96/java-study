package sec02.exam02;

public class ForSumFrom1to100Example {

	public static void main(String[] args) {
		// 1부터 100까지 합
		int sum = 0;
		for (int i=0; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);
//		System.out.println("1~ " + i + "합: " + sum); // i는 for문 내부에서만 사용 가능하 지역 변수
	}

}
