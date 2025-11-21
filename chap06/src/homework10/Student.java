package homework10;

public class Student {
    private static int nextStudentNo = 1; // 공유되는 학번 카운터
    private int studentNo;                // 각 객체에 저장될 학번
	private String name;
	private char className;
	
	public Student() {
		this.studentNo = nextStudentNo ++;
	}
	
	public int getStudentNo() {
		return studentNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getClassName() {
		return className;
	}
	public void setClassName(char className) {
		this.className = className;
	}
	
	
}
