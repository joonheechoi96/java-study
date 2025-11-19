package exercise.dd1118;

public class RunCar {

	public static void main(String[] args) {
		Car car = new Car("K5", 0);
		
		car.speedUp();
		car.speedUp();
		car.speedUp();
		car.speedDown();
		car.printStatus();
	}

}
