package day2;

public class Exam10_Logic_Operator2 {

	public static void main(String[] args) {
		int a = 10;
		System.out.println(5<a && a<15); //5 < a < 15
		System.out.println((5<a && a<15) && a%2==0);
		
		a = 4;
		System.out.println((5<a && a<15) && a%2==0);
		System.out.println((5<a && a<15) || a%2==0);
		

	}

}
