package chap07.sec03.quiz;

public class InformalEmployee extends Employee{
	
	private int primaryPay;
	
	public InformalEmployee(String name, String dept, int primaryPay) {
		super("비정규직", name, dept);
		this.primaryPay = primaryPay;
		this.setType("비정규직");
	}

	@Override
	public int getPay() {
	       return primaryPay;
	}
	
	@Override
	public String getInfo() {
		return getType() + ", " + getName() + ", " + getDept() + ", " + primaryPay;
	}
}
