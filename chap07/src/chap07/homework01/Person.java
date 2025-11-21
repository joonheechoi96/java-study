package chap07.homework01;

public class Person {
	
	protected String name;
	protected int age;
	protected double height;
	protected double weight;
	
	public Person() {
		
	}
	
	public Person(int age, double height, double weight) {
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
}
