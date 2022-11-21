package ch07.sec07.exam03;

public class ChildExample {

	public static void main(String[] args) {
		Parent pA = new Child();
		
		pA.field1 = "data1";
		pA.method1();
		pA.method2();
		
		Child cH = (Child) pA;
		
		cH.field2 = "data2";
		cH.method3();

	}

}
