package chatgpt.class04;

public class CastingMain {

	public static void main(String[] args) {
		Person p = new Student(); //업캐스팅
		
		
		p.hello();
		
		Student ptos = (Student) p;
		
		ptos.study();
	}

}
