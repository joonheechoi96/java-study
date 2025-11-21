package chap07.sec02.exam03;

public class Car {
	// 필드
	Tire frontLeftTire = new Tire("앞왼쪽", 6); // 일반 순정 타이어
	Tire frontRightTire = new Tire("앞오른쪽", 2); // 
	Tire backLeftTire = new Tire("뒤왼쪽", 3); // 
	Tire backRightTire = new Tire("뒤오른쪽", 4); // 
	
	// 메소드
	// 4개의 타이어를 1회전 시키는 메소드
	// 어떤 타이어가 펑크 났는지 정수값으로 리턴
	public int run(){
		System.out.println("[자동차가 달립니다.]");
		if (frontLeftTire.roll() == false) { stop(); return 1;}
		if (frontRightTire.roll() == false) { stop(); return 2;}
		if (backLeftTire.roll() == false) { stop(); return 3;}
		if (backRightTire.roll() == false) { stop(); return 4;}
		return 0;
	}
	
	public void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
}
