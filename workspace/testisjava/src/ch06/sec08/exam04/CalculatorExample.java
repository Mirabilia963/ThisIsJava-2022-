package ch06.sec08.exam04;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator Calc = new Calculator();
		
		double result1 = Calc.areaRectangle(10);
		
		double result2 = Calc.areaRectangle(10, 20);
		
		System.out.println("정사각형 넓이: " + result1);
		System.out.println("직사각형 넓이: " + result2);

	}

}
