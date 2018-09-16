package DuckAndChicken;

public class main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Chicken chicken = new RedChicken();
		Duck falseDuck = new DuckByChicken(chicken);
		
//		falseDuck.quack();
//		falseDuck.fly();
		
		Waiguan waiguan = new Waiguan(falseDuck , chicken);
		waiguan.start();
	}

}
