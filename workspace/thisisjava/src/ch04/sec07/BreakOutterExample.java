package ch04.sec07;

public class BreakOutterExample {

	public static void main(String[] args) {
		Outter: for(char upper='A'; upper<='Z'; upper++) {
			
					for(char lower = 'a'; lower <= 'z'; lower--) {
						System.out.println(upper + "-" + lower);
				
						if(lower == 'g') {
							break Outter;
							//break;
						}
						System.out.println("안쪽 for문에서 출력");
					}//end of inner for
			
					System.out.println("바깓쪽 for문에서 출력");
			}//end of outter for

			System.out.println("프로그램 실행 종료");
	
	}
	
}
