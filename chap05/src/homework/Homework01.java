package homework;

public class Homework01 {

	public static void main(String[] args) {
		
		int[] talls = {152, 180, 165, 158, 171};
		
		for(int i = 0; i < talls.length; i++) {
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
