package part1.last;

public class problem2 {

	public static void main(String[] args) {
		//Switch문을 Expression으로 변경해서 오른쪽에 작성해보세요.
		String grade = "B";
		
		int score1 = 0;
		
//		switch(grade) {
//		case "A":
//			score1 = 100;
//			break;
//			case "B":
//			int result = 100 - 20;
//			score1 = result;
//			break;
//		default:
//			score1 = 60;
//		}

		switch(grade) {
			case "A" -> {
				score1 = 100;
//				break;
			}
			case "B" -> {
				int result = 100 - 20;
//				break;
			}
			default -> {
				score1 = 60;
			}
		}
		
	}

}
