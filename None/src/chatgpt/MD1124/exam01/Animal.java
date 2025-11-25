package chatgpt.MD1124.exam01;

public abstract class Animal {
	private String name;
	
	public Animal (String name) {
		this.name = name;
	}
	
	public abstract void sound();

	public String getName() {
		return name;
	}

}
