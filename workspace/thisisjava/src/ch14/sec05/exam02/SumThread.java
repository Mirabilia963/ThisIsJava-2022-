package ch14.sec05.exam02;

public class SumThread extends Thread{
	private long sum;
	
	public long getSum() {
		return sum;
	}
	
	public void getSum(long sum) {
		this.sum = sum;
	}

	@Override
	public void run() {
		for(int i=0; i<=100; i++) {
			sum += i;
		}
	}

}
