package ch12.sec07;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		int selecNumber[] = new int[6];
		Random random = new Random(3);
		System.out.print("선택번호: ");
		for(int i=0; i<6; i++) {
			selecNumber[i] = random.nextInt(45) + 1;
			System.out.print(selecNumber[i]+ " ");
		}
		System.out.println();
		
		int winningNumber[] = new int[6];
		random = new Random(5);
		System.out.print("당첨번호: ");
		for(int i=0; i<6; i++) {
			winningNumber[i] = random.nextInt(45) + 1;
			System.out.print(winningNumber[i]+ " ");
		}
		System.out.println();
		
		Arrays.sort(selecNumber);
		Arrays.sort(winningNumber);
		boolean result = Arrays.equals(selecNumber, winningNumber);
		System.out.print("당첨여부: ");
		if(result) {
			System.out.println("1등에 당첨");
		} else {
			System.out.println("1등에 당첨 X");
		}
	}

}
