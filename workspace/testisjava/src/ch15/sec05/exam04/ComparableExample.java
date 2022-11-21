package ch15.sec05.exam04;

import java.util.TreeSet;

public class ComparableExample {

	public static void main(String[] args) {
		TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new FruitComparator());
	}

}
