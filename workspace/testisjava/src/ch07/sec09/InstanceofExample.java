package ch07.sec09;

public class InstanceofExample {
	
	public static void personInfo(Person perS) {
		System.out.println("name: " + perS.name);
		perS.walk();
		
		if(perS instanceof Student stuD) {
			System.out.println("stuNo: " + stuD.stuNo);
			stuD.study();
		}
	}

	public static void main(String[] args) {
		
		Person p1 = new Person("홍길동");
		personInfo(p1);
		
		System.out.println();
		
		Person p2 = new Student("김길동", 10);
		personInfo(p2);

	}

}
