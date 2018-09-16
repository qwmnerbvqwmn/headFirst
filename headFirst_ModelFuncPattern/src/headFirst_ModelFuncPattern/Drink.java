package headFirst_ModelFuncPattern;

public abstract class Drink {

	public void prepare() {
		boil();
		brew();
		pourInCup();
		if (customWantAdd()) {
			add();				
		}
		giveCustom();
	}

	private void giveCustom() {
		// TODO 自动生成的方法存根
		System.out.println("you drink has done.");
	}

	protected abstract void add();

	protected abstract void brew();

	protected boolean customWantAdd() {
		return true;
	}
	
	private void pourInCup() {
		// TODO 自动生成的方法存根
		System.out.println("pouring into cup.");
	}

	private void boil() {
		// TODO 自动生成的方法存根
		System.out.println("boiling water.");
	}
	
}
