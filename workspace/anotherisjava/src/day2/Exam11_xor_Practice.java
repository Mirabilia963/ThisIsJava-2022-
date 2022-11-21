package day2;

public class Exam11_xor_Practice {

	public static void main(String[] args) {
		int a = 15;
		int b = 5;
		
		System.out.println(a | b);
		System.out.println(a & b);
		System.out.println(a ^ b);
		
//		byte data = (byte)(a ^ b);
//		int unsignedInt = Byte.toUnsignedInt(data);
//		System.out.println(a ^ b);
		
		System.out.println(a >> 2);
		System.out.println(b << 4);
	}

}
