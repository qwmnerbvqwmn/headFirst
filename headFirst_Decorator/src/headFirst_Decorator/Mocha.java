package headFirst_Decorator;

public class Mocha extends CondimentDecorator {

	Beverage beverage;
	
	public Mocha(Beverage bev) {
		// TODO 自动生成的构造函数存根
		beverage = bev;
	}
	
	@Override
	public double cost() {
		// TODO 自动生成的方法存根
		return beverage.cost() + 0.8;
	}
	
	@Override
	public String getDescription() {
		// TODO 自动生成的方法存根
		return beverage.getDescription() + " Mocha ";
	}

}
