package ch08.sec12;

public class InstanceofExample {

	public static void main(String[] args) {
				
		Bus bUs = new Bus();
		Taxi taX = new Taxi();
		
		ride(taX);
		System.out.println();
		ride(bUs);
	}
	
	public static void ride(Vehicle veH) {
//		if(veH instanceof Bus) {
//			Bus bUs = (Bus) veH;
//			bUs.checkFare();
			
			if(veH instanceof Bus bUs) {
				bUs.checkFare();
			}
			veH.run();
		}
	}
