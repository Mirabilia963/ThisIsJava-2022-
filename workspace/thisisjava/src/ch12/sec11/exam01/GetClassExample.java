package ch12.sec11.exam01;

public class GetClassExample {

	public static void main(String[] args) throws Exception {
		Class clazz = Car.class;
		
		Class clazz1 = Class.forName("ch12.sec11.exam01.Car");
		System.out.println(clazz1);
		
		Car car1 = new Car();
		Class clazz2 = car1.getClass();
		System.out.println(clazz2);
		
		System.out.println("패키지: " + clazz.getPackage().getName());
		System.out.println("클래스 간단 이름: " + clazz.getSimpleName());
		System.out.println("클래스 전체 이름: " + clazz.getName());
	}

}
