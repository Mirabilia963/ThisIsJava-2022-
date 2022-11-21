package ch05.sec06;

public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {
		String season[] = { "Spring", "Summer", "Fall", "Winter" };
		
		System.out.println("season[0] : " + season[0]);
		System.out.println("season[1] : " + season[1]);
		System.out.println("season[2] : " + season[2]);
		System.out.println("season[3] : " + season[3]);
		
		season[1] = "여름";
		System.out.println("season[1] : " + season[1]);
		System.out.println();
		
		int scores[] = new int[3];
			scores[0] = 83;
			scores[1] = 90;
			scores[2] = 87;
			
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		
		System.out.println("총합 : " + sum);
		double avg = (double) sum / 3;
		System.out.println("평균 : " + avg);

	}

}
