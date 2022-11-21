package ch07.sec02;

public class Phone {
	
	public String model;
	public String color;
	
	public void bell() {
		System.out.println("ringing");
	}
	
	public void sendVoice(String message) {
		System.out.println("자신:" + message);
	}
	
	public void receiveVoice(String message) {
		System.out.println("상대:" + message);
	}
	
	public void hangUp() {
		System.out.println("call off");
		
	}

}
