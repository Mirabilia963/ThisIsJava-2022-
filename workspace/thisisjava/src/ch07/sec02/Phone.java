package ch07.sec02;

public class Phone {
	
	public String model;
	public String color;
	
	public void bell() {
		System.out.println("Ringing");
	}
	
	public void sendVoice(String message) {
		System.out.println("본인:" + message);
	
	}
	
	public void receiveVoice(String message) {
		System.out.println("상대:" + message);
		
	}
	
	public void hangUp() {
		System.out.println("Call Off");
	}

}
