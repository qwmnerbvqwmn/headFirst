package head_first_disign_pattern;

import duck.Duck;
import duck.RedDuck;
import duck.woodToyDuck;
import flyBehavior.flyBeauty;

public class testDuck {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		RedDuck redduck = new RedDuck();
		redduck.display();
		redduck.performFly();
		redduck.performQuack();
		woodToyDuck wtduck = new woodToyDuck();
		testADuck(wtduck);
		wtduck.setFlyBehavior(new flyBeauty());
		testADuck(wtduck);
//		redduck.setFlyBehavior(new );
	}

	public static void testADuck(Duck duck) {
		duck.display();
		duck.performFly();
		duck.performQuack();
	}
}
