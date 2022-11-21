package day7;

public class Exam37_Method3 {

	public static void main(String[] args) {
		Check.cm_Imember();
		Check.cm_Cmember();
		
		Check myinstance = new Check();
		myinstance.im_Cmember();
		myinstance.im_Imember();
		myinstance.cm_Cmember();
		myinstance.cm_Imember();
	}

}
