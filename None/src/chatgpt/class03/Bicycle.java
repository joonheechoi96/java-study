package chatgpt.class03;

public class Bicycle extends Vehicle{
	
	public Bicycle (String name) {
		super(name);
	}
	
	@Override
	public void move() {
		System.out.println(getName() + " 자전거가 달립니다!");
	}
}
