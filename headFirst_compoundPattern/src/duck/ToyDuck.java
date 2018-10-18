package duck;

import quack.Jiji;
import quack.Quackable;

public class ToyDuck extends Duck {
	public ToyDuck(Quackable quackable) {
		super(quackable);
	}
	public ToyDuck() {
		// TODO Auto-generated constructor stub
		this.quackable = new Jiji();
	}
}
