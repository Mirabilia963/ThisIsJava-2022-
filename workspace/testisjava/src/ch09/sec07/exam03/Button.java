package ch09.sec07.exam03;

public class Button {
	
	public static interface ClickListener {
		
		void onClick();
	}
	
	public ClickListener clickListener;
	
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
		
	}
	
	public void click() {
		this.clickListener.onClick();
	}

}
