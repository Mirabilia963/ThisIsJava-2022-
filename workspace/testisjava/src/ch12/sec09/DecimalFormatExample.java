package ch12.sec09;

import java.text.DecimalFormat;

public class DecimalFormatExample {

	public static void main(String[] args) {
		double num = 12345.6789;
		
		DecimalFormat df;
		
		df = new DecimalFormat("#,###.#");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#,###.0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#.#%");
		System.out.println(df.format(num));
	}

}
