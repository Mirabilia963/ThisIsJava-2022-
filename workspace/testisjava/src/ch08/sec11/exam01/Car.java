package ch08.sec11.exam01;

public class Car {
	
	Tire tire1 = new HankookTrie();
	Tire tire2 = new HankookTrie();
	
	void run() {
		tire1.roll();
		tire2.roll();
	}

}
