package quackCount;

import quack.Quackable;

public class QuackCount implements Quackable {

	public static int quackCount = 0;
	
	Quackable quackable;
	public QuackCount(Quackable quackable) {
		// TODO Auto-generated constructor stub
		this.quackable = quackable;
	}
	
	@Override
	public void quack() {
		// TODO Auto-generated method stub
		this.quackable.quack();
		quackCount++;
	}
	
	public static int getQuackCount() {
		return quackCount;
	}
	
	
}
