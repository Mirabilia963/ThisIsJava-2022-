package day4;

public class Exam20_Switch {

	public static void main(String[] args) {
		int book = 20;
		book = book/10;
		
		switch(book) {
		case 0:
			System.out.println("조금 더 노력하세요!");
			break;
		case 1:
			System.out.println("책 읽는 걸 즐기는 분");
			break;
		case 2:
			System.out.println("책을 사랑하는 분");
			break;
		default:
			System.out.println("다독왕");
		}

	}

}
