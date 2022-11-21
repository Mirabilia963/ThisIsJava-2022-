package ch09.sec06.exam03;

public class Button {
	
	public static interface ClickListener {
		
		void onClick();
	}
		
	private ClickListener clickListener;
	
	public void setClickListener(ClickListener chlClickListener) {
		this.clickListener = chlClickListener;
	}
	
	public void click() {
		this.clickListener.onClick();
		
	}
	
}
