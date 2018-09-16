package headFirst_CommandPattern;

public class LightOffCommand implements Command {
	
	private Light light;
	
	public LightOffCommand(Light light) {
		// TODO 自动生成的构造函数存根
		this.light = light;
	}
	
	@Override
	public void execute() {
		// TODO 自动生成的方法存根
		light.off();
	}

	@Override
	public void undo() {
		// TODO 自动生成的方法存根
		light.on();
	}

	
	
}
