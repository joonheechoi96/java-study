package exercise.dd1118;

public class Person {
	String name;
	int age;
	
	Person () {
		
	}
	Person (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void introduce () {
		System.out.println("이름: " + name + ", 나이: " + age);
	}
}
