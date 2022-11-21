package ch12.sec12;

import java.lang.reflect.Method;

public class PrintAnnotationExample {

	public static void main(String[] args) throws Exception{
		Method declareMethods[] = Service.class.getDeclaredMethods();
		for(Method method : declareMethods) {
			PrintAnnotaion printAnnotaion = method.getAnnotation(PrintAnnotaion.class);
		
		printLine(printAnnotaion);
		
		method.invoke(new Service());
		
		printLine(printAnnotaion);
		}
	}
	
	public static void printLine(PrintAnnotaion printAnnotaion) {
		if(printAnnotaion != null) {
			int number = printAnnotaion.number();
			for(int i=0; i<number; i++) {
				String value = printAnnotaion.value();
				System.out.print(value);
			}
			System.out.println();
		}
	}

}
