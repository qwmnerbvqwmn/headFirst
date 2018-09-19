package statePattern;

public abstract class State {
	
	protected StateMachine stateMachine;
	
	public State(StateMachine stateMachine) {
		this.stateMachine = stateMachine;
	}
	/**
	 * 放硬币
	 */
	public void insertQuarter() {
		System.out.println("不支持的操作");
	}
	
	/**
	 * 退硬币
	 */
	public void ejectQuarter() {
		System.out.println("不支持的操作");
	}

	/**
	 * 转动曲柄
	 */
	public void turnCrank() {
		System.out.println("不支持的操作");
	}
	
	/**
	 * 发糖
	 */
	public void dispense() {
		System.out.println("不支持的操作");
	}
	
}
