package ch08.sec07;

public class ServiceExample {

	public static void main(String[] args) {
		Service serV = new ServiceImpl();
		
		serV.defaultMethod1();
		System.out.println();
		serV.defaultMethod2();
		System.out.println();
		
		Service.staticMethod1();
		System.out.println();
		Service.staticMethod2();
		System.out.println();
		
	}

}
