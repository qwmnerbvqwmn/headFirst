package headFirst_CommandPattern;

public class TVOnCommand implements Command {

	private TV tv;
	private int prevSound;
	public TVOnCommand(TV tv) {
		// TODO 自动生成的构造函数存根
		this.tv = tv;
	}
	
	@Override
	public void execute() {
		// TODO 自动生成的方法存根
		tv.start();
		tv.setSound(20);
		prevSound = 20;
	}

	@Override
	public void undo() {
		// TODO 自动生成的方法存根
		tv.end();
	}

}
