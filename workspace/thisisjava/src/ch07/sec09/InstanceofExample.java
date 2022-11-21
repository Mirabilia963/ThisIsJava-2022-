package ch07.sec09;

public class InstanceofExample {
	
	public static void personIfo(Person perS) {
		System.out.println("name: " + perS.name);
		perS.walk();
		
		if(perS instanceof Student student) {
			System.out.println("stuNo: " + student.stuNo);
			student.study();
		}
	}

	public static void main(String[] args) {
		Person p1 = new Person("홍길동");
		personIfo(p1);
		
		System.out.println();
		
		Person p2 = new Student("홍길동", 10);
		personIfo(p2);

	}

}
