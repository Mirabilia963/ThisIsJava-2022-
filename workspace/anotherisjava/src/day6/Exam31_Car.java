package day6;

public class Exam31_Car {
	boolean powerOn;
	String color;
	int wheel;
	int speed;
	boolean wiperOn;
	
	void power() {
		powerOn = !powerOn;
	}
	void speedUp() {
		speed++;
	}
	void speedDown() {
		speed--;
	}
	void wiper() {
		wiperOn = !wiperOn;
	}
}
