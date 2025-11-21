package chap07.homework01;

public class Student extends Person {

	private int grade;
	private String major;
		
	public Student() {
		
	}

	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(age, height, weight);
		this.name = name;
		this.grade = grade;
		this.major = major;
	}
	
	public String toString() {
		return "=== " + name + " ===" +
			   "\n키 : " + height +
			   "\n나이 : " + age +
			   "\n몸무게 : " + weight +
			   "\n학년 : " + grade +
			   "\n전공 : " + major;	    
	}
	
}
