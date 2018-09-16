package headFirst_Decorator;

public abstract class CondimentDecorator extends Beverage {
	@Override
	public String getDescription() {
		// TODO 自动生成的方法存根
		return super.getDescription() + "and condiment : ";
	}
}
