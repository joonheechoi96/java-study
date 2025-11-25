package chatgpt.MD1124.exam03;

public class Car implements Vehicle{
	
	private String name ;
	
	public Car (String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public void run() {
		System.out.println("자동차 " + getName() + "가 도로를 달립니다!");
	}

}
