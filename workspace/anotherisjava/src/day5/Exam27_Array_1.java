package day5;

import java.util.Arrays;

public class Exam27_Array_1 {

	public static void main(String[] args) {
		int a[] = new int[] { 10,20,4,25,18 };
		
		int b[] = {1,2,3,4,5,6,7};
		
		int c[] = new int[10];
		for (int i = 0; i<c.length; i++) {
			c[i] = i;
		}
		
		for(int i=0; i<c.length; i++) {
			System.out.println(c[i]);
		}
		
		System.out.println("");
		System.out.println(Arrays.toString(c));

	}

}
