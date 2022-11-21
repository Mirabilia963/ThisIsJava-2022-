package ch15.sec07;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronizedMapExample {

	public static void main(String[] args) {
		Map<Integer, String> map = Collections.synchronizedMap(new HashMap<>());
		Map<Integer, String> map2 = new HashMap<>();
		
		Thread threadA = new Thread() {

			@Override
			public void run() {
				for(int i=1; i<=1000; i++) {
					map.put(i, "내용"+i);
				}
			}
			
		};
		
		Thread threadB = new Thread() {

			@Override
			public void run() {
				for(int i=1001; i<=2000; i++) {
					map.put(i, "내용"+i);
				}
			}
			
		};
		
		threadA.start();
		threadB.start();
		
		try {
			threadA.join();
			threadB.join();
		} catch (Exception e) {
			
		}
		
		int size = map.size();
		System.out.println("총 객체 수: " + size);
		System.out.println();
		
		//---------------------------------------
		
		Thread threadC = new Thread() {

			@Override
			public void run() {
				for(int i=1; i<=1000; i++) {
					map2.put(i, "내용"+i);
				}
			}
			
		};
		
		Thread threadD = new Thread() {

			@Override
			public void run() {
				for(int i=1001; i<=2000; i++) {
					map2.put(i, "내용"+i);
				}
			}
			
		};
		
		threadC.start();
		threadD.start();
		
		try {
			threadC.join();
			threadD.join();
		} catch (Exception e) {
			
		}
		
		int size2 = map2.size();
		System.out.println("총 객체 수: " + size2);
		System.out.println();
		
	}

}
