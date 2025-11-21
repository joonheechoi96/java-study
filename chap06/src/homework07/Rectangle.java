package homework07;

public class Rectangle {
	private int width = 1;
	private int height = 1;
	
	public Rectangle() {
		
	}
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int calculateRound() {
		return (width + height) * 2;
	}
	
	public int calculateArea() {
		return width * height;
	}
	
	public void printInfo() {
		System.out.print("둘레 : " + calculateRound());
		System.out.println(", 넓이 : " + calculateArea());
	}
}
