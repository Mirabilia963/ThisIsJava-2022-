package day8;

public class Exam46_AccessModifier2 {

	public static void main(String[] args) {
		User1 user1 = new User1("철수", 20);
		User1 user2 = new User1("영희", 19);
		
//		System.out.println(user2.name + "의 나이는" + user2.age);
//		
//		user2.age = 99;
//		System.out.println(user2.name + "의 나이는" + user2.age);
		
		user2.setAge(20);
		System.out.println(user2.getName() + "의 나이는" + user2.getAge());
	}

}
