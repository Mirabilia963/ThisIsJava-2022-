package ch04.sec04;

public class MultiplecationExample {

	public static void main(String[] args) {
		int result;
		
		for (int m=2; m<=9; m++) {
			System.out.println("*** " + m + "단 ***");
			for (int n=1; n<=9; n++) {
				result = m*n;
				System.out.println(m + " x " + n + " = " + result);
			}
		}

	}

}
