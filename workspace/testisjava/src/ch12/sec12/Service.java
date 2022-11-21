package ch12.sec12;

public class Service {
	@PrintAnnotaion
	public void method1() {
		System.out.println("실행 내용1");
	}
	
	@PrintAnnotaion("*")
	public void method2() {
		System.out.println("실행 내용2");
	}
	
	@PrintAnnotaion(value = "#", number=20)
	public void method3() {
		System.out.println("실행 내용3");
	}
}
