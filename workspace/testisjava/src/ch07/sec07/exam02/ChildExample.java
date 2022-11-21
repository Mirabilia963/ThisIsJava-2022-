package ch07.sec07.exam02;

public class ChildExample {

	public static void main(String[] args) {
		Child ch = new Child();
		
		Parent pa = ch;
		
		pa.method1();
		pa.method2();
//		pa.method3();
	}

}
