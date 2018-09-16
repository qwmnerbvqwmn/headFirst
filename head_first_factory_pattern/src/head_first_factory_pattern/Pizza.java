package head_first_factory_pattern;

import java.util.ArrayList;

public abstract class Pizza {
	
	
	
	String name;
	Dough dough;
	Sauce sauce;
	ArrayList toppings = new ArrayList();
	
	
	public abstract void prepare();
	
	
	public void bake() {
		// TODO 自动生成的方法存根
		System.out.println("Baking " + name);
	}

	public void cut() {
		// TODO 自动生成的方法存根
		System.out.println("Cutting " + name);
	}
	

	public void box() {
		// TODO 自动生成的方法存根
		System.out.println("Boxing " + name);
	}

	
	
}
