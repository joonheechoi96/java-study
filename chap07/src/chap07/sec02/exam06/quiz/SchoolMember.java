package chap07.sec02.exam06.quiz;

public class SchoolMember {
	public void introduce() {
		System.out.println("안녕하세요, 학교 구성원입니다.");
	}
	
	public static String getClassName() {
        return SchoolMember.class.getName();        
    }
}
