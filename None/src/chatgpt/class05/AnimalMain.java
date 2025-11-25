package chatgpt.class05;

import java.util.Iterator;

public class AnimalMain {

	public static void main(String[] args) {
		
		Animal[] animal = new Animal[3];
		animal[0] = new Dog();
		animal[1] = new Cat();
		animal[2] = new Cow();
		
		for (Animal animals : animal) {
			animals.sound();
			}
		}
		
		
		
	}

