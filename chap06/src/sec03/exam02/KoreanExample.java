package sec03.exam02;

public class KoreanExample {

	public static void main(String[] args) {
		Korean k1 = new Korean("최준희", "960501-1111111");
		System.out.println("k1.nation: " + k1.nation);
		System.out.println("k1.name: " + k1.name);
		System.out.println("k1.ssn: " + k1.ssn);
		
		System.out.println();
		
		Korean k2 = new Korean("김쟁쟁", "493843-493444");
		System.out.println("k1.nation: " + k2.nation);
		System.out.println("k1.name: " + k2.name);
		System.out.println("k1.ssn: " + k2.ssn);
		
	}

}
