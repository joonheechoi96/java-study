package chatgpt.class03;

public class VehicleMain {

	public static void main(String[] args) {
		
		Vehicle c1 = new Car("벤츠");
		Vehicle c2 = new Bicycle("픽시");
		
		c1.move();
		c2.move();
	}
}
