package duckComponent;

import java.util.ArrayList;
import java.util.Iterator;

import humanObserver.DuckSubject;
import humanObserver.Observeable;
import humanObserver.Subject;

public class Ducks extends DuckComponent implements Subject {
	private ArrayList children;
	private DuckSubject duckSubject;

	public Ducks() {
		// TODO Auto-generated constructor stub
		children = new ArrayList();
		duckSubject = new DuckSubject();
	}

	@Override
	public void addChild(DuckComponent child) {
		// TODO Auto-generated method stub
		this.children.add(child);
	}

	@Override
	public void quack() {
//		Iterator it = children.iterator();
//		for ()
		for (Object child : children) {
//			DuckComponent dc = (DuckComponent) child;
//			dc.quack();
			((DuckComponent) child).quack();
		}
		notifyAllObservers();
	}

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
