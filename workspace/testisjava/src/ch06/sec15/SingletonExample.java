package ch06.sec15;

public class SingletonExample {

	public static void main(String[] args) {
		
		Singleton oj1 = Singleton.genInstance();
		Singleton oj2 = Singleton.genInstance();
		
		if(oj1 == oj2) {
			System.out.println("Same sinG");
		}
		else {
			System.out.println("different SinG");
		}

	}

}
