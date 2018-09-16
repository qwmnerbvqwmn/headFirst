package headFirst_CommandPattern;

public class FullCommand implements Command {

	private Command[] commands;
	
	public FullCommand(Command[] cmds) {
		// TODO 自动生成的构造函数存根
		commands = cmds;
	}
	
	@Override
	public void execute() {
		// TODO 自动生成的方法存根
		for (Command cmd : commands) {
			cmd.execute();
		}
	}

	@Override
	public void undo() {
		// TODO 自动生成的方法存根
//		for (Command cmd : commands) {
//			cmd.undo();
//		}
		for (int i = commands.length-1; i >= 0; i--) {
			commands[i].undo();
		}
	}

}
