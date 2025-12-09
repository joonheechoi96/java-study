package sec07.exam01;

public class Student implements Comparable<Student>{
	private String name;
	private int score;
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	
	public int getScore() {
		return score;
	}

	@Override
	public int compareTo(Student o) {
		// 점수 기준 오름차순
//		if (this.score > o.score) {
//			return 1;
//		} else if (this.score == o.score) {
//			return 0;
//		} else {
//			return -1;
//		}
		
		return Integer.compare(this.score, o.score);
	}
	
}
