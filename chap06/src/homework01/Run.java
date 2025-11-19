package homework01;

public class Run {

	public static void main(String[] args) {
		Employee emp1 = new Employee("김철수", "교육운영팀");
		Employee emp2 = new Employee("이영희", "경영지원팀");
		
		emp1.printInfo();
		emp2.printInfo();
	}

}
