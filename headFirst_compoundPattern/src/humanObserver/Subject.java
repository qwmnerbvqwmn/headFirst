package humanObserver;

public interface Subject {

	public void register(Observeable observeable);
	
	public void unregister(Observeable observeable);
	
	public void notifyAllObservers();
	
}
