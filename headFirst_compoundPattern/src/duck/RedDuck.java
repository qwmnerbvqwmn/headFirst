package duck;

import quack.Quackable;
import quack.Quaqua;

public class RedDuck extends Duck {
	
//	@Override
	public RedDuck(Quackable quackable) {
		super(quackable);
	}
	
	public RedDuck() {
		// TODO Auto-generated constructor stub
		this.quackable = new Quaqua();
	}
}
