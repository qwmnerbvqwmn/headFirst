package head_first_observer_pattern;

import java.util.ArrayList;

public class FindWorld implements Subject {

	ArrayList<Observer> observers;
	int tem;
	int press;
	int water;
	
	public FindWorld() {
		tem = 0;
		press = 0;
		water = 0;
		observers = new ArrayList<Observer>();
	}
	
	@Override
	public void registerObserver(Observer observer) {
		// TODO 自动生成的方法存根
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		// TODO 自动生成的方法存根
		observers.remove(observer);
	}

	@Override
	public void notifyObserver() {
		// TODO 自动生成的方法存根
		for (Observer observer : observers) {
			observer.update(tem, press, water);
		}
	}

	public void changeonce(int tem, int press, int water) {
		this.tem = tem;
		this.press = press;
		this.water = water;
		notifyObserver();
	}
}
