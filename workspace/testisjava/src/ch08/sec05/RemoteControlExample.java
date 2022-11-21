package ch08.sec05;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc;
		
		rc = new Television();
		rc.turnOn();
		rc.steVolume(5);
//		rc.turnOff();
		
//		System.out.println();
//		
//		rc = new Audio();
//		rc.turnOn();
//		rc.steVolume(10);
//		rc.turnOff();
//		
//		System.out.println();
//		
		rc.setMute(true);
		rc.setMute(false);
		
		System.out.println();
		
		rc = new Audio();
		rc.turnOn();
		rc.steVolume(5);
		
		System.out.println();
		
		rc.setMute(true);
		rc.setMute(false);

	}

}
