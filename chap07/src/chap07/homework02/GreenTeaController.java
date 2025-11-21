package chap07.homework02;

public class GreenTeaController {
	GreenTea gt = new GreenTea();
	public String bakeGreenTeaCake(double flour, double cream, double powder, int cheese) {
		return 	   "밀가루 : " + flour + "(g)\n" 
			     + "크림 : " + cream + "(g)\n"
			     + "녹차 파우더 : " + powder + "(g)\n"
			     + "치즈 큐브(개) : " + cheese + "(개)\n"
			     + "치즈 케이크가 완성되었습니다.";
	}
}
