package chap07.sec01.exam02;

public class People {
	// 필드
	String name;
	String ssn;
	
	// 생성자
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
		System.out.println("부모 생성자 호출");
	}
	
	
}
