package ch07.sec08.exam02;

public class DriverExample {

	public static void main(String[] args) {
		Driver dR = new Driver();
		
		Bus bus = new Bus();
		dR.drive(bus);
		
		Taxi taxi = new Taxi();
		dR.drive(taxi);

	}

}
