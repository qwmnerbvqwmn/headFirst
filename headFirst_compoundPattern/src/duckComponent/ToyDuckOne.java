package duckComponent;

import quack.Jiji;
import quack.Quackable;

public class ToyDuckOne extends DuckOne {
	public ToyDuckOne(Quackable quackable) {
		super(quackable);
	}
	public ToyDuckOne() {
		// TODO Auto-generated constructor stub
		this.quackable = new Jiji();
	}
}
