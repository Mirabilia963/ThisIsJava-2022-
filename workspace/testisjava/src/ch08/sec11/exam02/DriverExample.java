package ch08.sec11.exam02;

public class DriverExample {

	public static void main(String[] args) {
		Driver drI = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		drI.drive(bus);
		drI.drive(taxi);
	}

}
