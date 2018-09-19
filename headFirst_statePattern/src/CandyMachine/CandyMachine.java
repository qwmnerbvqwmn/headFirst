package CandyMachine;


import statePattern.*;

public class CandyMachine extends StateMachine {

	State hasQuarterState;
	State noQuarterState;
	State soldOutState;
	State soldState;
	State curState;
	int count;
	
	public CandyMachine() {
		// TODO Auto-generated constructor stub
		this.hasQuarterState = new HasQuarterState(this);
		this.noQuarterState = new NoQuarterState(this);
		this.soldOutState = new SoldOutState(this);
		this.soldState = new SoldState(this);
		changeState(getNoQuarterState());
	}
	
	
	
	public int getCount() {
		return count;
	}

	public boolean noCount() {
		return getCount() > 0;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	
    /**
	 * 放硬币
	 */
	public void insertQuarter() {
		curState.insertQuarter();
	}
	
	/**
	 * 退硬币
	 */
	public void ejectQuarter() {
		curState.ejectQuarter();
	}

	/**
	 * 转动曲柄
	 */
	public void turnCrank() {
		curState.turnCrank();
	}
	
	/**
	 * 发糖
	 */
	public void dispense() {
		curState.dispense();
	}


	@Override
	public void changeState(State s) {
		// TODO Auto-generated method stub
		curState = s;
	}

	@Override
	public State getHasQuarterState() {
		return hasQuarterState;
	}


	@Override
	public State getNoQuarterState() {
		return noQuarterState;
	}

	@Override
	public State getSoldOutState() {
		return soldOutState;
	}

	@Override
	public State getSoldState() {
		return soldState;
	}
	
	
	
	

}
