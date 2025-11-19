package homework;

public class Homework01 {

	public static void main(String[] args) {
		
		int[] talls = {152, 180, 165, 158, 171};
		
		for(int i = 0; i < talls.length-1; i++) {
			for (int j = i + 1; j < talls.length; j++) {
				if (talls[j] < talls[i]) {
					int temp = talls[i];
					talls[i] = talls[j];
					talls[j] = temp;
				}
			}
		}	for (int i = 0; i < talls.length; i++) {
			System.out.print(i == (talls.length - 1) ? talls[talls.length-1] : talls[i] + ", ");
		}
		
	}

}


/*
8w...... ...........
...................7w



1 2 3 4 5 .........w



(n / w + 1) -> 짝수일때
n = w * (n / w) + (n % w)

*/