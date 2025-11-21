package homework04;

public class Library {
	int x;
	int y;
	
	void plus () {
		System.out.println(x+y);
	}
	
	void multiply() {
		if (x < y) {
			System.out.println("계산할 수 없습니다.");
		} else {System.out.println(x*y);
	}
	}
	
	void isSame() {
		System.out.println(x==y ? true : false);
	}
		
}
