package statePattern;

import CandyMachine.CandyMachine;

public class SoldState extends State {

	public SoldState(StateMachine stateMachine) {
		super(stateMachine);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		
		
		CandyMachine cm = (CandyMachine)this.stateMachine;
		System.out.println("卖了一个糖");
		cm.setCount(cm.getCount()-1);
		if (cm.noCount()) {
			this.stateMachine.changeState(this.stateMachine.getSoldOutState());
		} else {
			this.stateMachine.changeState(this.stateMachine.getNoQuarterState());			
		}
	}
	
}
