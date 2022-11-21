package ch08.sec11.exam02;

public class DriverExample {

	public static void main(String[] args) {
		Driver dRi = new Driver();
		
		Bus bUs = new Bus();
		Taxi taX = new Taxi();
		
		dRi.drive(taX);
		dRi.drive(bUs);
	}

}
