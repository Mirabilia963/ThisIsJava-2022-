package ch07.sec08.exam02;

public class DriverExample {

	public static void main(String[] args) {
		Driver driV = new Driver();
		
		Bus bus = new Bus();
		driV.drive(bus);
		
		Taxi taxi = new Taxi();
		driV.drive(taxi);

	}

}
