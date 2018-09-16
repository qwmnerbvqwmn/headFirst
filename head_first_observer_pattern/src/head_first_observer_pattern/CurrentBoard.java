package head_first_observer_pattern;

public class CurrentBoard implements Observer, DisplayBehavior {

	int tem;
	int press;
	int water;
	Subject sub;
	
	public CurrentBoard(Subject sub) {
		this.sub = sub;
		sub.registerObserver(this);
	}
	
	
	@Override
	public void update(int tem, int press, int water) {
		// TODO 自动生成的方法存根
		this.tem = tem;
		this.press = press;
		this.water = water;
		display();
	}

	@Override
	public void display() {
		// TODO 自动生成的方法存根
		System.out.println("cur:\ttem = " + tem + " press = " + press + " water = " + water);
		
	}

}
