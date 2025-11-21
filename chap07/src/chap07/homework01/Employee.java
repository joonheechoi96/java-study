package chap07.homework01;

public class Employee extends Person {
	
	private int salary;
	private String dept;
	
	public Employee() {
		
	}
	
	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(age, height, weight);
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	
	public String toString() {
		return "=== " + name + " ===" +
			   "\n키 : " + height +
			   "\n나이 : " + age +
			   "\n몸무게 : " + weight +
			   "\n급여 : " + salary +
			   "\n부서 : " + dept;	    
	}
}
