package chatgpt.MD1124.exam02;

public class Duck extends Animal implements Flyable, Swimmable {
	
	public Duck (String name) {
		super(name);
	}
	
	@Override
	public void swim() {
		System.out.println("오리 " + getName() + "가 헤엄칩니다!");
	}

	@Override
	public void fly() {
		System.out.println("오리 " + getName() + "가 날아갑니다!");
	}

}
