package head_first_observer_pattern;

public interface Subject {
	void registerObserver(Observer observer);
	void removeObserver(Observer observer);
	void notifyObserver();
}
