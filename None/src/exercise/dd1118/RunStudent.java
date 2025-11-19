package exercise.dd1118;

public class RunStudent {

	public static void main(String[] args) {
		Student stu1 = new Student("홍길동", 93, 84, 89);
		Student stu2 = new Student("김병지", 91, 82, 85);
		
		
		
		if (stu1.getAverage() >= stu2.getAverage()) {
			stu1.printinfo();
		} else {
			stu2.printinfo();
		}
	}

}
