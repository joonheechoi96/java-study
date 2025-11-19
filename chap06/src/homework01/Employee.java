package homework01;

public class Employee {
	// 필드
	public String name;
	public String team;
	String position;
	int payment;
	private int bonus;
	
	public Employee(String name, String team) {
		this.name = name;
		this.team = team;
	}
	
	void printInfo() {
		System.out.println("이름 : " + name + ", 팀 : " + team);
	}
	
}
