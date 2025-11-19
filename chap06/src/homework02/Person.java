package homework02;

public class Person {
	private String name;
	private String address;
	public String phone;
	public double height;
	public double weight;
	
	public Person(String phone, double height, double weight) {
		this.phone = phone;
		this.height = height;
		this.weight = weight;
	}
	
	void printInfo() {
		System.out.println("전화번호: " + phone + ", 키: " + height + ", 몸무게: " + weight);
	}
	
	
}
