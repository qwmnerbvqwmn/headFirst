package statePattern;

public abstract class State {
	
	public State(StateMachine stateMachine) {
		
	}
	
	/**
	 * 放硬币
	 */
	public void insertQuarter() {
		throw new UnsupportedOperationException();
	}
	
	/**
	 * 退硬币
	 */
	public void ejectQuarter() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 转动曲柄
	 */
	public void turnCrank() {
		throw new UnsupportedOperationException();
	}
	
	/**
	 * 发糖
	 */
	public void dispense() {
		throw new UnsupportedOperationException();
	}
	
}
