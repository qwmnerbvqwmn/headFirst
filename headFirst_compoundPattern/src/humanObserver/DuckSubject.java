package humanObserver;

import java.util.ArrayList;

public class DuckSubject implements Subject {

	ArrayList observers;
	
	public DuckSubject() {
		observers = new ArrayList();
	}
	
	@Override
	public void register(Observeable observeable) {
		// TODO Auto-generated method stub
		observers.add(observeable);
	}

	@Override
	public void unregister(Observeable observeable) {
		// TODO Auto-generated method stub
		observers.remove(observers);
	}

	@Override
	public void notifyAllObservers() {
		// TODO Auto-generated method stub
		for (Object observer : observers) {
			((Observeable)observer).beNotify();
		}
	}

}
