package chatgpt.class03;

public class Car extends Vehicle {
	
	public Car (String name) {
		super(name);
	}
	
	@Override
	public void move() {
		System.out.println(getName() + " 자동차가 달립니다!");
	}
}
