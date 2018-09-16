package headFirst_Decorator;

public class Milk extends CondimentDecorator {

	Beverage beverage;
	
	public Milk(Beverage bev) {
		// TODO 自动生成的构造函数存根
		beverage = bev;
	}
	
	@Override
	public double cost() {
		// TODO 自动生成的方法存根
		return beverage.cost() + 0.5;
	}
	
	@Override
	public String getDescription() {
		// TODO 自动生成的方法存根
		return beverage.getDescription() + " Milk ";
	}

}
