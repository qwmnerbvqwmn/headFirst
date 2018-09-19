package statePattern;

public class HasQuarterState extends State {

	public HasQuarterState(StateMachine stateMachine) {
		super(stateMachine);
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		this.stateMachine.changeState(this.stateMachine.getSoldState());
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("退出25分");
		this.stateMachine.changeState(this.stateMachine.getNoQuarterState());
	}
}
