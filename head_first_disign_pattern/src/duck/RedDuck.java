package duck;

import flyBehavior.flyBeauty;
import quackBeahvior.guagua;

public class RedDuck extends Duck {
	public RedDuck() {
		System.out.println("redduck born.");
		quackBehavior = new guagua();
		flyBehavior = new flyBeauty();
		
	}
	
	public void display() {
		System.out.println("I am a redDuck.");
	}
}
