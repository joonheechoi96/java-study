package homework;

import java.util.Arrays;

public class Homework07 {

	public static void main(String[] args) {
		String [] report = {"Introduction", "Research", "Conclusion"};
		String [] copiedReport = Arrays.copyOf(report, report.length);
		copiedReport[0] = "Team Feedback";
		
		System.out.println("원본 보고서: " + String.join(", ", report));
		System.out.println("복사된 보고서: " + String.join(", ", copiedReport));

}

}