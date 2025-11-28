package sec01.quiz;

public class Count {
	
	public Count() {
		
	}
	
	public int count(String x, String y) {
		int sum = 0;
		for(int i = 0; i < x.length(); i++) {
			if (x.indexOf(y, i+1) != x.indexOf(y, i)) {
				sum += 1;
			}
		}	return sum;
	}
}
