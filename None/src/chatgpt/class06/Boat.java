package chatgpt.class06;

public class Boat extends Vehicle{
	

	public Boat(String name) {
		super(name);
	}
	
	@Override
	public void move() {
		System.out.println("배 " + getName() + "가 바다 위를 떠다닙니다!");
	}

}
