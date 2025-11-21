package chap07.sec02.exam04;

public class DriveExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		driver.drive(bus); // 자동 타입 변환
		
		Taxi taxi = new Taxi();
		driver.drive(taxi);
	}

}
