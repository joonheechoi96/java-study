package chatgpt.class06;

public class Airplane extends Vehicle{

	public Airplane (String name) {
		super(name);
	}
	
	@Override
	public void move() {
		System.out.println("비행기 " + getName() + "가 하늘을 날아갑니다!");
	}

}
