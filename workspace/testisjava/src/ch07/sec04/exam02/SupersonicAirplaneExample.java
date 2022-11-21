package ch07.sec04.exam02;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		
		sa.takeoff();
		sa.fly();
		
		sa.flymod = SupersonicAirplane.SUPERSONIC;
		sa.fly();
		
		sa.flymod = SupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();

	}

}
