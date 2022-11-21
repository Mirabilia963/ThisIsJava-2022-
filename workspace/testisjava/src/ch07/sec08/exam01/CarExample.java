package ch07.sec08.exam01;

public class CarExample {

	public static void main(String[] args) {
		Car mC = new Car();
		
		mC.tire = new Tire();
		mC.run();
		
		mC.tire = new HkTire();
		mC.run();
		
		mC.tire = new KhTire();
		mC.run();

	}

}
