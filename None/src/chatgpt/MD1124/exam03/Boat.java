package chatgpt.MD1124.exam03;

public class Boat implements Vehicle{
	
	private String name ;
	
	public Boat (String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public void run() {
		System.out.println("배 " + getName() + "가 물 위를 떠다닙니다!");
	}
	
	public void anchor() {
		System.out.println("배 " + getName() + "가 닻을 내립니다!");
	}

}
