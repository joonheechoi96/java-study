package chatgpt.class03;

public abstract class Vehicle {
	private String name;
	
	
	public String getName() {
		return name;
	}
	
	public Vehicle(String name) {
		this.name = name;
	}
	
	public abstract void move();
}
