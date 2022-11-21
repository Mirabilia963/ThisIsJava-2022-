package ch07.sec04.exam02;

public class SupersonicAirplane extends Airplane{

	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flymod = NORMAL;
	
	@Override
	public void fly() {
		if(flymod == SUPERSONIC) {
			System.out.println("초음속 비행");
		} 
		else {
			super.fly();
		}
		
	}

	
}
