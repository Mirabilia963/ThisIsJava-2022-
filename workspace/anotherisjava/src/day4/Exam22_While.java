package day4;

import java.util.Scanner;

public class Exam22_While {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String answer = "Y";
		int count = 0;
		
		while (answer.equals("Y")) {
			System.out.println("음악을 재생?(Y)");
			
			answer = sc.nextLine();
			
			if(answer.equals("Y")) {
				System.out.printf("음악을 %d번 재생? \n", ++count);
			}
		}
		System.out.println("재생 종료");

	}

}
