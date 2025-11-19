package sec03.exam03;

public class Animal {
	String kind;
	int age;
	
	Animal(String kind, int age) {
		this.kind = kind;
		this.age = age;
	}
	// 종류만 받는 생성자 (기본 나이 : 1살)
	Animal(String kind) {
		this.kind = kind;
		this.age = 1;
	}
	// 나이만 받는 생성자 (기본 종 : 사람)
	Animal(int age) {
		this.kind = "사람";
		this.age = age;
	}
	
	public void info() {
		System.out.println(kind + ": " + age + "살"); 
	}
	
}
