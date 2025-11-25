package chatgpt.MD1124.exam01;

public class Main {

	public static void main(String[] args) {
		Animal[] ani = new Animal[3];
		
		ani[0] = new Cat("고양이");
		ani[1] = new Dog("강아지");
		ani[2] = new Cow("소");
		
		
		for (Animal animal : ani) {
			System.out.println(animal.getName());
			animal.sound();
		}
	}

}
