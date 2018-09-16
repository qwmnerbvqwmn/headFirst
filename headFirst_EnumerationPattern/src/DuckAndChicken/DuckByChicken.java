package DuckAndChicken;

public class DuckByChicken implements Duck {
	Chicken chicken;
	public DuckByChicken(Chicken chicken) {
		// TODO 自动生成的构造函数存根
		this.chicken = chicken;
	}
	
	@Override
	public void quack() {
		// TODO 自动生成的方法存根
		chicken.gugu();
	}

	@Override
	public void fly() {
		// TODO 自动生成的方法存根
		for (int i = 0; i < 5; ++i) {
			chicken.fly();
		}
	}

}
