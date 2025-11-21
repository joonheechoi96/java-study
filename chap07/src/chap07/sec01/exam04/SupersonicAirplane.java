package chap07.sec01.exam04;

// 자식 클래스
// 비행기의 일반적인 특성을 물려받고 초음속 비행 기능만 추가
public class SupersonicAirplane extends Airplane{
	// 비행 모드를 상수로 선언
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flymode = NORMAL;

	@Override
	public void fly() {
		if (flymode == SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
	} else {
			super.fly(); // 부모의 fly() 메소드 호출
			// 주로 부모 메소드의 기능을 일부 유지(사용) 하면서, 자식에게 확장하려 할 떄 사용
	}
}
	
}
