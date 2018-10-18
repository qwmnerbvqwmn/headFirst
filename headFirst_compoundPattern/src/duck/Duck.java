package duck;

import quack.Quackable;

public abstract class Duck implements DuckInterface {
	protected Quackable quackable;
	
	public Duck() {}
	
	public Duck(Quackable quackable) {
		this.quackable = quackable;
	}
	
	@Override
	public void quack() {
		quackable.quack();
	}
	
	public void quack(Quackable quackable) {
		quackable.quack();
	}
	
	
}
