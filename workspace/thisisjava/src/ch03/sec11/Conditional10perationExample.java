package ch03.sec11;

public class Conditional10perationExample {

	public static void main(String[] args) {
		double score = 89.9;
		char grade = (score > 90) ? 'A' : ( (score > 80) ? 'B' : 'C');
		System.out.println(score + "점은 " + grade + "등급입니다.");

	}

}
