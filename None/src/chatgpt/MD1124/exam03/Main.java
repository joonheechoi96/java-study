package chatgpt.MD1124.exam03;

public class Main {

	public static void main(String[] args) {
		
		Vehicle[] vehicles = new Vehicle[6];
		
		vehicles[0] = new Car("테슬라");
		vehicles[1] = new Car("아우디");
		vehicles[2] = new Boat("크루즈");
		vehicles[3] = new Boat("돛단배");
		vehicles[4] = new Airplane("여객기");
		vehicles[5] = new Airplane("UFO");
		
		for (Vehicle vehicle : vehicles) {
			vehicle.run();
			if (vehicle instanceof Boat boat) {
				boat.anchor();
			} else if (vehicle instanceof Airplane airplane) {
				airplane.fly();
			}
		}
	}

}
