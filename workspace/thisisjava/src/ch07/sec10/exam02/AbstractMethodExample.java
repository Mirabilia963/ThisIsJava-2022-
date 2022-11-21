package ch07.sec10.exam02;

public class AbstractMethodExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound();
		dog.breathe();
	
		
		Cat cat = new Cat();
		cat.sound();
		
		dog.breathe();
		
		animalSound(new Dog());
		animalSound(new Cat());

	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
		
	}
	

	

}
