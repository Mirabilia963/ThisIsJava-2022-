

public class MyReport {

	public static void main(String[] args) {
		String name = "남궁명건";
		int phNum = 1093655239;
		String adrState = "경기";
		String adrCity = "의정부";
		
		System.out.println("이름: " + name);
		System.out.printf("휴대전화번호: %011d\n", phNum);
		System.out.printf("주소: %1$3s도 " + "%2$3s시" + "\n", adrState, adrCity);
		

	}

}
