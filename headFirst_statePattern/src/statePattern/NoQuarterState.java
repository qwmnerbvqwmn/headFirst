package statePattern;

public class NoQuarterState extends State {

	public NoQuarterState(StateMachine stateMachine) {
		super(stateMachine);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("投入25分硬币");
		stateMachine.changeState(stateMachine.getHasQuarterState());
	}

	
}
