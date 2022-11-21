package ch06.sec15;

public class Singleton {
	
	private static Singleton sinG = new Singleton();
	
	private Singleton() {
		
		
	}
	
	static Singleton genInstance() {
		return sinG;
	}

}
