package statePattern;

public abstract class StateMachine {

	public abstract void changeState(State s);
	
	public State getHasQuarterState() {
		throw new UnsupportedOperationException();
	}
	
	public State getNoQuarterState() {
		throw new UnsupportedOperationException();
	}
	
	public State getSoldOutState() {
		throw new UnsupportedOperationException();
	}
	
	public State getSoldState() {
		throw new UnsupportedOperationException();
	}

}
