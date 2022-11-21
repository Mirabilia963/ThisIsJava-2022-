package day4;

import java.util.Scanner;

public class Exam25_Continue {

	public static void main(String[] args) {
		int money = 10000;
		System.out.println("현재 가진 돈 10000원");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("얼마나 사용?");
			int i = sc.nextInt();
			
			if(i<=0 || i>money) {
				System.out.println("다시 입력(사용범위X)");
				continue;
			}
			
			System.out.printf("이제 %d원 남았습니다. \n", money -= i);
			
			if(money == 0) {
				break;
			}
		}
		
		System.out.println("모든 돈을 사용, 종료");

	}

}
