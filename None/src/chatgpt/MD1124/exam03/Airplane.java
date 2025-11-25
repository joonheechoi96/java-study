package chatgpt.MD1124.exam03;

public class Airplane implements Vehicle{
	
	private String name ;
	
	public Airplane (String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	
	@Override
	public void run() {
		System.out.println("비행기 " + getName() + "가 활주로를 달립니다!");
	}
	
	public void fly() {
		System.out.println("비행기 " + getName() + " 가 하늘을 날아갑니다!");
	}

}
