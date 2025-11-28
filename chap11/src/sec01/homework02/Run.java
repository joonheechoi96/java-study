package sec01.homework02;

public class Run {

	public static void main(String[] args) {
		Practice p = new Practice();
		
		String[] infos = {"서울특별시 금천구 구로디지털로2로 95", "서울특별시 서대문구 연희로 248",
				"울산광역시 남구 돋질로 233", "경상북도 구미시 송정대로 55"};
	
		for (String info : infos) {
			System.out.println(p.takeState(info));
		}
		
	}

}
