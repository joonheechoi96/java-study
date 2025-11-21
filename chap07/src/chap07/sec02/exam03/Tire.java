package chap07.sec02.exam03;

public class Tire {
	// 필드
	public int maxRotation; // 최대 회전수(최대 수명)
	public int accumulatedRotation; // 누적 회전수, (누적 회전수 == 최대 회전수) -> 타이어 펑크
	public String location;
	
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	// 메소드
	// 타이어 1회 회전시키는 메소드
	// 회전할 수 있다면 true, 펑크가 나서 회전할 수 없다면 false
	public boolean roll() {
		accumulatedRotation++;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + " Tire 수명 : " + (maxRotation-accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " Tire 펑크 ***");
			return false;
		}
	}
	
	
	
	
	
	
	// 생성자
	
	
	// 메소드
}
