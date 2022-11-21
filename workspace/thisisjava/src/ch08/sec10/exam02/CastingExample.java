package ch08.sec10.exam02;

public class CastingExample {

	public static void main(String[] args) {
		Vehicle veHi = new Bus();
		
		veHi.run();
//		veHi.checkFare();
		
		Bus bus = (Bus) veHi;
		bus.run();
		bus.checkFare();
	}

}
