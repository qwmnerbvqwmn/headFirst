package duck;

import flyBehavior.noFly;
import quackBeahvior.slient;

public class woodToyDuck extends Duck {
	public woodToyDuck() {
		System.out.println("woodToyDuck born.");
		quackBehavior = new slient();
		flyBehavior = new noFly();
	}
	
	public void display() {
		System.out.println("I am a wood toy duck.");
	}
	
}
