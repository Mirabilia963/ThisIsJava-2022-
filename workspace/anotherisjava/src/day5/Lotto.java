package day5;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		int lottoAr[] = new int[6];
		int userAr[] = new int[6];
		
		int bonus, bonusUser;
		int count = 0;
		
		for(int i=0; i<6; i++) {
			lottoAr[i] = random.nextInt(45) +1;
		}
		
//		lottoAr[0] = 1;
//		lottoAr[1] = 2;
//		lottoAr[2] = 3;
//		lottoAr[3] = 4;
//		lottoAr[4] = 5;
//		lottoAr[5] = 6;
		bonus = random.nextInt(45) + 1;
		
//		bonus = 7;
		
		System.out.println("Lotto:" + Arrays.toString(lottoAr) + ", bonus:" + 
		bonus);
		
		System.out.print("숫자 6개 입력: ");
		for(int i = 0; i<6; i++) {
			userAr[i] = sc.nextInt();
		}
		
		System.out.print("보너스 값 입력: ");
		bonusUser = sc.nextInt();
		
		System.out.println("User:" + Arrays.toString(userAr) + ", bonusUser:" + bonusUser);
		
		for(int j=0; j<6; j++) {
			for(int i=0; i<6; i++) {
				if(lottoAr[j] == userAr[i]) {
					count++;
				}
			}
		}
		System.out.println("총 맞춘 갯수: " + count + "개");
		
		if(count == 6) {
			System.out.println("축하드립니다! 1등입니다!");
		}
		else if(count == 5) {
			if(bonus == bonusUser) {
				System.out.println("축하드립니다! 2등입니다!");
			}
			else {
				System.out.println("축하드립니다! 3등입니다!");
			}
		}
		else if (count == 4) {
			System.out.println("축하드립니다! 4등입니다!");
		}
		else if (count == 3) {
			System.out.println("축하드립니다! 53등입니다!");
		}
		else {
			System.out.println("꽝! 다음 기회에...");
		}
		
		sc.close();
	}

}
