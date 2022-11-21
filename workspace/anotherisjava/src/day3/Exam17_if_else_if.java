package day3;

import java.util.Scanner;

public class Exam17_if_else_if {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int age;
		System.out.println("나이");
		age = sc.nextInt();
		
		if (age>19) {
			System.out.println("성인");
			System.out.println("성인 요금");
		}
		else if(age>13 ) {
			System.out.println("청소년");
			System.out.println("청소년 요금");
		}
		else if(age>8 ) {
			System.out.println("어린이");
			System.out.println("어린이 요금");
		}
		else {
			System.out.println("유아");
			System.out.println("유아 요금");
		}
		System.out.println("결제 진행");
	}

}
