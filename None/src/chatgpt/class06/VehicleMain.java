package chatgpt.class06;

public class VehicleMain {

	public static void main(String[] args) {
		
		Vehicle[] vehicle = new Vehicle[3];
		vehicle[0] = new Car("테슬라");
		vehicle[1] = new Boat("크루즈");
		vehicle[2] = new Airplane("F-22");
		
		for (Vehicle vhc : vehicle) {
			vhc.move();
		}
	}

}
