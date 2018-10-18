package duckComponent;

import humanObserver.DuckSubject;
import humanObserver.Observeable;
import humanObserver.Subject;
import quack.Quackable;

public class DuckOne extends DuckComponent implements Subject {
	
//	@Override
//	public void quack() {
//		// TODO Auto-generated method stub
//		super.quack();
//	}
	
	protected Quackable quackable;
	private DuckSubject duckSubject;
	
	public DuckOne() {
		this.duckSubject = new DuckSubject();
	}
	
	public DuckOne(Quackable quackable) {
		this.quackable = quackable;
		this.duckSubject = new DuckSubject();
	}
	
	@Override
	public void quack() {
		quackable.quack();
		this.notifyAllObservers();
	}
	
//	public void quack(Quackable quackable) {
//		quackable.quack();
//	}

	@Override
	public void register(Observeable observeable) {
		// TODO Auto-generated method stub
		this.duckSubject.register(observeable);
	}

	@Override
	public void unregister(Observeable observeable) {
		// TODO Auto-generated method stub
		this.duckSubject.unregister(observeable);
	}

	@Override
	public void notifyAllObservers() {
		// TODO Auto-generated method stub
		this.duckSubject.notifyAllObservers();
	}
	
}
