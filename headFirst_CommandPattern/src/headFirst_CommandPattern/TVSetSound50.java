package headFirst_CommandPattern;

public class TVSetSound50 implements Command {

	public int prevSound;
	public TV tv;
	public TVSetSound50(TV tv) {
		// TODO 自动生成的构造函数存根
		this.tv = tv;
		prevSound = tv.getSound();
	}
	
	@Override
	public void execute() {
		// TODO 自动生成的方法存根
		tv.setSound(50);
	}

	@Override
	public void undo() {
		// TODO 自动生成的方法存根
		tv.setSound(prevSound);
	}

}
