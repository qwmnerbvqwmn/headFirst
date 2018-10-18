package duck;

import quack.Quackable;
import quack.Quaqua;

public class GreenDuck extends Duck {
	
	public GreenDuck(Quackable quackable) {
		super(quackable);
	}
	public GreenDuck() {
		// TODO Auto-generated constructor stub
		this.quackable = new Quaqua();
	}

}
