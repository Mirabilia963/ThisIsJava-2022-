package ch12;

import java.util.Date;
import java.text.SimpleDateFormat;

public class qa16 {

	public static void main(String[] args) {
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH시 mm분");
		
		System.out.println(sdf.format(now));
		
	}

}
