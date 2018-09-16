package DuckAndChicken;

public class Waiguan {

	Duck duck;
	Chicken chicken;
	
	public Waiguan(Duck duck, Chicken chicken) {
		// TODO 自动生成的构造函数存根
		this.duck = duck;
		this.chicken = chicken;
	}
	
	public void start() {
		duck.quack();
		duck.fly();
		chicken.gugu();
		chicken.fly();
	}
}
