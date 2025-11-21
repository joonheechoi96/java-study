package chap07.sec01.exam02;

public class StudentExample {

	public static void main(String[] args) {
		Student student1 = new Student("홍길동", "123456-1234567", 1);
		// 부모 생성자가 호출되고 자식 객체가 생성됨
		
		System.out.println("name : " + student1.name);
		System.out.println("ssn : " + student1.ssn);
		System.out.println("studentNo : " + student1.studentNo);
	}
	

}
	