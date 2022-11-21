package ch06.sec07.exam04;

public class Car {
	
	String company = "현대";
	String model;
	String color;
	int maxSpeed;
	
	Car() {}
	
	Car(String model) {
		this.model = model;
	}
	
	Car (int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	Car (String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	Car (String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

}