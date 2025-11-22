package homework01;

public class Food extends Product {
	private int expirationDays;
	
	public Food() {
		
	}

	public Food(String name, int price, int expirationDays) {
		super(name, price);
		this.expirationDays = expirationDays;
	}

	public int getExpirationDays() {
		return expirationDays;
	}
	
	public int calculateDiscountRate () {
		if(expirationDays <= 1 && expirationDays >= 0) {
			return 80;
		} else if (expirationDays <= 5 && expirationDays > 1) {
			return 50;
		} else if (expirationDays <= 10 && expirationDays > 5) {
			return 20;
		} else {
			return 1;
		}
	}
	
	@Override
	public int calculatePrice() {
		return getPrice() * (100-calculateDiscountRate()) / 100;
	}
}
