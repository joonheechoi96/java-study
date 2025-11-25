package chatgpt.MD1124.exam02;

public class Main {

	public static void main(String[] args) {
		Duck duck = new Duck("도날드");
		Flyable flyingDuck = new Duck("오예");
		
	
		System.out.println(flyingDuck.getClass());
		
		Flyable flyduck = duck;
		
		flyduck.fly();
		
		Swimmable swimduck = duck;
		
		swimduck.swim();
		
		Animal animalDuck = duck;
		
		System.out.println(duck.getName());
	}

}
