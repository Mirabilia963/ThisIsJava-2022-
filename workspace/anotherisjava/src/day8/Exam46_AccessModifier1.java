package day8;

public class Exam46_AccessModifier1 {

	public static void main(String[] args) {
		User user1 = new User("철수", 20);
		User user2 = new User("영희", 19);
		
		System.out.println(user2.name + "의 나이는" + user2.age);
		
		user2.age = 99;
		System.out.println(user2.name + "의 나이는" + user2.age);
	}

}
