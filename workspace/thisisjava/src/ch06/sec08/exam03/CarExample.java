package ch06.sec08.exam03;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
//		myCar.setGas(5);
		myCar.setGas(0);
		
		if(myCar.isLeftGas()) {
			System.out.println("Go");
			
			myCar.run();
		}
		
		System.out.println("Gas please");

	}

}
