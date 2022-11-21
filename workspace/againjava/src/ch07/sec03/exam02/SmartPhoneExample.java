package ch07.sec03.exam02;

public class SmartPhoneExample {

	public static void main(String[] args) {
		SmartPhone myP1 = new SmartPhone();
		System.out.println();
		SmartPhone myP2 = new SmartPhone("갤럭시", "은색");
		
		System.out.println("모델: " + myP1.model);
		System.out.println("컬러: " + myP1.color);
		
		System.out.println("모델: " + myP2.model);
		System.out.println("컬러: " + myP2.color);
	}

}
