package part1.last;

public class problem3 {

	public static void main(String[] args) {
		//for문을 이용해서 1부터 100까지의 정수 중에서 3의 배수의 총합을 출력하는 코드를 작성해보세요.
		int sum = 0;
//		int i;
		
//		for (i=1; i<=100; i++) {
//			for (int m=3; m<=100; m++) {
//				int result = i*m;
//				System.out.println("1부터 100까지의 정수 중에서 3의 배수의 총 합: " + result );		
//			}
//		}
		for(int i=1; i<10; i++) {
			if(i%3 == 0) {
				sum += i;
			}
		}
		System.out.println("3의 배수의 합: " + sum);
		
	}

}
