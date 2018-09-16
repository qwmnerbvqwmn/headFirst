package headFirst_CommandPattern;

/**
 * @author Administrator
 * headfirst书上的遥控器实现
 *
 */
public class RemoteControl {
	Command[] onCommands;
	Command[] offCommands;
	Command undoCommand;
	public RemoteControl() {
		// TODO 自动生成的构造函数存根
		onCommands = new Command[7];
		offCommands = new Command[7];
		Command noCommand = new NoCommand();
		for (int i = 0; i < 7; ++i) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		
	}
	
	
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand; 
	}
	
	public void onButtonWasPressed(int slot) {
		onCommands[slot].execute();
		undoCommand = onCommands[slot];
	}
	
	public void offButtonWasPressed(int slot) {
		offCommands[slot].execute();
		undoCommand = offCommands[slot];
	}
	
	public void undoCommandPressed() {		
		undoCommand.undo();
	}
	
}
