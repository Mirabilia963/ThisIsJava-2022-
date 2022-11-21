package ch07.sec07.exam03;

public class ChildExample {

	public static void main(String[] args) {
		 Parent par = new Child();
		 
		 par.filed1 = "data1";
		 par.method1();
		 par.method2();
		 
//		 par.filed2();
//		 par.method3();
		 
		 Child chi = (Child) par;
		 
		 chi.field2 = "data2";
		 chi.method3();

	}

}
