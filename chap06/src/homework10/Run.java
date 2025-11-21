package homework10;

public class Run {

	public static void main(String[] args) {
		Student stu1 = new Student();
		Student stu2 = new Student();
		Student stu3 = new Student();
		
		
		stu1.setName("김철수");
		stu2.setName("홍길동");
		stu3.setName("이영희");
		
		stu1.setClassName('A');
		stu2.setClassName('B');
		stu3.setClassName('C');
		
		
		System.out.println(stu1.getStudentNo() + " " + stu1.getName() + " " + stu1.getClassName());
		System.out.println(stu2.getStudentNo() + " " + stu2.getName() + " " + stu2.getClassName());
		System.out.println(stu3.getStudentNo() + " " + stu3.getName() + " " + stu3.getClassName());
	}

}
