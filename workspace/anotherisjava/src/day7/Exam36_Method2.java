package day7;

public class Exam36_Method2 {

	public static void main(String[] args) {
		
		Area.manual();
//		Area.triangle(3,5);
//		Area.rectangle(3,4);
		
		Area cal = new Area();
		
		cal.manual();
		System.out.println(cal.triangle(3, 5));
		System.out.println(cal.rectangle(3, 4));
		
	}

}
