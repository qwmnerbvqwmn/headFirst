package headFirst_Decorator;

public class Soy extends CondimentDecorator {

	Beverage beverage;
	
	public Soy(Beverage bev) {
		// TODO 自动生成的构造函数存根
		beverage = bev;
	}
	
	@Override
	public double cost() {
		// TODO 自动生成的方法存根
		return beverage.cost() + 0.3;
	}
	
	@Override
	public String getDescription() {
		// TODO 自动生成的方法存根
		return beverage.getDescription() + " Soy ";
	}

}
