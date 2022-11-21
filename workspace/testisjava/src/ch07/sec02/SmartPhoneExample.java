package ch07.sec02;

public class SmartPhoneExample {

	public static void main(String[] args) {
		SmartPhone myP = new SmartPhone("iPhone", "silver");
		
		System.out.println("모델: " + myP.model);
		System.out.println("색상: " + myP.color);
		
		System.out.println("와이파이 상태: " + myP.wifi);
		
		myP.bell();
		myP.sendVoice("안녕하세요?");
		myP.receiveVoice("왜요");
		myP.sendVoice("네?");
		myP.hangUp();
		
		myP.setWifi(true);
		myP.internet();

	}

}
