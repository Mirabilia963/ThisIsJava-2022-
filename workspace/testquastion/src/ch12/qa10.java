package ch12;

public class qa10 {

	public static void main(String[] args) {
		String str = "";
		StringBuilder sb = new StringBuilder();
		for(int i=1; i<=100; i++) {
			sb.append(i);
		}
		
		str = sb.toString();
		System.out.println(str);

	}

}
