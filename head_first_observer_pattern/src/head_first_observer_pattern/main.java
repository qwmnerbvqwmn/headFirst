package head_first_observer_pattern;

public class main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		FindWorld findWorld = new FindWorld();
		@SuppressWarnings("unused")
		CurrentBoard curBoard = new CurrentBoard(findWorld);
		findWorld.changeonce(50, 60, 80);
		findWorld.changeonce(80, 100, 40);
		findWorld.changeonce(30, 60, 100);
	}

}
