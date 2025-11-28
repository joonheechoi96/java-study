package sec01.homework01;

public class Run {

	public static void main(String[] args) {
		String str ="김철수,25,동작구,남\n홍길동,27,관악구,남\n이영희,29,강서구,여";
		
		String[] people = str.split("\n");
		
		String[] per1 = people[0].split(",");
		String[] per2 = people[1].split(",");
		String[] per3 = people[2].split(",");
		
		Person person1 = new Person(per1[0],Integer.parseInt(per1[1]),per1[2],per1[3].charAt(0));
		Person person2 = new Person(per2[0],Integer.parseInt(per2[1]),per2[2],per2[3].charAt(0));
		Person person3 = new Person(per3[0],Integer.parseInt(per3[1]),per3[2],per3[3].charAt(0));
		
		System.out.println(person1.toString());
		System.out.println(person2.toString());
		System.out.println(person3.toString());
	}

}
