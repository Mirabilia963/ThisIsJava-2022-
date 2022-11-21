package ch07.sec08.exam01;

public class CarExample {

	public static void main(String[] args) {
		
		Car myC = new Car();
		
		myC.tire = new Tire();
		myC.run();
		
		myC.tire = new HankookTire();
		myC.run();
		
		myC.tire = new KumhoTire();
		myC.run();

	}

}
