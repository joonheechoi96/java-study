package chatgpt.class06;

public class Car extends Vehicle{
	public Car(String name) {
		super(name);
	}
	
	@Override
	public void move() {
		System.out.println("자동차 " + getName() + "가 도로 위를 달립니다");
	}
}
