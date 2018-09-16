package duck;

import flyBehavior.FlyBehavior;
import quackBeahvior.QuackBehavior;

public abstract class Duck {
	QuackBehavior quackBehavior; 
	FlyBehavior	flyBehavior;
	public Duck() {
		System.out.println("Duck born.");
	}
	
	public void swim() {
		System.out.println("I am swimming.");
	}
	
	public void display() {
		System.out.println("I am a duck.");
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void setQuackBehavior(QuackBehavior soundType) {
		quackBehavior = soundType;
	}
	
	public void setFlyBehavior(FlyBehavior flyType) {
		flyBehavior = flyType;
	}
}
