
public class ExamPrint {

	public static void main(String[] args) {
		Student arrstudent[] = new Student[4];
		
		arrstudent[0] = new Student("홍길동", 60, 75);
		arrstudent[1] = new Student("강호동", 70, 80);
		arrstudent[2] = new Student("유재석", 80, 55);
		arrstudent[3] = new Student("박명수", 90, 100);
		
		for(int j=0; j < arrstudent.length; j++) {
			for(int i=j; i < arrstudent.length; i++) {
				if(arrstudent[j].getTotal() < arrstudent[i].getTotal()) {
					Student tmp = arrstudent[j];
					arrstudent[j] = arrstudent[i];
					arrstudent[i] = tmp;
				}
			}
		}
		
		int order = 1;
		for(int j=0; j < arrstudent.length; j++) {
			if(j>0) {
				order = arrstudent[j].getTotal() == arrstudent[j-1].getTotal() ?
						j : j+1;
			}
			
			System.out.printf("이름: %s 총점: %d 순위: %d \n"
					, arrstudent[j].getName()
					, arrstudent[j].getTotal()
					, order);
		}
	}

}
