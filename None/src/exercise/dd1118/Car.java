package exercise.dd1118;

public class Car {
	String model;
	int speed;
	
	Car (String model, int speed) {
		this.model = model;
		this.speed = speed;
	}
	
	void speedUp () {
		speed += 10;
	}
	
	void speedDown() {
		speed -= 10;
	}
	
	void printStatus() {
		System.out.println("모델 : " + model + ", 속도 : " + speed);
	}
}
