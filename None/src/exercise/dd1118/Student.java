package exercise.dd1118;

public class Student {
	String name;
	int kor;
	int eng;
	int math;
	
	Student (String name, int kor, int math, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	double getAverage() {
		return (double) (kor + eng + math)/3;
	}
	
	
	void printinfo() {
		
		System.out.println(name + " 평균: " + getAverage() + "\"");
	}
}
