package day6;

public class Exam33_Class_Practice_2 {

	public static void main(String[] args) {
		Exam31_Car myCar1 = new Exam31_Car();
		Exam31_Car myCar2 = new Exam31_Car();
		
		myCar1.color = "red";
		myCar2.color = "black";
		myCar1.speedUp();
		myCar2.wiper();
		
		System.out.println("myCar1의 색 :" + myCar1.color);
		System.out.println("myCar2의 색 :" + myCar2.color);
		
		System.out.println("myCar1의 속도 :" + myCar1.speed);
		System.out.println("myCar2의 속도 :" + myCar2.speed);
		
		System.out.println("myCar1의 와이퍼 작동 여부 :" + myCar1.wiperOn);
		System.out.println("myCar2의 와이퍼 작동 여부 :" + myCar2.wiperOn);
	}

}
