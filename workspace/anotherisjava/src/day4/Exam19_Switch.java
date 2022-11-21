package day4;

public class Exam19_Switch {

	public static void main(String[] args) {
		int book = 10;
		book = book/10;
		
		switch(book) {
		case 0:
			System.out.println("조금 더 노력하세요!");
			
		case 1:
			System.out.println("책 읽는 걸 즐기는 분");
			
		case 2:
			System.out.println("책을 사랑하는 분");
			
		default:
			System.out.println("다독왕");
		}

	}

}
