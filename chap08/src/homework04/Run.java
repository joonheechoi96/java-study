package homework04;

public class Run {

	public static void main(String[] args) {
		SmartPhone[] sp = new SmartPhone[2];
		
		sp[0] = new GalaxyS24();
		sp[1] = new Iphone15();
		
		for (SmartPhone sPhone : sp) {
			sPhone.printMaker();
			sPhone.makeCall();
			sPhone.takeCall();
			sPhone.touch();
			sPhone.charge();
			sPhone.picture();
			System.out.println();
		}
	}

}
