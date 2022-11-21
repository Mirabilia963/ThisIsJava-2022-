package ch07.sec03.exam02;

public class SmartPhone extends Phone{
	public SmartPhone() {
		System.out.println("SmartPhone 기본 생성자 실행");
	}
	
	public SmartPhone(String model, String color) {
		super(model, color);
		System.out.println("SmartPhone(String model, String color) 생성자 실행");
	}

}
