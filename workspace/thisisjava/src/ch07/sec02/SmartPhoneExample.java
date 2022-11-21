package ch07.sec02;

public class SmartPhoneExample {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("아이폰", "실버");
		
		System.out.println("모델:" + myPhone.model);
		System.out.println("색상:" + myPhone.color);
		
		System.out.println("wifi set: " + myPhone.wifi);
		
		myPhone.bell();
		myPhone.sendVoice("Hi");
		myPhone.receiveVoice("Yes");
		myPhone.sendVoice("How are you");
		myPhone.hangUp();
		
		myPhone.seWifi(true);
		myPhone.internet();

	}

}
