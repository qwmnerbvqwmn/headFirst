package duckComponent;

import quack.Quackable;
import quack.Quaqua;

public class RedDuckOne extends DuckOne {
	
//	@Override
	public RedDuckOne(Quackable quackable) {
		super(quackable);
	}
	
	public RedDuckOne() {
		// TODO Auto-generated constructor stub
		this.quackable = new Quaqua();
	}
}
