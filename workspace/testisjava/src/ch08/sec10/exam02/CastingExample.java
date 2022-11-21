package ch08.sec10.exam02;

public class CastingExample {

	public static void main(String[] args) {
		Vehicle veH = new Bus();
		veH.run();
		
		Bus bus = new Bus();
		bus.run();
		bus.checkFare();
	}

}
