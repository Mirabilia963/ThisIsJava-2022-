package ch08.sec05;

public interface RemoteControl {
	
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 10;
	
	void turnOn();
	void turnOff();
	void steVolume(int volume);
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리");
			steVolume(MIN_VOLUME);
		}
		else {
			System.out.println("무음 해제");
		}
	}

}
